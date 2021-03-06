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
from cloudsmith_api.apis.formats_api import FormatsApi


class TestFormatsApi(unittest.TestCase):
    """ FormatsApi unit test stubs """

    def setUp(self):
        self.api = cloudsmith_api.apis.formats_api.FormatsApi()

    def tearDown(self):
        pass

    def test_formats_list(self):
        """
        Test case for formats_list

        Get a list of all supported package formats.
        """
        pass

    def test_formats_read(self):
        """
        Test case for formats_read

        Get a specific supported package format.
        """
        pass


if __name__ == '__main__':
    unittest.main()
