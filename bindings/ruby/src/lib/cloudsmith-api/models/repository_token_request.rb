=begin
#Cloudsmith API (v1)

#The API to the Cloudsmith Service

OpenAPI spec version: v1
Contact: support@cloudsmith.io
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.26

=end

require 'date'

module CloudsmithApi
  class RepositoryTokenRequest
    # If checked, a EULA acceptance is required for this token.
    attr_accessor :eula_required

    # If enabled, the token will allow downloads based on configured restrictions (if any).
    attr_accessor :is_active

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

    # The path-based search query to apply to restrict downloads to. This supports boolean logic operators such as OR/AND/NOT and parentheses for grouping. The path evaluated does not include the domain name, the namespace, the entitlement code used, the package format, etc. and it always starts with a forward slash.
    attr_accessor :limit_path_query

    attr_accessor :metadata

    attr_accessor :name

    # The time at which the scheduled reset period has elapsed and the token limits were automatically reset to zero.
    attr_accessor :scheduled_reset_at

    attr_accessor :scheduled_reset_period

    attr_accessor :token

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'eula_required' => :'eula_required',
        :'is_active' => :'is_active',
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
        :'scheduled_reset_at' => :'scheduled_reset_at',
        :'scheduled_reset_period' => :'scheduled_reset_period',
        :'token' => :'token'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'eula_required' => :'BOOLEAN',
        :'is_active' => :'BOOLEAN',
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
        :'scheduled_reset_at' => :'DateTime',
        :'scheduled_reset_period' => :'String',
        :'token' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'eula_required')
        self.eula_required = attributes[:'eula_required']
      end

      if attributes.has_key?(:'is_active')
        self.is_active = attributes[:'is_active']
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

      if attributes.has_key?(:'scheduled_reset_at')
        self.scheduled_reset_at = attributes[:'scheduled_reset_at']
      end

      if attributes.has_key?(:'scheduled_reset_period')
        self.scheduled_reset_period = attributes[:'scheduled_reset_period']
      else
        self.scheduled_reset_period = 'Never Reset'
      end

      if attributes.has_key?(:'token')
        self.token = attributes[:'token']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if !@limit_bandwidth.nil? && @limit_bandwidth > 9223372036854775807
        invalid_properties.push('invalid value for "limit_bandwidth", must be smaller than or equal to 9223372036854775807.')
      end

      if !@limit_bandwidth.nil? && @limit_bandwidth < -9223372036854775808
        invalid_properties.push('invalid value for "limit_bandwidth", must be greater than or equal to -9223372036854775808.')
      end

      if !@limit_num_clients.nil? && @limit_num_clients > 9223372036854775807
        invalid_properties.push('invalid value for "limit_num_clients", must be smaller than or equal to 9223372036854775807.')
      end

      if !@limit_num_clients.nil? && @limit_num_clients < -9223372036854775808
        invalid_properties.push('invalid value for "limit_num_clients", must be greater than or equal to -9223372036854775808.')
      end

      if !@limit_num_downloads.nil? && @limit_num_downloads > 9223372036854775807
        invalid_properties.push('invalid value for "limit_num_downloads", must be smaller than or equal to 9223372036854775807.')
      end

      if !@limit_num_downloads.nil? && @limit_num_downloads < -9223372036854775808
        invalid_properties.push('invalid value for "limit_num_downloads", must be greater than or equal to -9223372036854775808.')
      end

      if !@limit_package_query.nil? && @limit_package_query.to_s.length > 1024
        invalid_properties.push('invalid value for "limit_package_query", the character length must be smaller than or equal to 1024.')
      end

      if !@limit_path_query.nil? && @limit_path_query.to_s.length > 1024
        invalid_properties.push('invalid value for "limit_path_query", the character length must be smaller than or equal to 1024.')
      end

      if @name.nil?
        invalid_properties.push('invalid value for "name", name cannot be nil.')
      end

      if @name.to_s.length < 1
        invalid_properties.push('invalid value for "name", the character length must be great than or equal to 1.')
      end

      if !@token.nil? && @token.to_s.length < 1
        invalid_properties.push('invalid value for "token", the character length must be great than or equal to 1.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@limit_bandwidth.nil? && @limit_bandwidth > 9223372036854775807
      return false if !@limit_bandwidth.nil? && @limit_bandwidth < -9223372036854775808
      return false if !@limit_num_clients.nil? && @limit_num_clients > 9223372036854775807
      return false if !@limit_num_clients.nil? && @limit_num_clients < -9223372036854775808
      return false if !@limit_num_downloads.nil? && @limit_num_downloads > 9223372036854775807
      return false if !@limit_num_downloads.nil? && @limit_num_downloads < -9223372036854775808
      return false if !@limit_package_query.nil? && @limit_package_query.to_s.length > 1024
      return false if !@limit_path_query.nil? && @limit_path_query.to_s.length > 1024
      return false if @name.nil?
      return false if @name.to_s.length < 1
      return false if !@token.nil? && @token.to_s.length < 1
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] limit_bandwidth Value to be assigned
    def limit_bandwidth=(limit_bandwidth)
      if !limit_bandwidth.nil? && limit_bandwidth > 9223372036854775807
        fail ArgumentError, 'invalid value for "limit_bandwidth", must be smaller than or equal to 9223372036854775807.'
      end

      if !limit_bandwidth.nil? && limit_bandwidth < -9223372036854775808
        fail ArgumentError, 'invalid value for "limit_bandwidth", must be greater than or equal to -9223372036854775808.'
      end

      @limit_bandwidth = limit_bandwidth
    end

    # Custom attribute writer method with validation
    # @param [Object] limit_num_clients Value to be assigned
    def limit_num_clients=(limit_num_clients)
      if !limit_num_clients.nil? && limit_num_clients > 9223372036854775807
        fail ArgumentError, 'invalid value for "limit_num_clients", must be smaller than or equal to 9223372036854775807.'
      end

      if !limit_num_clients.nil? && limit_num_clients < -9223372036854775808
        fail ArgumentError, 'invalid value for "limit_num_clients", must be greater than or equal to -9223372036854775808.'
      end

      @limit_num_clients = limit_num_clients
    end

    # Custom attribute writer method with validation
    # @param [Object] limit_num_downloads Value to be assigned
    def limit_num_downloads=(limit_num_downloads)
      if !limit_num_downloads.nil? && limit_num_downloads > 9223372036854775807
        fail ArgumentError, 'invalid value for "limit_num_downloads", must be smaller than or equal to 9223372036854775807.'
      end

      if !limit_num_downloads.nil? && limit_num_downloads < -9223372036854775808
        fail ArgumentError, 'invalid value for "limit_num_downloads", must be greater than or equal to -9223372036854775808.'
      end

      @limit_num_downloads = limit_num_downloads
    end

    # Custom attribute writer method with validation
    # @param [Object] limit_package_query Value to be assigned
    def limit_package_query=(limit_package_query)
      if !limit_package_query.nil? && limit_package_query.to_s.length > 1024
        fail ArgumentError, 'invalid value for "limit_package_query", the character length must be smaller than or equal to 1024.'
      end

      @limit_package_query = limit_package_query
    end

    # Custom attribute writer method with validation
    # @param [Object] limit_path_query Value to be assigned
    def limit_path_query=(limit_path_query)
      if !limit_path_query.nil? && limit_path_query.to_s.length > 1024
        fail ArgumentError, 'invalid value for "limit_path_query", the character length must be smaller than or equal to 1024.'
      end

      @limit_path_query = limit_path_query
    end

    # Custom attribute writer method with validation
    # @param [Object] name Value to be assigned
    def name=(name)
      if name.nil?
        fail ArgumentError, 'name cannot be nil'
      end

      if name.to_s.length < 1
        fail ArgumentError, 'invalid value for "name", the character length must be great than or equal to 1.'
      end

      @name = name
    end

    # Custom attribute writer method with validation
    # @param [Object] token Value to be assigned
    def token=(token)
      if !token.nil? && token.to_s.length < 1
        fail ArgumentError, 'invalid value for "token", the character length must be great than or equal to 1.'
      end

      @token = token
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          eula_required == o.eula_required &&
          is_active == o.is_active &&
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
          scheduled_reset_at == o.scheduled_reset_at &&
          scheduled_reset_period == o.scheduled_reset_period &&
          token == o.token
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [eula_required, is_active, limit_bandwidth, limit_bandwidth_unit, limit_date_range_from, limit_date_range_to, limit_num_clients, limit_num_downloads, limit_package_query, limit_path_query, metadata, name, scheduled_reset_at, scheduled_reset_period, token].hash
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