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


class OrganizationSAMLAuthRequestPatch(object):
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
        'saml_auth_enabled': 'bool',
        'saml_auth_enforced': 'bool',
        'saml_metadata_inline': 'str',
        'saml_metadata_url': 'str'
    }

    attribute_map = {
        'saml_auth_enabled': 'saml_auth_enabled',
        'saml_auth_enforced': 'saml_auth_enforced',
        'saml_metadata_inline': 'saml_metadata_inline',
        'saml_metadata_url': 'saml_metadata_url'
    }

    def __init__(self, saml_auth_enabled=None, saml_auth_enforced=None, saml_metadata_inline=None, saml_metadata_url=None, _configuration=None):  # noqa: E501
        """OrganizationSAMLAuthRequestPatch - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._saml_auth_enabled = None
        self._saml_auth_enforced = None
        self._saml_metadata_inline = None
        self._saml_metadata_url = None
        self.discriminator = None

        if saml_auth_enabled is not None:
            self.saml_auth_enabled = saml_auth_enabled
        if saml_auth_enforced is not None:
            self.saml_auth_enforced = saml_auth_enforced
        if saml_metadata_inline is not None:
            self.saml_metadata_inline = saml_metadata_inline
        if saml_metadata_url is not None:
            self.saml_metadata_url = saml_metadata_url

    @property
    def saml_auth_enabled(self):
        """Gets the saml_auth_enabled of this OrganizationSAMLAuthRequestPatch.


        :return: The saml_auth_enabled of this OrganizationSAMLAuthRequestPatch.
        :rtype: bool
        """
        return self._saml_auth_enabled

    @saml_auth_enabled.setter
    def saml_auth_enabled(self, saml_auth_enabled):
        """Sets the saml_auth_enabled of this OrganizationSAMLAuthRequestPatch.


        :param saml_auth_enabled: The saml_auth_enabled of this OrganizationSAMLAuthRequestPatch.
        :type: bool
        """

        self._saml_auth_enabled = saml_auth_enabled

    @property
    def saml_auth_enforced(self):
        """Gets the saml_auth_enforced of this OrganizationSAMLAuthRequestPatch.


        :return: The saml_auth_enforced of this OrganizationSAMLAuthRequestPatch.
        :rtype: bool
        """
        return self._saml_auth_enforced

    @saml_auth_enforced.setter
    def saml_auth_enforced(self, saml_auth_enforced):
        """Sets the saml_auth_enforced of this OrganizationSAMLAuthRequestPatch.


        :param saml_auth_enforced: The saml_auth_enforced of this OrganizationSAMLAuthRequestPatch.
        :type: bool
        """

        self._saml_auth_enforced = saml_auth_enforced

    @property
    def saml_metadata_inline(self):
        """Gets the saml_metadata_inline of this OrganizationSAMLAuthRequestPatch.

        If configured, SAML metadata will be used as entered instead of retrieved from a remote URL.

        :return: The saml_metadata_inline of this OrganizationSAMLAuthRequestPatch.
        :rtype: str
        """
        return self._saml_metadata_inline

    @saml_metadata_inline.setter
    def saml_metadata_inline(self, saml_metadata_inline):
        """Sets the saml_metadata_inline of this OrganizationSAMLAuthRequestPatch.

        If configured, SAML metadata will be used as entered instead of retrieved from a remote URL.

        :param saml_metadata_inline: The saml_metadata_inline of this OrganizationSAMLAuthRequestPatch.
        :type: str
        """
        if (self._configuration.client_side_validation and
                saml_metadata_inline is not None and len(saml_metadata_inline) > 32000):
            raise ValueError("Invalid value for `saml_metadata_inline`, length must be less than or equal to `32000`")  # noqa: E501

        self._saml_metadata_inline = saml_metadata_inline

    @property
    def saml_metadata_url(self):
        """Gets the saml_metadata_url of this OrganizationSAMLAuthRequestPatch.

        If configured, SAML metadata be retrieved from a remote URL.

        :return: The saml_metadata_url of this OrganizationSAMLAuthRequestPatch.
        :rtype: str
        """
        return self._saml_metadata_url

    @saml_metadata_url.setter
    def saml_metadata_url(self, saml_metadata_url):
        """Sets the saml_metadata_url of this OrganizationSAMLAuthRequestPatch.

        If configured, SAML metadata be retrieved from a remote URL.

        :param saml_metadata_url: The saml_metadata_url of this OrganizationSAMLAuthRequestPatch.
        :type: str
        """
        if (self._configuration.client_side_validation and
                saml_metadata_url is not None and len(saml_metadata_url) > 254):
            raise ValueError("Invalid value for `saml_metadata_url`, length must be less than or equal to `254`")  # noqa: E501

        self._saml_metadata_url = saml_metadata_url

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
        if issubclass(OrganizationSAMLAuthRequestPatch, dict):
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
        if not isinstance(other, OrganizationSAMLAuthRequestPatch):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, OrganizationSAMLAuthRequestPatch):
            return True

        return self.to_dict() != other.to_dict()

