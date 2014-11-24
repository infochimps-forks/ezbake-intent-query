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
package ezbake.query.basequeryableprocedure;

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

public class ColumnDataValues extends org.apache.thrift.TUnion<ColumnDataValues, ColumnDataValues._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ColumnDataValues");
  private static final org.apache.thrift.protocol.TField BOOL_VALS_FIELD_DESC = new org.apache.thrift.protocol.TField("bool_vals", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField BYTE_VALS_FIELD_DESC = new org.apache.thrift.protocol.TField("byte_vals", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField SHORT_VALS_FIELD_DESC = new org.apache.thrift.protocol.TField("short_vals", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField INT_VALS_FIELD_DESC = new org.apache.thrift.protocol.TField("int_vals", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField LONG_VALS_FIELD_DESC = new org.apache.thrift.protocol.TField("long_vals", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField DOUBLE_VALS_FIELD_DESC = new org.apache.thrift.protocol.TField("double_vals", org.apache.thrift.protocol.TType.LIST, (short)6);
  private static final org.apache.thrift.protocol.TField STRING_VALS_FIELD_DESC = new org.apache.thrift.protocol.TField("string_vals", org.apache.thrift.protocol.TType.LIST, (short)7);
  private static final org.apache.thrift.protocol.TField BINARY_VALS_FIELD_DESC = new org.apache.thrift.protocol.TField("binary_vals", org.apache.thrift.protocol.TType.LIST, (short)8);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BOOL_VALS((short)1, "bool_vals"),
    BYTE_VALS((short)2, "byte_vals"),
    SHORT_VALS((short)3, "short_vals"),
    INT_VALS((short)4, "int_vals"),
    LONG_VALS((short)5, "long_vals"),
    DOUBLE_VALS((short)6, "double_vals"),
    STRING_VALS((short)7, "string_vals"),
    BINARY_VALS((short)8, "binary_vals");

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
        case 1: // BOOL_VALS
          return BOOL_VALS;
        case 2: // BYTE_VALS
          return BYTE_VALS;
        case 3: // SHORT_VALS
          return SHORT_VALS;
        case 4: // INT_VALS
          return INT_VALS;
        case 5: // LONG_VALS
          return LONG_VALS;
        case 6: // DOUBLE_VALS
          return DOUBLE_VALS;
        case 7: // STRING_VALS
          return STRING_VALS;
        case 8: // BINARY_VALS
          return BINARY_VALS;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BOOL_VALS, new org.apache.thrift.meta_data.FieldMetaData("bool_vals", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL))));
    tmpMap.put(_Fields.BYTE_VALS, new org.apache.thrift.meta_data.FieldMetaData("byte_vals", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE))));
    tmpMap.put(_Fields.SHORT_VALS, new org.apache.thrift.meta_data.FieldMetaData("short_vals", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16))));
    tmpMap.put(_Fields.INT_VALS, new org.apache.thrift.meta_data.FieldMetaData("int_vals", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.LONG_VALS, new org.apache.thrift.meta_data.FieldMetaData("long_vals", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.DOUBLE_VALS, new org.apache.thrift.meta_data.FieldMetaData("double_vals", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.STRING_VALS, new org.apache.thrift.meta_data.FieldMetaData("string_vals", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.BINARY_VALS, new org.apache.thrift.meta_data.FieldMetaData("binary_vals", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , true))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ColumnDataValues.class, metaDataMap);
  }

  public ColumnDataValues() {
    super();
  }

  public ColumnDataValues(_Fields setField, Object value) {
    super(setField, value);
  }

  public ColumnDataValues(ColumnDataValues other) {
    super(other);
  }
  public ColumnDataValues deepCopy() {
    return new ColumnDataValues(this);
  }

  public static ColumnDataValues bool_vals(List<Boolean> value) {
    ColumnDataValues x = new ColumnDataValues();
    x.setBool_vals(value);
    return x;
  }

  public static ColumnDataValues byte_vals(List<Byte> value) {
    ColumnDataValues x = new ColumnDataValues();
    x.setByte_vals(value);
    return x;
  }

  public static ColumnDataValues short_vals(List<Short> value) {
    ColumnDataValues x = new ColumnDataValues();
    x.setShort_vals(value);
    return x;
  }

  public static ColumnDataValues int_vals(List<Integer> value) {
    ColumnDataValues x = new ColumnDataValues();
    x.setInt_vals(value);
    return x;
  }

  public static ColumnDataValues long_vals(List<Long> value) {
    ColumnDataValues x = new ColumnDataValues();
    x.setLong_vals(value);
    return x;
  }

  public static ColumnDataValues double_vals(List<Double> value) {
    ColumnDataValues x = new ColumnDataValues();
    x.setDouble_vals(value);
    return x;
  }

  public static ColumnDataValues string_vals(List<String> value) {
    ColumnDataValues x = new ColumnDataValues();
    x.setString_vals(value);
    return x;
  }

  public static ColumnDataValues binary_vals(List<ByteBuffer> value) {
    ColumnDataValues x = new ColumnDataValues();
    x.setBinary_vals(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case BOOL_VALS:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<Boolean> for field 'bool_vals', but got " + value.getClass().getSimpleName());
      case BYTE_VALS:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<Byte> for field 'byte_vals', but got " + value.getClass().getSimpleName());
      case SHORT_VALS:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<Short> for field 'short_vals', but got " + value.getClass().getSimpleName());
      case INT_VALS:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<Integer> for field 'int_vals', but got " + value.getClass().getSimpleName());
      case LONG_VALS:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<Long> for field 'long_vals', but got " + value.getClass().getSimpleName());
      case DOUBLE_VALS:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<Double> for field 'double_vals', but got " + value.getClass().getSimpleName());
      case STRING_VALS:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<String> for field 'string_vals', but got " + value.getClass().getSimpleName());
      case BINARY_VALS:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<ByteBuffer> for field 'binary_vals', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case BOOL_VALS:
          if (field.type == BOOL_VALS_FIELD_DESC.type) {
            List<Boolean> bool_vals;
            {
              org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
              bool_vals = new ArrayList<Boolean>(_list8.size);
              for (int _i9 = 0; _i9 < _list8.size; ++_i9)
              {
                boolean _elem10;
                _elem10 = iprot.readBool();
                bool_vals.add(_elem10);
              }
              iprot.readListEnd();
            }
            return bool_vals;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case BYTE_VALS:
          if (field.type == BYTE_VALS_FIELD_DESC.type) {
            List<Byte> byte_vals;
            {
              org.apache.thrift.protocol.TList _list11 = iprot.readListBegin();
              byte_vals = new ArrayList<Byte>(_list11.size);
              for (int _i12 = 0; _i12 < _list11.size; ++_i12)
              {
                byte _elem13;
                _elem13 = iprot.readByte();
                byte_vals.add(_elem13);
              }
              iprot.readListEnd();
            }
            return byte_vals;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case SHORT_VALS:
          if (field.type == SHORT_VALS_FIELD_DESC.type) {
            List<Short> short_vals;
            {
              org.apache.thrift.protocol.TList _list14 = iprot.readListBegin();
              short_vals = new ArrayList<Short>(_list14.size);
              for (int _i15 = 0; _i15 < _list14.size; ++_i15)
              {
                short _elem16;
                _elem16 = iprot.readI16();
                short_vals.add(_elem16);
              }
              iprot.readListEnd();
            }
            return short_vals;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case INT_VALS:
          if (field.type == INT_VALS_FIELD_DESC.type) {
            List<Integer> int_vals;
            {
              org.apache.thrift.protocol.TList _list17 = iprot.readListBegin();
              int_vals = new ArrayList<Integer>(_list17.size);
              for (int _i18 = 0; _i18 < _list17.size; ++_i18)
              {
                int _elem19;
                _elem19 = iprot.readI32();
                int_vals.add(_elem19);
              }
              iprot.readListEnd();
            }
            return int_vals;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case LONG_VALS:
          if (field.type == LONG_VALS_FIELD_DESC.type) {
            List<Long> long_vals;
            {
              org.apache.thrift.protocol.TList _list20 = iprot.readListBegin();
              long_vals = new ArrayList<Long>(_list20.size);
              for (int _i21 = 0; _i21 < _list20.size; ++_i21)
              {
                long _elem22;
                _elem22 = iprot.readI64();
                long_vals.add(_elem22);
              }
              iprot.readListEnd();
            }
            return long_vals;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case DOUBLE_VALS:
          if (field.type == DOUBLE_VALS_FIELD_DESC.type) {
            List<Double> double_vals;
            {
              org.apache.thrift.protocol.TList _list23 = iprot.readListBegin();
              double_vals = new ArrayList<Double>(_list23.size);
              for (int _i24 = 0; _i24 < _list23.size; ++_i24)
              {
                double _elem25;
                _elem25 = iprot.readDouble();
                double_vals.add(_elem25);
              }
              iprot.readListEnd();
            }
            return double_vals;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case STRING_VALS:
          if (field.type == STRING_VALS_FIELD_DESC.type) {
            List<String> string_vals;
            {
              org.apache.thrift.protocol.TList _list26 = iprot.readListBegin();
              string_vals = new ArrayList<String>(_list26.size);
              for (int _i27 = 0; _i27 < _list26.size; ++_i27)
              {
                String _elem28;
                _elem28 = iprot.readString();
                string_vals.add(_elem28);
              }
              iprot.readListEnd();
            }
            return string_vals;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case BINARY_VALS:
          if (field.type == BINARY_VALS_FIELD_DESC.type) {
            List<ByteBuffer> binary_vals;
            {
              org.apache.thrift.protocol.TList _list29 = iprot.readListBegin();
              binary_vals = new ArrayList<ByteBuffer>(_list29.size);
              for (int _i30 = 0; _i30 < _list29.size; ++_i30)
              {
                ByteBuffer _elem31;
                _elem31 = iprot.readBinary();
                binary_vals.add(_elem31);
              }
              iprot.readListEnd();
            }
            return binary_vals;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case BOOL_VALS:
        List<Boolean> bool_vals = (List<Boolean>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.BOOL, bool_vals.size()));
          for (boolean _iter32 : bool_vals)
          {
            oprot.writeBool(_iter32);
          }
          oprot.writeListEnd();
        }
        return;
      case BYTE_VALS:
        List<Byte> byte_vals = (List<Byte>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.BYTE, byte_vals.size()));
          for (byte _iter33 : byte_vals)
          {
            oprot.writeByte(_iter33);
          }
          oprot.writeListEnd();
        }
        return;
      case SHORT_VALS:
        List<Short> short_vals = (List<Short>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I16, short_vals.size()));
          for (short _iter34 : short_vals)
          {
            oprot.writeI16(_iter34);
          }
          oprot.writeListEnd();
        }
        return;
      case INT_VALS:
        List<Integer> int_vals = (List<Integer>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, int_vals.size()));
          for (int _iter35 : int_vals)
          {
            oprot.writeI32(_iter35);
          }
          oprot.writeListEnd();
        }
        return;
      case LONG_VALS:
        List<Long> long_vals = (List<Long>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, long_vals.size()));
          for (long _iter36 : long_vals)
          {
            oprot.writeI64(_iter36);
          }
          oprot.writeListEnd();
        }
        return;
      case DOUBLE_VALS:
        List<Double> double_vals = (List<Double>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, double_vals.size()));
          for (double _iter37 : double_vals)
          {
            oprot.writeDouble(_iter37);
          }
          oprot.writeListEnd();
        }
        return;
      case STRING_VALS:
        List<String> string_vals = (List<String>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, string_vals.size()));
          for (String _iter38 : string_vals)
          {
            oprot.writeString(_iter38);
          }
          oprot.writeListEnd();
        }
        return;
      case BINARY_VALS:
        List<ByteBuffer> binary_vals = (List<ByteBuffer>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, binary_vals.size()));
          for (ByteBuffer _iter39 : binary_vals)
          {
            oprot.writeBinary(_iter39);
          }
          oprot.writeListEnd();
        }
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case BOOL_VALS:
          List<Boolean> bool_vals;
          {
            org.apache.thrift.protocol.TList _list40 = iprot.readListBegin();
            bool_vals = new ArrayList<Boolean>(_list40.size);
            for (int _i41 = 0; _i41 < _list40.size; ++_i41)
            {
              boolean _elem42;
              _elem42 = iprot.readBool();
              bool_vals.add(_elem42);
            }
            iprot.readListEnd();
          }
          return bool_vals;
        case BYTE_VALS:
          List<Byte> byte_vals;
          {
            org.apache.thrift.protocol.TList _list43 = iprot.readListBegin();
            byte_vals = new ArrayList<Byte>(_list43.size);
            for (int _i44 = 0; _i44 < _list43.size; ++_i44)
            {
              byte _elem45;
              _elem45 = iprot.readByte();
              byte_vals.add(_elem45);
            }
            iprot.readListEnd();
          }
          return byte_vals;
        case SHORT_VALS:
          List<Short> short_vals;
          {
            org.apache.thrift.protocol.TList _list46 = iprot.readListBegin();
            short_vals = new ArrayList<Short>(_list46.size);
            for (int _i47 = 0; _i47 < _list46.size; ++_i47)
            {
              short _elem48;
              _elem48 = iprot.readI16();
              short_vals.add(_elem48);
            }
            iprot.readListEnd();
          }
          return short_vals;
        case INT_VALS:
          List<Integer> int_vals;
          {
            org.apache.thrift.protocol.TList _list49 = iprot.readListBegin();
            int_vals = new ArrayList<Integer>(_list49.size);
            for (int _i50 = 0; _i50 < _list49.size; ++_i50)
            {
              int _elem51;
              _elem51 = iprot.readI32();
              int_vals.add(_elem51);
            }
            iprot.readListEnd();
          }
          return int_vals;
        case LONG_VALS:
          List<Long> long_vals;
          {
            org.apache.thrift.protocol.TList _list52 = iprot.readListBegin();
            long_vals = new ArrayList<Long>(_list52.size);
            for (int _i53 = 0; _i53 < _list52.size; ++_i53)
            {
              long _elem54;
              _elem54 = iprot.readI64();
              long_vals.add(_elem54);
            }
            iprot.readListEnd();
          }
          return long_vals;
        case DOUBLE_VALS:
          List<Double> double_vals;
          {
            org.apache.thrift.protocol.TList _list55 = iprot.readListBegin();
            double_vals = new ArrayList<Double>(_list55.size);
            for (int _i56 = 0; _i56 < _list55.size; ++_i56)
            {
              double _elem57;
              _elem57 = iprot.readDouble();
              double_vals.add(_elem57);
            }
            iprot.readListEnd();
          }
          return double_vals;
        case STRING_VALS:
          List<String> string_vals;
          {
            org.apache.thrift.protocol.TList _list58 = iprot.readListBegin();
            string_vals = new ArrayList<String>(_list58.size);
            for (int _i59 = 0; _i59 < _list58.size; ++_i59)
            {
              String _elem60;
              _elem60 = iprot.readString();
              string_vals.add(_elem60);
            }
            iprot.readListEnd();
          }
          return string_vals;
        case BINARY_VALS:
          List<ByteBuffer> binary_vals;
          {
            org.apache.thrift.protocol.TList _list61 = iprot.readListBegin();
            binary_vals = new ArrayList<ByteBuffer>(_list61.size);
            for (int _i62 = 0; _i62 < _list61.size; ++_i62)
            {
              ByteBuffer _elem63;
              _elem63 = iprot.readBinary();
              binary_vals.add(_elem63);
            }
            iprot.readListEnd();
          }
          return binary_vals;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case BOOL_VALS:
        List<Boolean> bool_vals = (List<Boolean>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.BOOL, bool_vals.size()));
          for (boolean _iter64 : bool_vals)
          {
            oprot.writeBool(_iter64);
          }
          oprot.writeListEnd();
        }
        return;
      case BYTE_VALS:
        List<Byte> byte_vals = (List<Byte>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.BYTE, byte_vals.size()));
          for (byte _iter65 : byte_vals)
          {
            oprot.writeByte(_iter65);
          }
          oprot.writeListEnd();
        }
        return;
      case SHORT_VALS:
        List<Short> short_vals = (List<Short>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I16, short_vals.size()));
          for (short _iter66 : short_vals)
          {
            oprot.writeI16(_iter66);
          }
          oprot.writeListEnd();
        }
        return;
      case INT_VALS:
        List<Integer> int_vals = (List<Integer>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, int_vals.size()));
          for (int _iter67 : int_vals)
          {
            oprot.writeI32(_iter67);
          }
          oprot.writeListEnd();
        }
        return;
      case LONG_VALS:
        List<Long> long_vals = (List<Long>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, long_vals.size()));
          for (long _iter68 : long_vals)
          {
            oprot.writeI64(_iter68);
          }
          oprot.writeListEnd();
        }
        return;
      case DOUBLE_VALS:
        List<Double> double_vals = (List<Double>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, double_vals.size()));
          for (double _iter69 : double_vals)
          {
            oprot.writeDouble(_iter69);
          }
          oprot.writeListEnd();
        }
        return;
      case STRING_VALS:
        List<String> string_vals = (List<String>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, string_vals.size()));
          for (String _iter70 : string_vals)
          {
            oprot.writeString(_iter70);
          }
          oprot.writeListEnd();
        }
        return;
      case BINARY_VALS:
        List<ByteBuffer> binary_vals = (List<ByteBuffer>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, binary_vals.size()));
          for (ByteBuffer _iter71 : binary_vals)
          {
            oprot.writeBinary(_iter71);
          }
          oprot.writeListEnd();
        }
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case BOOL_VALS:
        return BOOL_VALS_FIELD_DESC;
      case BYTE_VALS:
        return BYTE_VALS_FIELD_DESC;
      case SHORT_VALS:
        return SHORT_VALS_FIELD_DESC;
      case INT_VALS:
        return INT_VALS_FIELD_DESC;
      case LONG_VALS:
        return LONG_VALS_FIELD_DESC;
      case DOUBLE_VALS:
        return DOUBLE_VALS_FIELD_DESC;
      case STRING_VALS:
        return STRING_VALS_FIELD_DESC;
      case BINARY_VALS:
        return BINARY_VALS_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public List<Boolean> getBool_vals() {
    if (getSetField() == _Fields.BOOL_VALS) {
      return (List<Boolean>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'bool_vals' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setBool_vals(List<Boolean> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.BOOL_VALS;
    value_ = value;
  }

  public List<Byte> getByte_vals() {
    if (getSetField() == _Fields.BYTE_VALS) {
      return (List<Byte>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'byte_vals' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setByte_vals(List<Byte> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.BYTE_VALS;
    value_ = value;
  }

  public List<Short> getShort_vals() {
    if (getSetField() == _Fields.SHORT_VALS) {
      return (List<Short>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'short_vals' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setShort_vals(List<Short> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.SHORT_VALS;
    value_ = value;
  }

  public List<Integer> getInt_vals() {
    if (getSetField() == _Fields.INT_VALS) {
      return (List<Integer>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'int_vals' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setInt_vals(List<Integer> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.INT_VALS;
    value_ = value;
  }

  public List<Long> getLong_vals() {
    if (getSetField() == _Fields.LONG_VALS) {
      return (List<Long>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'long_vals' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setLong_vals(List<Long> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.LONG_VALS;
    value_ = value;
  }

  public List<Double> getDouble_vals() {
    if (getSetField() == _Fields.DOUBLE_VALS) {
      return (List<Double>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'double_vals' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDouble_vals(List<Double> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.DOUBLE_VALS;
    value_ = value;
  }

  public List<String> getString_vals() {
    if (getSetField() == _Fields.STRING_VALS) {
      return (List<String>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'string_vals' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setString_vals(List<String> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.STRING_VALS;
    value_ = value;
  }

  public List<ByteBuffer> getBinary_vals() {
    if (getSetField() == _Fields.BINARY_VALS) {
      return (List<ByteBuffer>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'binary_vals' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setBinary_vals(List<ByteBuffer> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.BINARY_VALS;
    value_ = value;
  }

  public boolean isSetBool_vals() {
    return setField_ == _Fields.BOOL_VALS;
  }


  public boolean isSetByte_vals() {
    return setField_ == _Fields.BYTE_VALS;
  }


  public boolean isSetShort_vals() {
    return setField_ == _Fields.SHORT_VALS;
  }


  public boolean isSetInt_vals() {
    return setField_ == _Fields.INT_VALS;
  }


  public boolean isSetLong_vals() {
    return setField_ == _Fields.LONG_VALS;
  }


  public boolean isSetDouble_vals() {
    return setField_ == _Fields.DOUBLE_VALS;
  }


  public boolean isSetString_vals() {
    return setField_ == _Fields.STRING_VALS;
  }


  public boolean isSetBinary_vals() {
    return setField_ == _Fields.BINARY_VALS;
  }


  public boolean equals(Object other) {
    if (other instanceof ColumnDataValues) {
      return equals((ColumnDataValues)other);
    } else {
      return false;
    }
  }

  public boolean equals(ColumnDataValues other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(ColumnDataValues other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  /**
   * If you'd like this to perform more respectably, use the hashcode generator option.
   */
  @Override
  public int hashCode() {
    return 0;
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


}