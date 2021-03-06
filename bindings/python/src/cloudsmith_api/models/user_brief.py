# coding: utf-8

"""
    Cloudsmith API

    The API to the Cloudsmith Service

    OpenAPI spec version: v1
    Contact: support@cloudsmith.io
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class UserBrief(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
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
        'authenticated': 'bool',
        'email': 'str',
        'name': 'str',
        'profile_url': 'str',
        'self_url': 'str',
        'slug': 'str',
        'slug_perm': 'str'
    }

    attribute_map = {
        'authenticated': 'authenticated',
        'email': 'email',
        'name': 'name',
        'profile_url': 'profile_url',
        'self_url': 'self_url',
        'slug': 'slug',
        'slug_perm': 'slug_perm'
    }

    def __init__(self, authenticated=None, email=None, name=None, profile_url=None, self_url=None, slug=None, slug_perm=None):
        """
        UserBrief - a model defined in Swagger
        """

        self._authenticated = None
        self._email = None
        self._name = None
        self._profile_url = None
        self._self_url = None
        self._slug = None
        self._slug_perm = None

        if authenticated is not None:
          self.authenticated = authenticated
        if email is not None:
          self.email = email
        if name is not None:
          self.name = name
        if profile_url is not None:
          self.profile_url = profile_url
        if self_url is not None:
          self.self_url = self_url
        if slug is not None:
          self.slug = slug
        if slug_perm is not None:
          self.slug_perm = slug_perm

    @property
    def authenticated(self):
        """
        Gets the authenticated of this UserBrief.
        If true then you're logged in as a user.

        :return: The authenticated of this UserBrief.
        :rtype: bool
        """
        return self._authenticated

    @authenticated.setter
    def authenticated(self, authenticated):
        """
        Sets the authenticated of this UserBrief.
        If true then you're logged in as a user.

        :param authenticated: The authenticated of this UserBrief.
        :type: bool
        """

        self._authenticated = authenticated

    @property
    def email(self):
        """
        Gets the email of this UserBrief.
        Your email address that we use to contact you. This is only visible to you.

        :return: The email of this UserBrief.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """
        Sets the email of this UserBrief.
        Your email address that we use to contact you. This is only visible to you.

        :param email: The email of this UserBrief.
        :type: str
        """

        self._email = email

    @property
    def name(self):
        """
        Gets the name of this UserBrief.
        The full name of the user (if any).

        :return: The name of this UserBrief.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this UserBrief.
        The full name of the user (if any).

        :param name: The name of this UserBrief.
        :type: str
        """

        self._name = name

    @property
    def profile_url(self):
        """
        Gets the profile_url of this UserBrief.
        The URL for the full profile of the user.

        :return: The profile_url of this UserBrief.
        :rtype: str
        """
        return self._profile_url

    @profile_url.setter
    def profile_url(self, profile_url):
        """
        Sets the profile_url of this UserBrief.
        The URL for the full profile of the user.

        :param profile_url: The profile_url of this UserBrief.
        :type: str
        """

        self._profile_url = profile_url

    @property
    def self_url(self):
        """
        Gets the self_url of this UserBrief.
        

        :return: The self_url of this UserBrief.
        :rtype: str
        """
        return self._self_url

    @self_url.setter
    def self_url(self, self_url):
        """
        Sets the self_url of this UserBrief.
        

        :param self_url: The self_url of this UserBrief.
        :type: str
        """

        self._self_url = self_url

    @property
    def slug(self):
        """
        Gets the slug of this UserBrief.
        

        :return: The slug of this UserBrief.
        :rtype: str
        """
        return self._slug

    @slug.setter
    def slug(self, slug):
        """
        Sets the slug of this UserBrief.
        

        :param slug: The slug of this UserBrief.
        :type: str
        """

        self._slug = slug

    @property
    def slug_perm(self):
        """
        Gets the slug_perm of this UserBrief.
        

        :return: The slug_perm of this UserBrief.
        :rtype: str
        """
        return self._slug_perm

    @slug_perm.setter
    def slug_perm(self, slug_perm):
        """
        Sets the slug_perm of this UserBrief.
        

        :param slug_perm: The slug_perm of this UserBrief.
        :type: str
        """

        self._slug_perm = slug_perm

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
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

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        if not isinstance(other, UserBrief):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
