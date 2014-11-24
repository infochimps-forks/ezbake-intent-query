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

public class TOpenParams implements org.apache.thrift.TBase<TOpenParams, TOpenParams._Fields>, java.io.Serializable, Cloneable, Comparable<TOpenParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TOpenParams");

  private static final org.apache.thrift.protocol.TField QUERY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("query_id", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("table_name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField INIT_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("init_string", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField AUTHENTICATED_USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("authenticated_user_name", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField ROW_SCHEMA_FIELD_DESC = new org.apache.thrift.protocol.TField("row_schema", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField BATCH_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("batch_size", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField PREDICATES_FIELD_DESC = new org.apache.thrift.protocol.TField("predicates", org.apache.thrift.protocol.TType.LIST, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TOpenParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TOpenParamsTupleSchemeFactory());
  }

  public com.cloudera.impala.thrift.TUniqueId query_id; // optional
  public String table_name; // optional
  public String init_string; // optional
  public String authenticated_user_name; // optional
  public TTableSchema row_schema; // optional
  public int batch_size; // optional
  public List<List<TBinaryPredicate>> predicates; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    QUERY_ID((short)1, "query_id"),
    TABLE_NAME((short)2, "table_name"),
    INIT_STRING((short)3, "init_string"),
    AUTHENTICATED_USER_NAME((short)4, "authenticated_user_name"),
    ROW_SCHEMA((short)5, "row_schema"),
    BATCH_SIZE((short)6, "batch_size"),
    PREDICATES((short)7, "predicates");

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
        case 1: // QUERY_ID
          return QUERY_ID;
        case 2: // TABLE_NAME
          return TABLE_NAME;
        case 3: // INIT_STRING
          return INIT_STRING;
        case 4: // AUTHENTICATED_USER_NAME
          return AUTHENTICATED_USER_NAME;
        case 5: // ROW_SCHEMA
          return ROW_SCHEMA;
        case 6: // BATCH_SIZE
          return BATCH_SIZE;
        case 7: // PREDICATES
          return PREDICATES;
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
  private static final int __BATCH_SIZE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.QUERY_ID,_Fields.TABLE_NAME,_Fields.INIT_STRING,_Fields.AUTHENTICATED_USER_NAME,_Fields.ROW_SCHEMA,_Fields.BATCH_SIZE,_Fields.PREDICATES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUERY_ID, new org.apache.thrift.meta_data.FieldMetaData("query_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TUniqueId.class)));
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("table_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INIT_STRING, new org.apache.thrift.meta_data.FieldMetaData("init_string", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AUTHENTICATED_USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("authenticated_user_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ROW_SCHEMA, new org.apache.thrift.meta_data.FieldMetaData("row_schema", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTableSchema.class)));
    tmpMap.put(_Fields.BATCH_SIZE, new org.apache.thrift.meta_data.FieldMetaData("batch_size", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PREDICATES, new org.apache.thrift.meta_data.FieldMetaData("predicates", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TBinaryPredicate.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TOpenParams.class, metaDataMap);
  }

  public TOpenParams() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TOpenParams(TOpenParams other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetQuery_id()) {
      this.query_id = new com.cloudera.impala.thrift.TUniqueId(other.query_id);
    }
    if (other.isSetTable_name()) {
      this.table_name = other.table_name;
    }
    if (other.isSetInit_string()) {
      this.init_string = other.init_string;
    }
    if (other.isSetAuthenticated_user_name()) {
      this.authenticated_user_name = other.authenticated_user_name;
    }
    if (other.isSetRow_schema()) {
      this.row_schema = new TTableSchema(other.row_schema);
    }
    this.batch_size = other.batch_size;
    if (other.isSetPredicates()) {
      List<List<TBinaryPredicate>> __this__predicates = new ArrayList<List<TBinaryPredicate>>(other.predicates.size());
      for (List<TBinaryPredicate> other_element : other.predicates) {
        List<TBinaryPredicate> __this__predicates_copy = new ArrayList<TBinaryPredicate>(other_element.size());
        for (TBinaryPredicate other_element_element : other_element) {
          __this__predicates_copy.add(new TBinaryPredicate(other_element_element));
        }
        __this__predicates.add(__this__predicates_copy);
      }
      this.predicates = __this__predicates;
    }
  }

  public TOpenParams deepCopy() {
    return new TOpenParams(this);
  }

  @Override
  public void clear() {
    this.query_id = null;
    this.table_name = null;
    this.init_string = null;
    this.authenticated_user_name = null;
    this.row_schema = null;
    setBatch_sizeIsSet(false);
    this.batch_size = 0;
    this.predicates = null;
  }

  public com.cloudera.impala.thrift.TUniqueId getQuery_id() {
    return this.query_id;
  }

  public TOpenParams setQuery_id(com.cloudera.impala.thrift.TUniqueId query_id) {
    this.query_id = query_id;
    return this;
  }

  public void unsetQuery_id() {
    this.query_id = null;
  }

  /** Returns true if field query_id is set (has been assigned a value) and false otherwise */
  public boolean isSetQuery_id() {
    return this.query_id != null;
  }

  public void setQuery_idIsSet(boolean value) {
    if (!value) {
      this.query_id = null;
    }
  }

  public String getTable_name() {
    return this.table_name;
  }

  public TOpenParams setTable_name(String table_name) {
    this.table_name = table_name;
    return this;
  }

  public void unsetTable_name() {
    this.table_name = null;
  }

  /** Returns true if field table_name is set (has been assigned a value) and false otherwise */
  public boolean isSetTable_name() {
    return this.table_name != null;
  }

  public void setTable_nameIsSet(boolean value) {
    if (!value) {
      this.table_name = null;
    }
  }

  public String getInit_string() {
    return this.init_string;
  }

  public TOpenParams setInit_string(String init_string) {
    this.init_string = init_string;
    return this;
  }

  public void unsetInit_string() {
    this.init_string = null;
  }

  /** Returns true if field init_string is set (has been assigned a value) and false otherwise */
  public boolean isSetInit_string() {
    return this.init_string != null;
  }

  public void setInit_stringIsSet(boolean value) {
    if (!value) {
      this.init_string = null;
    }
  }

  public String getAuthenticated_user_name() {
    return this.authenticated_user_name;
  }

  public TOpenParams setAuthenticated_user_name(String authenticated_user_name) {
    this.authenticated_user_name = authenticated_user_name;
    return this;
  }

  public void unsetAuthenticated_user_name() {
    this.authenticated_user_name = null;
  }

  /** Returns true if field authenticated_user_name is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthenticated_user_name() {
    return this.authenticated_user_name != null;
  }

  public void setAuthenticated_user_nameIsSet(boolean value) {
    if (!value) {
      this.authenticated_user_name = null;
    }
  }

  public TTableSchema getRow_schema() {
    return this.row_schema;
  }

  public TOpenParams setRow_schema(TTableSchema row_schema) {
    this.row_schema = row_schema;
    return this;
  }

  public void unsetRow_schema() {
    this.row_schema = null;
  }

  /** Returns true if field row_schema is set (has been assigned a value) and false otherwise */
  public boolean isSetRow_schema() {
    return this.row_schema != null;
  }

  public void setRow_schemaIsSet(boolean value) {
    if (!value) {
      this.row_schema = null;
    }
  }

  public int getBatch_size() {
    return this.batch_size;
  }

  public TOpenParams setBatch_size(int batch_size) {
    this.batch_size = batch_size;
    setBatch_sizeIsSet(true);
    return this;
  }

  public void unsetBatch_size() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BATCH_SIZE_ISSET_ID);
  }

  /** Returns true if field batch_size is set (has been assigned a value) and false otherwise */
  public boolean isSetBatch_size() {
    return EncodingUtils.testBit(__isset_bitfield, __BATCH_SIZE_ISSET_ID);
  }

  public void setBatch_sizeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BATCH_SIZE_ISSET_ID, value);
  }

  public int getPredicatesSize() {
    return (this.predicates == null) ? 0 : this.predicates.size();
  }

  public java.util.Iterator<List<TBinaryPredicate>> getPredicatesIterator() {
    return (this.predicates == null) ? null : this.predicates.iterator();
  }

  public void addToPredicates(List<TBinaryPredicate> elem) {
    if (this.predicates == null) {
      this.predicates = new ArrayList<List<TBinaryPredicate>>();
    }
    this.predicates.add(elem);
  }

  public List<List<TBinaryPredicate>> getPredicates() {
    return this.predicates;
  }

  public TOpenParams setPredicates(List<List<TBinaryPredicate>> predicates) {
    this.predicates = predicates;
    return this;
  }

  public void unsetPredicates() {
    this.predicates = null;
  }

  /** Returns true if field predicates is set (has been assigned a value) and false otherwise */
  public boolean isSetPredicates() {
    return this.predicates != null;
  }

  public void setPredicatesIsSet(boolean value) {
    if (!value) {
      this.predicates = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUERY_ID:
      if (value == null) {
        unsetQuery_id();
      } else {
        setQuery_id((com.cloudera.impala.thrift.TUniqueId)value);
      }
      break;

    case TABLE_NAME:
      if (value == null) {
        unsetTable_name();
      } else {
        setTable_name((String)value);
      }
      break;

    case INIT_STRING:
      if (value == null) {
        unsetInit_string();
      } else {
        setInit_string((String)value);
      }
      break;

    case AUTHENTICATED_USER_NAME:
      if (value == null) {
        unsetAuthenticated_user_name();
      } else {
        setAuthenticated_user_name((String)value);
      }
      break;

    case ROW_SCHEMA:
      if (value == null) {
        unsetRow_schema();
      } else {
        setRow_schema((TTableSchema)value);
      }
      break;

    case BATCH_SIZE:
      if (value == null) {
        unsetBatch_size();
      } else {
        setBatch_size((Integer)value);
      }
      break;

    case PREDICATES:
      if (value == null) {
        unsetPredicates();
      } else {
        setPredicates((List<List<TBinaryPredicate>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUERY_ID:
      return getQuery_id();

    case TABLE_NAME:
      return getTable_name();

    case INIT_STRING:
      return getInit_string();

    case AUTHENTICATED_USER_NAME:
      return getAuthenticated_user_name();

    case ROW_SCHEMA:
      return getRow_schema();

    case BATCH_SIZE:
      return Integer.valueOf(getBatch_size());

    case PREDICATES:
      return getPredicates();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUERY_ID:
      return isSetQuery_id();
    case TABLE_NAME:
      return isSetTable_name();
    case INIT_STRING:
      return isSetInit_string();
    case AUTHENTICATED_USER_NAME:
      return isSetAuthenticated_user_name();
    case ROW_SCHEMA:
      return isSetRow_schema();
    case BATCH_SIZE:
      return isSetBatch_size();
    case PREDICATES:
      return isSetPredicates();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TOpenParams)
      return this.equals((TOpenParams)that);
    return false;
  }

  public boolean equals(TOpenParams that) {
    if (that == null)
      return false;

    boolean this_present_query_id = true && this.isSetQuery_id();
    boolean that_present_query_id = true && that.isSetQuery_id();
    if (this_present_query_id || that_present_query_id) {
      if (!(this_present_query_id && that_present_query_id))
        return false;
      if (!this.query_id.equals(that.query_id))
        return false;
    }

    boolean this_present_table_name = true && this.isSetTable_name();
    boolean that_present_table_name = true && that.isSetTable_name();
    if (this_present_table_name || that_present_table_name) {
      if (!(this_present_table_name && that_present_table_name))
        return false;
      if (!this.table_name.equals(that.table_name))
        return false;
    }

    boolean this_present_init_string = true && this.isSetInit_string();
    boolean that_present_init_string = true && that.isSetInit_string();
    if (this_present_init_string || that_present_init_string) {
      if (!(this_present_init_string && that_present_init_string))
        return false;
      if (!this.init_string.equals(that.init_string))
        return false;
    }

    boolean this_present_authenticated_user_name = true && this.isSetAuthenticated_user_name();
    boolean that_present_authenticated_user_name = true && that.isSetAuthenticated_user_name();
    if (this_present_authenticated_user_name || that_present_authenticated_user_name) {
      if (!(this_present_authenticated_user_name && that_present_authenticated_user_name))
        return false;
      if (!this.authenticated_user_name.equals(that.authenticated_user_name))
        return false;
    }

    boolean this_present_row_schema = true && this.isSetRow_schema();
    boolean that_present_row_schema = true && that.isSetRow_schema();
    if (this_present_row_schema || that_present_row_schema) {
      if (!(this_present_row_schema && that_present_row_schema))
        return false;
      if (!this.row_schema.equals(that.row_schema))
        return false;
    }

    boolean this_present_batch_size = true && this.isSetBatch_size();
    boolean that_present_batch_size = true && that.isSetBatch_size();
    if (this_present_batch_size || that_present_batch_size) {
      if (!(this_present_batch_size && that_present_batch_size))
        return false;
      if (this.batch_size != that.batch_size)
        return false;
    }

    boolean this_present_predicates = true && this.isSetPredicates();
    boolean that_present_predicates = true && that.isSetPredicates();
    if (this_present_predicates || that_present_predicates) {
      if (!(this_present_predicates && that_present_predicates))
        return false;
      if (!this.predicates.equals(that.predicates))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(TOpenParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQuery_id()).compareTo(other.isSetQuery_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuery_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.query_id, other.query_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTable_name()).compareTo(other.isSetTable_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_name, other.table_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInit_string()).compareTo(other.isSetInit_string());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInit_string()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.init_string, other.init_string);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAuthenticated_user_name()).compareTo(other.isSetAuthenticated_user_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthenticated_user_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.authenticated_user_name, other.authenticated_user_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRow_schema()).compareTo(other.isSetRow_schema());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRow_schema()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.row_schema, other.row_schema);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBatch_size()).compareTo(other.isSetBatch_size());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBatch_size()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.batch_size, other.batch_size);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPredicates()).compareTo(other.isSetPredicates());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPredicates()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.predicates, other.predicates);
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
    StringBuilder sb = new StringBuilder("TOpenParams(");
    boolean first = true;

    if (isSetQuery_id()) {
      sb.append("query_id:");
      if (this.query_id == null) {
        sb.append("null");
      } else {
        sb.append(this.query_id);
      }
      first = false;
    }
    if (isSetTable_name()) {
      if (!first) sb.append(", ");
      sb.append("table_name:");
      if (this.table_name == null) {
        sb.append("null");
      } else {
        sb.append(this.table_name);
      }
      first = false;
    }
    if (isSetInit_string()) {
      if (!first) sb.append(", ");
      sb.append("init_string:");
      if (this.init_string == null) {
        sb.append("null");
      } else {
        sb.append(this.init_string);
      }
      first = false;
    }
    if (isSetAuthenticated_user_name()) {
      if (!first) sb.append(", ");
      sb.append("authenticated_user_name:");
      if (this.authenticated_user_name == null) {
        sb.append("null");
      } else {
        sb.append(this.authenticated_user_name);
      }
      first = false;
    }
    if (isSetRow_schema()) {
      if (!first) sb.append(", ");
      sb.append("row_schema:");
      if (this.row_schema == null) {
        sb.append("null");
      } else {
        sb.append(this.row_schema);
      }
      first = false;
    }
    if (isSetBatch_size()) {
      if (!first) sb.append(", ");
      sb.append("batch_size:");
      sb.append(this.batch_size);
      first = false;
    }
    if (isSetPredicates()) {
      if (!first) sb.append(", ");
      sb.append("predicates:");
      if (this.predicates == null) {
        sb.append("null");
      } else {
        sb.append(this.predicates);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (query_id != null) {
      query_id.validate();
    }
    if (row_schema != null) {
      row_schema.validate();
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

  private static class TOpenParamsStandardSchemeFactory implements SchemeFactory {
    public TOpenParamsStandardScheme getScheme() {
      return new TOpenParamsStandardScheme();
    }
  }

  private static class TOpenParamsStandardScheme extends StandardScheme<TOpenParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TOpenParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUERY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.query_id = new com.cloudera.impala.thrift.TUniqueId();
              struct.query_id.read(iprot);
              struct.setQuery_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table_name = iprot.readString();
              struct.setTable_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INIT_STRING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.init_string = iprot.readString();
              struct.setInit_stringIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // AUTHENTICATED_USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.authenticated_user_name = iprot.readString();
              struct.setAuthenticated_user_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ROW_SCHEMA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.row_schema = new TTableSchema();
              struct.row_schema.read(iprot);
              struct.setRow_schemaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // BATCH_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.batch_size = iprot.readI32();
              struct.setBatch_sizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // PREDICATES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list56 = iprot.readListBegin();
                struct.predicates = new ArrayList<List<TBinaryPredicate>>(_list56.size);
                for (int _i57 = 0; _i57 < _list56.size; ++_i57)
                {
                  List<TBinaryPredicate> _elem58;
                  {
                    org.apache.thrift.protocol.TList _list59 = iprot.readListBegin();
                    _elem58 = new ArrayList<TBinaryPredicate>(_list59.size);
                    for (int _i60 = 0; _i60 < _list59.size; ++_i60)
                    {
                      TBinaryPredicate _elem61;
                      _elem61 = new TBinaryPredicate();
                      _elem61.read(iprot);
                      _elem58.add(_elem61);
                    }
                    iprot.readListEnd();
                  }
                  struct.predicates.add(_elem58);
                }
                iprot.readListEnd();
              }
              struct.setPredicatesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TOpenParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.query_id != null) {
        if (struct.isSetQuery_id()) {
          oprot.writeFieldBegin(QUERY_ID_FIELD_DESC);
          struct.query_id.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.table_name != null) {
        if (struct.isSetTable_name()) {
          oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.table_name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.init_string != null) {
        if (struct.isSetInit_string()) {
          oprot.writeFieldBegin(INIT_STRING_FIELD_DESC);
          oprot.writeString(struct.init_string);
          oprot.writeFieldEnd();
        }
      }
      if (struct.authenticated_user_name != null) {
        if (struct.isSetAuthenticated_user_name()) {
          oprot.writeFieldBegin(AUTHENTICATED_USER_NAME_FIELD_DESC);
          oprot.writeString(struct.authenticated_user_name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.row_schema != null) {
        if (struct.isSetRow_schema()) {
          oprot.writeFieldBegin(ROW_SCHEMA_FIELD_DESC);
          struct.row_schema.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetBatch_size()) {
        oprot.writeFieldBegin(BATCH_SIZE_FIELD_DESC);
        oprot.writeI32(struct.batch_size);
        oprot.writeFieldEnd();
      }
      if (struct.predicates != null) {
        if (struct.isSetPredicates()) {
          oprot.writeFieldBegin(PREDICATES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.predicates.size()));
            for (List<TBinaryPredicate> _iter62 : struct.predicates)
            {
              {
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter62.size()));
                for (TBinaryPredicate _iter63 : _iter62)
                {
                  _iter63.write(oprot);
                }
                oprot.writeListEnd();
              }
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TOpenParamsTupleSchemeFactory implements SchemeFactory {
    public TOpenParamsTupleScheme getScheme() {
      return new TOpenParamsTupleScheme();
    }
  }

  private static class TOpenParamsTupleScheme extends TupleScheme<TOpenParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TOpenParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetQuery_id()) {
        optionals.set(0);
      }
      if (struct.isSetTable_name()) {
        optionals.set(1);
      }
      if (struct.isSetInit_string()) {
        optionals.set(2);
      }
      if (struct.isSetAuthenticated_user_name()) {
        optionals.set(3);
      }
      if (struct.isSetRow_schema()) {
        optionals.set(4);
      }
      if (struct.isSetBatch_size()) {
        optionals.set(5);
      }
      if (struct.isSetPredicates()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetQuery_id()) {
        struct.query_id.write(oprot);
      }
      if (struct.isSetTable_name()) {
        oprot.writeString(struct.table_name);
      }
      if (struct.isSetInit_string()) {
        oprot.writeString(struct.init_string);
      }
      if (struct.isSetAuthenticated_user_name()) {
        oprot.writeString(struct.authenticated_user_name);
      }
      if (struct.isSetRow_schema()) {
        struct.row_schema.write(oprot);
      }
      if (struct.isSetBatch_size()) {
        oprot.writeI32(struct.batch_size);
      }
      if (struct.isSetPredicates()) {
        {
          oprot.writeI32(struct.predicates.size());
          for (List<TBinaryPredicate> _iter64 : struct.predicates)
          {
            {
              oprot.writeI32(_iter64.size());
              for (TBinaryPredicate _iter65 : _iter64)
              {
                _iter65.write(oprot);
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TOpenParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.query_id = new com.cloudera.impala.thrift.TUniqueId();
        struct.query_id.read(iprot);
        struct.setQuery_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.table_name = iprot.readString();
        struct.setTable_nameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.init_string = iprot.readString();
        struct.setInit_stringIsSet(true);
      }
      if (incoming.get(3)) {
        struct.authenticated_user_name = iprot.readString();
        struct.setAuthenticated_user_nameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.row_schema = new TTableSchema();
        struct.row_schema.read(iprot);
        struct.setRow_schemaIsSet(true);
      }
      if (incoming.get(5)) {
        struct.batch_size = iprot.readI32();
        struct.setBatch_sizeIsSet(true);
      }
      if (incoming.get(6)) {
        {
          org.apache.thrift.protocol.TList _list66 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.predicates = new ArrayList<List<TBinaryPredicate>>(_list66.size);
          for (int _i67 = 0; _i67 < _list66.size; ++_i67)
          {
            List<TBinaryPredicate> _elem68;
            {
              org.apache.thrift.protocol.TList _list69 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
              _elem68 = new ArrayList<TBinaryPredicate>(_list69.size);
              for (int _i70 = 0; _i70 < _list69.size; ++_i70)
              {
                TBinaryPredicate _elem71;
                _elem71 = new TBinaryPredicate();
                _elem71.read(iprot);
                _elem68.add(_elem71);
              }
            }
            struct.predicates.add(_elem68);
          }
        }
        struct.setPredicatesIsSet(true);
      }
    }
  }

}

