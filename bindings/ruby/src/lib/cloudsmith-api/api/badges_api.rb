=begin
#Cloudsmith API

#The API to the Cloudsmith Service

OpenAPI spec version: v1
Contact: support@cloudsmith.io
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.2.3

=end

require "uri"

module CloudsmithApi
  class BadgesApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # Get latest package version for a package or package group.
    # Get latest package version for a package or package group.
    # @param owner 
    # @param repo 
    # @param package_format 
    # @param package_name 
    # @param package_version 
    # @param package_identifiers 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :badge_token Badge token to authenticate for private packages
    # @option opts [BOOLEAN] :render If true, badge will be rendered
    # @return [nil]
    def badges_version_list(owner, repo, package_format, package_name, package_version, package_identifiers, opts = {})
      badges_version_list_with_http_info(owner, repo, package_format, package_name, package_version, package_identifiers, opts)
      return nil
    end

    # Get latest package version for a package or package group.
    # Get latest package version for a package or package group.
    # @param owner 
    # @param repo 
    # @param package_format 
    # @param package_name 
    # @param package_version 
    # @param package_identifiers 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :badge_token Badge token to authenticate for private packages
    # @option opts [BOOLEAN] :render If true, badge will be rendered
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def badges_version_list_with_http_info(owner, repo, package_format, package_name, package_version, package_identifiers, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: BadgesApi.badges_version_list ..."
      end
      # verify the required parameter 'owner' is set
      if @api_client.config.client_side_validation && owner.nil?
        fail ArgumentError, "Missing the required parameter 'owner' when calling BadgesApi.badges_version_list"
      end
      # verify the required parameter 'repo' is set
      if @api_client.config.client_side_validation && repo.nil?
        fail ArgumentError, "Missing the required parameter 'repo' when calling BadgesApi.badges_version_list"
      end
      # verify the required parameter 'package_format' is set
      if @api_client.config.client_side_validation && package_format.nil?
        fail ArgumentError, "Missing the required parameter 'package_format' when calling BadgesApi.badges_version_list"
      end
      # verify the required parameter 'package_name' is set
      if @api_client.config.client_side_validation && package_name.nil?
        fail ArgumentError, "Missing the required parameter 'package_name' when calling BadgesApi.badges_version_list"
      end
      # verify the required parameter 'package_version' is set
      if @api_client.config.client_side_validation && package_version.nil?
        fail ArgumentError, "Missing the required parameter 'package_version' when calling BadgesApi.badges_version_list"
      end
      # verify the required parameter 'package_identifiers' is set
      if @api_client.config.client_side_validation && package_identifiers.nil?
        fail ArgumentError, "Missing the required parameter 'package_identifiers' when calling BadgesApi.badges_version_list"
      end
      # resource path
      local_var_path = "/badges/version/{owner}/{repo}/{package_format}/{package_name}/{package_version}/{package_identifiers}/".sub('{' + 'owner' + '}', owner.to_s).sub('{' + 'repo' + '}', repo.to_s).sub('{' + 'package_format' + '}', package_format.to_s).sub('{' + 'package_name' + '}', package_name.to_s).sub('{' + 'package_version' + '}', package_version.to_s).sub('{' + 'package_identifiers' + '}', package_identifiers.to_s)

      # query parameters
      query_params = {}
      query_params[:'badge_token'] = opts[:'badge_token'] if !opts[:'badge_token'].nil?
      query_params[:'render'] = opts[:'render'] if !opts[:'render'].nil?

      # header parameters
      header_params = {}

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['apikey', 'csrf_token']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BadgesApi#badges_version_list\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end