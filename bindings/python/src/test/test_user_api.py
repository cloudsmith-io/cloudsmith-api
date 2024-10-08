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
from cloudsmith_api.api.user_api import UserApi  # noqa: E501
from cloudsmith_api.rest import ApiException


class TestUserApi(unittest.TestCase):
    """UserApi unit test stubs"""

    def setUp(self):
        self.api = cloudsmith_api.api.user_api.UserApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_user_self(self):
        """Test case for user_self

        Provide a brief for the current user (if any).  # noqa: E501
        """
        pass

    def test_user_token_create(self):
        """Test case for user_token_create

        Retrieve/Create API key/token for the authenticated user.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
