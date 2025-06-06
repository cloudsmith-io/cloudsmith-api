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
class PackageGroup
  attr_accessor :backend_kind

  attr_accessor :count

  attr_accessor :last_push

  attr_accessor :name

  attr_accessor :num_downloads

  attr_accessor :size

  # Attribute mapping from ruby-style variable name to JSON key.
  def self.attribute_map
    {
      :'backend_kind' => :'backend_kind',
      :'count' => :'count',
      :'last_push' => :'last_push',
      :'name' => :'name',
      :'num_downloads' => :'num_downloads',
      :'size' => :'size'
    }
  end

  # Attribute type mapping.
  def self.swagger_types
    {
      :'backend_kind' => :'Integer',
      :'count' => :'Integer',
      :'last_push' => :'DateTime',
      :'name' => :'String',
      :'num_downloads' => :'Integer',
      :'size' => :'Integer'
    }
  end

  # Initializes the object
  # @param [Hash] attributes Model attributes in the form of hash
  def initialize(attributes = {})
    return unless attributes.is_a?(Hash)

    # convert string to symbol for hash key
    attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

    if attributes.has_key?(:'backend_kind')
      self.backend_kind = attributes[:'backend_kind']
    end

    if attributes.has_key?(:'count')
      self.count = attributes[:'count']
    end

    if attributes.has_key?(:'last_push')
      self.last_push = attributes[:'last_push']
    end

    if attributes.has_key?(:'name')
      self.name = attributes[:'name']
    end

    if attributes.has_key?(:'num_downloads')
      self.num_downloads = attributes[:'num_downloads']
    end

    if attributes.has_key?(:'size')
      self.size = attributes[:'size']
    end
  end

  # Show invalid properties with the reasons. Usually used together with valid?
  # @return Array for valid properties with the reasons
  def list_invalid_properties
    invalid_properties = Array.new
    if @count.nil?
      invalid_properties.push('invalid value for "count", count cannot be nil.')
    end

    if @last_push.nil?
      invalid_properties.push('invalid value for "last_push", last_push cannot be nil.')
    end

    if @num_downloads.nil?
      invalid_properties.push('invalid value for "num_downloads", num_downloads cannot be nil.')
    end

    if @size.nil?
      invalid_properties.push('invalid value for "size", size cannot be nil.')
    end

    invalid_properties
  end

  # Check to see if the all the properties in the model are valid
  # @return true if the model is valid
  def valid?
    return false if @count.nil?
    return false if @last_push.nil?
    return false if @num_downloads.nil?
    return false if @size.nil?
    true
  end

  # Checks equality by comparing each attribute.
  # @param [Object] Object to be compared
  def ==(o)
    return true if self.equal?(o)
    self.class == o.class &&
        backend_kind == o.backend_kind &&
        count == o.count &&
        last_push == o.last_push &&
        name == o.name &&
        num_downloads == o.num_downloads &&
        size == o.size
  end

  # @see the `==` method
  # @param [Object] Object to be compared
  def eql?(o)
    self == o
  end

  # Calculates hash code according to all attributes.
  # @return [Fixnum] Hash code
  def hash
    [backend_kind, count, last_push, name, num_downloads, size].hash
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
