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


class DebUpstreamRequestPatch(object):
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
        'auth_mode': 'str',
        'auth_secret': 'str',
        'auth_username': 'str',
        'component': 'str',
        'distro_versions': 'list[str]',
        'extra_header_1': 'str',
        'extra_header_2': 'str',
        'extra_value_1': 'str',
        'extra_value_2': 'str',
        'include_sources': 'bool',
        'is_active': 'bool',
        'mode': 'str',
        'name': 'str',
        'priority': 'int',
        'upstream_distribution': 'str',
        'upstream_url': 'str',
        'verify_ssl': 'bool'
    }

    attribute_map = {
        'auth_mode': 'auth_mode',
        'auth_secret': 'auth_secret',
        'auth_username': 'auth_username',
        'component': 'component',
        'distro_versions': 'distro_versions',
        'extra_header_1': 'extra_header_1',
        'extra_header_2': 'extra_header_2',
        'extra_value_1': 'extra_value_1',
        'extra_value_2': 'extra_value_2',
        'include_sources': 'include_sources',
        'is_active': 'is_active',
        'mode': 'mode',
        'name': 'name',
        'priority': 'priority',
        'upstream_distribution': 'upstream_distribution',
        'upstream_url': 'upstream_url',
        'verify_ssl': 'verify_ssl'
    }

    def __init__(self, auth_mode='None', auth_secret=None, auth_username=None, component=None, distro_versions=None, extra_header_1=None, extra_header_2=None, extra_value_1=None, extra_value_2=None, include_sources=None, is_active=None, mode='Proxy Only', name=None, priority=None, upstream_distribution=None, upstream_url=None, verify_ssl=None, _configuration=None):  # noqa: E501
        """DebUpstreamRequestPatch - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._auth_mode = None
        self._auth_secret = None
        self._auth_username = None
        self._component = None
        self._distro_versions = None
        self._extra_header_1 = None
        self._extra_header_2 = None
        self._extra_value_1 = None
        self._extra_value_2 = None
        self._include_sources = None
        self._is_active = None
        self._mode = None
        self._name = None
        self._priority = None
        self._upstream_distribution = None
        self._upstream_url = None
        self._verify_ssl = None
        self.discriminator = None

        if auth_mode is not None:
            self.auth_mode = auth_mode
        if auth_secret is not None:
            self.auth_secret = auth_secret
        if auth_username is not None:
            self.auth_username = auth_username
        if component is not None:
            self.component = component
        if distro_versions is not None:
            self.distro_versions = distro_versions
        if extra_header_1 is not None:
            self.extra_header_1 = extra_header_1
        if extra_header_2 is not None:
            self.extra_header_2 = extra_header_2
        if extra_value_1 is not None:
            self.extra_value_1 = extra_value_1
        if extra_value_2 is not None:
            self.extra_value_2 = extra_value_2
        if include_sources is not None:
            self.include_sources = include_sources
        if is_active is not None:
            self.is_active = is_active
        if mode is not None:
            self.mode = mode
        if name is not None:
            self.name = name
        if priority is not None:
            self.priority = priority
        if upstream_distribution is not None:
            self.upstream_distribution = upstream_distribution
        if upstream_url is not None:
            self.upstream_url = upstream_url
        if verify_ssl is not None:
            self.verify_ssl = verify_ssl

    @property
    def auth_mode(self):
        """Gets the auth_mode of this DebUpstreamRequestPatch.

        The authentication mode to use when accessing this upstream. 

        :return: The auth_mode of this DebUpstreamRequestPatch.
        :rtype: str
        """
        return self._auth_mode

    @auth_mode.setter
    def auth_mode(self, auth_mode):
        """Sets the auth_mode of this DebUpstreamRequestPatch.

        The authentication mode to use when accessing this upstream. 

        :param auth_mode: The auth_mode of this DebUpstreamRequestPatch.
        :type: str
        """
        allowed_values = ["None", "Username and Password"]  # noqa: E501
        if (self._configuration.client_side_validation and
                auth_mode not in allowed_values):
            raise ValueError(
                "Invalid value for `auth_mode` ({0}), must be one of {1}"  # noqa: E501
                .format(auth_mode, allowed_values)
            )

        self._auth_mode = auth_mode

    @property
    def auth_secret(self):
        """Gets the auth_secret of this DebUpstreamRequestPatch.

        Secret to provide with requests to upstream.

        :return: The auth_secret of this DebUpstreamRequestPatch.
        :rtype: str
        """
        return self._auth_secret

    @auth_secret.setter
    def auth_secret(self, auth_secret):
        """Sets the auth_secret of this DebUpstreamRequestPatch.

        Secret to provide with requests to upstream.

        :param auth_secret: The auth_secret of this DebUpstreamRequestPatch.
        :type: str
        """
        if (self._configuration.client_side_validation and
                auth_secret is not None and len(auth_secret) > 4096):
            raise ValueError("Invalid value for `auth_secret`, length must be less than or equal to `4096`")  # noqa: E501

        self._auth_secret = auth_secret

    @property
    def auth_username(self):
        """Gets the auth_username of this DebUpstreamRequestPatch.

        Username to provide with requests to upstream.

        :return: The auth_username of this DebUpstreamRequestPatch.
        :rtype: str
        """
        return self._auth_username

    @auth_username.setter
    def auth_username(self, auth_username):
        """Sets the auth_username of this DebUpstreamRequestPatch.

        Username to provide with requests to upstream.

        :param auth_username: The auth_username of this DebUpstreamRequestPatch.
        :type: str
        """
        if (self._configuration.client_side_validation and
                auth_username is not None and len(auth_username) > 64):
            raise ValueError("Invalid value for `auth_username`, length must be less than or equal to `64`")  # noqa: E501

        self._auth_username = auth_username

    @property
    def component(self):
        """Gets the component of this DebUpstreamRequestPatch.

        The component to fetch from the upstream

        :return: The component of this DebUpstreamRequestPatch.
        :rtype: str
        """
        return self._component

    @component.setter
    def component(self, component):
        """Sets the component of this DebUpstreamRequestPatch.

        The component to fetch from the upstream

        :param component: The component of this DebUpstreamRequestPatch.
        :type: str
        """
        if (self._configuration.client_side_validation and
                component is not None and len(component) > 64):
            raise ValueError("Invalid value for `component`, length must be less than or equal to `64`")  # noqa: E501
        if (self._configuration.client_side_validation and
                component is not None and len(component) < 1):
            raise ValueError("Invalid value for `component`, length must be greater than or equal to `1`")  # noqa: E501

        self._component = component

    @property
    def distro_versions(self):
        """Gets the distro_versions of this DebUpstreamRequestPatch.

        The distribution version that packages found on this upstream could be associated with.

        :return: The distro_versions of this DebUpstreamRequestPatch.
        :rtype: list[str]
        """
        return self._distro_versions

    @distro_versions.setter
    def distro_versions(self, distro_versions):
        """Sets the distro_versions of this DebUpstreamRequestPatch.

        The distribution version that packages found on this upstream could be associated with.

        :param distro_versions: The distro_versions of this DebUpstreamRequestPatch.
        :type: list[str]
        """

        self._distro_versions = distro_versions

    @property
    def extra_header_1(self):
        """Gets the extra_header_1 of this DebUpstreamRequestPatch.

        The key for extra header #1 to send to upstream.

        :return: The extra_header_1 of this DebUpstreamRequestPatch.
        :rtype: str
        """
        return self._extra_header_1

    @extra_header_1.setter
    def extra_header_1(self, extra_header_1):
        """Sets the extra_header_1 of this DebUpstreamRequestPatch.

        The key for extra header #1 to send to upstream.

        :param extra_header_1: The extra_header_1 of this DebUpstreamRequestPatch.
        :type: str
        """
        if (self._configuration.client_side_validation and
                extra_header_1 is not None and len(extra_header_1) > 64):
            raise ValueError("Invalid value for `extra_header_1`, length must be less than or equal to `64`")  # noqa: E501
        if (self._configuration.client_side_validation and
                extra_header_1 is not None and not re.search('^[-\\w]+$', extra_header_1)):  # noqa: E501
            raise ValueError(r"Invalid value for `extra_header_1`, must be a follow pattern or equal to `/^[-\\w]+$/`")  # noqa: E501

        self._extra_header_1 = extra_header_1

    @property
    def extra_header_2(self):
        """Gets the extra_header_2 of this DebUpstreamRequestPatch.

        The key for extra header #2 to send to upstream.

        :return: The extra_header_2 of this DebUpstreamRequestPatch.
        :rtype: str
        """
        return self._extra_header_2

    @extra_header_2.setter
    def extra_header_2(self, extra_header_2):
        """Sets the extra_header_2 of this DebUpstreamRequestPatch.

        The key for extra header #2 to send to upstream.

        :param extra_header_2: The extra_header_2 of this DebUpstreamRequestPatch.
        :type: str
        """
        if (self._configuration.client_side_validation and
                extra_header_2 is not None and len(extra_header_2) > 64):
            raise ValueError("Invalid value for `extra_header_2`, length must be less than or equal to `64`")  # noqa: E501
        if (self._configuration.client_side_validation and
                extra_header_2 is not None and not re.search('^[-\\w]+$', extra_header_2)):  # noqa: E501
            raise ValueError(r"Invalid value for `extra_header_2`, must be a follow pattern or equal to `/^[-\\w]+$/`")  # noqa: E501

        self._extra_header_2 = extra_header_2

    @property
    def extra_value_1(self):
        """Gets the extra_value_1 of this DebUpstreamRequestPatch.

        The value for extra header #1 to send to upstream. This is stored as plaintext, and is NOT encrypted.

        :return: The extra_value_1 of this DebUpstreamRequestPatch.
        :rtype: str
        """
        return self._extra_value_1

    @extra_value_1.setter
    def extra_value_1(self, extra_value_1):
        """Sets the extra_value_1 of this DebUpstreamRequestPatch.

        The value for extra header #1 to send to upstream. This is stored as plaintext, and is NOT encrypted.

        :param extra_value_1: The extra_value_1 of this DebUpstreamRequestPatch.
        :type: str
        """
        if (self._configuration.client_side_validation and
                extra_value_1 is not None and len(extra_value_1) > 128):
            raise ValueError("Invalid value for `extra_value_1`, length must be less than or equal to `128`")  # noqa: E501
        if (self._configuration.client_side_validation and
                extra_value_1 is not None and not re.search('^[^\\n\\r]+$', extra_value_1)):  # noqa: E501
            raise ValueError(r"Invalid value for `extra_value_1`, must be a follow pattern or equal to `/^[^\\n\\r]+$/`")  # noqa: E501

        self._extra_value_1 = extra_value_1

    @property
    def extra_value_2(self):
        """Gets the extra_value_2 of this DebUpstreamRequestPatch.

        The value for extra header #2 to send to upstream. This is stored as plaintext, and is NOT encrypted.

        :return: The extra_value_2 of this DebUpstreamRequestPatch.
        :rtype: str
        """
        return self._extra_value_2

    @extra_value_2.setter
    def extra_value_2(self, extra_value_2):
        """Sets the extra_value_2 of this DebUpstreamRequestPatch.

        The value for extra header #2 to send to upstream. This is stored as plaintext, and is NOT encrypted.

        :param extra_value_2: The extra_value_2 of this DebUpstreamRequestPatch.
        :type: str
        """
        if (self._configuration.client_side_validation and
                extra_value_2 is not None and len(extra_value_2) > 128):
            raise ValueError("Invalid value for `extra_value_2`, length must be less than or equal to `128`")  # noqa: E501
        if (self._configuration.client_side_validation and
                extra_value_2 is not None and not re.search('^[^\\n\\r]+$', extra_value_2)):  # noqa: E501
            raise ValueError(r"Invalid value for `extra_value_2`, must be a follow pattern or equal to `/^[^\\n\\r]+$/`")  # noqa: E501

        self._extra_value_2 = extra_value_2

    @property
    def include_sources(self):
        """Gets the include_sources of this DebUpstreamRequestPatch.

        When true, source packages will be available from this upstream.

        :return: The include_sources of this DebUpstreamRequestPatch.
        :rtype: bool
        """
        return self._include_sources

    @include_sources.setter
    def include_sources(self, include_sources):
        """Sets the include_sources of this DebUpstreamRequestPatch.

        When true, source packages will be available from this upstream.

        :param include_sources: The include_sources of this DebUpstreamRequestPatch.
        :type: bool
        """

        self._include_sources = include_sources

    @property
    def is_active(self):
        """Gets the is_active of this DebUpstreamRequestPatch.

        Whether or not this upstream is active and ready for requests.

        :return: The is_active of this DebUpstreamRequestPatch.
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this DebUpstreamRequestPatch.

        Whether or not this upstream is active and ready for requests.

        :param is_active: The is_active of this DebUpstreamRequestPatch.
        :type: bool
        """

        self._is_active = is_active

    @property
    def mode(self):
        """Gets the mode of this DebUpstreamRequestPatch.

        The mode that this upstream should operate in. Upstream sources can be used to proxy resolved packages, as well as operate in a proxy/cache or cache only mode.

        :return: The mode of this DebUpstreamRequestPatch.
        :rtype: str
        """
        return self._mode

    @mode.setter
    def mode(self, mode):
        """Sets the mode of this DebUpstreamRequestPatch.

        The mode that this upstream should operate in. Upstream sources can be used to proxy resolved packages, as well as operate in a proxy/cache or cache only mode.

        :param mode: The mode of this DebUpstreamRequestPatch.
        :type: str
        """
        allowed_values = ["Proxy Only", "Cache and Proxy"]  # noqa: E501
        if (self._configuration.client_side_validation and
                mode not in allowed_values):
            raise ValueError(
                "Invalid value for `mode` ({0}), must be one of {1}"  # noqa: E501
                .format(mode, allowed_values)
            )

        self._mode = mode

    @property
    def name(self):
        """Gets the name of this DebUpstreamRequestPatch.

        A descriptive name for this upstream source. A shortened version of this name will be used for tagging cached packages retrieved from this upstream.

        :return: The name of this DebUpstreamRequestPatch.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this DebUpstreamRequestPatch.

        A descriptive name for this upstream source. A shortened version of this name will be used for tagging cached packages retrieved from this upstream.

        :param name: The name of this DebUpstreamRequestPatch.
        :type: str
        """
        if (self._configuration.client_side_validation and
                name is not None and len(name) > 64):
            raise ValueError("Invalid value for `name`, length must be less than or equal to `64`")  # noqa: E501
        if (self._configuration.client_side_validation and
                name is not None and len(name) < 1):
            raise ValueError("Invalid value for `name`, length must be greater than or equal to `1`")  # noqa: E501
        if (self._configuration.client_side_validation and
                name is not None and not re.search('^\\w[\\w \\-\'\\.\/()]+$', name)):  # noqa: E501
            raise ValueError(r"Invalid value for `name`, must be a follow pattern or equal to `/^\\w[\\w \\-'\\.\/()]+$/`")  # noqa: E501

        self._name = name

    @property
    def priority(self):
        """Gets the priority of this DebUpstreamRequestPatch.

        Upstream sources are selected for resolving requests by sequential order (1..n), followed by creation date.

        :return: The priority of this DebUpstreamRequestPatch.
        :rtype: int
        """
        return self._priority

    @priority.setter
    def priority(self, priority):
        """Sets the priority of this DebUpstreamRequestPatch.

        Upstream sources are selected for resolving requests by sequential order (1..n), followed by creation date.

        :param priority: The priority of this DebUpstreamRequestPatch.
        :type: int
        """
        if (self._configuration.client_side_validation and
                priority is not None and priority > 32767):  # noqa: E501
            raise ValueError("Invalid value for `priority`, must be a value less than or equal to `32767`")  # noqa: E501
        if (self._configuration.client_side_validation and
                priority is not None and priority < 1):  # noqa: E501
            raise ValueError("Invalid value for `priority`, must be a value greater than or equal to `1`")  # noqa: E501

        self._priority = priority

    @property
    def upstream_distribution(self):
        """Gets the upstream_distribution of this DebUpstreamRequestPatch.

        The distribution to fetch from the upstream

        :return: The upstream_distribution of this DebUpstreamRequestPatch.
        :rtype: str
        """
        return self._upstream_distribution

    @upstream_distribution.setter
    def upstream_distribution(self, upstream_distribution):
        """Sets the upstream_distribution of this DebUpstreamRequestPatch.

        The distribution to fetch from the upstream

        :param upstream_distribution: The upstream_distribution of this DebUpstreamRequestPatch.
        :type: str
        """
        if (self._configuration.client_side_validation and
                upstream_distribution is not None and len(upstream_distribution) > 64):
            raise ValueError("Invalid value for `upstream_distribution`, length must be less than or equal to `64`")  # noqa: E501
        if (self._configuration.client_side_validation and
                upstream_distribution is not None and len(upstream_distribution) < 1):
            raise ValueError("Invalid value for `upstream_distribution`, length must be greater than or equal to `1`")  # noqa: E501

        self._upstream_distribution = upstream_distribution

    @property
    def upstream_url(self):
        """Gets the upstream_url of this DebUpstreamRequestPatch.

        The URL for this upstream source. This must be a fully qualified URL including any path elements required to reach the root of the repository. 

        :return: The upstream_url of this DebUpstreamRequestPatch.
        :rtype: str
        """
        return self._upstream_url

    @upstream_url.setter
    def upstream_url(self, upstream_url):
        """Sets the upstream_url of this DebUpstreamRequestPatch.

        The URL for this upstream source. This must be a fully qualified URL including any path elements required to reach the root of the repository. 

        :param upstream_url: The upstream_url of this DebUpstreamRequestPatch.
        :type: str
        """
        if (self._configuration.client_side_validation and
                upstream_url is not None and len(upstream_url) > 200):
            raise ValueError("Invalid value for `upstream_url`, length must be less than or equal to `200`")  # noqa: E501
        if (self._configuration.client_side_validation and
                upstream_url is not None and len(upstream_url) < 1):
            raise ValueError("Invalid value for `upstream_url`, length must be greater than or equal to `1`")  # noqa: E501

        self._upstream_url = upstream_url

    @property
    def verify_ssl(self):
        """Gets the verify_ssl of this DebUpstreamRequestPatch.

        If enabled, SSL certificates are verified when requests are made to this upstream. It's recommended to leave this enabled for all public sources to help mitigate Man-In-The-Middle (MITM) attacks. Please note this only applies to HTTPS upstreams.

        :return: The verify_ssl of this DebUpstreamRequestPatch.
        :rtype: bool
        """
        return self._verify_ssl

    @verify_ssl.setter
    def verify_ssl(self, verify_ssl):
        """Sets the verify_ssl of this DebUpstreamRequestPatch.

        If enabled, SSL certificates are verified when requests are made to this upstream. It's recommended to leave this enabled for all public sources to help mitigate Man-In-The-Middle (MITM) attacks. Please note this only applies to HTTPS upstreams.

        :param verify_ssl: The verify_ssl of this DebUpstreamRequestPatch.
        :type: bool
        """

        self._verify_ssl = verify_ssl

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
        if issubclass(DebUpstreamRequestPatch, dict):
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
        if not isinstance(other, DebUpstreamRequestPatch):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, DebUpstreamRequestPatch):
            return True

        return self.to_dict() != other.to_dict()
