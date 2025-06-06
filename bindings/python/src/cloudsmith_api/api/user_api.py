# coding: utf-8

"""
    Cloudsmith API (v1)

    The API to the Cloudsmith Service  # noqa: E501

    OpenAPI spec version: v1
    Contact: support@cloudsmith.io
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from cloudsmith_api.api_client import ApiClient


class UserApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def user_self(self, **kwargs):  # noqa: E501
        """Provide a brief for the current user (if any).  # noqa: E501

        Provide a brief for the current user (if any).  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.user_self(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: UserBrief
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.user_self_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.user_self_with_http_info(**kwargs)  # noqa: E501
            return data

    def user_self_with_http_info(self, **kwargs):  # noqa: E501
        """Provide a brief for the current user (if any).  # noqa: E501

        Provide a brief for the current user (if any).  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.user_self_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: UserBrief
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = []  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method user_self" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apikey', 'basic']  # noqa: E501

        return self.api_client.call_api(
            '/user/self/', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='UserBrief',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def user_token_create(self, **kwargs):  # noqa: E501
        """Create or retrieve API token for a user.  # noqa: E501

        Handles both: - Users authenticating with basic credentials to get a token - Two-factor authentication flow  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.user_token_create(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param UserAuthTokenRequest data:
        :return: UserAuthToken
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.user_token_create_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.user_token_create_with_http_info(**kwargs)  # noqa: E501
            return data

    def user_token_create_with_http_info(self, **kwargs):  # noqa: E501
        """Create or retrieve API token for a user.  # noqa: E501

        Handles both: - Users authenticating with basic credentials to get a token - Two-factor authentication flow  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.user_token_create_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param UserAuthTokenRequest data:
        :return: UserAuthToken
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['data']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method user_token_create" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'data' in params:
            body_params = params['data']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['basic']  # noqa: E501

        return self.api_client.call_api(
            '/user/token/', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='UserAuthToken',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def user_tokens_create(self, **kwargs):  # noqa: E501
        """Create an API key for the user that is currently authenticated.  # noqa: E501

        Create an API key for the user that is currently authenticated.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.user_tokens_create(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: UserAuthenticationToken
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.user_tokens_create_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.user_tokens_create_with_http_info(**kwargs)  # noqa: E501
            return data

    def user_tokens_create_with_http_info(self, **kwargs):  # noqa: E501
        """Create an API key for the user that is currently authenticated.  # noqa: E501

        Create an API key for the user that is currently authenticated.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.user_tokens_create_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: UserAuthenticationToken
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = []  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method user_tokens_create" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apikey', 'basic']  # noqa: E501

        return self.api_client.call_api(
            '/user/tokens/', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='UserAuthenticationToken',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def user_tokens_list(self, **kwargs):  # noqa: E501
        """Retrieve the API key assigned to the user that is currently authenticated.  # noqa: E501

        Retrieve the API key assigned to the user that is currently authenticated.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.user_tokens_list(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int page: A page number within the paginated result set.
        :param int page_size: Number of results to return per page.
        :return: InlineResponse2001
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.user_tokens_list_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.user_tokens_list_with_http_info(**kwargs)  # noqa: E501
            return data

    def user_tokens_list_with_http_info(self, **kwargs):  # noqa: E501
        """Retrieve the API key assigned to the user that is currently authenticated.  # noqa: E501

        Retrieve the API key assigned to the user that is currently authenticated.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.user_tokens_list_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int page: A page number within the paginated result set.
        :param int page_size: Number of results to return per page.
        :return: InlineResponse2001
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['page', 'page_size']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method user_tokens_list" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'page' in params:
            query_params.append(('page', params['page']))  # noqa: E501
        if 'page_size' in params:
            query_params.append(('page_size', params['page_size']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apikey', 'basic']  # noqa: E501

        return self.api_client.call_api(
            '/user/tokens/', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='InlineResponse2001',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def user_tokens_refresh(self, slug_perm, **kwargs):  # noqa: E501
        """Refresh the specified API key for the user that is currently authenticated.  # noqa: E501

        Refresh the specified API key for the user that is currently authenticated.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.user_tokens_refresh(slug_perm, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str slug_perm: (required)
        :return: UserAuthenticationToken
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.user_tokens_refresh_with_http_info(slug_perm, **kwargs)  # noqa: E501
        else:
            (data) = self.user_tokens_refresh_with_http_info(slug_perm, **kwargs)  # noqa: E501
            return data

    def user_tokens_refresh_with_http_info(self, slug_perm, **kwargs):  # noqa: E501
        """Refresh the specified API key for the user that is currently authenticated.  # noqa: E501

        Refresh the specified API key for the user that is currently authenticated.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.user_tokens_refresh_with_http_info(slug_perm, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str slug_perm: (required)
        :return: UserAuthenticationToken
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['slug_perm']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method user_tokens_refresh" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'slug_perm' is set
        if self.api_client.client_side_validation and ('slug_perm' not in params or
                                                       params['slug_perm'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `slug_perm` when calling `user_tokens_refresh`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'slug_perm' in params:
            path_params['slug_perm'] = params['slug_perm']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apikey', 'basic']  # noqa: E501

        return self.api_client.call_api(
            '/user/tokens/{slug_perm}/refresh/', 'PUT',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='UserAuthenticationToken',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
