# CloudsmithApi::RepositoryWebhook

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created_at** | **Time** |  | [optional][readonly] |
| **created_by** | **String** |  | [optional][readonly] |
| **created_by_url** | **String** |  | [optional][readonly] |
| **disable_reason** | **Integer** |  | [optional][readonly] |
| **disable_reason_str** | **String** |  | [optional][readonly] |
| **events** | **Array&lt;String&gt;** |  | [optional] |
| **identifier** | **Integer** | Deprecated (23-05-15): Please use &#39;slug_perm&#39; instead. Previously: A monotonically increasing number that identified a webhook request within a repository. | [optional][readonly] |
| **is_active** | **Boolean** | If enabled, the webhook will trigger on subscribed events and send payloads to the configured target URL. | [optional] |
| **is_last_response_bad** | **Boolean** |  | [optional][readonly] |
| **last_response_status** | **Integer** |  | [optional][readonly] |
| **last_response_status_str** | **String** |  | [optional][readonly] |
| **num_sent** | **Integer** |  | [optional][readonly] |
| **package_query** | **String** | The package-based search query for webhooks to fire. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. If a package does not match, the webhook will not fire. | [optional] |
| **request_body_format** | **Integer** | The format of the payloads for webhook requests. Valid options are: (0) JSON, (1) JSON array, (2) form encoded JSON and (3) Handlebars template. | [optional] |
| **request_body_format_str** | **String** |  | [optional][readonly] |
| **request_body_template_format** | **Integer** | The format of the payloads for webhook requests. Valid options are: (0) Generic/user defined, (1) JSON and (2) XML. | [optional] |
| **request_body_template_format_str** | **String** |  | [optional][readonly] |
| **request_content_type** | **String** | The value that will be sent for the &#39;Content Type&#39; header.  | [optional] |
| **secret_header** | **String** | The header to send the predefined secret in. This must be unique from existing headers or it won&#39;t be sent. You can use this as a form of authentication on the endpoint side. | [optional] |
| **self_url** | **String** |  | [optional][readonly] |
| **slug_perm** | **String** |  | [optional][readonly] |
| **target_url** | **String** | The destination URL that webhook payloads will be POST&#39;ed to. | [optional] |
| **templates** | [**Array&lt;WebhookTemplate&gt;**](WebhookTemplate.md) |  | [optional] |
| **updated_at** | **Time** |  | [optional][readonly] |
| **updated_by** | **String** |  | [optional][readonly] |
| **updated_by_url** | **String** |  | [optional][readonly] |
| **verify_ssl** | **Boolean** | If enabled, SSL certificates is verified when webhooks are sent. It&#39;s recommended to leave this enabled as not verifying the integrity of SSL certificates leaves you susceptible to Man-in-the-Middle (MITM) attacks. | [optional] |

## Example

```ruby
require 'cloudsmith-api'

instance = CloudsmithApi::RepositoryWebhook.new(
  created_at: null,
  created_by: null,
  created_by_url: null,
  disable_reason: null,
  disable_reason_str: null,
  events: null,
  identifier: null,
  is_active: null,
  is_last_response_bad: null,
  last_response_status: null,
  last_response_status_str: null,
  num_sent: null,
  package_query: null,
  request_body_format: null,
  request_body_format_str: null,
  request_body_template_format: null,
  request_body_template_format_str: null,
  request_content_type: null,
  secret_header: null,
  self_url: null,
  slug_perm: null,
  target_url: null,
  templates: null,
  updated_at: null,
  updated_by: null,
  updated_by_url: null,
  verify_ssl: null
)
```

