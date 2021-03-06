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
from cloudsmith_api.apis.entitlements_api import EntitlementsApi


class TestEntitlementsApi(unittest.TestCase):
    """ EntitlementsApi unit test stubs """

    def setUp(self):
        self.api = cloudsmith_api.apis.entitlements_api.EntitlementsApi()

    def tearDown(self):
        pass

    def test_entitlements_create(self):
        """
        Test case for entitlements_create

        Create a specific entitlement in a repository.
        """
        pass

    def test_entitlements_delete(self):
        """
        Test case for entitlements_delete

        Delete a specific entitlement in a repository.
        """
        pass

    def test_entitlements_disable(self):
        """
        Test case for entitlements_disable

        Disable an entitlement token in a repository.
        """
        pass

    def test_entitlements_enable(self):
        """
        Test case for entitlements_enable

        Enable an entitlement token in a repository.
        """
        pass

    def test_entitlements_list(self):
        """
        Test case for entitlements_list

        Get a list of all entitlements in a repository.
        """
        pass

    def test_entitlements_partial_update(self):
        """
        Test case for entitlements_partial_update

        Update a specific entitlement in a repository.
        """
        pass

    def test_entitlements_read(self):
        """
        Test case for entitlements_read

        Get a specific entitlement in a repository.
        """
        pass

    def test_entitlements_refresh(self):
        """
        Test case for entitlements_refresh

        Refresh an entitlement token in a repository.
        """
        pass

    def test_entitlements_reset(self):
        """
        Test case for entitlements_reset

        Reset the statistics for an entitlement token in a repository.
        """
        pass

    def test_entitlements_sync(self):
        """
        Test case for entitlements_sync

        Synchronise tokens from a source repository.
        """
        pass


if __name__ == '__main__':
    unittest.main()
