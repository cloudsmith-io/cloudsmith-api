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


class Eula(object):
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
        'identifier': 'str',
        'number': 'int'
    }

    attribute_map = {
        'identifier': 'identifier',
        'number': 'number'
    }

    def __init__(self, identifier=None, number=None, _configuration=None):  # noqa: E501
        """Eula - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._identifier = None
        self._number = None
        self.discriminator = None

        if identifier is not None:
            self.identifier = identifier
        self.number = number

    @property
    def identifier(self):
        """Gets the identifier of this Eula.

        A unique identifier that you can use for your own EULA tracking purposes. This might be a date, or a semantic version, etc. The only requirement is that it is unique across multiple EULAs.

        :return: The identifier of this Eula.
        :rtype: str
        """
        return self._identifier

    @identifier.setter
    def identifier(self, identifier):
        """Sets the identifier of this Eula.

        A unique identifier that you can use for your own EULA tracking purposes. This might be a date, or a semantic version, etc. The only requirement is that it is unique across multiple EULAs.

        :param identifier: The identifier of this Eula.
        :type: str
        """
        if (self._configuration.client_side_validation and
                identifier is not None and len(identifier) > 16):
            raise ValueError("Invalid value for `identifier`, length must be less than or equal to `16`")  # noqa: E501
        if (self._configuration.client_side_validation and
                identifier is not None and not re.search('^[-a-zA-Z0-9_]+$', identifier)):  # noqa: E501
            raise ValueError(r"Invalid value for `identifier`, must be a follow pattern or equal to `/^[-a-zA-Z0-9_]+$/`")  # noqa: E501

        self._identifier = identifier

    @property
    def number(self):
        """Gets the number of this Eula.

        A sequential identifier that increments by one for each new commit in a repository.

        :return: The number of this Eula.
        :rtype: int
        """
        return self._number

    @number.setter
    def number(self, number):
        """Sets the number of this Eula.

        A sequential identifier that increments by one for each new commit in a repository.

        :param number: The number of this Eula.
        :type: int
        """
        if self._configuration.client_side_validation and number is None:
            raise ValueError("Invalid value for `number`, must not be `None`")  # noqa: E501
        if (self._configuration.client_side_validation and
                number is not None and number > 2147483647):  # noqa: E501
            raise ValueError("Invalid value for `number`, must be a value less than or equal to `2147483647`")  # noqa: E501
        if (self._configuration.client_side_validation and
                number is not None and number < 0):  # noqa: E501
            raise ValueError("Invalid value for `number`, must be a value greater than or equal to `0`")  # noqa: E501

        self._number = number

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
        if issubclass(Eula, dict):
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
        if not isinstance(other, Eula):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Eula):
            return True

        return self.to_dict() != other.to_dict()
