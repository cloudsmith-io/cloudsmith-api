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


class ReposGpgKeys(object):
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
        'active': 'bool',
        'comment': 'str',
        'created_at': 'str',
        'default': 'bool',
        'fingerprint': 'str',
        'fingerprint_short': 'str',
        'public_key': 'str'
    }

    attribute_map = {
        'active': 'active',
        'comment': 'comment',
        'created_at': 'created_at',
        'default': 'default',
        'fingerprint': 'fingerprint',
        'fingerprint_short': 'fingerprint_short',
        'public_key': 'public_key'
    }

    def __init__(self, active=None, comment=None, created_at=None, default=None, fingerprint=None, fingerprint_short=None, public_key=None):
        """
        ReposGpgKeys - a model defined in Swagger
        """

        self._active = None
        self._comment = None
        self._created_at = None
        self._default = None
        self._fingerprint = None
        self._fingerprint_short = None
        self._public_key = None

        if active is not None:
          self.active = active
        if comment is not None:
          self.comment = comment
        if created_at is not None:
          self.created_at = created_at
        if default is not None:
          self.default = default
        if fingerprint is not None:
          self.fingerprint = fingerprint
        if fingerprint_short is not None:
          self.fingerprint_short = fingerprint_short
        if public_key is not None:
          self.public_key = public_key

    @property
    def active(self):
        """
        Gets the active of this ReposGpgKeys.
        If selected this is the active key for this repository.

        :return: The active of this ReposGpgKeys.
        :rtype: bool
        """
        return self._active

    @active.setter
    def active(self, active):
        """
        Sets the active of this ReposGpgKeys.
        If selected this is the active key for this repository.

        :param active: The active of this ReposGpgKeys.
        :type: bool
        """

        self._active = active

    @property
    def comment(self):
        """
        Gets the comment of this ReposGpgKeys.
        

        :return: The comment of this ReposGpgKeys.
        :rtype: str
        """
        return self._comment

    @comment.setter
    def comment(self, comment):
        """
        Sets the comment of this ReposGpgKeys.
        

        :param comment: The comment of this ReposGpgKeys.
        :type: str
        """

        self._comment = comment

    @property
    def created_at(self):
        """
        Gets the created_at of this ReposGpgKeys.
        

        :return: The created_at of this ReposGpgKeys.
        :rtype: str
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at):
        """
        Sets the created_at of this ReposGpgKeys.
        

        :param created_at: The created_at of this ReposGpgKeys.
        :type: str
        """

        self._created_at = created_at

    @property
    def default(self):
        """
        Gets the default of this ReposGpgKeys.
        If selected this is the default key for this repository.

        :return: The default of this ReposGpgKeys.
        :rtype: bool
        """
        return self._default

    @default.setter
    def default(self, default):
        """
        Sets the default of this ReposGpgKeys.
        If selected this is the default key for this repository.

        :param default: The default of this ReposGpgKeys.
        :type: bool
        """

        self._default = default

    @property
    def fingerprint(self):
        """
        Gets the fingerprint of this ReposGpgKeys.
        The long identifier used by GPG for this key.

        :return: The fingerprint of this ReposGpgKeys.
        :rtype: str
        """
        return self._fingerprint

    @fingerprint.setter
    def fingerprint(self, fingerprint):
        """
        Sets the fingerprint of this ReposGpgKeys.
        The long identifier used by GPG for this key.

        :param fingerprint: The fingerprint of this ReposGpgKeys.
        :type: str
        """

        self._fingerprint = fingerprint

    @property
    def fingerprint_short(self):
        """
        Gets the fingerprint_short of this ReposGpgKeys.
        

        :return: The fingerprint_short of this ReposGpgKeys.
        :rtype: str
        """
        return self._fingerprint_short

    @fingerprint_short.setter
    def fingerprint_short(self, fingerprint_short):
        """
        Sets the fingerprint_short of this ReposGpgKeys.
        

        :param fingerprint_short: The fingerprint_short of this ReposGpgKeys.
        :type: str
        """

        self._fingerprint_short = fingerprint_short

    @property
    def public_key(self):
        """
        Gets the public_key of this ReposGpgKeys.
        The public key given to repository users.

        :return: The public_key of this ReposGpgKeys.
        :rtype: str
        """
        return self._public_key

    @public_key.setter
    def public_key(self, public_key):
        """
        Sets the public_key of this ReposGpgKeys.
        The public key given to repository users.

        :param public_key: The public_key of this ReposGpgKeys.
        :type: str
        """

        self._public_key = public_key

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
        if not isinstance(other, ReposGpgKeys):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
