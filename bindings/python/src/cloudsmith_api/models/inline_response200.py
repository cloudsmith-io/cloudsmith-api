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


class InlineResponse200(object):
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
        'country_code': 'InlineResponse200CountryCode',
        'cidr': 'InlineResponse200CountryCode'
    }

    attribute_map = {
        'country_code': 'country_code',
        'cidr': 'cidr'
    }

    def __init__(self, country_code=None, cidr=None, _configuration=None):  # noqa: E501
        """InlineResponse200 - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._country_code = None
        self._cidr = None
        self.discriminator = None

        if country_code is not None:
            self.country_code = country_code
        if cidr is not None:
            self.cidr = cidr

    @property
    def country_code(self):
        """Gets the country_code of this InlineResponse200.


        :return: The country_code of this InlineResponse200.
        :rtype: InlineResponse200CountryCode
        """
        return self._country_code

    @country_code.setter
    def country_code(self, country_code):
        """Sets the country_code of this InlineResponse200.


        :param country_code: The country_code of this InlineResponse200.
        :type: InlineResponse200CountryCode
        """

        self._country_code = country_code

    @property
    def cidr(self):
        """Gets the cidr of this InlineResponse200.


        :return: The cidr of this InlineResponse200.
        :rtype: InlineResponse200CountryCode
        """
        return self._cidr

    @cidr.setter
    def cidr(self, cidr):
        """Sets the cidr of this InlineResponse200.


        :param cidr: The cidr of this InlineResponse200.
        :type: InlineResponse200CountryCode
        """

        self._cidr = cidr

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
        if issubclass(InlineResponse200, dict):
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
        if not isinstance(other, InlineResponse200):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, InlineResponse200):
            return True

        return self.to_dict() != other.to_dict()
