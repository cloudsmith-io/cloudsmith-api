=begin
#Cloudsmith API

#The API to the Cloudsmith Service

OpenAPI spec version: v1
Contact: support@cloudsmith.io
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.2.3

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for CloudsmithApi::PackagesValidateuploadCargo
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'PackagesValidateuploadCargo' do
  before do
    # run before each test
    @instance = CloudsmithApi::PackagesValidateuploadCargo.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of PackagesValidateuploadCargo' do
    it 'should create an instance of PackagesValidateuploadCargo' do
      expect(@instance).to be_instance_of(CloudsmithApi::PackagesValidateuploadCargo)
    end
  end
  describe 'test attribute "package_file"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "republish"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
