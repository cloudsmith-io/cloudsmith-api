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


class PackageTagRequest(object):
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
        'action': 'int',
        'is_immutable': 'bool',
        'tags': 'list[str]'
    }

    attribute_map = {
        'action': 'action',
        'is_immutable': 'is_immutable',
        'tags': 'tags'
    }

    def __init__(self, action=None, is_immutable=False, tags=None, _configuration=None):  # noqa: E501
        """PackageTagRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._action = None
        self._is_immutable = None
        self._tags = None
        self.discriminator = None

        if action is not None:
            self.action = action
        if is_immutable is not None:
            self.is_immutable = is_immutable
        if tags is not None:
            self.tags = tags

    @property
    def action(self):
        """Gets the action of this PackageTagRequest.


        :return: The action of this PackageTagRequest.
        :rtype: int
        """
        return self._action

    @action.setter
    def action(self, action):
        """Sets the action of this PackageTagRequest.


        :param action: The action of this PackageTagRequest.
        :type: int
        """

        self._action = action

    @property
    def is_immutable(self):
        """Gets the is_immutable of this PackageTagRequest.

        If true, created tags will be immutable. An immutable flag is a tag that cannot be removed from a package.

        :return: The is_immutable of this PackageTagRequest.
        :rtype: bool
        """
        return self._is_immutable

    @is_immutable.setter
    def is_immutable(self, is_immutable):
        """Sets the is_immutable of this PackageTagRequest.

        If true, created tags will be immutable. An immutable flag is a tag that cannot be removed from a package.

        :param is_immutable: The is_immutable of this PackageTagRequest.
        :type: bool
        """

        self._is_immutable = is_immutable

    @property
    def tags(self):
        """Gets the tags of this PackageTagRequest.

        A list of tags to apply the action to. Not required for clears.

        :return: The tags of this PackageTagRequest.
        :rtype: list[str]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """Sets the tags of this PackageTagRequest.

        A list of tags to apply the action to. Not required for clears.

        :param tags: The tags of this PackageTagRequest.
        :type: list[str]
        """

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
        if issubclass(PackageTagRequest, dict):
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
        if not isinstance(other, PackageTagRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, PackageTagRequest):
            return True

        return self.to_dict() != other.to_dict()
