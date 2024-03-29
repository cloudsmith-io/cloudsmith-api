# coding: utf-8

"""
    Cloudsmith API (v1)

    The API to the Cloudsmith Service  # noqa: E501

    OpenAPI spec version: v1
    Contact: support@cloudsmith.io
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from cloudsmith_api.configuration import Configuration


class NugetPackageUploadRequest(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'package_file': 'str',
        'republish': 'bool',
        'symbols_file': 'str',
        'tags': 'str'
    }

    attribute_map = {
        'package_file': 'package_file',
        'republish': 'republish',
        'symbols_file': 'symbols_file',
        'tags': 'tags'
    }

    def __init__(self, package_file=None, republish=None, symbols_file=None, tags=None, _configuration=None):  # noqa: E501
        """NugetPackageUploadRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._package_file = None
        self._republish = None
        self._symbols_file = None
        self._tags = None
        self.discriminator = None

        self.package_file = package_file
        if republish is not None:
            self.republish = republish
        if symbols_file is not None:
            self.symbols_file = symbols_file
        if tags is not None:
            self.tags = tags

    @property
    def package_file(self):
        """Gets the package_file of this NugetPackageUploadRequest.

        The primary file for the package.

        :return: The package_file of this NugetPackageUploadRequest.
        :rtype: str
        """
        return self._package_file

    @package_file.setter
    def package_file(self, package_file):
        """Sets the package_file of this NugetPackageUploadRequest.

        The primary file for the package.

        :param package_file: The package_file of this NugetPackageUploadRequest.
        :type: str
        """
        if self._configuration.client_side_validation and package_file is None:
            raise ValueError("Invalid value for `package_file`, must not be `None`")  # noqa: E501
        if (self._configuration.client_side_validation and
                package_file is not None and len(package_file) < 1):
            raise ValueError("Invalid value for `package_file`, length must be greater than or equal to `1`")  # noqa: E501

        self._package_file = package_file

    @property
    def republish(self):
        """Gets the republish of this NugetPackageUploadRequest.

        If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate.

        :return: The republish of this NugetPackageUploadRequest.
        :rtype: bool
        """
        return self._republish

    @republish.setter
    def republish(self, republish):
        """Sets the republish of this NugetPackageUploadRequest.

        If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate.

        :param republish: The republish of this NugetPackageUploadRequest.
        :type: bool
        """

        self._republish = republish

    @property
    def symbols_file(self):
        """Gets the symbols_file of this NugetPackageUploadRequest.

        Uploads a symbols file as a separate package

        :return: The symbols_file of this NugetPackageUploadRequest.
        :rtype: str
        """
        return self._symbols_file

    @symbols_file.setter
    def symbols_file(self, symbols_file):
        """Sets the symbols_file of this NugetPackageUploadRequest.

        Uploads a symbols file as a separate package

        :param symbols_file: The symbols_file of this NugetPackageUploadRequest.
        :type: str
        """
        if (self._configuration.client_side_validation and
                symbols_file is not None and len(symbols_file) < 1):
            raise ValueError("Invalid value for `symbols_file`, length must be greater than or equal to `1`")  # noqa: E501

        self._symbols_file = symbols_file

    @property
    def tags(self):
        """Gets the tags of this NugetPackageUploadRequest.

        A comma-separated values list of tags to add to the package.

        :return: The tags of this NugetPackageUploadRequest.
        :rtype: str
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """Sets the tags of this NugetPackageUploadRequest.

        A comma-separated values list of tags to add to the package.

        :param tags: The tags of this NugetPackageUploadRequest.
        :type: str
        """
        if (self._configuration.client_side_validation and
                tags is not None and len(tags) > 1024):
            raise ValueError("Invalid value for `tags`, length must be less than or equal to `1024`")  # noqa: E501
        if (self._configuration.client_side_validation and
                tags is not None and len(tags) < 1):
            raise ValueError("Invalid value for `tags`, length must be greater than or equal to `1`")  # noqa: E501

        self._tags = tags

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(NugetPackageUploadRequest, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, NugetPackageUploadRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, NugetPackageUploadRequest):
            return True

        return self.to_dict() != other.to_dict()

