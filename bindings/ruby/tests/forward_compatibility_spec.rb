require 'cloudsmith-api'

describe 'forward compatibility' do
  it 'deserializes an enum value that the spec does not list' do
    repository = CloudsmithApi::Repository.build_from_hash(
      name: 'my-repo',
      broadcast_state: 'A value added after this release'
    )

    expect(repository.broadcast_state).to eq('A value added after this release')
  end

  it 'deserializes a response that breaks the spec constraints' do
    audit_log = CloudsmithApi::NamespaceAuditLog.build_from_hash(
      actor: nil, actor_location: nil, context: '', event: 'action.login'
    )

    expect(audit_log.actor_location).to be_nil
    expect(audit_log.context).to eq('')
  end
end
