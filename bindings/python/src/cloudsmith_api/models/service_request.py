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


class ServiceRequest(object):
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
        'description': 'str',
        'name': 'str',
        'role': 'str',
        'teams': 'list[ServiceTeams]'
    }

    attribute_map = {
        'description': 'description',
        'name': 'name',
        'role': 'role',
        'teams': 'teams'
    }

    def __init__(self, description=None, name=None, role='Member', teams=None, _configuration=None):  # noqa: E501
        """ServiceRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._description = None
        self._name = None
        self._role = None
        self._teams = None
        self.discriminator = None

        if description is not None:
            self.description = description
        self.name = name
        if role is not None:
            self.role = role
        if teams is not None:
            self.teams = teams

    @property
    def description(self):
        """Gets the description of this ServiceRequest.

        The description of the service

        :return: The description of this ServiceRequest.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this ServiceRequest.

        The description of the service

        :param description: The description of this ServiceRequest.
        :type: str
        """
        if (self._configuration.client_side_validation and
                description is not None and len(description) > 1024):
            raise ValueError("Invalid value for `description`, length must be less than or equal to `1024`")  # noqa: E501
        if (self._configuration.client_side_validation and
                description is not None and len(description) < 1):
            raise ValueError("Invalid value for `description`, length must be greater than or equal to `1`")  # noqa: E501

        self._description = description

    @property
    def name(self):
        """Gets the name of this ServiceRequest.

        The name of the service

        :return: The name of this ServiceRequest.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this ServiceRequest.

        The name of the service

        :param name: The name of this ServiceRequest.
        :type: str
        """
        if self._configuration.client_side_validation and name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501
        if (self._configuration.client_side_validation and
                name is not None and len(name) > 120):
            raise ValueError("Invalid value for `name`, length must be less than or equal to `120`")  # noqa: E501
        if (self._configuration.client_side_validation and
                name is not None and len(name) < 1):
            raise ValueError("Invalid value for `name`, length must be greater than or equal to `1`")  # noqa: E501

        self._name = name

    @property
    def role(self):
        """Gets the role of this ServiceRequest.

        The role of the service.

        :return: The role of this ServiceRequest.
        :rtype: str
        """
        return self._role

    @role.setter
    def role(self, role):
        """Sets the role of this ServiceRequest.

        The role of the service.

        :param role: The role of this ServiceRequest.
        :type: str
        """
        allowed_values = ["Manager", "Member"]  # noqa: E501
        if (self._configuration.client_side_validation and
                role not in allowed_values):
            raise ValueError(
                "Invalid value for `role` ({0}), must be one of {1}"  # noqa: E501
                .format(role, allowed_values)
            )

        self._role = role

    @property
    def teams(self):
        """Gets the teams of this ServiceRequest.


        :return: The teams of this ServiceRequest.
        :rtype: list[ServiceTeams]
        """
        return self._teams

    @teams.setter
    def teams(self, teams):
        """Sets the teams of this ServiceRequest.


        :param teams: The teams of this ServiceRequest.
        :type: list[ServiceTeams]
        """

        self._teams = teams

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
        if issubclass(ServiceRequest, dict):
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
        if not isinstance(other, ServiceRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ServiceRequest):
            return True

        return self.to_dict() != other.to_dict()

