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

# Unit tests for CloudsmithApi::StorageAllocatedLimitRaw
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'StorageAllocatedLimitRaw' do
  before do
    # run before each test
    @instance = CloudsmithApi::StorageAllocatedLimitRaw.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of StorageAllocatedLimitRaw' do
    it 'should create an instance of StorageAllocatedLimitRaw' do
      expect(@instance).to be_instance_of(CloudsmithApi::StorageAllocatedLimitRaw)
    end
  end
  describe 'test attribute "configured"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "peak"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "percentage_used"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "plan_limit"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "used"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end