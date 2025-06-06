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

# Unit tests for CloudsmithApi::FormatsApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'FormatsApi' do
  before do
    # run before each test
    @instance = CloudsmithApi::FormatsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of FormatsApi' do
    it 'should create an instance of FormatsApi' do
      expect(@instance).to be_instance_of(CloudsmithApi::FormatsApi)
    end
  end

  # unit tests for formats_list
  # Get a list of all supported package formats.
  # Get a list of all supported package formats.
  # @param [Hash] opts the optional parameters
  # @return [Array<Format>]
  describe 'formats_list test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for formats_read
  # Get a specific supported package format.
  # Get a specific supported package format.
  # @param slug 
  # @param [Hash] opts the optional parameters
  # @return [Format]
  describe 'formats_read test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
