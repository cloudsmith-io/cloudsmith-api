require 'cloudsmith-api'

describe 'forward compatibility' do
  it 'deserializes an enum value that the spec does not list' do
    repository = CloudsmithApi::Repository.build_from_hash(
      name: 'my-repo',
      broadcast_state: 'A value added after this release'
    )

    expect(repository.broadcast_state).to eq('A value added after this release')
  end
end
