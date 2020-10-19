/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.pinot.common.request;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * AUTO GENERATED: DO NOT EDIT
 * selection-sort : specifies how the search results should be sorted.
 * The results can be sorted based on one or multiple columns
 * 
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-10-31")
public class SelectionSort implements org.apache.thrift.TBase<SelectionSort, SelectionSort._Fields>, java.io.Serializable, Cloneable, Comparable<SelectionSort> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SelectionSort");

  private static final org.apache.thrift.protocol.TField COLUMN_FIELD_DESC = new org.apache.thrift.protocol.TField("column", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField IS_ASC_FIELD_DESC = new org.apache.thrift.protocol.TField("isAsc", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SelectionSortStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SelectionSortTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String column; // optional
  private boolean isAsc; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COLUMN((short)1, "column"),
    IS_ASC((short)2, "isAsc");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // COLUMN
          return COLUMN;
        case 2: // IS_ASC
          return IS_ASC;
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
    @org.apache.thrift.annotation.Nullable
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
  private static final int __ISASC_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.COLUMN,_Fields.IS_ASC};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COLUMN, new org.apache.thrift.meta_data.FieldMetaData("column", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IS_ASC, new org.apache.thrift.meta_data.FieldMetaData("isAsc", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SelectionSort.class, metaDataMap);
  }

  public SelectionSort() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SelectionSort(SelectionSort other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetColumn()) {
      this.column = other.column;
    }
    this.isAsc = other.isAsc;
  }

  public SelectionSort deepCopy() {
    return new SelectionSort(this);
  }

  @Override
  public void clear() {
    this.column = null;
    setIsAscIsSet(false);
    this.isAsc = false;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getColumn() {
    return this.column;
  }

  public void setColumn(@org.apache.thrift.annotation.Nullable java.lang.String column) {
    this.column = column;
  }

  public void unsetColumn() {
    this.column = null;
  }

  /** Returns true if field column is set (has been assigned a value) and false otherwise */
  public boolean isSetColumn() {
    return this.column != null;
  }

  public void setColumnIsSet(boolean value) {
    if (!value) {
      this.column = null;
    }
  }

  public boolean isIsAsc() {
    return this.isAsc;
  }

  public void setIsAsc(boolean isAsc) {
    this.isAsc = isAsc;
    setIsAscIsSet(true);
  }

  public void unsetIsAsc() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISASC_ISSET_ID);
  }

  /** Returns true if field isAsc is set (has been assigned a value) and false otherwise */
  public boolean isSetIsAsc() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISASC_ISSET_ID);
  }

  public void setIsAscIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISASC_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case COLUMN:
      if (value == null) {
        unsetColumn();
      } else {
        setColumn((java.lang.String)value);
      }
      break;

    case IS_ASC:
      if (value == null) {
        unsetIsAsc();
      } else {
        setIsAsc((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case COLUMN:
      return getColumn();

    case IS_ASC:
      return isIsAsc();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case COLUMN:
      return isSetColumn();
    case IS_ASC:
      return isSetIsAsc();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SelectionSort)
      return this.equals((SelectionSort)that);
    return false;
  }

  public boolean equals(SelectionSort that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_column = true && this.isSetColumn();
    boolean that_present_column = true && that.isSetColumn();
    if (this_present_column || that_present_column) {
      if (!(this_present_column && that_present_column))
        return false;
      if (!this.column.equals(that.column))
        return false;
    }

    boolean this_present_isAsc = true && this.isSetIsAsc();
    boolean that_present_isAsc = true && that.isSetIsAsc();
    if (this_present_isAsc || that_present_isAsc) {
      if (!(this_present_isAsc && that_present_isAsc))
        return false;
      if (this.isAsc != that.isAsc)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetColumn()) ? 131071 : 524287);
    if (isSetColumn())
      hashCode = hashCode * 8191 + column.hashCode();

    hashCode = hashCode * 8191 + ((isSetIsAsc()) ? 131071 : 524287);
    if (isSetIsAsc())
      hashCode = hashCode * 8191 + ((isAsc) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(SelectionSort other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetColumn()).compareTo(other.isSetColumn());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumn()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.column, other.column);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIsAsc()).compareTo(other.isSetIsAsc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsAsc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isAsc, other.isAsc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectionSort(");
    boolean first = true;

    if (isSetColumn()) {
      sb.append("column:");
      if (this.column == null) {
        sb.append("null");
      } else {
        sb.append(this.column);
      }
      first = false;
    }
    if (isSetIsAsc()) {
      if (!first) sb.append(", ");
      sb.append("isAsc:");
      sb.append(this.isAsc);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class SelectionSortStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SelectionSortStandardScheme getScheme() {
      return new SelectionSortStandardScheme();
    }
  }

  private static class SelectionSortStandardScheme extends org.apache.thrift.scheme.StandardScheme<SelectionSort> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SelectionSort struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COLUMN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.column = iprot.readString();
              struct.setColumnIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IS_ASC
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isAsc = iprot.readBool();
              struct.setIsAscIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SelectionSort struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.column != null) {
        if (struct.isSetColumn()) {
          oprot.writeFieldBegin(COLUMN_FIELD_DESC);
          oprot.writeString(struct.column);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetIsAsc()) {
        oprot.writeFieldBegin(IS_ASC_FIELD_DESC);
        oprot.writeBool(struct.isAsc);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SelectionSortTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SelectionSortTupleScheme getScheme() {
      return new SelectionSortTupleScheme();
    }
  }

  private static class SelectionSortTupleScheme extends org.apache.thrift.scheme.TupleScheme<SelectionSort> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SelectionSort struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetColumn()) {
        optionals.set(0);
      }
      if (struct.isSetIsAsc()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetColumn()) {
        oprot.writeString(struct.column);
      }
      if (struct.isSetIsAsc()) {
        oprot.writeBool(struct.isAsc);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SelectionSort struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.column = iprot.readString();
        struct.setColumnIsSet(true);
      }
      if (incoming.get(1)) {
        struct.isAsc = iprot.readBool();
        struct.setIsAscIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

