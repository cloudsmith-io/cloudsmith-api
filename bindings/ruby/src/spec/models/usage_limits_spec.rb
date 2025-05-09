=begin
#Cloudsmith API (v1)

#The API to the Cloudsmith Service

OpenAPI spec version: v1
Contact: support@cloudsmith.io
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.43

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for CloudsmithApi::UsageLimits
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'UsageLimits' do
  before do
    # run before each test
    @instance = CloudsmithApi::UsageLimits.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of UsageLimits' do
    it 'should create an instance of UsageLimits' do
      expect(@instance).to be_instance_of(CloudsmithApi::UsageLimits)
    end
  end
  describe 'test attribute "bandwidth"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "storage"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
