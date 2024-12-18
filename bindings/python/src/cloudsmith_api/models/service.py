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


class Service(object):
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
        'created_at': 'datetime',
        'created_by': 'str',
        'created_by_url': 'str',
        'description': 'str',
        'key': 'str',
        'key_expires_at': 'datetime',
        'name': 'str',
        'role': 'str',
        'slug': 'str',
        'teams': 'list[ServiceTeams]'
    }

    attribute_map = {
        'created_at': 'created_at',
        'created_by': 'created_by',
        'created_by_url': 'created_by_url',
        'description': 'description',
        'key': 'key',
        'key_expires_at': 'key_expires_at',
        'name': 'name',
        'role': 'role',
        'slug': 'slug',
        'teams': 'teams'
    }

    def __init__(self, created_at=None, created_by=None, created_by_url=None, description=None, key=None, key_expires_at=None, name=None, role='Member', slug=None, teams=None, _configuration=None):  # noqa: E501
        """Service - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._created_at = None
        self._created_by = None
        self._created_by_url = None
        self._description = None
        self._key = None
        self._key_expires_at = None
        self._name = None
        self._role = None
        self._slug = None
        self._teams = None
        self.discriminator = None

        if created_at is not None:
            self.created_at = created_at
        if created_by is not None:
            self.created_by = created_by
        if created_by_url is not None:
            self.created_by_url = created_by_url
        if description is not None:
            self.description = description
        if key is not None:
            self.key = key
        if key_expires_at is not None:
            self.key_expires_at = key_expires_at
        self.name = name
        if role is not None:
            self.role = role
        if slug is not None:
            self.slug = slug
        if teams is not None:
            self.teams = teams

    @property
    def created_at(self):
        """Gets the created_at of this Service.


        :return: The created_at of this Service.
        :rtype: datetime
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at):
        """Sets the created_at of this Service.


        :param created_at: The created_at of this Service.
        :type: datetime
        """

        self._created_at = created_at

    @property
    def created_by(self):
        """Gets the created_by of this Service.


        :return: The created_by of this Service.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """Sets the created_by of this Service.


        :param created_by: The created_by of this Service.
        :type: str
        """
        if (self._configuration.client_side_validation and
                created_by is not None and len(created_by) < 1):
            raise ValueError("Invalid value for `created_by`, length must be greater than or equal to `1`")  # noqa: E501

        self._created_by = created_by

    @property
    def created_by_url(self):
        """Gets the created_by_url of this Service.


        :return: The created_by_url of this Service.
        :rtype: str
        """
        return self._created_by_url

    @created_by_url.setter
    def created_by_url(self, created_by_url):
        """Sets the created_by_url of this Service.


        :param created_by_url: The created_by_url of this Service.
        :type: str
        """

        self._created_by_url = created_by_url

    @property
    def description(self):
        """Gets the description of this Service.

        The description of the service

        :return: The description of this Service.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this Service.

        The description of the service

        :param description: The description of this Service.
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
    def key(self):
        """Gets the key of this Service.

        The API key of the service

        :return: The key of this Service.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """Sets the key of this Service.

        The API key of the service

        :param key: The key of this Service.
        :type: str
        """

        self._key = key

    @property
    def key_expires_at(self):
        """Gets the key_expires_at of this Service.

        The time at which the API key will expire. This will only be populated if the Organization has an active API Key Policy.

        :return: The key_expires_at of this Service.
        :rtype: datetime
        """
        return self._key_expires_at

    @key_expires_at.setter
    def key_expires_at(self, key_expires_at):
        """Sets the key_expires_at of this Service.

        The time at which the API key will expire. This will only be populated if the Organization has an active API Key Policy.

        :param key_expires_at: The key_expires_at of this Service.
        :type: datetime
        """

        self._key_expires_at = key_expires_at

    @property
    def name(self):
        """Gets the name of this Service.

        The name of the service

        :return: The name of this Service.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Service.

        The name of the service

        :param name: The name of this Service.
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
        """Gets the role of this Service.

        The role of the service.

        :return: The role of this Service.
        :rtype: str
        """
        return self._role

    @role.setter
    def role(self, role):
        """Sets the role of this Service.

        The role of the service.

        :param role: The role of this Service.
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
    def slug(self):
        """Gets the slug of this Service.

        The slug of the service

        :return: The slug of this Service.
        :rtype: str
        """
        return self._slug

    @slug.setter
    def slug(self, slug):
        """Sets the slug of this Service.

        The slug of the service

        :param slug: The slug of this Service.
        :type: str
        """
        if (self._configuration.client_side_validation and
                slug is not None and len(slug) < 1):
            raise ValueError("Invalid value for `slug`, length must be greater than or equal to `1`")  # noqa: E501
        if (self._configuration.client_side_validation and
                slug is not None and not re.search('^[-a-zA-Z0-9_]+$', slug)):  # noqa: E501
            raise ValueError(r"Invalid value for `slug`, must be a follow pattern or equal to `/^[-a-zA-Z0-9_]+$/`")  # noqa: E501

        self._slug = slug

    @property
    def teams(self):
        """Gets the teams of this Service.


        :return: The teams of this Service.
        :rtype: list[ServiceTeams]
        """
        return self._teams

    @teams.setter
    def teams(self, teams):
        """Sets the teams of this Service.


        :param teams: The teams of this Service.
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
        if issubclass(Service, dict):
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
        if not isinstance(other, Service):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Service):
            return True

        return self.to_dict() != other.to_dict()

