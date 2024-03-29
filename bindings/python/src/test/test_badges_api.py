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
from cloudsmith_api.api.badges_api import BadgesApi  # noqa: E501
from cloudsmith_api.rest import ApiException


class TestBadgesApi(unittest.TestCase):
    """BadgesApi unit test stubs"""

    def setUp(self):
        self.api = cloudsmith_api.api.badges_api.BadgesApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_badges_version_list(self):
        """Test case for badges_version_list

        Get latest package version for a package or package group.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
