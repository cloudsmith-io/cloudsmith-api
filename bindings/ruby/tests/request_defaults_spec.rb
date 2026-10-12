require 'cloudsmith-api'

describe 'request defaults' do
  it 'sends only the fields that are set in a patch request' do
    patch = CloudsmithApi::RepositoryRequestPatch.new(description: 'A new description')

    expect(patch.to_hash).to eq(description: 'A new description')
  end
end
