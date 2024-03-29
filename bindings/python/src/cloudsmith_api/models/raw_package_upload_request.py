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


class RawPackageUploadRequest(object):
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
        'content_type': 'str',
        'description': 'str',
        'name': 'str',
        'package_file': 'str',
        'republish': 'bool',
        'summary': 'str',
        'tags': 'str',
        'version': 'str'
    }

    attribute_map = {
        'content_type': 'content_type',
        'description': 'description',
        'name': 'name',
        'package_file': 'package_file',
        'republish': 'republish',
        'summary': 'summary',
        'tags': 'tags',
        'version': 'version'
    }

    def __init__(self, content_type=None, description=None, name=None, package_file=None, republish=None, summary=None, tags=None, version=None, _configuration=None):  # noqa: E501
        """RawPackageUploadRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._content_type = None
        self._description = None
        self._name = None
        self._package_file = None
        self._republish = None
        self._summary = None
        self._tags = None
        self._version = None
        self.discriminator = None

        if content_type is not None:
            self.content_type = content_type
        if description is not None:
            self.description = description
        if name is not None:
            self.name = name
        self.package_file = package_file
        if republish is not None:
            self.republish = republish
        if summary is not None:
            self.summary = summary
        if tags is not None:
            self.tags = tags
        if version is not None:
            self.version = version

    @property
    def content_type(self):
        """Gets the content_type of this RawPackageUploadRequest.

        A custom content/media (also known as MIME) type to be sent when downloading this file. By default Cloudsmith will attempt to detect the type, but if you need to override it, you can specify it here.

        :return: The content_type of this RawPackageUploadRequest.
        :rtype: str
        """
        return self._content_type

    @content_type.setter
    def content_type(self, content_type):
        """Sets the content_type of this RawPackageUploadRequest.

        A custom content/media (also known as MIME) type to be sent when downloading this file. By default Cloudsmith will attempt to detect the type, but if you need to override it, you can specify it here.

        :param content_type: The content_type of this RawPackageUploadRequest.
        :type: str
        """
        if (self._configuration.client_side_validation and
                content_type is not None and len(content_type) > 64):
            raise ValueError("Invalid value for `content_type`, length must be less than or equal to `64`")  # noqa: E501
        if (self._configuration.client_side_validation and
                content_type is not None and len(content_type) < 1):
            raise ValueError("Invalid value for `content_type`, length must be greater than or equal to `1`")  # noqa: E501

        self._content_type = content_type

    @property
    def description(self):
        """Gets the description of this RawPackageUploadRequest.

        A textual description of this package.

        :return: The description of this RawPackageUploadRequest.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this RawPackageUploadRequest.

        A textual description of this package.

        :param description: The description of this RawPackageUploadRequest.
        :type: str
        """
        if (self._configuration.client_side_validation and
                description is not None and len(description) > 12288):
            raise ValueError("Invalid value for `description`, length must be less than or equal to `12288`")  # noqa: E501

        self._description = description

    @property
    def name(self):
        """Gets the name of this RawPackageUploadRequest.

        The name of this package.

        :return: The name of this RawPackageUploadRequest.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this RawPackageUploadRequest.

        The name of this package.

        :param name: The name of this RawPackageUploadRequest.
        :type: str
        """
        if (self._configuration.client_side_validation and
                name is not None and len(name) > 200):
            raise ValueError("Invalid value for `name`, length must be less than or equal to `200`")  # noqa: E501

        self._name = name

    @property
    def package_file(self):
        """Gets the package_file of this RawPackageUploadRequest.

        The primary file for the package.

        :return: The package_file of this RawPackageUploadRequest.
        :rtype: str
        """
        return self._package_file

    @package_file.setter
    def package_file(self, package_file):
        """Sets the package_file of this RawPackageUploadRequest.

        The primary file for the package.

        :param package_file: The package_file of this RawPackageUploadRequest.
        :type: str
        """
        if self._configuration.client_side_validation and package_file is None:
            raise ValueError("Invalid value for `package_file`, must not be `None`")  # noqa: E501
        if (self._configuration.client_side_validation and
                package_file is not None and len(package_file) < 1):
            raise ValueError("Invalid value for `package_file`, length must be greater than or equal to `1`")  # noqa: E501

        self._package_file = package_file

    @property
    def republish(self):
        """Gets the republish of this RawPackageUploadRequest.

        If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate.

        :return: The republish of this RawPackageUploadRequest.
        :rtype: bool
        """
        return self._republish

    @republish.setter
    def republish(self, republish):
        """Sets the republish of this RawPackageUploadRequest.

        If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate.

        :param republish: The republish of this RawPackageUploadRequest.
        :type: bool
        """

        self._republish = republish

    @property
    def summary(self):
        """Gets the summary of this RawPackageUploadRequest.

        A one-liner synopsis of this package.

        :return: The summary of this RawPackageUploadRequest.
        :rtype: str
        """
        return self._summary

    @summary.setter
    def summary(self, summary):
        """Sets the summary of this RawPackageUploadRequest.

        A one-liner synopsis of this package.

        :param summary: The summary of this RawPackageUploadRequest.
        :type: str
        """
        if (self._configuration.client_side_validation and
                summary is not None and len(summary) > 255):
            raise ValueError("Invalid value for `summary`, length must be less than or equal to `255`")  # noqa: E501

        self._summary = summary

    @property
    def tags(self):
        """Gets the tags of this RawPackageUploadRequest.

        A comma-separated values list of tags to add to the package.

        :return: The tags of this RawPackageUploadRequest.
        :rtype: str
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """Sets the tags of this RawPackageUploadRequest.

        A comma-separated values list of tags to add to the package.

        :param tags: The tags of this RawPackageUploadRequest.
        :type: str
        """
        if (self._configuration.client_side_validation and
                tags is not None and len(tags) > 1024):
            raise ValueError("Invalid value for `tags`, length must be less than or equal to `1024`")  # noqa: E501
        if (self._configuration.client_side_validation and
                tags is not None and len(tags) < 1):
            raise ValueError("Invalid value for `tags`, length must be greater than or equal to `1`")  # noqa: E501

        self._tags = tags

    @property
    def version(self):
        """Gets the version of this RawPackageUploadRequest.

        The raw version for this package.

        :return: The version of this RawPackageUploadRequest.
        :rtype: str
        """
        return self._version

    @version.setter
    def version(self, version):
        """Sets the version of this RawPackageUploadRequest.

        The raw version for this package.

        :param version: The version of this RawPackageUploadRequest.
        :type: str
        """
        if (self._configuration.client_side_validation and
                version is not None and len(version) > 128):
            raise ValueError("Invalid value for `version`, length must be less than or equal to `128`")  # noqa: E501

        self._version = version

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
        if issubclass(RawPackageUploadRequest, dict):
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
        if not isinstance(other, RawPackageUploadRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, RawPackageUploadRequest):
            return True

        return self.to_dict() != other.to_dict()

