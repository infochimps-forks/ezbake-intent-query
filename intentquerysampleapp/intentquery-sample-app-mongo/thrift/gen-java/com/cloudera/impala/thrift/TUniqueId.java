/*   Copyright (C) 2013-2014 Computer Sciences Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. */

/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cloudera.impala.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TUniqueId implements org.apache.thrift.TBase<TUniqueId, TUniqueId._Fields>, java.io.Serializable, Cloneable, Comparable<TUniqueId> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TUniqueId");

  private static final org.apache.thrift.protocol.TField HI_FIELD_DESC = new org.apache.thrift.protocol.TField("hi", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField LO_FIELD_DESC = new org.apache.thrift.protocol.TField("lo", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TUniqueIdStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TUniqueIdTupleSchemeFactory());
  }

  public long hi; // required
  public long lo; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HI((short)1, "hi"),
    LO((short)2, "lo");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // HI
          return HI;
        case 2: // LO
          return LO;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __HI_ISSET_ID = 0;
  private static final int __LO_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HI, new org.apache.thrift.meta_data.FieldMetaData("hi", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LO, new org.apache.thrift.meta_data.FieldMetaData("lo", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TUniqueId.class, metaDataMap);
  }

  public TUniqueId() {
  }

  public TUniqueId(
    long hi,
    long lo)
  {
    this();
    this.hi = hi;
    setHiIsSet(true);
    this.lo = lo;
    setLoIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TUniqueId(TUniqueId other) {
    __isset_bitfield = other.__isset_bitfield;
    this.hi = other.hi;
    this.lo = other.lo;
  }

  public TUniqueId deepCopy() {
    return new TUniqueId(this);
  }

  @Override
  public void clear() {
    setHiIsSet(false);
    this.hi = 0;
    setLoIsSet(false);
    this.lo = 0;
  }

  public long getHi() {
    return this.hi;
  }

  public TUniqueId setHi(long hi) {
    this.hi = hi;
    setHiIsSet(true);
    return this;
  }

  public void unsetHi() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HI_ISSET_ID);
  }

  /** Returns true if field hi is set (has been assigned a value) and false otherwise */
  public boolean isSetHi() {
    return EncodingUtils.testBit(__isset_bitfield, __HI_ISSET_ID);
  }

  public void setHiIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HI_ISSET_ID, value);
  }

  public long getLo() {
    return this.lo;
  }

  public TUniqueId setLo(long lo) {
    this.lo = lo;
    setLoIsSet(true);
    return this;
  }

  public void unsetLo() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LO_ISSET_ID);
  }

  /** Returns true if field lo is set (has been assigned a value) and false otherwise */
  public boolean isSetLo() {
    return EncodingUtils.testBit(__isset_bitfield, __LO_ISSET_ID);
  }

  public void setLoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LO_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HI:
      if (value == null) {
        unsetHi();
      } else {
        setHi((Long)value);
      }
      break;

    case LO:
      if (value == null) {
        unsetLo();
      } else {
        setLo((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HI:
      return Long.valueOf(getHi());

    case LO:
      return Long.valueOf(getLo());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HI:
      return isSetHi();
    case LO:
      return isSetLo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TUniqueId)
      return this.equals((TUniqueId)that);
    return false;
  }

  public boolean equals(TUniqueId that) {
    if (that == null)
      return false;

    boolean this_present_hi = true;
    boolean that_present_hi = true;
    if (this_present_hi || that_present_hi) {
      if (!(this_present_hi && that_present_hi))
        return false;
      if (this.hi != that.hi)
        return false;
    }

    boolean this_present_lo = true;
    boolean that_present_lo = true;
    if (this_present_lo || that_present_lo) {
      if (!(this_present_lo && that_present_lo))
        return false;
      if (this.lo != that.lo)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(TUniqueId other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHi()).compareTo(other.isSetHi());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHi()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hi, other.hi);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLo()).compareTo(other.isSetLo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lo, other.lo);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TUniqueId(");
    boolean first = true;

    sb.append("hi:");
    sb.append(this.hi);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lo:");
    sb.append(this.lo);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'hi' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'lo' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TUniqueIdStandardSchemeFactory implements SchemeFactory {
    public TUniqueIdStandardScheme getScheme() {
      return new TUniqueIdStandardScheme();
    }
  }

  private static class TUniqueIdStandardScheme extends StandardScheme<TUniqueId> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TUniqueId struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HI
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.hi = iprot.readI64();
              struct.setHiIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LO
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lo = iprot.readI64();
              struct.setLoIsSet(true);
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
      if (!struct.isSetHi()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'hi' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetLo()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'lo' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TUniqueId struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(HI_FIELD_DESC);
      oprot.writeI64(struct.hi);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LO_FIELD_DESC);
      oprot.writeI64(struct.lo);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TUniqueIdTupleSchemeFactory implements SchemeFactory {
    public TUniqueIdTupleScheme getScheme() {
      return new TUniqueIdTupleScheme();
    }
  }

  private static class TUniqueIdTupleScheme extends TupleScheme<TUniqueId> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TUniqueId struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.hi);
      oprot.writeI64(struct.lo);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TUniqueId struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.hi = iprot.readI64();
      struct.setHiIsSet(true);
      struct.lo = iprot.readI64();
      struct.setLoIsSet(true);
    }
  }

}

