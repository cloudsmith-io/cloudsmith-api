# coding: utf-8

"""
    Cloudsmith API (v1)

    The API to the Cloudsmith Service  # noqa: E501

    OpenAPI spec version: v1
    Contact: support@cloudsmith.io
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import cloudsmith_api
from cloudsmith_api.api.quota_api import QuotaApi  # noqa: E501
from cloudsmith_api.rest import ApiException


class TestQuotaApi(unittest.TestCase):
    """QuotaApi unit test stubs"""

    def setUp(self):
        self.api = cloudsmith_api.api.quota_api.QuotaApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_quota_history_read(self):
        """Test case for quota_history_read

        Quota history for a given namespace.  # noqa: E501
        """
        pass

    def test_quota_oss_history_read(self):
        """Test case for quota_oss_history_read

        Open-source Quota history for a given namespace.  # noqa: E501
        """
        pass

    def test_quota_oss_read(self):
        """Test case for quota_oss_read

        Open-source Quota usage for a given namespace.  # noqa: E501
        """
        pass

    def test_quota_read(self):
        """Test case for quota_read

        Quota usage for a given namespace.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
