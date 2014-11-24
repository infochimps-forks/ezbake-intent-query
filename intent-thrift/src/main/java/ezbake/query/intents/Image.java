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
package ezbake.query.intents;

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

public class Image implements org.apache.thrift.TBase<Image, Image._Fields>, java.io.Serializable, Cloneable, Comparable<Image> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Image");

  private static final org.apache.thrift.protocol.TField BASE_FIELD_DESC = new org.apache.thrift.protocol.TField("base", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField URI_FIELD_DESC = new org.apache.thrift.protocol.TField("URI", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ImageStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ImageTupleSchemeFactory());
  }

  public ezbake.query.intents.base.BaseContext base; // required
  public String name; // required
  public String URI; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BASE((short)1, "base"),
    NAME((short)2, "name"),
    URI((short)3, "URI");

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
        case 1: // BASE
          return BASE;
        case 2: // NAME
          return NAME;
        case 3: // URI
          return URI;
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
  private _Fields optionals[] = {_Fields.URI};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BASE, new org.apache.thrift.meta_data.FieldMetaData("base", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ezbake.query.intents.base.BaseContext.class)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.URI, new org.apache.thrift.meta_data.FieldMetaData("URI", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Image.class, metaDataMap);
  }

  public Image() {
  }

  public Image(
    ezbake.query.intents.base.BaseContext base,
    String name)
  {
    this();
    this.base = base;
    this.name = name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Image(Image other) {
    if (other.isSetBase()) {
      this.base = new ezbake.query.intents.base.BaseContext(other.base);
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetURI()) {
      this.URI = other.URI;
    }
  }

  public Image deepCopy() {
    return new Image(this);
  }

  @Override
  public void clear() {
    this.base = null;
    this.name = null;
    this.URI = null;
  }

  public ezbake.query.intents.base.BaseContext getBase() {
    return this.base;
  }

  public Image setBase(ezbake.query.intents.base.BaseContext base) {
    this.base = base;
    return this;
  }

  public void unsetBase() {
    this.base = null;
  }

  /** Returns true if field base is set (has been assigned a value) and false otherwise */
  public boolean isSetBase() {
    return this.base != null;
  }

  public void setBaseIsSet(boolean value) {
    if (!value) {
      this.base = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public Image setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getURI() {
    return this.URI;
  }

  public Image setURI(String URI) {
    this.URI = URI;
    return this;
  }

  public void unsetURI() {
    this.URI = null;
  }

  /** Returns true if field URI is set (has been assigned a value) and false otherwise */
  public boolean isSetURI() {
    return this.URI != null;
  }

  public void setURIIsSet(boolean value) {
    if (!value) {
      this.URI = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BASE:
      if (value == null) {
        unsetBase();
      } else {
        setBase((ezbake.query.intents.base.BaseContext)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case URI:
      if (value == null) {
        unsetURI();
      } else {
        setURI((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BASE:
      return getBase();

    case NAME:
      return getName();

    case URI:
      return getURI();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BASE:
      return isSetBase();
    case NAME:
      return isSetName();
    case URI:
      return isSetURI();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Image)
      return this.equals((Image)that);
    return false;
  }

  public boolean equals(Image that) {
    if (that == null)
      return false;

    boolean this_present_base = true && this.isSetBase();
    boolean that_present_base = true && that.isSetBase();
    if (this_present_base || that_present_base) {
      if (!(this_present_base && that_present_base))
        return false;
      if (!this.base.equals(that.base))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_URI = true && this.isSetURI();
    boolean that_present_URI = true && that.isSetURI();
    if (this_present_URI || that_present_URI) {
      if (!(this_present_URI && that_present_URI))
        return false;
      if (!this.URI.equals(that.URI))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Image other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBase()).compareTo(other.isSetBase());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBase()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.base, other.base);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetURI()).compareTo(other.isSetURI());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetURI()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.URI, other.URI);
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
    StringBuilder sb = new StringBuilder("Image(");
    boolean first = true;

    sb.append("base:");
    if (this.base == null) {
      sb.append("null");
    } else {
      sb.append(this.base);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (isSetURI()) {
      if (!first) sb.append(", ");
      sb.append("URI:");
      if (this.URI == null) {
        sb.append("null");
      } else {
        sb.append(this.URI);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (base == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'base' was not present! Struct: " + toString());
    }
    if (name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (base != null) {
      base.validate();
    }
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

  private static class ImageStandardSchemeFactory implements SchemeFactory {
    public ImageStandardScheme getScheme() {
      return new ImageStandardScheme();
    }
  }

  private static class ImageStandardScheme extends StandardScheme<Image> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Image struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BASE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.base = new ezbake.query.intents.base.BaseContext();
              struct.base.read(iprot);
              struct.setBaseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // URI
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.URI = iprot.readString();
              struct.setURIIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Image struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.base != null) {
        oprot.writeFieldBegin(BASE_FIELD_DESC);
        struct.base.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.URI != null) {
        if (struct.isSetURI()) {
          oprot.writeFieldBegin(URI_FIELD_DESC);
          oprot.writeString(struct.URI);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ImageTupleSchemeFactory implements SchemeFactory {
    public ImageTupleScheme getScheme() {
      return new ImageTupleScheme();
    }
  }

  private static class ImageTupleScheme extends TupleScheme<Image> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Image struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.base.write(oprot);
      oprot.writeString(struct.name);
      BitSet optionals = new BitSet();
      if (struct.isSetURI()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetURI()) {
        oprot.writeString(struct.URI);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Image struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.base = new ezbake.query.intents.base.BaseContext();
      struct.base.read(iprot);
      struct.setBaseIsSet(true);
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.URI = iprot.readString();
        struct.setURIIsSet(true);
      }
    }
  }

}
