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

public class Unit implements org.apache.thrift.TBase<Unit, Unit._Fields>, java.io.Serializable, Cloneable, Comparable<Unit> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Unit");

  private static final org.apache.thrift.protocol.TField BASE_FIELD_DESC = new org.apache.thrift.protocol.TField("base", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COUNTRY_FIELD_DESC = new org.apache.thrift.protocol.TField("country", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField ECHELON_FIELD_DESC = new org.apache.thrift.protocol.TField("echelon", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField UNIT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("unitId", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField TKB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tkbId", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField IS_TRANSIENT_FIELD_DESC = new org.apache.thrift.protocol.TField("isTransient", org.apache.thrift.protocol.TType.BOOL, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UnitStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UnitTupleSchemeFactory());
  }

  public ezbake.query.intents.base.StandardObject base; // required
  public String name; // optional
  public String country; // optional
  public String type; // optional
  public String echelon; // optional
  public String unitId; // optional
  public String tkbId; // optional
  public boolean isTransient; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BASE((short)1, "base"),
    NAME((short)2, "name"),
    COUNTRY((short)3, "country"),
    TYPE((short)4, "type"),
    ECHELON((short)5, "echelon"),
    UNIT_ID((short)6, "unitId"),
    TKB_ID((short)7, "tkbId"),
    IS_TRANSIENT((short)8, "isTransient");

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
        case 3: // COUNTRY
          return COUNTRY;
        case 4: // TYPE
          return TYPE;
        case 5: // ECHELON
          return ECHELON;
        case 6: // UNIT_ID
          return UNIT_ID;
        case 7: // TKB_ID
          return TKB_ID;
        case 8: // IS_TRANSIENT
          return IS_TRANSIENT;
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
  private static final int __ISTRANSIENT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.NAME,_Fields.COUNTRY,_Fields.TYPE,_Fields.ECHELON,_Fields.UNIT_ID,_Fields.TKB_ID,_Fields.IS_TRANSIENT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BASE, new org.apache.thrift.meta_data.FieldMetaData("base", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ezbake.query.intents.base.StandardObject.class)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COUNTRY, new org.apache.thrift.meta_data.FieldMetaData("country", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ECHELON, new org.apache.thrift.meta_data.FieldMetaData("echelon", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UNIT_ID, new org.apache.thrift.meta_data.FieldMetaData("unitId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TKB_ID, new org.apache.thrift.meta_data.FieldMetaData("tkbId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IS_TRANSIENT, new org.apache.thrift.meta_data.FieldMetaData("isTransient", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Unit.class, metaDataMap);
  }

  public Unit() {
  }

  public Unit(
    ezbake.query.intents.base.StandardObject base)
  {
    this();
    this.base = base;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Unit(Unit other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetBase()) {
      this.base = new ezbake.query.intents.base.StandardObject(other.base);
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetCountry()) {
      this.country = other.country;
    }
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetEchelon()) {
      this.echelon = other.echelon;
    }
    if (other.isSetUnitId()) {
      this.unitId = other.unitId;
    }
    if (other.isSetTkbId()) {
      this.tkbId = other.tkbId;
    }
    this.isTransient = other.isTransient;
  }

  public Unit deepCopy() {
    return new Unit(this);
  }

  @Override
  public void clear() {
    this.base = null;
    this.name = null;
    this.country = null;
    this.type = null;
    this.echelon = null;
    this.unitId = null;
    this.tkbId = null;
    setIsTransientIsSet(false);
    this.isTransient = false;
  }

  public ezbake.query.intents.base.StandardObject getBase() {
    return this.base;
  }

  public Unit setBase(ezbake.query.intents.base.StandardObject base) {
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

  public Unit setName(String name) {
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

  public String getCountry() {
    return this.country;
  }

  public Unit setCountry(String country) {
    this.country = country;
    return this;
  }

  public void unsetCountry() {
    this.country = null;
  }

  /** Returns true if field country is set (has been assigned a value) and false otherwise */
  public boolean isSetCountry() {
    return this.country != null;
  }

  public void setCountryIsSet(boolean value) {
    if (!value) {
      this.country = null;
    }
  }

  public String getType() {
    return this.type;
  }

  public Unit setType(String type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public String getEchelon() {
    return this.echelon;
  }

  public Unit setEchelon(String echelon) {
    this.echelon = echelon;
    return this;
  }

  public void unsetEchelon() {
    this.echelon = null;
  }

  /** Returns true if field echelon is set (has been assigned a value) and false otherwise */
  public boolean isSetEchelon() {
    return this.echelon != null;
  }

  public void setEchelonIsSet(boolean value) {
    if (!value) {
      this.echelon = null;
    }
  }

  public String getUnitId() {
    return this.unitId;
  }

  public Unit setUnitId(String unitId) {
    this.unitId = unitId;
    return this;
  }

  public void unsetUnitId() {
    this.unitId = null;
  }

  /** Returns true if field unitId is set (has been assigned a value) and false otherwise */
  public boolean isSetUnitId() {
    return this.unitId != null;
  }

  public void setUnitIdIsSet(boolean value) {
    if (!value) {
      this.unitId = null;
    }
  }

  public String getTkbId() {
    return this.tkbId;
  }

  public Unit setTkbId(String tkbId) {
    this.tkbId = tkbId;
    return this;
  }

  public void unsetTkbId() {
    this.tkbId = null;
  }

  /** Returns true if field tkbId is set (has been assigned a value) and false otherwise */
  public boolean isSetTkbId() {
    return this.tkbId != null;
  }

  public void setTkbIdIsSet(boolean value) {
    if (!value) {
      this.tkbId = null;
    }
  }

  public boolean isIsTransient() {
    return this.isTransient;
  }

  public Unit setIsTransient(boolean isTransient) {
    this.isTransient = isTransient;
    setIsTransientIsSet(true);
    return this;
  }

  public void unsetIsTransient() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISTRANSIENT_ISSET_ID);
  }

  /** Returns true if field isTransient is set (has been assigned a value) and false otherwise */
  public boolean isSetIsTransient() {
    return EncodingUtils.testBit(__isset_bitfield, __ISTRANSIENT_ISSET_ID);
  }

  public void setIsTransientIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISTRANSIENT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BASE:
      if (value == null) {
        unsetBase();
      } else {
        setBase((ezbake.query.intents.base.StandardObject)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case COUNTRY:
      if (value == null) {
        unsetCountry();
      } else {
        setCountry((String)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((String)value);
      }
      break;

    case ECHELON:
      if (value == null) {
        unsetEchelon();
      } else {
        setEchelon((String)value);
      }
      break;

    case UNIT_ID:
      if (value == null) {
        unsetUnitId();
      } else {
        setUnitId((String)value);
      }
      break;

    case TKB_ID:
      if (value == null) {
        unsetTkbId();
      } else {
        setTkbId((String)value);
      }
      break;

    case IS_TRANSIENT:
      if (value == null) {
        unsetIsTransient();
      } else {
        setIsTransient((Boolean)value);
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

    case COUNTRY:
      return getCountry();

    case TYPE:
      return getType();

    case ECHELON:
      return getEchelon();

    case UNIT_ID:
      return getUnitId();

    case TKB_ID:
      return getTkbId();

    case IS_TRANSIENT:
      return Boolean.valueOf(isIsTransient());

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
    case COUNTRY:
      return isSetCountry();
    case TYPE:
      return isSetType();
    case ECHELON:
      return isSetEchelon();
    case UNIT_ID:
      return isSetUnitId();
    case TKB_ID:
      return isSetTkbId();
    case IS_TRANSIENT:
      return isSetIsTransient();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Unit)
      return this.equals((Unit)that);
    return false;
  }

  public boolean equals(Unit that) {
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

    boolean this_present_country = true && this.isSetCountry();
    boolean that_present_country = true && that.isSetCountry();
    if (this_present_country || that_present_country) {
      if (!(this_present_country && that_present_country))
        return false;
      if (!this.country.equals(that.country))
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_echelon = true && this.isSetEchelon();
    boolean that_present_echelon = true && that.isSetEchelon();
    if (this_present_echelon || that_present_echelon) {
      if (!(this_present_echelon && that_present_echelon))
        return false;
      if (!this.echelon.equals(that.echelon))
        return false;
    }

    boolean this_present_unitId = true && this.isSetUnitId();
    boolean that_present_unitId = true && that.isSetUnitId();
    if (this_present_unitId || that_present_unitId) {
      if (!(this_present_unitId && that_present_unitId))
        return false;
      if (!this.unitId.equals(that.unitId))
        return false;
    }

    boolean this_present_tkbId = true && this.isSetTkbId();
    boolean that_present_tkbId = true && that.isSetTkbId();
    if (this_present_tkbId || that_present_tkbId) {
      if (!(this_present_tkbId && that_present_tkbId))
        return false;
      if (!this.tkbId.equals(that.tkbId))
        return false;
    }

    boolean this_present_isTransient = true && this.isSetIsTransient();
    boolean that_present_isTransient = true && that.isSetIsTransient();
    if (this_present_isTransient || that_present_isTransient) {
      if (!(this_present_isTransient && that_present_isTransient))
        return false;
      if (this.isTransient != that.isTransient)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Unit other) {
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
    lastComparison = Boolean.valueOf(isSetCountry()).compareTo(other.isSetCountry());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCountry()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.country, other.country);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEchelon()).compareTo(other.isSetEchelon());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEchelon()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.echelon, other.echelon);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnitId()).compareTo(other.isSetUnitId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnitId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unitId, other.unitId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTkbId()).compareTo(other.isSetTkbId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTkbId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tkbId, other.tkbId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsTransient()).compareTo(other.isSetIsTransient());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsTransient()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isTransient, other.isTransient);
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
    StringBuilder sb = new StringBuilder("Unit(");
    boolean first = true;

    sb.append("base:");
    if (this.base == null) {
      sb.append("null");
    } else {
      sb.append(this.base);
    }
    first = false;
    if (isSetName()) {
      if (!first) sb.append(", ");
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetCountry()) {
      if (!first) sb.append(", ");
      sb.append("country:");
      if (this.country == null) {
        sb.append("null");
      } else {
        sb.append(this.country);
      }
      first = false;
    }
    if (isSetType()) {
      if (!first) sb.append(", ");
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (isSetEchelon()) {
      if (!first) sb.append(", ");
      sb.append("echelon:");
      if (this.echelon == null) {
        sb.append("null");
      } else {
        sb.append(this.echelon);
      }
      first = false;
    }
    if (isSetUnitId()) {
      if (!first) sb.append(", ");
      sb.append("unitId:");
      if (this.unitId == null) {
        sb.append("null");
      } else {
        sb.append(this.unitId);
      }
      first = false;
    }
    if (isSetTkbId()) {
      if (!first) sb.append(", ");
      sb.append("tkbId:");
      if (this.tkbId == null) {
        sb.append("null");
      } else {
        sb.append(this.tkbId);
      }
      first = false;
    }
    if (isSetIsTransient()) {
      if (!first) sb.append(", ");
      sb.append("isTransient:");
      sb.append(this.isTransient);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UnitStandardSchemeFactory implements SchemeFactory {
    public UnitStandardScheme getScheme() {
      return new UnitStandardScheme();
    }
  }

  private static class UnitStandardScheme extends StandardScheme<Unit> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Unit struct) throws org.apache.thrift.TException {
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
              struct.base = new ezbake.query.intents.base.StandardObject();
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
          case 3: // COUNTRY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.country = iprot.readString();
              struct.setCountryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.type = iprot.readString();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ECHELON
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.echelon = iprot.readString();
              struct.setEchelonIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // UNIT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.unitId = iprot.readString();
              struct.setUnitIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // TKB_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tkbId = iprot.readString();
              struct.setTkbIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // IS_TRANSIENT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isTransient = iprot.readBool();
              struct.setIsTransientIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Unit struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.base != null) {
        oprot.writeFieldBegin(BASE_FIELD_DESC);
        struct.base.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.country != null) {
        if (struct.isSetCountry()) {
          oprot.writeFieldBegin(COUNTRY_FIELD_DESC);
          oprot.writeString(struct.country);
          oprot.writeFieldEnd();
        }
      }
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeString(struct.type);
          oprot.writeFieldEnd();
        }
      }
      if (struct.echelon != null) {
        if (struct.isSetEchelon()) {
          oprot.writeFieldBegin(ECHELON_FIELD_DESC);
          oprot.writeString(struct.echelon);
          oprot.writeFieldEnd();
        }
      }
      if (struct.unitId != null) {
        if (struct.isSetUnitId()) {
          oprot.writeFieldBegin(UNIT_ID_FIELD_DESC);
          oprot.writeString(struct.unitId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.tkbId != null) {
        if (struct.isSetTkbId()) {
          oprot.writeFieldBegin(TKB_ID_FIELD_DESC);
          oprot.writeString(struct.tkbId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetIsTransient()) {
        oprot.writeFieldBegin(IS_TRANSIENT_FIELD_DESC);
        oprot.writeBool(struct.isTransient);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UnitTupleSchemeFactory implements SchemeFactory {
    public UnitTupleScheme getScheme() {
      return new UnitTupleScheme();
    }
  }

  private static class UnitTupleScheme extends TupleScheme<Unit> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Unit struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.base.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetCountry()) {
        optionals.set(1);
      }
      if (struct.isSetType()) {
        optionals.set(2);
      }
      if (struct.isSetEchelon()) {
        optionals.set(3);
      }
      if (struct.isSetUnitId()) {
        optionals.set(4);
      }
      if (struct.isSetTkbId()) {
        optionals.set(5);
      }
      if (struct.isSetIsTransient()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetCountry()) {
        oprot.writeString(struct.country);
      }
      if (struct.isSetType()) {
        oprot.writeString(struct.type);
      }
      if (struct.isSetEchelon()) {
        oprot.writeString(struct.echelon);
      }
      if (struct.isSetUnitId()) {
        oprot.writeString(struct.unitId);
      }
      if (struct.isSetTkbId()) {
        oprot.writeString(struct.tkbId);
      }
      if (struct.isSetIsTransient()) {
        oprot.writeBool(struct.isTransient);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Unit struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.base = new ezbake.query.intents.base.StandardObject();
      struct.base.read(iprot);
      struct.setBaseIsSet(true);
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.country = iprot.readString();
        struct.setCountryIsSet(true);
      }
      if (incoming.get(2)) {
        struct.type = iprot.readString();
        struct.setTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.echelon = iprot.readString();
        struct.setEchelonIsSet(true);
      }
      if (incoming.get(4)) {
        struct.unitId = iprot.readString();
        struct.setUnitIdIsSet(true);
      }
      if (incoming.get(5)) {
        struct.tkbId = iprot.readString();
        struct.setTkbIdIsSet(true);
      }
      if (incoming.get(6)) {
        struct.isTransient = iprot.readBool();
        struct.setIsTransientIsSet(true);
      }
    }
  }

}

