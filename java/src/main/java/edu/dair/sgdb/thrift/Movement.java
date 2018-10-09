/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.dair.sgdb.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-10-09")
public class Movement implements org.apache.thrift.TBase<Movement, Movement._Fields>, java.io.Serializable, Cloneable, Comparable<Movement> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Movement");

  private static final org.apache.thrift.protocol.TField LOC_FIELD_DESC = new org.apache.thrift.protocol.TField("loc", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField KV_FIELD_DESC = new org.apache.thrift.protocol.TField("kv", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MovementStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MovementTupleSchemeFactory();

  public int loc; // required
  public KeyValue kv; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOC((short)1, "loc"),
    KV((short)2, "kv");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // LOC
          return LOC;
        case 2: // KV
          return KV;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __LOC_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOC, new org.apache.thrift.meta_data.FieldMetaData("loc", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.KV, new org.apache.thrift.meta_data.FieldMetaData("kv", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, KeyValue.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Movement.class, metaDataMap);
  }

  public Movement() {
  }

  public Movement(
    int loc,
    KeyValue kv)
  {
    this();
    this.loc = loc;
    setLocIsSet(true);
    this.kv = kv;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Movement(Movement other) {
    __isset_bitfield = other.__isset_bitfield;
    this.loc = other.loc;
    if (other.isSetKv()) {
      this.kv = new KeyValue(other.kv);
    }
  }

  public Movement deepCopy() {
    return new Movement(this);
  }

  @Override
  public void clear() {
    setLocIsSet(false);
    this.loc = 0;
    this.kv = null;
  }

  public int getLoc() {
    return this.loc;
  }

  public Movement setLoc(int loc) {
    this.loc = loc;
    setLocIsSet(true);
    return this;
  }

  public void unsetLoc() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LOC_ISSET_ID);
  }

  /** Returns true if field loc is set (has been assigned a value) and false otherwise */
  public boolean isSetLoc() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LOC_ISSET_ID);
  }

  public void setLocIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LOC_ISSET_ID, value);
  }

  public KeyValue getKv() {
    return this.kv;
  }

  public Movement setKv(KeyValue kv) {
    this.kv = kv;
    return this;
  }

  public void unsetKv() {
    this.kv = null;
  }

  /** Returns true if field kv is set (has been assigned a value) and false otherwise */
  public boolean isSetKv() {
    return this.kv != null;
  }

  public void setKvIsSet(boolean value) {
    if (!value) {
      this.kv = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case LOC:
      if (value == null) {
        unsetLoc();
      } else {
        setLoc((java.lang.Integer)value);
      }
      break;

    case KV:
      if (value == null) {
        unsetKv();
      } else {
        setKv((KeyValue)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case LOC:
      return getLoc();

    case KV:
      return getKv();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case LOC:
      return isSetLoc();
    case KV:
      return isSetKv();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Movement)
      return this.equals((Movement)that);
    return false;
  }

  public boolean equals(Movement that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_loc = true;
    boolean that_present_loc = true;
    if (this_present_loc || that_present_loc) {
      if (!(this_present_loc && that_present_loc))
        return false;
      if (this.loc != that.loc)
        return false;
    }

    boolean this_present_kv = true && this.isSetKv();
    boolean that_present_kv = true && that.isSetKv();
    if (this_present_kv || that_present_kv) {
      if (!(this_present_kv && that_present_kv))
        return false;
      if (!this.kv.equals(that.kv))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + loc;

    hashCode = hashCode * 8191 + ((isSetKv()) ? 131071 : 524287);
    if (isSetKv())
      hashCode = hashCode * 8191 + kv.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Movement other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetLoc()).compareTo(other.isSetLoc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.loc, other.loc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetKv()).compareTo(other.isSetKv());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKv()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.kv, other.kv);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Movement(");
    boolean first = true;

    sb.append("loc:");
    sb.append(this.loc);
    first = false;
    if (!first) sb.append(", ");
    sb.append("kv:");
    if (this.kv == null) {
      sb.append("null");
    } else {
      sb.append(this.kv);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'loc' because it's a primitive and you chose the non-beans generator.
    if (kv == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'kv' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (kv != null) {
      kv.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MovementStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MovementStandardScheme getScheme() {
      return new MovementStandardScheme();
    }
  }

  private static class MovementStandardScheme extends org.apache.thrift.scheme.StandardScheme<Movement> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Movement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOC
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.loc = iprot.readI32();
              struct.setLocIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // KV
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.kv = new KeyValue();
              struct.kv.read(iprot);
              struct.setKvIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetLoc()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'loc' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Movement struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(LOC_FIELD_DESC);
      oprot.writeI32(struct.loc);
      oprot.writeFieldEnd();
      if (struct.kv != null) {
        oprot.writeFieldBegin(KV_FIELD_DESC);
        struct.kv.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MovementTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MovementTupleScheme getScheme() {
      return new MovementTupleScheme();
    }
  }

  private static class MovementTupleScheme extends org.apache.thrift.scheme.TupleScheme<Movement> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Movement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.loc);
      struct.kv.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Movement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.loc = iprot.readI32();
      struct.setLocIsSet(true);
      struct.kv = new KeyValue();
      struct.kv.read(iprot);
      struct.setKvIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

