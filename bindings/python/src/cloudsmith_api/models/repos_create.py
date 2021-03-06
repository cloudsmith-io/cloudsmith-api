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


class ReposCreate(object):
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
        'description': 'str',
        'index_files': 'bool',
        'name': 'str',
        'repository_type_str': 'str',
        'slug': 'str',
        'storage_region': 'str'
    }

    attribute_map = {
        'description': 'description',
        'index_files': 'index_files',
        'name': 'name',
        'repository_type_str': 'repository_type_str',
        'slug': 'slug',
        'storage_region': 'storage_region'
    }

    def __init__(self, description=None, index_files=None, name=None, repository_type_str=None, slug=None, storage_region=None):
        """
        ReposCreate - a model defined in Swagger
        """

        self._description = None
        self._index_files = None
        self._name = None
        self._repository_type_str = None
        self._slug = None
        self._storage_region = None

        if description is not None:
          self.description = description
        if index_files is not None:
          self.index_files = index_files
        self.name = name
        if repository_type_str is not None:
          self.repository_type_str = repository_type_str
        if slug is not None:
          self.slug = slug
        if storage_region is not None:
          self.storage_region = storage_region

    @property
    def description(self):
        """
        Gets the description of this ReposCreate.
        A description of the repository's purpose/contents.

        :return: The description of this ReposCreate.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this ReposCreate.
        A description of the repository's purpose/contents.

        :param description: The description of this ReposCreate.
        :type: str
        """

        self._description = description

    @property
    def index_files(self):
        """
        Gets the index_files of this ReposCreate.
        If checked, files contained in packages will be indexed, which increase the synchronisation time required for packages. Note that it is recommended you keep this enabled unless the synchronisation time is significantly impacted.

        :return: The index_files of this ReposCreate.
        :rtype: bool
        """
        return self._index_files

    @index_files.setter
    def index_files(self, index_files):
        """
        Sets the index_files of this ReposCreate.
        If checked, files contained in packages will be indexed, which increase the synchronisation time required for packages. Note that it is recommended you keep this enabled unless the synchronisation time is significantly impacted.

        :param index_files: The index_files of this ReposCreate.
        :type: bool
        """

        self._index_files = index_files

    @property
    def name(self):
        """
        Gets the name of this ReposCreate.
        A descriptive name for the repository.

        :return: The name of this ReposCreate.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this ReposCreate.
        A descriptive name for the repository.

        :param name: The name of this ReposCreate.
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")

        self._name = name

    @property
    def repository_type_str(self):
        """
        Gets the repository_type_str of this ReposCreate.
        The repository type changes how it is accessed and billed. Private repositories can only be used on paid plans, but are visible only to you or authorised delegates. Public repositories are free to use on all plans and visible to all Cloudsmith users.

        :return: The repository_type_str of this ReposCreate.
        :rtype: str
        """
        return self._repository_type_str

    @repository_type_str.setter
    def repository_type_str(self, repository_type_str):
        """
        Sets the repository_type_str of this ReposCreate.
        The repository type changes how it is accessed and billed. Private repositories can only be used on paid plans, but are visible only to you or authorised delegates. Public repositories are free to use on all plans and visible to all Cloudsmith users.

        :param repository_type_str: The repository_type_str of this ReposCreate.
        :type: str
        """

        self._repository_type_str = repository_type_str

    @property
    def slug(self):
        """
        Gets the slug of this ReposCreate.
        The slug identifies the repository in URIs.

        :return: The slug of this ReposCreate.
        :rtype: str
        """
        return self._slug

    @slug.setter
    def slug(self, slug):
        """
        Sets the slug of this ReposCreate.
        The slug identifies the repository in URIs.

        :param slug: The slug of this ReposCreate.
        :type: str
        """

        self._slug = slug

    @property
    def storage_region(self):
        """
        Gets the storage_region of this ReposCreate.
        The Cloudsmith region in which package files are stored.

        :return: The storage_region of this ReposCreate.
        :rtype: str
        """
        return self._storage_region

    @storage_region.setter
    def storage_region(self, storage_region):
        """
        Sets the storage_region of this ReposCreate.
        The Cloudsmith region in which package files are stored.

        :param storage_region: The storage_region of this ReposCreate.
        :type: str
        """

        self._storage_region = storage_region

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
        if not isinstance(other, ReposCreate):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
