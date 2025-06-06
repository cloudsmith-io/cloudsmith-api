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

# Unit tests for CloudsmithApi::WebhooksApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'WebhooksApi' do
  before do
    # run before each test
    @instance = CloudsmithApi::WebhooksApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of WebhooksApi' do
    it 'should create an instance of WebhooksApi' do
      expect(@instance).to be_instance_of(CloudsmithApi::WebhooksApi)
    end
  end

  # unit tests for webhooks_create
  # Create a specific webhook in a repository.
  # Create a specific webhook in a repository.
  # @param owner 
  # @param repo 
  # @param [Hash] opts the optional parameters
  # @option opts [RepositoryWebhookRequest] :data 
  # @return [RepositoryWebhook]
  describe 'webhooks_create test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for webhooks_delete
  # Delete a specific webhook in a repository.
  # Delete a specific webhook in a repository.
  # @param owner 
  # @param repo 
  # @param identifier 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'webhooks_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for webhooks_list
  # Get a list of all webhooks in a repository.
  # Get a list of all webhooks in a repository.
  # @param owner 
  # @param repo 
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page A page number within the paginated result set.
  # @option opts [Integer] :page_size Number of results to return per page.
  # @return [Array<RepositoryWebhook>]
  describe 'webhooks_list test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for webhooks_partial_update
  # Update a specific webhook in a repository.
  # Update a specific webhook in a repository.
  # @param owner 
  # @param repo 
  # @param identifier 
  # @param [Hash] opts the optional parameters
  # @option opts [RepositoryWebhookRequestPatch] :data 
  # @return [RepositoryWebhook]
  describe 'webhooks_partial_update test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for webhooks_read
  # Views for working with repository webhooks.
  # Views for working with repository webhooks.
  # @param owner 
  # @param repo 
  # @param identifier 
  # @param [Hash] opts the optional parameters
  # @return [RepositoryWebhook]
  describe 'webhooks_read test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
