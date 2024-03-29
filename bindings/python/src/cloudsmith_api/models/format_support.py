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


class FormatSupport(object):
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
        'dependencies': 'bool',
        'distributions': 'bool',
        'file_lists': 'bool',
        'metadata': 'bool',
        'upstreams': 'FormatSupportUpstream',
        'versioning': 'bool'
    }

    attribute_map = {
        'dependencies': 'dependencies',
        'distributions': 'distributions',
        'file_lists': 'file_lists',
        'metadata': 'metadata',
        'upstreams': 'upstreams',
        'versioning': 'versioning'
    }

    def __init__(self, dependencies=None, distributions=None, file_lists=None, metadata=None, upstreams=None, versioning=None, _configuration=None):  # noqa: E501
        """FormatSupport - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._dependencies = None
        self._distributions = None
        self._file_lists = None
        self._metadata = None
        self._upstreams = None
        self._versioning = None
        self.discriminator = None

        self.dependencies = dependencies
        self.distributions = distributions
        self.file_lists = file_lists
        self.metadata = metadata
        self.upstreams = upstreams
        self.versioning = versioning

    @property
    def dependencies(self):
        """Gets the dependencies of this FormatSupport.

        If true the package format supports dependencies

        :return: The dependencies of this FormatSupport.
        :rtype: bool
        """
        return self._dependencies

    @dependencies.setter
    def dependencies(self, dependencies):
        """Sets the dependencies of this FormatSupport.

        If true the package format supports dependencies

        :param dependencies: The dependencies of this FormatSupport.
        :type: bool
        """
        if self._configuration.client_side_validation and dependencies is None:
            raise ValueError("Invalid value for `dependencies`, must not be `None`")  # noqa: E501

        self._dependencies = dependencies

    @property
    def distributions(self):
        """Gets the distributions of this FormatSupport.

        If true the package format supports distributions

        :return: The distributions of this FormatSupport.
        :rtype: bool
        """
        return self._distributions

    @distributions.setter
    def distributions(self, distributions):
        """Sets the distributions of this FormatSupport.

        If true the package format supports distributions

        :param distributions: The distributions of this FormatSupport.
        :type: bool
        """
        if self._configuration.client_side_validation and distributions is None:
            raise ValueError("Invalid value for `distributions`, must not be `None`")  # noqa: E501

        self._distributions = distributions

    @property
    def file_lists(self):
        """Gets the file_lists of this FormatSupport.

        If true the package format supports file lists

        :return: The file_lists of this FormatSupport.
        :rtype: bool
        """
        return self._file_lists

    @file_lists.setter
    def file_lists(self, file_lists):
        """Sets the file_lists of this FormatSupport.

        If true the package format supports file lists

        :param file_lists: The file_lists of this FormatSupport.
        :type: bool
        """
        if self._configuration.client_side_validation and file_lists is None:
            raise ValueError("Invalid value for `file_lists`, must not be `None`")  # noqa: E501

        self._file_lists = file_lists

    @property
    def metadata(self):
        """Gets the metadata of this FormatSupport.

        If true the package format supports metadata

        :return: The metadata of this FormatSupport.
        :rtype: bool
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this FormatSupport.

        If true the package format supports metadata

        :param metadata: The metadata of this FormatSupport.
        :type: bool
        """
        if self._configuration.client_side_validation and metadata is None:
            raise ValueError("Invalid value for `metadata`, must not be `None`")  # noqa: E501

        self._metadata = metadata

    @property
    def upstreams(self):
        """Gets the upstreams of this FormatSupport.


        :return: The upstreams of this FormatSupport.
        :rtype: FormatSupportUpstream
        """
        return self._upstreams

    @upstreams.setter
    def upstreams(self, upstreams):
        """Sets the upstreams of this FormatSupport.


        :param upstreams: The upstreams of this FormatSupport.
        :type: FormatSupportUpstream
        """
        if self._configuration.client_side_validation and upstreams is None:
            raise ValueError("Invalid value for `upstreams`, must not be `None`")  # noqa: E501

        self._upstreams = upstreams

    @property
    def versioning(self):
        """Gets the versioning of this FormatSupport.

        If true the package format supports versioning

        :return: The versioning of this FormatSupport.
        :rtype: bool
        """
        return self._versioning

    @versioning.setter
    def versioning(self, versioning):
        """Sets the versioning of this FormatSupport.

        If true the package format supports versioning

        :param versioning: The versioning of this FormatSupport.
        :type: bool
        """
        if self._configuration.client_side_validation and versioning is None:
            raise ValueError("Invalid value for `versioning`, must not be `None`")  # noqa: E501

        self._versioning = versioning

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
        if issubclass(FormatSupport, dict):
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
        if not isinstance(other, FormatSupport):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, FormatSupport):
            return True

        return self.to_dict() != other.to_dict()

