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


class UsageRaw(object):
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
        'limit': 'int',
        'percentage': 'str',
        'used': 'int'
    }

    attribute_map = {
        'limit': 'limit',
        'percentage': 'percentage',
        'used': 'used'
    }

    def __init__(self, limit=None, percentage=None, used=None, _configuration=None):  # noqa: E501
        """UsageRaw - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._limit = None
        self._percentage = None
        self._used = None
        self.discriminator = None

        if limit is not None:
            self.limit = limit
        if percentage is not None:
            self.percentage = percentage
        if used is not None:
            self.used = used

    @property
    def limit(self):
        """Gets the limit of this UsageRaw.


        :return: The limit of this UsageRaw.
        :rtype: int
        """
        return self._limit

    @limit.setter
    def limit(self, limit):
        """Sets the limit of this UsageRaw.


        :param limit: The limit of this UsageRaw.
        :type: int
        """

        self._limit = limit

    @property
    def percentage(self):
        """Gets the percentage of this UsageRaw.


        :return: The percentage of this UsageRaw.
        :rtype: str
        """
        return self._percentage

    @percentage.setter
    def percentage(self, percentage):
        """Sets the percentage of this UsageRaw.


        :param percentage: The percentage of this UsageRaw.
        :type: str
        """

        self._percentage = percentage

    @property
    def used(self):
        """Gets the used of this UsageRaw.


        :return: The used of this UsageRaw.
        :rtype: int
        """
        return self._used

    @used.setter
    def used(self, used):
        """Sets the used of this UsageRaw.


        :param used: The used of this UsageRaw.
        :type: int
        """

        self._used = used

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
        if issubclass(UsageRaw, dict):
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
        if not isinstance(other, UsageRaw):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, UsageRaw):
            return True

        return self.to_dict() != other.to_dict()

