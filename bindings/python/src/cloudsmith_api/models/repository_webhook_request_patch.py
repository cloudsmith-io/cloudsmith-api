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


class RepositoryWebhookRequestPatch(object):
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
        'events': 'list[str]',
        'is_active': 'bool',
        'package_query': 'str',
        'request_body_format': 'int',
        'request_body_template_format': 'int',
        'request_content_type': 'str',
        'secret_header': 'str',
        'secret_value': 'str',
        'signature_key': 'str',
        'target_url': 'str',
        'templates': 'list[WebhookTemplate]',
        'verify_ssl': 'bool'
    }

    attribute_map = {
        'events': 'events',
        'is_active': 'is_active',
        'package_query': 'package_query',
        'request_body_format': 'request_body_format',
        'request_body_template_format': 'request_body_template_format',
        'request_content_type': 'request_content_type',
        'secret_header': 'secret_header',
        'secret_value': 'secret_value',
        'signature_key': 'signature_key',
        'target_url': 'target_url',
        'templates': 'templates',
        'verify_ssl': 'verify_ssl'
    }

    def __init__(self, events=None, is_active=None, package_query=None, request_body_format=None, request_body_template_format=None, request_content_type=None, secret_header=None, secret_value=None, signature_key=None, target_url=None, templates=None, verify_ssl=None, _configuration=None):  # noqa: E501
        """RepositoryWebhookRequestPatch - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._events = None
        self._is_active = None
        self._package_query = None
        self._request_body_format = None
        self._request_body_template_format = None
        self._request_content_type = None
        self._secret_header = None
        self._secret_value = None
        self._signature_key = None
        self._target_url = None
        self._templates = None
        self._verify_ssl = None
        self.discriminator = None

        if events is not None:
            self.events = events
        if is_active is not None:
            self.is_active = is_active
        if package_query is not None:
            self.package_query = package_query
        if request_body_format is not None:
            self.request_body_format = request_body_format
        if request_body_template_format is not None:
            self.request_body_template_format = request_body_template_format
        if request_content_type is not None:
            self.request_content_type = request_content_type
        if secret_header is not None:
            self.secret_header = secret_header
        if secret_value is not None:
            self.secret_value = secret_value
        if signature_key is not None:
            self.signature_key = signature_key
        if target_url is not None:
            self.target_url = target_url
        if templates is not None:
            self.templates = templates
        if verify_ssl is not None:
            self.verify_ssl = verify_ssl

    @property
    def events(self):
        """Gets the events of this RepositoryWebhookRequestPatch.


        :return: The events of this RepositoryWebhookRequestPatch.
        :rtype: list[str]
        """
        return self._events

    @events.setter
    def events(self, events):
        """Sets the events of this RepositoryWebhookRequestPatch.


        :param events: The events of this RepositoryWebhookRequestPatch.
        :type: list[str]
        """
        allowed_values = ["*", "package.created", "package.deleted", "package.downloaded", "package.failed", "package.security_scanned", "package.synced", "package.syncing", "package.tags_updated"]  # noqa: E501
        if (self._configuration.client_side_validation and
                not set(events).issubset(set(allowed_values))):  # noqa: E501
            raise ValueError(
                "Invalid values for `events` [{0}], must be a subset of [{1}]"  # noqa: E501
                .format(", ".join(map(str, set(events) - set(allowed_values))),  # noqa: E501
                        ", ".join(map(str, allowed_values)))
            )

        self._events = events

    @property
    def is_active(self):
        """Gets the is_active of this RepositoryWebhookRequestPatch.

        If enabled, the webhook will trigger on subscribed events and send payloads to the configured target URL.

        :return: The is_active of this RepositoryWebhookRequestPatch.
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this RepositoryWebhookRequestPatch.

        If enabled, the webhook will trigger on subscribed events and send payloads to the configured target URL.

        :param is_active: The is_active of this RepositoryWebhookRequestPatch.
        :type: bool
        """

        self._is_active = is_active

    @property
    def package_query(self):
        """Gets the package_query of this RepositoryWebhookRequestPatch.

        The package-based search query for webhooks to fire. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. If a package does not match, the webhook will not fire.

        :return: The package_query of this RepositoryWebhookRequestPatch.
        :rtype: str
        """
        return self._package_query

    @package_query.setter
    def package_query(self, package_query):
        """Sets the package_query of this RepositoryWebhookRequestPatch.

        The package-based search query for webhooks to fire. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. If a package does not match, the webhook will not fire.

        :param package_query: The package_query of this RepositoryWebhookRequestPatch.
        :type: str
        """
        if (self._configuration.client_side_validation and
                package_query is not None and len(package_query) > 1024):
            raise ValueError("Invalid value for `package_query`, length must be less than or equal to `1024`")  # noqa: E501

        self._package_query = package_query

    @property
    def request_body_format(self):
        """Gets the request_body_format of this RepositoryWebhookRequestPatch.

        The format of the payloads for webhook requests.

        :return: The request_body_format of this RepositoryWebhookRequestPatch.
        :rtype: int
        """
        return self._request_body_format

    @request_body_format.setter
    def request_body_format(self, request_body_format):
        """Sets the request_body_format of this RepositoryWebhookRequestPatch.

        The format of the payloads for webhook requests.

        :param request_body_format: The request_body_format of this RepositoryWebhookRequestPatch.
        :type: int
        """

        self._request_body_format = request_body_format

    @property
    def request_body_template_format(self):
        """Gets the request_body_template_format of this RepositoryWebhookRequestPatch.

        The format of the payloads for webhook requests.

        :return: The request_body_template_format of this RepositoryWebhookRequestPatch.
        :rtype: int
        """
        return self._request_body_template_format

    @request_body_template_format.setter
    def request_body_template_format(self, request_body_template_format):
        """Sets the request_body_template_format of this RepositoryWebhookRequestPatch.

        The format of the payloads for webhook requests.

        :param request_body_template_format: The request_body_template_format of this RepositoryWebhookRequestPatch.
        :type: int
        """

        self._request_body_template_format = request_body_template_format

    @property
    def request_content_type(self):
        """Gets the request_content_type of this RepositoryWebhookRequestPatch.

        The value that will be sent for the 'Content Type' header. 

        :return: The request_content_type of this RepositoryWebhookRequestPatch.
        :rtype: str
        """
        return self._request_content_type

    @request_content_type.setter
    def request_content_type(self, request_content_type):
        """Sets the request_content_type of this RepositoryWebhookRequestPatch.

        The value that will be sent for the 'Content Type' header. 

        :param request_content_type: The request_content_type of this RepositoryWebhookRequestPatch.
        :type: str
        """
        if (self._configuration.client_side_validation and
                request_content_type is not None and len(request_content_type) > 128):
            raise ValueError("Invalid value for `request_content_type`, length must be less than or equal to `128`")  # noqa: E501

        self._request_content_type = request_content_type

    @property
    def secret_header(self):
        """Gets the secret_header of this RepositoryWebhookRequestPatch.

        The header to send the predefined secret in. This must be unique from existing headers or it won't be sent. You can use this as a form of authentication on the endpoint side.

        :return: The secret_header of this RepositoryWebhookRequestPatch.
        :rtype: str
        """
        return self._secret_header

    @secret_header.setter
    def secret_header(self, secret_header):
        """Sets the secret_header of this RepositoryWebhookRequestPatch.

        The header to send the predefined secret in. This must be unique from existing headers or it won't be sent. You can use this as a form of authentication on the endpoint side.

        :param secret_header: The secret_header of this RepositoryWebhookRequestPatch.
        :type: str
        """
        if (self._configuration.client_side_validation and
                secret_header is not None and len(secret_header) > 64):
            raise ValueError("Invalid value for `secret_header`, length must be less than or equal to `64`")  # noqa: E501
        if (self._configuration.client_side_validation and
                secret_header is not None and not re.search('^[-\\w]+$', secret_header)):  # noqa: E501
            raise ValueError(r"Invalid value for `secret_header`, must be a follow pattern or equal to `/^[-\\w]+$/`")  # noqa: E501

        self._secret_header = secret_header

    @property
    def secret_value(self):
        """Gets the secret_value of this RepositoryWebhookRequestPatch.

        The value for the predefined secret (note: this is treated as a passphrase and is encrypted when we store it). You can use this as a form of authentication on the endpoint side.

        :return: The secret_value of this RepositoryWebhookRequestPatch.
        :rtype: str
        """
        return self._secret_value

    @secret_value.setter
    def secret_value(self, secret_value):
        """Sets the secret_value of this RepositoryWebhookRequestPatch.

        The value for the predefined secret (note: this is treated as a passphrase and is encrypted when we store it). You can use this as a form of authentication on the endpoint side.

        :param secret_value: The secret_value of this RepositoryWebhookRequestPatch.
        :type: str
        """
        if (self._configuration.client_side_validation and
                secret_value is not None and len(secret_value) > 512):
            raise ValueError("Invalid value for `secret_value`, length must be less than or equal to `512`")  # noqa: E501
        if (self._configuration.client_side_validation and
                secret_value is not None and not re.search('^[^\\n\\r]+$', secret_value)):  # noqa: E501
            raise ValueError(r"Invalid value for `secret_value`, must be a follow pattern or equal to `/^[^\\n\\r]+$/`")  # noqa: E501

        self._secret_value = secret_value

    @property
    def signature_key(self):
        """Gets the signature_key of this RepositoryWebhookRequestPatch.

        The value for the signature key - This is used to generate an HMAC-based hex digest of the request body, which we send as the X-Cloudsmith-Signature header so that you can ensure that the request wasn't modified by a malicious party (note: this is treated as a passphrase and is encrypted when we store it).

        :return: The signature_key of this RepositoryWebhookRequestPatch.
        :rtype: str
        """
        return self._signature_key

    @signature_key.setter
    def signature_key(self, signature_key):
        """Sets the signature_key of this RepositoryWebhookRequestPatch.

        The value for the signature key - This is used to generate an HMAC-based hex digest of the request body, which we send as the X-Cloudsmith-Signature header so that you can ensure that the request wasn't modified by a malicious party (note: this is treated as a passphrase and is encrypted when we store it).

        :param signature_key: The signature_key of this RepositoryWebhookRequestPatch.
        :type: str
        """
        if (self._configuration.client_side_validation and
                signature_key is not None and len(signature_key) > 512):
            raise ValueError("Invalid value for `signature_key`, length must be less than or equal to `512`")  # noqa: E501
        if (self._configuration.client_side_validation and
                signature_key is not None and len(signature_key) < 1):
            raise ValueError("Invalid value for `signature_key`, length must be greater than or equal to `1`")  # noqa: E501

        self._signature_key = signature_key

    @property
    def target_url(self):
        """Gets the target_url of this RepositoryWebhookRequestPatch.

        The destination URL that webhook payloads will be POST'ed to.

        :return: The target_url of this RepositoryWebhookRequestPatch.
        :rtype: str
        """
        return self._target_url

    @target_url.setter
    def target_url(self, target_url):
        """Sets the target_url of this RepositoryWebhookRequestPatch.

        The destination URL that webhook payloads will be POST'ed to.

        :param target_url: The target_url of this RepositoryWebhookRequestPatch.
        :type: str
        """
        if (self._configuration.client_side_validation and
                target_url is not None and len(target_url) > 255):
            raise ValueError("Invalid value for `target_url`, length must be less than or equal to `255`")  # noqa: E501
        if (self._configuration.client_side_validation and
                target_url is not None and len(target_url) < 1):
            raise ValueError("Invalid value for `target_url`, length must be greater than or equal to `1`")  # noqa: E501

        self._target_url = target_url

    @property
    def templates(self):
        """Gets the templates of this RepositoryWebhookRequestPatch.


        :return: The templates of this RepositoryWebhookRequestPatch.
        :rtype: list[WebhookTemplate]
        """
        return self._templates

    @templates.setter
    def templates(self, templates):
        """Sets the templates of this RepositoryWebhookRequestPatch.


        :param templates: The templates of this RepositoryWebhookRequestPatch.
        :type: list[WebhookTemplate]
        """

        self._templates = templates

    @property
    def verify_ssl(self):
        """Gets the verify_ssl of this RepositoryWebhookRequestPatch.

        If enabled, SSL certificates is verified when webhooks are sent. It's recommended to leave this enabled as not verifying the integrity of SSL certificates leaves you susceptible to Man-in-the-Middle (MITM) attacks.

        :return: The verify_ssl of this RepositoryWebhookRequestPatch.
        :rtype: bool
        """
        return self._verify_ssl

    @verify_ssl.setter
    def verify_ssl(self, verify_ssl):
        """Sets the verify_ssl of this RepositoryWebhookRequestPatch.

        If enabled, SSL certificates is verified when webhooks are sent. It's recommended to leave this enabled as not verifying the integrity of SSL certificates leaves you susceptible to Man-in-the-Middle (MITM) attacks.

        :param verify_ssl: The verify_ssl of this RepositoryWebhookRequestPatch.
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
        if issubclass(RepositoryWebhookRequestPatch, dict):
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
        if not isinstance(other, RepositoryWebhookRequestPatch):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, RepositoryWebhookRequestPatch):
            return True

        return self.to_dict() != other.to_dict()
