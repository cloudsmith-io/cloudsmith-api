# coding: utf-8

"""
    Cloudsmith API

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


class MetricsApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def metrics_entitlements_list(self, owner, **kwargs):  # noqa: E501
        """View for listing entitlement token metrics, across an account.  # noqa: E501

        View for listing entitlement token metrics, across an account.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.metrics_entitlements_list(owner, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str owner:  (required)
        :param int page: A page number within the paginated result set.
        :param int page_size: Number of results to return per page.
        :param str finish: Include metrics upto and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
        :param str start: Include metrics from and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
        :param str tokens: A comma seperated list of tokens (slug perm) to include in the results.
        :return: EntitlementUsageMetrics
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.metrics_entitlements_list_with_http_info(owner, **kwargs)  # noqa: E501
        else:
            (data) = self.metrics_entitlements_list_with_http_info(owner, **kwargs)  # noqa: E501
            return data

    def metrics_entitlements_list_with_http_info(self, owner, **kwargs):  # noqa: E501
        """View for listing entitlement token metrics, across an account.  # noqa: E501

        View for listing entitlement token metrics, across an account.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.metrics_entitlements_list_with_http_info(owner, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str owner:  (required)
        :param int page: A page number within the paginated result set.
        :param int page_size: Number of results to return per page.
        :param str finish: Include metrics upto and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
        :param str start: Include metrics from and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
        :param str tokens: A comma seperated list of tokens (slug perm) to include in the results.
        :return: EntitlementUsageMetrics
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['owner', 'page', 'page_size', 'finish', 'start', 'tokens']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method metrics_entitlements_list" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'owner' is set
        if self.api_client.client_side_validation and ('owner' not in params or
                                                       params['owner'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `owner` when calling `metrics_entitlements_list`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'owner' in params:
            path_params['owner'] = params['owner']  # noqa: E501

        query_params = []
        if 'page' in params:
            query_params.append(('page', params['page']))  # noqa: E501
        if 'page_size' in params:
            query_params.append(('page_size', params['page_size']))  # noqa: E501
        if 'finish' in params:
            query_params.append(('finish', params['finish']))  # noqa: E501
        if 'start' in params:
            query_params.append(('start', params['start']))  # noqa: E501
        if 'tokens' in params:
            query_params.append(('tokens', params['tokens']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikey']  # noqa: E501

        return self.api_client.call_api(
            '/metrics/entitlements/{owner}/', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='EntitlementUsageMetrics',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def metrics_entitlements_list0(self, owner, repo, **kwargs):  # noqa: E501
        """View for listing entitlement token metrics, for a repository.  # noqa: E501

        View for listing entitlement token metrics, for a repository.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.metrics_entitlements_list0(owner, repo, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str owner:  (required)
        :param str repo:  (required)
        :param int page: A page number within the paginated result set.
        :param int page_size: Number of results to return per page.
        :param str finish: Include metrics upto and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
        :param str start: Include metrics from and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
        :param str tokens: A comma seperated list of tokens (slug perm) to include in the results.
        :return: EntitlementUsageMetrics
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.metrics_entitlements_list0_with_http_info(owner, repo, **kwargs)  # noqa: E501
        else:
            (data) = self.metrics_entitlements_list0_with_http_info(owner, repo, **kwargs)  # noqa: E501
            return data

    def metrics_entitlements_list0_with_http_info(self, owner, repo, **kwargs):  # noqa: E501
        """View for listing entitlement token metrics, for a repository.  # noqa: E501

        View for listing entitlement token metrics, for a repository.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.metrics_entitlements_list0_with_http_info(owner, repo, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str owner:  (required)
        :param str repo:  (required)
        :param int page: A page number within the paginated result set.
        :param int page_size: Number of results to return per page.
        :param str finish: Include metrics upto and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
        :param str start: Include metrics from and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
        :param str tokens: A comma seperated list of tokens (slug perm) to include in the results.
        :return: EntitlementUsageMetrics
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['owner', 'repo', 'page', 'page_size', 'finish', 'start', 'tokens']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method metrics_entitlements_list0" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'owner' is set
        if self.api_client.client_side_validation and ('owner' not in params or
                                                       params['owner'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `owner` when calling `metrics_entitlements_list0`")  # noqa: E501
        # verify the required parameter 'repo' is set
        if self.api_client.client_side_validation and ('repo' not in params or
                                                       params['repo'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `repo` when calling `metrics_entitlements_list0`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'owner' in params:
            path_params['owner'] = params['owner']  # noqa: E501
        if 'repo' in params:
            path_params['repo'] = params['repo']  # noqa: E501

        query_params = []
        if 'page' in params:
            query_params.append(('page', params['page']))  # noqa: E501
        if 'page_size' in params:
            query_params.append(('page_size', params['page_size']))  # noqa: E501
        if 'finish' in params:
            query_params.append(('finish', params['finish']))  # noqa: E501
        if 'start' in params:
            query_params.append(('start', params['start']))  # noqa: E501
        if 'tokens' in params:
            query_params.append(('tokens', params['tokens']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikey']  # noqa: E501

        return self.api_client.call_api(
            '/metrics/entitlements/{owner}/{repo}/', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='EntitlementUsageMetrics',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def metrics_packages_list(self, owner, repo, **kwargs):  # noqa: E501
        """View for listing package usage metrics, for a repository.  # noqa: E501

        View for listing package usage metrics, for a repository.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.metrics_packages_list(owner, repo, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str owner:  (required)
        :param str repo:  (required)
        :param int page: A page number within the paginated result set.
        :param int page_size: Number of results to return per page.
        :param str finish: Include metrics upto and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
        :param str packages: A comma seperated list of packages (slug perm) to include in the results.
        :param str start: Include metrics from and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
        :return: PackageUsageMetrics
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.metrics_packages_list_with_http_info(owner, repo, **kwargs)  # noqa: E501
        else:
            (data) = self.metrics_packages_list_with_http_info(owner, repo, **kwargs)  # noqa: E501
            return data

    def metrics_packages_list_with_http_info(self, owner, repo, **kwargs):  # noqa: E501
        """View for listing package usage metrics, for a repository.  # noqa: E501

        View for listing package usage metrics, for a repository.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.metrics_packages_list_with_http_info(owner, repo, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str owner:  (required)
        :param str repo:  (required)
        :param int page: A page number within the paginated result set.
        :param int page_size: Number of results to return per page.
        :param str finish: Include metrics upto and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
        :param str packages: A comma seperated list of packages (slug perm) to include in the results.
        :param str start: Include metrics from and including this UTC date or UTC datetime. For example '2020-12-31' or '2021-12-13T00:00:00Z'.
        :return: PackageUsageMetrics
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['owner', 'repo', 'page', 'page_size', 'finish', 'packages', 'start']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method metrics_packages_list" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'owner' is set
        if self.api_client.client_side_validation and ('owner' not in params or
                                                       params['owner'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `owner` when calling `metrics_packages_list`")  # noqa: E501
        # verify the required parameter 'repo' is set
        if self.api_client.client_side_validation and ('repo' not in params or
                                                       params['repo'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `repo` when calling `metrics_packages_list`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'owner' in params:
            path_params['owner'] = params['owner']  # noqa: E501
        if 'repo' in params:
            path_params['repo'] = params['repo']  # noqa: E501

        query_params = []
        if 'page' in params:
            query_params.append(('page', params['page']))  # noqa: E501
        if 'page_size' in params:
            query_params.append(('page_size', params['page_size']))  # noqa: E501
        if 'finish' in params:
            query_params.append(('finish', params['finish']))  # noqa: E501
        if 'packages' in params:
            query_params.append(('packages', params['packages']))  # noqa: E501
        if 'start' in params:
            query_params.append(('start', params['start']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikey']  # noqa: E501

        return self.api_client.call_api(
            '/metrics/packages/{owner}/{repo}/', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='PackageUsageMetrics',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)