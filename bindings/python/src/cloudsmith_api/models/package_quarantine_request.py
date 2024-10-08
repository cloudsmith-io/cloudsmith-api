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


class PackageQuarantineRequest(object):
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
        'release': 'bool',
        'restore': 'bool'
    }

    attribute_map = {
        'release': 'release',
        'restore': 'restore'
    }

    def __init__(self, release=None, restore=None, _configuration=None):  # noqa: E501
        """PackageQuarantineRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._release = None
        self._restore = None
        self.discriminator = None

        if release is not None:
            self.release = release
        if restore is not None:
            self.restore = restore

    @property
    def release(self):
        """Gets the release of this PackageQuarantineRequest.

        If true, the package is released from quarantine.

        :return: The release of this PackageQuarantineRequest.
        :rtype: bool
        """
        return self._release

    @release.setter
    def release(self, release):
        """Sets the release of this PackageQuarantineRequest.

        If true, the package is released from quarantine.

        :param release: The release of this PackageQuarantineRequest.
        :type: bool
        """

        self._release = release

    @property
    def restore(self):
        """Gets the restore of this PackageQuarantineRequest.

        If true, the package is released from quarantine. Note: This field is deprecated, please use 'release' instead.

        :return: The restore of this PackageQuarantineRequest.
        :rtype: bool
        """
        return self._restore

    @restore.setter
    def restore(self, restore):
        """Sets the restore of this PackageQuarantineRequest.

        If true, the package is released from quarantine. Note: This field is deprecated, please use 'release' instead.

        :param restore: The restore of this PackageQuarantineRequest.
        :type: bool
        """

        self._restore = restore

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
        if issubclass(PackageQuarantineRequest, dict):
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
        if not isinstance(other, PackageQuarantineRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, PackageQuarantineRequest):
            return True

        return self.to_dict() != other.to_dict()

