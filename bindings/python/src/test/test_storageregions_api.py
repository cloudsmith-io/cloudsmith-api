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
from cloudsmith_api.apis.storageregions_api import StorageregionsApi


class TestStorageregionsApi(unittest.TestCase):
    """ StorageregionsApi unit test stubs """

    def setUp(self):
        self.api = cloudsmith_api.apis.storageregions_api.StorageregionsApi()

    def tearDown(self):
        pass

    def test_storage_regions_list(self):
        """
        Test case for storage_regions_list

        Get a list of all available storage regions.
        """
        pass

    def test_storage_regions_read(self):
        """
        Test case for storage_regions_read

        Get a specific storage region.
        """
        pass


if __name__ == '__main__':
    unittest.main()
