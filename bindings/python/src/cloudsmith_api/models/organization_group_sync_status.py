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


class OrganizationGroupSyncStatus(object):
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
        'saml_group_sync_status': 'bool'
    }

    attribute_map = {
        'saml_group_sync_status': 'saml_group_sync_status'
    }

    def __init__(self, saml_group_sync_status=None, _configuration=None):  # noqa: E501
        """OrganizationGroupSyncStatus - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._saml_group_sync_status = None
        self.discriminator = None

        if saml_group_sync_status is not None:
            self.saml_group_sync_status = saml_group_sync_status

    @property
    def saml_group_sync_status(self):
        """Gets the saml_group_sync_status of this OrganizationGroupSyncStatus.


        :return: The saml_group_sync_status of this OrganizationGroupSyncStatus.
        :rtype: bool
        """
        return self._saml_group_sync_status

    @saml_group_sync_status.setter
    def saml_group_sync_status(self, saml_group_sync_status):
        """Sets the saml_group_sync_status of this OrganizationGroupSyncStatus.


        :param saml_group_sync_status: The saml_group_sync_status of this OrganizationGroupSyncStatus.
        :type: bool
        """

        self._saml_group_sync_status = saml_group_sync_status

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
        if issubclass(OrganizationGroupSyncStatus, dict):
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
        if not isinstance(other, OrganizationGroupSyncStatus):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, OrganizationGroupSyncStatus):
            return True

        return self.to_dict() != other.to_dict()
