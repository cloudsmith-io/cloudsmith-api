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
  class RateCheck
    # The time in seconds that you are suggested to wait until the next request in order to avoid consuming too much within the rate limit window.
    attr_accessor :interval

    # The maximum number of requests that you are permitted to send per hour
    attr_accessor :limit

    # The number of requests that are remaining in the current rate limit window
    attr_accessor :remaining

    # The UTC epoch timestamp at which the current rate limit window will reset
    attr_accessor :reset

    # The ISO 8601 datetime at which the current rate limit window will reset
    attr_accessor :reset_iso_8601

    # If true, throttling is currently being enforced.
    attr_accessor :throttled

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'interval' => :'interval',
        :'limit' => :'limit',
        :'remaining' => :'remaining',
        :'reset' => :'reset',
        :'reset_iso_8601' => :'reset_iso_8601',
        :'throttled' => :'throttled'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'interval' => :'Float',
        :'limit' => :'Integer',
        :'remaining' => :'Integer',
        :'reset' => :'Integer',
        :'reset_iso_8601' => :'String',
        :'throttled' => :'BOOLEAN'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'interval')
        self.interval = attributes[:'interval']
      end

      if attributes.has_key?(:'limit')
        self.limit = attributes[:'limit']
      end

      if attributes.has_key?(:'remaining')
        self.remaining = attributes[:'remaining']
      end

      if attributes.has_key?(:'reset')
        self.reset = attributes[:'reset']
      end

      if attributes.has_key?(:'reset_iso_8601')
        self.reset_iso_8601 = attributes[:'reset_iso_8601']
      end

      if attributes.has_key?(:'throttled')
        self.throttled = attributes[:'throttled']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if !@reset_iso_8601.nil? && @reset_iso_8601.to_s.length < 1
        invalid_properties.push('invalid value for "reset_iso_8601", the character length must be great than or equal to 1.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@reset_iso_8601.nil? && @reset_iso_8601.to_s.length < 1
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] reset_iso_8601 Value to be assigned
    def reset_iso_8601=(reset_iso_8601)
      if !reset_iso_8601.nil? && reset_iso_8601.to_s.length < 1
        fail ArgumentError, 'invalid value for "reset_iso_8601", the character length must be great than or equal to 1.'
      end

      @reset_iso_8601 = reset_iso_8601
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          interval == o.interval &&
          limit == o.limit &&
          remaining == o.remaining &&
          reset == o.reset &&
          reset_iso_8601 == o.reset_iso_8601 &&
          throttled == o.throttled
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [interval, limit, remaining, reset, reset_iso_8601, throttled].hash
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