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

# Unit tests for CloudsmithApi::ReposApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'ReposApi' do
  before do
    # run before each test
    @instance = CloudsmithApi::ReposApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ReposApi' do
    it 'should create an instance of ReposApi' do
      expect(@instance).to be_instance_of(CloudsmithApi::ReposApi)
    end
  end

  # unit tests for repos_all_list
  # Get a list of all repositories associated with current user.
  # Get a list of all repositories associated with current user.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page A page number within the paginated result set.
  # @option opts [Integer] :page_size Number of results to return per page.
  # @return [Array<Repository>]
  describe 'repos_all_list test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for repos_create
  # Create a new repository in a given namespace.
  # Create a new repository in a given namespace.
  # @param owner 
  # @param [Hash] opts the optional parameters
  # @option opts [ReposCreate] :data 
  # @return [Repository]
  describe 'repos_create test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for repos_delete
  # Delete a repository in a given namespace.
  # Delete a repository in a given namespace.
  # @param owner 
  # @param identifier 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'repos_delete test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for repos_list
  # Get a list of all repositories within a namespace.
  # Get a list of all repositories within a namespace.
  # @param owner 
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page A page number within the paginated result set.
  # @option opts [Integer] :page_size Number of results to return per page.
  # @return [Array<Repository>]
  describe 'repos_list test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for repos_partial_update
  # Update details about a repository in a given namespace.
  # Update details about a repository in a given namespace.
  # @param owner 
  # @param identifier 
  # @param [Hash] opts the optional parameters
  # @option opts [ReposPartialUpdate] :data 
  # @return [Repository]
  describe 'repos_partial_update test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for repos_read
  # Get a specific repository.
  # Get a specific repository.
  # @param owner 
  # @param identifier 
  # @param [Hash] opts the optional parameters
  # @return [Repository]
  describe 'repos_read test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
