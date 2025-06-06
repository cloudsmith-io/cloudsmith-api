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


class UserProfile(object):
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
        'company': 'str',
        'first_name': 'str',
        'job_title': 'str',
        'joined_at': 'datetime',
        'last_name': 'str',
        'name': 'str',
        'slug': 'str',
        'slug_perm': 'str',
        'tagline': 'str',
        'url': 'str'
    }

    attribute_map = {
        'company': 'company',
        'first_name': 'first_name',
        'job_title': 'job_title',
        'joined_at': 'joined_at',
        'last_name': 'last_name',
        'name': 'name',
        'slug': 'slug',
        'slug_perm': 'slug_perm',
        'tagline': 'tagline',
        'url': 'url'
    }

    def __init__(self, company=None, first_name=None, job_title=None, joined_at=None, last_name=None, name=None, slug=None, slug_perm=None, tagline=None, url=None, _configuration=None):  # noqa: E501
        """UserProfile - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._company = None
        self._first_name = None
        self._job_title = None
        self._joined_at = None
        self._last_name = None
        self._name = None
        self._slug = None
        self._slug_perm = None
        self._tagline = None
        self._url = None
        self.discriminator = None

        if company is not None:
            self.company = company
        self.first_name = first_name
        if job_title is not None:
            self.job_title = job_title
        if joined_at is not None:
            self.joined_at = joined_at
        self.last_name = last_name
        if name is not None:
            self.name = name
        if slug is not None:
            self.slug = slug
        if slug_perm is not None:
            self.slug_perm = slug_perm
        if tagline is not None:
            self.tagline = tagline
        if url is not None:
            self.url = url

    @property
    def company(self):
        """Gets the company of this UserProfile.


        :return: The company of this UserProfile.
        :rtype: str
        """
        return self._company

    @company.setter
    def company(self, company):
        """Sets the company of this UserProfile.


        :param company: The company of this UserProfile.
        :type: str
        """
        if (self._configuration.client_side_validation and
                company is not None and len(company) > 64):
            raise ValueError("Invalid value for `company`, length must be less than or equal to `64`")  # noqa: E501

        self._company = company

    @property
    def first_name(self):
        """Gets the first_name of this UserProfile.


        :return: The first_name of this UserProfile.
        :rtype: str
        """
        return self._first_name

    @first_name.setter
    def first_name(self, first_name):
        """Sets the first_name of this UserProfile.


        :param first_name: The first_name of this UserProfile.
        :type: str
        """
        if self._configuration.client_side_validation and first_name is None:
            raise ValueError("Invalid value for `first_name`, must not be `None`")  # noqa: E501
        if (self._configuration.client_side_validation and
                first_name is not None and len(first_name) > 120):
            raise ValueError("Invalid value for `first_name`, length must be less than or equal to `120`")  # noqa: E501
        if (self._configuration.client_side_validation and
                first_name is not None and len(first_name) < 1):
            raise ValueError("Invalid value for `first_name`, length must be greater than or equal to `1`")  # noqa: E501

        self._first_name = first_name

    @property
    def job_title(self):
        """Gets the job_title of this UserProfile.


        :return: The job_title of this UserProfile.
        :rtype: str
        """
        return self._job_title

    @job_title.setter
    def job_title(self, job_title):
        """Sets the job_title of this UserProfile.


        :param job_title: The job_title of this UserProfile.
        :type: str
        """
        if (self._configuration.client_side_validation and
                job_title is not None and len(job_title) > 64):
            raise ValueError("Invalid value for `job_title`, length must be less than or equal to `64`")  # noqa: E501

        self._job_title = job_title

    @property
    def joined_at(self):
        """Gets the joined_at of this UserProfile.


        :return: The joined_at of this UserProfile.
        :rtype: datetime
        """
        return self._joined_at

    @joined_at.setter
    def joined_at(self, joined_at):
        """Sets the joined_at of this UserProfile.


        :param joined_at: The joined_at of this UserProfile.
        :type: datetime
        """

        self._joined_at = joined_at

    @property
    def last_name(self):
        """Gets the last_name of this UserProfile.


        :return: The last_name of this UserProfile.
        :rtype: str
        """
        return self._last_name

    @last_name.setter
    def last_name(self, last_name):
        """Sets the last_name of this UserProfile.


        :param last_name: The last_name of this UserProfile.
        :type: str
        """
        if self._configuration.client_side_validation and last_name is None:
            raise ValueError("Invalid value for `last_name`, must not be `None`")  # noqa: E501
        if (self._configuration.client_side_validation and
                last_name is not None and len(last_name) > 120):
            raise ValueError("Invalid value for `last_name`, length must be less than or equal to `120`")  # noqa: E501
        if (self._configuration.client_side_validation and
                last_name is not None and len(last_name) < 1):
            raise ValueError("Invalid value for `last_name`, length must be greater than or equal to `1`")  # noqa: E501

        self._last_name = last_name

    @property
    def name(self):
        """Gets the name of this UserProfile.


        :return: The name of this UserProfile.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this UserProfile.


        :param name: The name of this UserProfile.
        :type: str
        """
        if (self._configuration.client_side_validation and
                name is not None and len(name) < 1):
            raise ValueError("Invalid value for `name`, length must be greater than or equal to `1`")  # noqa: E501

        self._name = name

    @property
    def slug(self):
        """Gets the slug of this UserProfile.


        :return: The slug of this UserProfile.
        :rtype: str
        """
        return self._slug

    @slug.setter
    def slug(self, slug):
        """Sets the slug of this UserProfile.


        :param slug: The slug of this UserProfile.
        :type: str
        """

        self._slug = slug

    @property
    def slug_perm(self):
        """Gets the slug_perm of this UserProfile.


        :return: The slug_perm of this UserProfile.
        :rtype: str
        """
        return self._slug_perm

    @slug_perm.setter
    def slug_perm(self, slug_perm):
        """Sets the slug_perm of this UserProfile.


        :param slug_perm: The slug_perm of this UserProfile.
        :type: str
        """

        self._slug_perm = slug_perm

    @property
    def tagline(self):
        """Gets the tagline of this UserProfile.

        Your tagline is a sentence about you. Make it funny. Make it professional. Either way, it's public and it represents who you are.

        :return: The tagline of this UserProfile.
        :rtype: str
        """
        return self._tagline

    @tagline.setter
    def tagline(self, tagline):
        """Sets the tagline of this UserProfile.

        Your tagline is a sentence about you. Make it funny. Make it professional. Either way, it's public and it represents who you are.

        :param tagline: The tagline of this UserProfile.
        :type: str
        """
        if (self._configuration.client_side_validation and
                tagline is not None and len(tagline) > 1024):
            raise ValueError("Invalid value for `tagline`, length must be less than or equal to `1024`")  # noqa: E501

        self._tagline = tagline

    @property
    def url(self):
        """Gets the url of this UserProfile.


        :return: The url of this UserProfile.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url):
        """Sets the url of this UserProfile.


        :param url: The url of this UserProfile.
        :type: str
        """

        self._url = url

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
        if issubclass(UserProfile, dict):
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
        if not isinstance(other, UserProfile):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, UserProfile):
            return True

        return self.to_dict() != other.to_dict()

