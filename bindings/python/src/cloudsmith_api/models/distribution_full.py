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


class DistributionFull(object):
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
        'format': 'str',
        'format_url': 'str',
        'name': 'str',
        'self_url': 'str',
        'slug': 'str',
        'variants': 'str',
        'versions': 'list[DistributionVersion]'
    }

    attribute_map = {
        'format': 'format',
        'format_url': 'format_url',
        'name': 'name',
        'self_url': 'self_url',
        'slug': 'slug',
        'variants': 'variants',
        'versions': 'versions'
    }

    def __init__(self, format=None, format_url=None, name=None, self_url=None, slug=None, variants=None, versions=None, _configuration=None):  # noqa: E501
        """DistributionFull - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._format = None
        self._format_url = None
        self._name = None
        self._self_url = None
        self._slug = None
        self._variants = None
        self._versions = None
        self.discriminator = None

        if format is not None:
            self.format = format
        if format_url is not None:
            self.format_url = format_url
        self.name = name
        if self_url is not None:
            self.self_url = self_url
        if slug is not None:
            self.slug = slug
        if variants is not None:
            self.variants = variants
        if versions is not None:
            self.versions = versions

    @property
    def format(self):
        """Gets the format of this DistributionFull.


        :return: The format of this DistributionFull.
        :rtype: str
        """
        return self._format

    @format.setter
    def format(self, format):
        """Sets the format of this DistributionFull.


        :param format: The format of this DistributionFull.
        :type: str
        """
        if (self._configuration.client_side_validation and
                format is not None and len(format) < 1):
            raise ValueError("Invalid value for `format`, length must be greater than or equal to `1`")  # noqa: E501

        self._format = format

    @property
    def format_url(self):
        """Gets the format_url of this DistributionFull.


        :return: The format_url of this DistributionFull.
        :rtype: str
        """
        return self._format_url

    @format_url.setter
    def format_url(self, format_url):
        """Sets the format_url of this DistributionFull.


        :param format_url: The format_url of this DistributionFull.
        :type: str
        """

        self._format_url = format_url

    @property
    def name(self):
        """Gets the name of this DistributionFull.


        :return: The name of this DistributionFull.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this DistributionFull.


        :param name: The name of this DistributionFull.
        :type: str
        """
        if self._configuration.client_side_validation and name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501
        if (self._configuration.client_side_validation and
                name is not None and len(name) > 32):
            raise ValueError("Invalid value for `name`, length must be less than or equal to `32`")  # noqa: E501
        if (self._configuration.client_side_validation and
                name is not None and len(name) < 1):
            raise ValueError("Invalid value for `name`, length must be greater than or equal to `1`")  # noqa: E501

        self._name = name

    @property
    def self_url(self):
        """Gets the self_url of this DistributionFull.


        :return: The self_url of this DistributionFull.
        :rtype: str
        """
        return self._self_url

    @self_url.setter
    def self_url(self, self_url):
        """Sets the self_url of this DistributionFull.


        :param self_url: The self_url of this DistributionFull.
        :type: str
        """

        self._self_url = self_url

    @property
    def slug(self):
        """Gets the slug of this DistributionFull.

        The slug identifier for this distribution

        :return: The slug of this DistributionFull.
        :rtype: str
        """
        return self._slug

    @slug.setter
    def slug(self, slug):
        """Sets the slug of this DistributionFull.

        The slug identifier for this distribution

        :param slug: The slug of this DistributionFull.
        :type: str
        """
        if (self._configuration.client_side_validation and
                slug is not None and len(slug) < 1):
            raise ValueError("Invalid value for `slug`, length must be greater than or equal to `1`")  # noqa: E501

        self._slug = slug

    @property
    def variants(self):
        """Gets the variants of this DistributionFull.


        :return: The variants of this DistributionFull.
        :rtype: str
        """
        return self._variants

    @variants.setter
    def variants(self, variants):
        """Sets the variants of this DistributionFull.


        :param variants: The variants of this DistributionFull.
        :type: str
        """
        if (self._configuration.client_side_validation and
                variants is not None and len(variants) > 128):
            raise ValueError("Invalid value for `variants`, length must be less than or equal to `128`")  # noqa: E501

        self._variants = variants

    @property
    def versions(self):
        """Gets the versions of this DistributionFull.

        A list of the versions for this distribution

        :return: The versions of this DistributionFull.
        :rtype: list[DistributionVersion]
        """
        return self._versions

    @versions.setter
    def versions(self, versions):
        """Sets the versions of this DistributionFull.

        A list of the versions for this distribution

        :param versions: The versions of this DistributionFull.
        :type: list[DistributionVersion]
        """

        self._versions = versions

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
        if issubclass(DistributionFull, dict):
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
        if not isinstance(other, DistributionFull):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, DistributionFull):
            return True

        return self.to_dict() != other.to_dict()
