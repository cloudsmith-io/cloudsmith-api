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

# Unit tests for CloudsmithApi::PackagesUploadNpm
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'PackagesUploadNpm' do
  before do
    # run before each test
    @instance = CloudsmithApi::PackagesUploadNpm.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of PackagesUploadNpm' do
    it 'should create an instance of PackagesUploadNpm' do
      expect(@instance).to be_instance_of(CloudsmithApi::PackagesUploadNpm)
    end
  end
  describe 'test attribute "npm_dist_tag"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "package_file"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
