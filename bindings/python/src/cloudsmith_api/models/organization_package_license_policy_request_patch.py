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


class OrganizationPackageLicensePolicyRequestPatch(object):
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
        'allow_unknown_licenses': 'bool',
        'description': 'str',
        'name': 'str',
        'on_violation_quarantine': 'bool',
        'spdx_identifiers': 'list[str]'
    }

    attribute_map = {
        'allow_unknown_licenses': 'allow_unknown_licenses',
        'description': 'description',
        'name': 'name',
        'on_violation_quarantine': 'on_violation_quarantine',
        'spdx_identifiers': 'spdx_identifiers'
    }

    def __init__(self, allow_unknown_licenses=None, description=None, name=None, on_violation_quarantine=None, spdx_identifiers=None, _configuration=None):  # noqa: E501
        """OrganizationPackageLicensePolicyRequestPatch - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._allow_unknown_licenses = None
        self._description = None
        self._name = None
        self._on_violation_quarantine = None
        self._spdx_identifiers = None
        self.discriminator = None

        if allow_unknown_licenses is not None:
            self.allow_unknown_licenses = allow_unknown_licenses
        if description is not None:
            self.description = description
        if name is not None:
            self.name = name
        if on_violation_quarantine is not None:
            self.on_violation_quarantine = on_violation_quarantine
        if spdx_identifiers is not None:
            self.spdx_identifiers = spdx_identifiers

    @property
    def allow_unknown_licenses(self):
        """Gets the allow_unknown_licenses of this OrganizationPackageLicensePolicyRequestPatch.


        :return: The allow_unknown_licenses of this OrganizationPackageLicensePolicyRequestPatch.
        :rtype: bool
        """
        return self._allow_unknown_licenses

    @allow_unknown_licenses.setter
    def allow_unknown_licenses(self, allow_unknown_licenses):
        """Sets the allow_unknown_licenses of this OrganizationPackageLicensePolicyRequestPatch.


        :param allow_unknown_licenses: The allow_unknown_licenses of this OrganizationPackageLicensePolicyRequestPatch.
        :type: bool
        """

        self._allow_unknown_licenses = allow_unknown_licenses

    @property
    def description(self):
        """Gets the description of this OrganizationPackageLicensePolicyRequestPatch.


        :return: The description of this OrganizationPackageLicensePolicyRequestPatch.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this OrganizationPackageLicensePolicyRequestPatch.


        :param description: The description of this OrganizationPackageLicensePolicyRequestPatch.
        :type: str
        """
        if (self._configuration.client_side_validation and
                description is not None and len(description) > 250):
            raise ValueError("Invalid value for `description`, length must be less than or equal to `250`")  # noqa: E501
        if (self._configuration.client_side_validation and
                description is not None and len(description) < 1):
            raise ValueError("Invalid value for `description`, length must be greater than or equal to `1`")  # noqa: E501

        self._description = description

    @property
    def name(self):
        """Gets the name of this OrganizationPackageLicensePolicyRequestPatch.


        :return: The name of this OrganizationPackageLicensePolicyRequestPatch.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this OrganizationPackageLicensePolicyRequestPatch.


        :param name: The name of this OrganizationPackageLicensePolicyRequestPatch.
        :type: str
        """
        if (self._configuration.client_side_validation and
                name is not None and len(name) > 100):
            raise ValueError("Invalid value for `name`, length must be less than or equal to `100`")  # noqa: E501
        if (self._configuration.client_side_validation and
                name is not None and len(name) < 1):
            raise ValueError("Invalid value for `name`, length must be greater than or equal to `1`")  # noqa: E501

        self._name = name

    @property
    def on_violation_quarantine(self):
        """Gets the on_violation_quarantine of this OrganizationPackageLicensePolicyRequestPatch.


        :return: The on_violation_quarantine of this OrganizationPackageLicensePolicyRequestPatch.
        :rtype: bool
        """
        return self._on_violation_quarantine

    @on_violation_quarantine.setter
    def on_violation_quarantine(self, on_violation_quarantine):
        """Sets the on_violation_quarantine of this OrganizationPackageLicensePolicyRequestPatch.


        :param on_violation_quarantine: The on_violation_quarantine of this OrganizationPackageLicensePolicyRequestPatch.
        :type: bool
        """

        self._on_violation_quarantine = on_violation_quarantine

    @property
    def spdx_identifiers(self):
        """Gets the spdx_identifiers of this OrganizationPackageLicensePolicyRequestPatch.


        :return: The spdx_identifiers of this OrganizationPackageLicensePolicyRequestPatch.
        :rtype: list[str]
        """
        return self._spdx_identifiers

    @spdx_identifiers.setter
    def spdx_identifiers(self, spdx_identifiers):
        """Sets the spdx_identifiers of this OrganizationPackageLicensePolicyRequestPatch.


        :param spdx_identifiers: The spdx_identifiers of this OrganizationPackageLicensePolicyRequestPatch.
        :type: list[str]
        """

        self._spdx_identifiers = spdx_identifiers

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
        if issubclass(OrganizationPackageLicensePolicyRequestPatch, dict):
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
        if not isinstance(other, OrganizationPackageLicensePolicyRequestPatch):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, OrganizationPackageLicensePolicyRequestPatch):
            return True

        return self.to_dict() != other.to_dict()
