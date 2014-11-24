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
package com.cloudera.impala.extdatasource.thrift;

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

public class TGetNextParams implements org.apache.thrift.TBase<TGetNextParams, TGetNextParams._Fields>, java.io.Serializable, Cloneable, Comparable<TGetNextParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetNextParams");

  private static final org.apache.thrift.protocol.TField SCAN_HANDLE_FIELD_DESC = new org.apache.thrift.protocol.TField("scan_handle", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TGetNextParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TGetNextParamsTupleSchemeFactory());
  }

  public String scan_handle; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SCAN_HANDLE((short)1, "scan_handle");

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
        case 1: // SCAN_HANDLE
          return SCAN_HANDLE;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SCAN_HANDLE, new org.apache.thrift.meta_data.FieldMetaData("scan_handle", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetNextParams.class, metaDataMap);
  }

  public TGetNextParams() {
  }

  public TGetNextParams(
    String scan_handle)
  {
    this();
    this.scan_handle = scan_handle;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetNextParams(TGetNextParams other) {
    if (other.isSetScan_handle()) {
      this.scan_handle = other.scan_handle;
    }
  }

  public TGetNextParams deepCopy() {
    return new TGetNextParams(this);
  }

  @Override
  public void clear() {
    this.scan_handle = null;
  }

  public String getScan_handle() {
    return this.scan_handle;
  }

  public TGetNextParams setScan_handle(String scan_handle) {
    this.scan_handle = scan_handle;
    return this;
  }

  public void unsetScan_handle() {
    this.scan_handle = null;
  }

  /** Returns true if field scan_handle is set (has been assigned a value) and false otherwise */
  public boolean isSetScan_handle() {
    return this.scan_handle != null;
  }

  public void setScan_handleIsSet(boolean value) {
    if (!value) {
      this.scan_handle = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SCAN_HANDLE:
      if (value == null) {
        unsetScan_handle();
      } else {
        setScan_handle((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SCAN_HANDLE:
      return getScan_handle();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SCAN_HANDLE:
      return isSetScan_handle();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TGetNextParams)
      return this.equals((TGetNextParams)that);
    return false;
  }

  public boolean equals(TGetNextParams that) {
    if (that == null)
      return false;

    boolean this_present_scan_handle = true && this.isSetScan_handle();
    boolean that_present_scan_handle = true && that.isSetScan_handle();
    if (this_present_scan_handle || that_present_scan_handle) {
      if (!(this_present_scan_handle && that_present_scan_handle))
        return false;
      if (!this.scan_handle.equals(that.scan_handle))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(TGetNextParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetScan_handle()).compareTo(other.isSetScan_handle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScan_handle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scan_handle, other.scan_handle);
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
    StringBuilder sb = new StringBuilder("TGetNextParams(");
    boolean first = true;

    sb.append("scan_handle:");
    if (this.scan_handle == null) {
      sb.append("null");
    } else {
      sb.append(this.scan_handle);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (scan_handle == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'scan_handle' was not present! Struct: " + toString());
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TGetNextParamsStandardSchemeFactory implements SchemeFactory {
    public TGetNextParamsStandardScheme getScheme() {
      return new TGetNextParamsStandardScheme();
    }
  }

  private static class TGetNextParamsStandardScheme extends StandardScheme<TGetNextParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetNextParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SCAN_HANDLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.scan_handle = iprot.readString();
              struct.setScan_handleIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetNextParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.scan_handle != null) {
        oprot.writeFieldBegin(SCAN_HANDLE_FIELD_DESC);
        oprot.writeString(struct.scan_handle);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetNextParamsTupleSchemeFactory implements SchemeFactory {
    public TGetNextParamsTupleScheme getScheme() {
      return new TGetNextParamsTupleScheme();
    }
  }

  private static class TGetNextParamsTupleScheme extends TupleScheme<TGetNextParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetNextParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.scan_handle);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetNextParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.scan_handle = iprot.readString();
      struct.setScan_handleIsSet(true);
    }
  }

}

