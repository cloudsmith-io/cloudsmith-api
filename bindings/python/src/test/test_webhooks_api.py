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
from cloudsmith_api.apis.webhooks_api import WebhooksApi


class TestWebhooksApi(unittest.TestCase):
    """ WebhooksApi unit test stubs """

    def setUp(self):
        self.api = cloudsmith_api.apis.webhooks_api.WebhooksApi()

    def tearDown(self):
        pass

    def test_webhooks_create(self):
        """
        Test case for webhooks_create

        Create a specific webhook in a repository.
        """
        pass

    def test_webhooks_delete(self):
        """
        Test case for webhooks_delete

        Delete a specific webhook in a repository.
        """
        pass

    def test_webhooks_list(self):
        """
        Test case for webhooks_list

        Get a list of all webhooks in a repository.
        """
        pass

    def test_webhooks_partial_update(self):
        """
        Test case for webhooks_partial_update

        Update a specific webhook in a repository.
        """
        pass

    def test_webhooks_read(self):
        """
        Test case for webhooks_read

        Views for working with repository webhooks.
        """
        pass


if __name__ == '__main__':
    unittest.main()
