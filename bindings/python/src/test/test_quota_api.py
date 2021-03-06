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
from cloudsmith_api.apis.quota_api import QuotaApi


class TestQuotaApi(unittest.TestCase):
    """ QuotaApi unit test stubs """

    def setUp(self):
        self.api = cloudsmith_api.apis.quota_api.QuotaApi()

    def tearDown(self):
        pass

    def test_quota_history_read(self):
        """
        Test case for quota_history_read

        Quota history for a given namespace.
        """
        pass

    def test_quota_oss_history_read(self):
        """
        Test case for quota_oss_history_read

        Open-source Quota history for a given namespace.
        """
        pass

    def test_quota_oss_read(self):
        """
        Test case for quota_oss_read

        Open-source Quota usage for a given namespace.
        """
        pass

    def test_quota_read(self):
        """
        Test case for quota_read

        Quota usage for a given namespace.
        """
        pass


if __name__ == '__main__':
    unittest.main()
