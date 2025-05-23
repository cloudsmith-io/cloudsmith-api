=begin
#Cloudsmith API (v1)

#The API to the Cloudsmith Service

OpenAPI spec version: v1
Contact: support@cloudsmith.io
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.43

=end

require 'uri'

module CloudsmithApi
  class NamespacesApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Get a list of all namespaces the user belongs to.
    # Get a list of all namespaces the user belongs to.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :page A page number within the paginated result set.
    # @option opts [Integer] :page_size Number of results to return per page.
    # @return [Array<Namespace>]
    def namespaces_list(opts = {})
      data, _status_code, _headers = namespaces_list_with_http_info(opts)
      data
    end

    # Get a list of all namespaces the user belongs to.
    # Get a list of all namespaces the user belongs to.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :page A page number within the paginated result set.
    # @option opts [Integer] :page_size Number of results to return per page.
    # @return [Array<(Array<Namespace>, Fixnum, Hash)>] Array<Namespace> data, response status code and response headers
    def namespaces_list_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: NamespacesApi.namespaces_list ...'
      end
      # resource path
      local_var_path = '/namespaces/'

      # query parameters
      query_params = {}
      query_params[:'page'] = opts[:'page'] if !opts[:'page'].nil?
      query_params[:'page_size'] = opts[:'page_size'] if !opts[:'page_size'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['apikey', 'basic']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<Namespace>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: NamespacesApi#namespaces_list\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get a specific namespace that the user belongs to.
    # Get a specific namespace that the user belongs to.
    # @param slug 
    # @param [Hash] opts the optional parameters
    # @return [Namespace]
    def namespaces_read(slug, opts = {})
      data, _status_code, _headers = namespaces_read_with_http_info(slug, opts)
      data
    end

    # Get a specific namespace that the user belongs to.
    # Get a specific namespace that the user belongs to.
    # @param slug 
    # @param [Hash] opts the optional parameters
    # @return [Array<(Namespace, Fixnum, Hash)>] Namespace data, response status code and response headers
    def namespaces_read_with_http_info(slug, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: NamespacesApi.namespaces_read ...'
      end
      # verify the required parameter 'slug' is set
      if @api_client.config.client_side_validation && slug.nil?
        fail ArgumentError, "Missing the required parameter 'slug' when calling NamespacesApi.namespaces_read"
      end
      # resource path
      local_var_path = '/namespaces/{slug}/'.sub('{' + 'slug' + '}', slug.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['apikey', 'basic']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Namespace')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: NamespacesApi#namespaces_read\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
