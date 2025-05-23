=begin
#Cloudsmith API (v1)

#The API to the Cloudsmith Service

OpenAPI spec version: v1
Contact: support@cloudsmith.io
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.43

=end

require 'date'

module CloudsmithApi
class RepositoryTokenRefresh
  attr_accessor :clients

  # The datetime the token was updated at.
  attr_accessor :created_at

  attr_accessor :created_by

  attr_accessor :created_by_url

  # If selected this is the default token for this repository.
  attr_accessor :default

  attr_accessor :disable_url

  attr_accessor :downloads

  attr_accessor :enable_url

  attr_accessor :eula_accepted

  # The datetime the EULA was accepted at.
  attr_accessor :eula_accepted_at

  attr_accessor :eula_accepted_from

  # If checked, a EULA acceptance is required for this token.
  attr_accessor :eula_required

  attr_accessor :has_limits

  # Deprecated (23-05-15): Please use 'slug_perm' instead. Previously: A monotonically increasing number that identified an entitlement within a repository.
  attr_accessor :identifier

  # If enabled, the token will allow downloads based on configured restrictions (if any).
  attr_accessor :is_active

  attr_accessor :is_limited

  # The maximum download bandwidth allowed for the token. Values are expressed as the selected unit of bandwidth. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point. 
  attr_accessor :limit_bandwidth

  attr_accessor :limit_bandwidth_unit

  # The starting date/time the token is allowed to be used from.
  attr_accessor :limit_date_range_from

  # The ending date/time the token is allowed to be used until.
  attr_accessor :limit_date_range_to

  # The maximum number of unique clients allowed for the token. Please note that since clients are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.
  attr_accessor :limit_num_clients

  # The maximum number of downloads allowed for the token. Please note that since downloads are calculated asynchronously (after the download happens), the limit may not be imposed immediately but at a later point.
  attr_accessor :limit_num_downloads

  # The package-based search query to apply to restrict downloads to. This uses the same syntax as the standard search used for repositories, and also supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. This will still allow access to non-package files, such as metadata.
  attr_accessor :limit_package_query

  # THIS WILL SOON BE DEPRECATED, please use limit_package_query instead. The path-based search query to apply to restrict downloads to. This supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. The path evaluated does not include the domain name, the namespace, the entitlement code used, the package format, etc. and it always starts with a forward slash.
  attr_accessor :limit_path_query

  attr_accessor :metadata

  attr_accessor :name

  attr_accessor :refresh_url

  attr_accessor :reset_url

  # The time at which the scheduled reset period has elapsed and the token limits were automatically reset to zero.
  attr_accessor :scheduled_reset_at

  attr_accessor :scheduled_reset_period

  attr_accessor :self_url

  attr_accessor :slug_perm

  attr_accessor :token

  # The datetime the token was updated at.
  attr_accessor :updated_at

  attr_accessor :updated_by

  attr_accessor :updated_by_url

  attr_accessor :usage

  attr_accessor :user

  attr_accessor :user_url

  class EnumAttributeValidator
    attr_reader :datatype
    attr_reader :allowable_values

    def initialize(datatype, allowable_values)
      @allowable_values = allowable_values.map do |value|
        case datatype.to_s
        when /Integer/i
          value.to_i
        when /Float/i
          value.to_f
        else
          value
        end
      end
    end

    def valid?(value)
      !value || allowable_values.include?(value)
    end
  end

  # Attribute mapping from ruby-style variable name to JSON key.
  def self.attribute_map
    {
      :'clients' => :'clients',
      :'created_at' => :'created_at',
      :'created_by' => :'created_by',
      :'created_by_url' => :'created_by_url',
      :'default' => :'default',
      :'disable_url' => :'disable_url',
      :'downloads' => :'downloads',
      :'enable_url' => :'enable_url',
      :'eula_accepted' => :'eula_accepted',
      :'eula_accepted_at' => :'eula_accepted_at',
      :'eula_accepted_from' => :'eula_accepted_from',
      :'eula_required' => :'eula_required',
      :'has_limits' => :'has_limits',
      :'identifier' => :'identifier',
      :'is_active' => :'is_active',
      :'is_limited' => :'is_limited',
      :'limit_bandwidth' => :'limit_bandwidth',
      :'limit_bandwidth_unit' => :'limit_bandwidth_unit',
      :'limit_date_range_from' => :'limit_date_range_from',
      :'limit_date_range_to' => :'limit_date_range_to',
      :'limit_num_clients' => :'limit_num_clients',
      :'limit_num_downloads' => :'limit_num_downloads',
      :'limit_package_query' => :'limit_package_query',
      :'limit_path_query' => :'limit_path_query',
      :'metadata' => :'metadata',
      :'name' => :'name',
      :'refresh_url' => :'refresh_url',
      :'reset_url' => :'reset_url',
      :'scheduled_reset_at' => :'scheduled_reset_at',
      :'scheduled_reset_period' => :'scheduled_reset_period',
      :'self_url' => :'self_url',
      :'slug_perm' => :'slug_perm',
      :'token' => :'token',
      :'updated_at' => :'updated_at',
      :'updated_by' => :'updated_by',
      :'updated_by_url' => :'updated_by_url',
      :'usage' => :'usage',
      :'user' => :'user',
      :'user_url' => :'user_url'
    }
  end

  # Attribute type mapping.
  def self.swagger_types
    {
      :'clients' => :'Integer',
      :'created_at' => :'DateTime',
      :'created_by' => :'String',
      :'created_by_url' => :'String',
      :'default' => :'BOOLEAN',
      :'disable_url' => :'String',
      :'downloads' => :'Integer',
      :'enable_url' => :'String',
      :'eula_accepted' => :'Eula',
      :'eula_accepted_at' => :'DateTime',
      :'eula_accepted_from' => :'String',
      :'eula_required' => :'BOOLEAN',
      :'has_limits' => :'BOOLEAN',
      :'identifier' => :'Integer',
      :'is_active' => :'BOOLEAN',
      :'is_limited' => :'BOOLEAN',
      :'limit_bandwidth' => :'Integer',
      :'limit_bandwidth_unit' => :'String',
      :'limit_date_range_from' => :'DateTime',
      :'limit_date_range_to' => :'DateTime',
      :'limit_num_clients' => :'Integer',
      :'limit_num_downloads' => :'Integer',
      :'limit_package_query' => :'String',
      :'limit_path_query' => :'String',
      :'metadata' => :'Object',
      :'name' => :'String',
      :'refresh_url' => :'String',
      :'reset_url' => :'String',
      :'scheduled_reset_at' => :'DateTime',
      :'scheduled_reset_period' => :'String',
      :'self_url' => :'String',
      :'slug_perm' => :'String',
      :'token' => :'String',
      :'updated_at' => :'DateTime',
      :'updated_by' => :'String',
      :'updated_by_url' => :'String',
      :'usage' => :'String',
      :'user' => :'String',
      :'user_url' => :'String'
    }
  end

  # Initializes the object
  # @param [Hash] attributes Model attributes in the form of hash
  def initialize(attributes = {})
    return unless attributes.is_a?(Hash)

    # convert string to symbol for hash key
    attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

    if attributes.has_key?(:'clients')
      self.clients = attributes[:'clients']
    end

    if attributes.has_key?(:'created_at')
      self.created_at = attributes[:'created_at']
    end

    if attributes.has_key?(:'created_by')
      self.created_by = attributes[:'created_by']
    end

    if attributes.has_key?(:'created_by_url')
      self.created_by_url = attributes[:'created_by_url']
    end

    if attributes.has_key?(:'default')
      self.default = attributes[:'default']
    end

    if attributes.has_key?(:'disable_url')
      self.disable_url = attributes[:'disable_url']
    end

    if attributes.has_key?(:'downloads')
      self.downloads = attributes[:'downloads']
    end

    if attributes.has_key?(:'enable_url')
      self.enable_url = attributes[:'enable_url']
    end

    if attributes.has_key?(:'eula_accepted')
      self.eula_accepted = attributes[:'eula_accepted']
    end

    if attributes.has_key?(:'eula_accepted_at')
      self.eula_accepted_at = attributes[:'eula_accepted_at']
    end

    if attributes.has_key?(:'eula_accepted_from')
      self.eula_accepted_from = attributes[:'eula_accepted_from']
    end

    if attributes.has_key?(:'eula_required')
      self.eula_required = attributes[:'eula_required']
    end

    if attributes.has_key?(:'has_limits')
      self.has_limits = attributes[:'has_limits']
    end

    if attributes.has_key?(:'identifier')
      self.identifier = attributes[:'identifier']
    end

    if attributes.has_key?(:'is_active')
      self.is_active = attributes[:'is_active']
    end

    if attributes.has_key?(:'is_limited')
      self.is_limited = attributes[:'is_limited']
    end

    if attributes.has_key?(:'limit_bandwidth')
      self.limit_bandwidth = attributes[:'limit_bandwidth']
    end

    if attributes.has_key?(:'limit_bandwidth_unit')
      self.limit_bandwidth_unit = attributes[:'limit_bandwidth_unit']
    else
      self.limit_bandwidth_unit = 'Byte'
    end

    if attributes.has_key?(:'limit_date_range_from')
      self.limit_date_range_from = attributes[:'limit_date_range_from']
    end

    if attributes.has_key?(:'limit_date_range_to')
      self.limit_date_range_to = attributes[:'limit_date_range_to']
    end

    if attributes.has_key?(:'limit_num_clients')
      self.limit_num_clients = attributes[:'limit_num_clients']
    end

    if attributes.has_key?(:'limit_num_downloads')
      self.limit_num_downloads = attributes[:'limit_num_downloads']
    end

    if attributes.has_key?(:'limit_package_query')
      self.limit_package_query = attributes[:'limit_package_query']
    end

    if attributes.has_key?(:'limit_path_query')
      self.limit_path_query = attributes[:'limit_path_query']
    end

    if attributes.has_key?(:'metadata')
      self.metadata = attributes[:'metadata']
    end

    if attributes.has_key?(:'name')
      self.name = attributes[:'name']
    end

    if attributes.has_key?(:'refresh_url')
      self.refresh_url = attributes[:'refresh_url']
    end

    if attributes.has_key?(:'reset_url')
      self.reset_url = attributes[:'reset_url']
    end

    if attributes.has_key?(:'scheduled_reset_at')
      self.scheduled_reset_at = attributes[:'scheduled_reset_at']
    end

    if attributes.has_key?(:'scheduled_reset_period')
      self.scheduled_reset_period = attributes[:'scheduled_reset_period']
    else
      self.scheduled_reset_period = 'Never Reset'
    end

    if attributes.has_key?(:'self_url')
      self.self_url = attributes[:'self_url']
    end

    if attributes.has_key?(:'slug_perm')
      self.slug_perm = attributes[:'slug_perm']
    end

    if attributes.has_key?(:'token')
      self.token = attributes[:'token']
    end

    if attributes.has_key?(:'updated_at')
      self.updated_at = attributes[:'updated_at']
    end

    if attributes.has_key?(:'updated_by')
      self.updated_by = attributes[:'updated_by']
    end

    if attributes.has_key?(:'updated_by_url')
      self.updated_by_url = attributes[:'updated_by_url']
    end

    if attributes.has_key?(:'usage')
      self.usage = attributes[:'usage']
    end

    if attributes.has_key?(:'user')
      self.user = attributes[:'user']
    end

    if attributes.has_key?(:'user_url')
      self.user_url = attributes[:'user_url']
    end
  end

  # Show invalid properties with the reasons. Usually used together with valid?
  # @return Array for valid properties with the reasons
  def list_invalid_properties
    invalid_properties = Array.new
    invalid_properties
  end

  # Check to see if the all the properties in the model are valid
  # @return true if the model is valid
  def valid?
    limit_bandwidth_unit_validator = EnumAttributeValidator.new('String', ['Byte', 'Kilobyte', 'Megabyte', 'Gigabyte', 'Terabyte', 'Petabyte', 'Exabyte', 'Zettabyte', 'Yottabyte'])
    return false unless limit_bandwidth_unit_validator.valid?(@limit_bandwidth_unit)
    scheduled_reset_period_validator = EnumAttributeValidator.new('String', ['Never Reset', 'Daily', 'Weekly', 'Fortnightly', 'Monthly', 'Bi-Monthly', 'Quarterly', 'Every 6 months', 'Annual'])
    return false unless scheduled_reset_period_validator.valid?(@scheduled_reset_period)
    true
  end

  # Custom attribute writer method checking allowed values (enum).
  # @param [Object] limit_bandwidth_unit Object to be assigned
  def limit_bandwidth_unit=(limit_bandwidth_unit)
    validator = EnumAttributeValidator.new('String', ['Byte', 'Kilobyte', 'Megabyte', 'Gigabyte', 'Terabyte', 'Petabyte', 'Exabyte', 'Zettabyte', 'Yottabyte'])
    unless validator.valid?(limit_bandwidth_unit)
      fail ArgumentError, 'invalid value for "limit_bandwidth_unit", must be one of #{validator.allowable_values}.'
    end
    @limit_bandwidth_unit = limit_bandwidth_unit
  end

  # Custom attribute writer method checking allowed values (enum).
  # @param [Object] scheduled_reset_period Object to be assigned
  def scheduled_reset_period=(scheduled_reset_period)
    validator = EnumAttributeValidator.new('String', ['Never Reset', 'Daily', 'Weekly', 'Fortnightly', 'Monthly', 'Bi-Monthly', 'Quarterly', 'Every 6 months', 'Annual'])
    unless validator.valid?(scheduled_reset_period)
      fail ArgumentError, 'invalid value for "scheduled_reset_period", must be one of #{validator.allowable_values}.'
    end
    @scheduled_reset_period = scheduled_reset_period
  end

  # Checks equality by comparing each attribute.
  # @param [Object] Object to be compared
  def ==(o)
    return true if self.equal?(o)
    self.class == o.class &&
        clients == o.clients &&
        created_at == o.created_at &&
        created_by == o.created_by &&
        created_by_url == o.created_by_url &&
        default == o.default &&
        disable_url == o.disable_url &&
        downloads == o.downloads &&
        enable_url == o.enable_url &&
        eula_accepted == o.eula_accepted &&
        eula_accepted_at == o.eula_accepted_at &&
        eula_accepted_from == o.eula_accepted_from &&
        eula_required == o.eula_required &&
        has_limits == o.has_limits &&
        identifier == o.identifier &&
        is_active == o.is_active &&
        is_limited == o.is_limited &&
        limit_bandwidth == o.limit_bandwidth &&
        limit_bandwidth_unit == o.limit_bandwidth_unit &&
        limit_date_range_from == o.limit_date_range_from &&
        limit_date_range_to == o.limit_date_range_to &&
        limit_num_clients == o.limit_num_clients &&
        limit_num_downloads == o.limit_num_downloads &&
        limit_package_query == o.limit_package_query &&
        limit_path_query == o.limit_path_query &&
        metadata == o.metadata &&
        name == o.name &&
        refresh_url == o.refresh_url &&
        reset_url == o.reset_url &&
        scheduled_reset_at == o.scheduled_reset_at &&
        scheduled_reset_period == o.scheduled_reset_period &&
        self_url == o.self_url &&
        slug_perm == o.slug_perm &&
        token == o.token &&
        updated_at == o.updated_at &&
        updated_by == o.updated_by &&
        updated_by_url == o.updated_by_url &&
        usage == o.usage &&
        user == o.user &&
        user_url == o.user_url
  end

  # @see the `==` method
  # @param [Object] Object to be compared
  def eql?(o)
    self == o
  end

  # Calculates hash code according to all attributes.
  # @return [Fixnum] Hash code
  def hash
    [clients, created_at, created_by, created_by_url, default, disable_url, downloads, enable_url, eula_accepted, eula_accepted_at, eula_accepted_from, eula_required, has_limits, identifier, is_active, is_limited, limit_bandwidth, limit_bandwidth_unit, limit_date_range_from, limit_date_range_to, limit_num_clients, limit_num_downloads, limit_package_query, limit_path_query, metadata, name, refresh_url, reset_url, scheduled_reset_at, scheduled_reset_period, self_url, slug_perm, token, updated_at, updated_by, updated_by_url, usage, user, user_url].hash
  end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.swagger_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end # or else data not found in attributes(hash), not an issue as the data can be optional
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        DateTime.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :BOOLEAN
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        temp_model = CloudsmithApi.const_get(type).new
        temp_model.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        next if value.nil?
        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

end
end
