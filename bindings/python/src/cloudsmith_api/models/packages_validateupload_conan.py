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


class PackagesValidateuploadConan(object):
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
        'conan_channel': 'str',
        'conan_prefix': 'str',
        'info_file': 'str',
        'manifest_file': 'str',
        'metadata_file': 'str',
        'package_file': 'str',
        'republish': 'bool'
    }

    attribute_map = {
        'conan_channel': 'conan_channel',
        'conan_prefix': 'conan_prefix',
        'info_file': 'info_file',
        'manifest_file': 'manifest_file',
        'metadata_file': 'metadata_file',
        'package_file': 'package_file',
        'republish': 'republish'
    }

    def __init__(self, conan_channel=None, conan_prefix=None, info_file=None, manifest_file=None, metadata_file=None, package_file=None, republish=None):
        """
        PackagesValidateuploadConan - a model defined in Swagger
        """

        self._conan_channel = None
        self._conan_prefix = None
        self._info_file = None
        self._manifest_file = None
        self._metadata_file = None
        self._package_file = None
        self._republish = None

        if conan_channel is not None:
          self.conan_channel = conan_channel
        if conan_prefix is not None:
          self.conan_prefix = conan_prefix
        if info_file is not None:
          self.info_file = info_file
        if manifest_file is not None:
          self.manifest_file = manifest_file
        if metadata_file is not None:
          self.metadata_file = metadata_file
        self.package_file = package_file
        if republish is not None:
          self.republish = republish

    @property
    def conan_channel(self):
        """
        Gets the conan_channel of this PackagesValidateuploadConan.
        Conan channel.

        :return: The conan_channel of this PackagesValidateuploadConan.
        :rtype: str
        """
        return self._conan_channel

    @conan_channel.setter
    def conan_channel(self, conan_channel):
        """
        Sets the conan_channel of this PackagesValidateuploadConan.
        Conan channel.

        :param conan_channel: The conan_channel of this PackagesValidateuploadConan.
        :type: str
        """

        self._conan_channel = conan_channel

    @property
    def conan_prefix(self):
        """
        Gets the conan_prefix of this PackagesValidateuploadConan.
        Conan prefix (User).

        :return: The conan_prefix of this PackagesValidateuploadConan.
        :rtype: str
        """
        return self._conan_prefix

    @conan_prefix.setter
    def conan_prefix(self, conan_prefix):
        """
        Sets the conan_prefix of this PackagesValidateuploadConan.
        Conan prefix (User).

        :param conan_prefix: The conan_prefix of this PackagesValidateuploadConan.
        :type: str
        """

        self._conan_prefix = conan_prefix

    @property
    def info_file(self):
        """
        Gets the info_file of this PackagesValidateuploadConan.
        The info file is an python file containing the package metadata.

        :return: The info_file of this PackagesValidateuploadConan.
        :rtype: str
        """
        return self._info_file

    @info_file.setter
    def info_file(self, info_file):
        """
        Sets the info_file of this PackagesValidateuploadConan.
        The info file is an python file containing the package metadata.

        :param info_file: The info_file of this PackagesValidateuploadConan.
        :type: str
        """

        self._info_file = info_file

    @property
    def manifest_file(self):
        """
        Gets the manifest_file of this PackagesValidateuploadConan.
        The info file is an python file containing the package metadata.

        :return: The manifest_file of this PackagesValidateuploadConan.
        :rtype: str
        """
        return self._manifest_file

    @manifest_file.setter
    def manifest_file(self, manifest_file):
        """
        Sets the manifest_file of this PackagesValidateuploadConan.
        The info file is an python file containing the package metadata.

        :param manifest_file: The manifest_file of this PackagesValidateuploadConan.
        :type: str
        """

        self._manifest_file = manifest_file

    @property
    def metadata_file(self):
        """
        Gets the metadata_file of this PackagesValidateuploadConan.
        The conan file is an python file containing the package metadata.

        :return: The metadata_file of this PackagesValidateuploadConan.
        :rtype: str
        """
        return self._metadata_file

    @metadata_file.setter
    def metadata_file(self, metadata_file):
        """
        Sets the metadata_file of this PackagesValidateuploadConan.
        The conan file is an python file containing the package metadata.

        :param metadata_file: The metadata_file of this PackagesValidateuploadConan.
        :type: str
        """

        self._metadata_file = metadata_file

    @property
    def package_file(self):
        """
        Gets the package_file of this PackagesValidateuploadConan.
        The primary file for the package.

        :return: The package_file of this PackagesValidateuploadConan.
        :rtype: str
        """
        return self._package_file

    @package_file.setter
    def package_file(self, package_file):
        """
        Sets the package_file of this PackagesValidateuploadConan.
        The primary file for the package.

        :param package_file: The package_file of this PackagesValidateuploadConan.
        :type: str
        """
        if package_file is None:
            raise ValueError("Invalid value for `package_file`, must not be `None`")

        self._package_file = package_file

    @property
    def republish(self):
        """
        Gets the republish of this PackagesValidateuploadConan.
        If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate.

        :return: The republish of this PackagesValidateuploadConan.
        :rtype: bool
        """
        return self._republish

    @republish.setter
    def republish(self, republish):
        """
        Sets the republish of this PackagesValidateuploadConan.
        If true, the uploaded package will overwrite any others with the same attributes (e.g. same version); otherwise, it will be flagged as a duplicate.

        :param republish: The republish of this PackagesValidateuploadConan.
        :type: bool
        """

        self._republish = republish

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
        if not isinstance(other, PackagesValidateuploadConan):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other