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
from cloudsmith_api.apis.files_api import FilesApi


class TestFilesApi(unittest.TestCase):
    """ FilesApi unit test stubs """

    def setUp(self):
        self.api = cloudsmith_api.apis.files_api.FilesApi()

    def tearDown(self):
        pass

    def test_files_abort(self):
        """
        Test case for files_abort

        Abort a multipart file upload.
        """
        pass

    def test_files_complete(self):
        """
        Test case for files_complete

        Complete a multipart file upload.
        """
        pass

    def test_files_create(self):
        """
        Test case for files_create

        Request URL(s) to upload new package file upload(s) to.
        """
        pass

    def test_files_info(self):
        """
        Test case for files_info

        Get upload information for a multipart file upload.
        """
        pass

    def test_files_validate(self):
        """
        Test case for files_validate

        Validate parameters used for create.
        """
        pass


if __name__ == '__main__':
    unittest.main()
