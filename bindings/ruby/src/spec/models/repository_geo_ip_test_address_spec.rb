=begin
#Cloudsmith API (v1)

#The API to the Cloudsmith Service

OpenAPI spec version: v1
Contact: support@cloudsmith.io
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.26

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for CloudsmithApi::RepositoryGeoIpTestAddress
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'RepositoryGeoIpTestAddress' do
  before do
    # run before each test
    @instance = CloudsmithApi::RepositoryGeoIpTestAddress.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of RepositoryGeoIpTestAddress' do
    it 'should create an instance of RepositoryGeoIpTestAddress' do
      expect(@instance).to be_instance_of(CloudsmithApi::RepositoryGeoIpTestAddress)
    end
  end
  describe 'test attribute "addresses"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end