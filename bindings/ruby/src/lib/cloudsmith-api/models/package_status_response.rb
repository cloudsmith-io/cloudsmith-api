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
  class PackageStatusResponse
    attr_accessor :is_downloadable

    attr_accessor :is_quarantined

    attr_accessor :is_sync_awaiting

    attr_accessor :is_sync_completed

    attr_accessor :is_sync_failed

    attr_accessor :is_sync_in_flight

    attr_accessor :is_sync_in_progress

    attr_accessor :self_url

    # The synchronisation (in progress) stage of the package.
    attr_accessor :stage

    attr_accessor :stage_str

    # The datetime the package stage was updated at.
    attr_accessor :stage_updated_at

    # The synchronisation status of the package.
    attr_accessor :status

    # A textual description for the synchronous status reason (if any
    attr_accessor :status_reason

    attr_accessor :status_str

    # The datetime the package status was updated at.
    attr_accessor :status_updated_at

    # The datetime the package sync was finished at.
    attr_accessor :sync_finished_at

    # Synchronisation progress (from 0-100)
    attr_accessor :sync_progress

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'is_downloadable' => :'is_downloadable',
        :'is_quarantined' => :'is_quarantined',
        :'is_sync_awaiting' => :'is_sync_awaiting',
        :'is_sync_completed' => :'is_sync_completed',
        :'is_sync_failed' => :'is_sync_failed',
        :'is_sync_in_flight' => :'is_sync_in_flight',
        :'is_sync_in_progress' => :'is_sync_in_progress',
        :'self_url' => :'self_url',
        :'stage' => :'stage',
        :'stage_str' => :'stage_str',
        :'stage_updated_at' => :'stage_updated_at',
        :'status' => :'status',
        :'status_reason' => :'status_reason',
        :'status_str' => :'status_str',
        :'status_updated_at' => :'status_updated_at',
        :'sync_finished_at' => :'sync_finished_at',
        :'sync_progress' => :'sync_progress'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'is_downloadable' => :'BOOLEAN',
        :'is_quarantined' => :'BOOLEAN',
        :'is_sync_awaiting' => :'BOOLEAN',
        :'is_sync_completed' => :'BOOLEAN',
        :'is_sync_failed' => :'BOOLEAN',
        :'is_sync_in_flight' => :'BOOLEAN',
        :'is_sync_in_progress' => :'BOOLEAN',
        :'self_url' => :'String',
        :'stage' => :'Integer',
        :'stage_str' => :'String',
        :'stage_updated_at' => :'DateTime',
        :'status' => :'Integer',
        :'status_reason' => :'String',
        :'status_str' => :'String',
        :'status_updated_at' => :'DateTime',
        :'sync_finished_at' => :'DateTime',
        :'sync_progress' => :'Integer'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'is_downloadable')
        self.is_downloadable = attributes[:'is_downloadable']
      end

      if attributes.has_key?(:'is_quarantined')
        self.is_quarantined = attributes[:'is_quarantined']
      end

      if attributes.has_key?(:'is_sync_awaiting')
        self.is_sync_awaiting = attributes[:'is_sync_awaiting']
      end

      if attributes.has_key?(:'is_sync_completed')
        self.is_sync_completed = attributes[:'is_sync_completed']
      end

      if attributes.has_key?(:'is_sync_failed')
        self.is_sync_failed = attributes[:'is_sync_failed']
      end

      if attributes.has_key?(:'is_sync_in_flight')
        self.is_sync_in_flight = attributes[:'is_sync_in_flight']
      end

      if attributes.has_key?(:'is_sync_in_progress')
        self.is_sync_in_progress = attributes[:'is_sync_in_progress']
      end

      if attributes.has_key?(:'self_url')
        self.self_url = attributes[:'self_url']
      end

      if attributes.has_key?(:'stage')
        self.stage = attributes[:'stage']
      end

      if attributes.has_key?(:'stage_str')
        self.stage_str = attributes[:'stage_str']
      end

      if attributes.has_key?(:'stage_updated_at')
        self.stage_updated_at = attributes[:'stage_updated_at']
      end

      if attributes.has_key?(:'status')
        self.status = attributes[:'status']
      end

      if attributes.has_key?(:'status_reason')
        self.status_reason = attributes[:'status_reason']
      end

      if attributes.has_key?(:'status_str')
        self.status_str = attributes[:'status_str']
      end

      if attributes.has_key?(:'status_updated_at')
        self.status_updated_at = attributes[:'status_updated_at']
      end

      if attributes.has_key?(:'sync_finished_at')
        self.sync_finished_at = attributes[:'sync_finished_at']
      end

      if attributes.has_key?(:'sync_progress')
        self.sync_progress = attributes[:'sync_progress']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if !@status_reason.nil? && @status_reason.to_s.length < 1
        invalid_properties.push('invalid value for "status_reason", the character length must be great than or equal to 1.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@status_reason.nil? && @status_reason.to_s.length < 1
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] status_reason Value to be assigned
    def status_reason=(status_reason)
      if !status_reason.nil? && status_reason.to_s.length < 1
        fail ArgumentError, 'invalid value for "status_reason", the character length must be great than or equal to 1.'
      end

      @status_reason = status_reason
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          is_downloadable == o.is_downloadable &&
          is_quarantined == o.is_quarantined &&
          is_sync_awaiting == o.is_sync_awaiting &&
          is_sync_completed == o.is_sync_completed &&
          is_sync_failed == o.is_sync_failed &&
          is_sync_in_flight == o.is_sync_in_flight &&
          is_sync_in_progress == o.is_sync_in_progress &&
          self_url == o.self_url &&
          stage == o.stage &&
          stage_str == o.stage_str &&
          stage_updated_at == o.stage_updated_at &&
          status == o.status &&
          status_reason == o.status_reason &&
          status_str == o.status_str &&
          status_updated_at == o.status_updated_at &&
          sync_finished_at == o.sync_finished_at &&
          sync_progress == o.sync_progress
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [is_downloadable, is_quarantined, is_sync_awaiting, is_sync_completed, is_sync_failed, is_sync_in_flight, is_sync_in_progress, self_url, stage, stage_str, stage_updated_at, status, status_reason, status_str, status_updated_at, sync_finished_at, sync_progress].hash
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