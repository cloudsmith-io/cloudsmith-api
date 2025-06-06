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

# Unit tests for CloudsmithApi::VulnerabilitiesApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'VulnerabilitiesApi' do
  before do
    # run before each test
    @instance = CloudsmithApi::VulnerabilitiesApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of VulnerabilitiesApi' do
    it 'should create an instance of VulnerabilitiesApi' do
      expect(@instance).to be_instance_of(CloudsmithApi::VulnerabilitiesApi)
    end
  end

  # unit tests for vulnerabilities_namespace_list
  # Lists scan results for a specific namespace.
  # Lists scan results for a specific namespace.
  # @param owner 
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page A page number within the paginated result set.
  # @option opts [Integer] :page_size Number of results to return per page.
  # @return [Array<VulnerabilityScanResultsList>]
  describe 'vulnerabilities_namespace_list test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for vulnerabilities_package_list
  # Lists scan results for a specific package.
  # Lists scan results for a specific package.
  # @param owner 
  # @param repo 
  # @param package 
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page A page number within the paginated result set.
  # @option opts [Integer] :page_size Number of results to return per page.
  # @return [Array<VulnerabilityScanResultsList>]
  describe 'vulnerabilities_package_list test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for vulnerabilities_read
  # Get a scan result.
  # Get a scan result.
  # @param owner 
  # @param repo 
  # @param package 
  # @param identifier 
  # @param [Hash] opts the optional parameters
  # @return [VulnerabilityScanResults]
  describe 'vulnerabilities_read test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for vulnerabilities_repo_list
  # Lists scan results for a specific repository.
  # Lists scan results for a specific repository.
  # @param owner 
  # @param repo 
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page A page number within the paginated result set.
  # @option opts [Integer] :page_size Number of results to return per page.
  # @return [Array<VulnerabilityScanResultsList>]
  describe 'vulnerabilities_repo_list test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
