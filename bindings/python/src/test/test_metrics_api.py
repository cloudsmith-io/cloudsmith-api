# coding: utf-8

"""
    Cloudsmith API

    The API to the Cloudsmith Service

    OpenAPI spec version: v1
    Contact: support@cloudsmith.io
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import os
import sys
import unittest

import cloudsmith_api
from cloudsmith_api.rest import ApiException
from cloudsmith_api.apis.metrics_api import MetricsApi


class TestMetricsApi(unittest.TestCase):
    """ MetricsApi unit test stubs """

    def setUp(self):
        self.api = cloudsmith_api.apis.metrics_api.MetricsApi()

    def tearDown(self):
        pass

    def test_metrics_entitlements_usage_list(self):
        """
        Test case for metrics_entitlements_usage_list

        View for listing entitlement token usage as a metric.
        """
        pass


if __name__ == '__main__':
    unittest.main()