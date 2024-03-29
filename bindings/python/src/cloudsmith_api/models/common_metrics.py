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


class CommonMetrics(object):
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
        'active': 'int',
        'bandwidth': 'CommonBandwidthMetrics',
        'downloads': 'CommonDownloadsMetrics',
        'inactive': 'int',
        'total': 'int'
    }

    attribute_map = {
        'active': 'active',
        'bandwidth': 'bandwidth',
        'downloads': 'downloads',
        'inactive': 'inactive',
        'total': 'total'
    }

    def __init__(self, active=None, bandwidth=None, downloads=None, inactive=None, total=None, _configuration=None):  # noqa: E501
        """CommonMetrics - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._active = None
        self._bandwidth = None
        self._downloads = None
        self._inactive = None
        self._total = None
        self.discriminator = None

        if active is not None:
            self.active = active
        self.bandwidth = bandwidth
        self.downloads = downloads
        if inactive is not None:
            self.inactive = inactive
        if total is not None:
            self.total = total

    @property
    def active(self):
        """Gets the active of this CommonMetrics.

        Number of packages with at least 1 download

        :return: The active of this CommonMetrics.
        :rtype: int
        """
        return self._active

    @active.setter
    def active(self, active):
        """Sets the active of this CommonMetrics.

        Number of packages with at least 1 download

        :param active: The active of this CommonMetrics.
        :type: int
        """

        self._active = active

    @property
    def bandwidth(self):
        """Gets the bandwidth of this CommonMetrics.


        :return: The bandwidth of this CommonMetrics.
        :rtype: CommonBandwidthMetrics
        """
        return self._bandwidth

    @bandwidth.setter
    def bandwidth(self, bandwidth):
        """Sets the bandwidth of this CommonMetrics.


        :param bandwidth: The bandwidth of this CommonMetrics.
        :type: CommonBandwidthMetrics
        """
        if self._configuration.client_side_validation and bandwidth is None:
            raise ValueError("Invalid value for `bandwidth`, must not be `None`")  # noqa: E501

        self._bandwidth = bandwidth

    @property
    def downloads(self):
        """Gets the downloads of this CommonMetrics.


        :return: The downloads of this CommonMetrics.
        :rtype: CommonDownloadsMetrics
        """
        return self._downloads

    @downloads.setter
    def downloads(self, downloads):
        """Sets the downloads of this CommonMetrics.


        :param downloads: The downloads of this CommonMetrics.
        :type: CommonDownloadsMetrics
        """
        if self._configuration.client_side_validation and downloads is None:
            raise ValueError("Invalid value for `downloads`, must not be `None`")  # noqa: E501

        self._downloads = downloads

    @property
    def inactive(self):
        """Gets the inactive of this CommonMetrics.

        Packages with zero downloads

        :return: The inactive of this CommonMetrics.
        :rtype: int
        """
        return self._inactive

    @inactive.setter
    def inactive(self, inactive):
        """Sets the inactive of this CommonMetrics.

        Packages with zero downloads

        :param inactive: The inactive of this CommonMetrics.
        :type: int
        """

        self._inactive = inactive

    @property
    def total(self):
        """Gets the total of this CommonMetrics.

        Total number of packages in repo

        :return: The total of this CommonMetrics.
        :rtype: int
        """
        return self._total

    @total.setter
    def total(self, total):
        """Sets the total of this CommonMetrics.

        Total number of packages in repo

        :param total: The total of this CommonMetrics.
        :type: int
        """

        self._total = total

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
        if issubclass(CommonMetrics, dict):
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
        if not isinstance(other, CommonMetrics):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, CommonMetrics):
            return True

        return self.to_dict() != other.to_dict()

