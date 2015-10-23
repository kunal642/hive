/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-21")
public class HiveObjectRef implements org.apache.thrift.TBase<HiveObjectRef, HiveObjectRef._Fields>, java.io.Serializable, Cloneable, Comparable<HiveObjectRef> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HiveObjectRef");

  private static final org.apache.thrift.protocol.TField OBJECT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("objectType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField OBJECT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("objectName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PART_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("partValues", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField COLUMN_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("columnName", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HiveObjectRefStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HiveObjectRefTupleSchemeFactory());
  }

  private HiveObjectType objectType; // required
  private String dbName; // required
  private String objectName; // required
  private List<String> partValues; // required
  private String columnName; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see HiveObjectType
     */
    OBJECT_TYPE((short)1, "objectType"),
    DB_NAME((short)2, "dbName"),
    OBJECT_NAME((short)3, "objectName"),
    PART_VALUES((short)4, "partValues"),
    COLUMN_NAME((short)5, "columnName");

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
        case 1: // OBJECT_TYPE
          return OBJECT_TYPE;
        case 2: // DB_NAME
          return DB_NAME;
        case 3: // OBJECT_NAME
          return OBJECT_NAME;
        case 4: // PART_VALUES
          return PART_VALUES;
        case 5: // COLUMN_NAME
          return COLUMN_NAME;
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
    tmpMap.put(_Fields.OBJECT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("objectType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, HiveObjectType.class)));
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("dbName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OBJECT_NAME, new org.apache.thrift.meta_data.FieldMetaData("objectName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PART_VALUES, new org.apache.thrift.meta_data.FieldMetaData("partValues", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.COLUMN_NAME, new org.apache.thrift.meta_data.FieldMetaData("columnName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HiveObjectRef.class, metaDataMap);
  }

  public HiveObjectRef() {
  }

  public HiveObjectRef(
    HiveObjectType objectType,
    String dbName,
    String objectName,
    List<String> partValues,
    String columnName)
  {
    this();
    this.objectType = objectType;
    this.dbName = dbName;
    this.objectName = objectName;
    this.partValues = partValues;
    this.columnName = columnName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HiveObjectRef(HiveObjectRef other) {
    if (other.isSetObjectType()) {
      this.objectType = other.objectType;
    }
    if (other.isSetDbName()) {
      this.dbName = other.dbName;
    }
    if (other.isSetObjectName()) {
      this.objectName = other.objectName;
    }
    if (other.isSetPartValues()) {
      List<String> __this__partValues = new ArrayList<String>(other.partValues);
      this.partValues = __this__partValues;
    }
    if (other.isSetColumnName()) {
      this.columnName = other.columnName;
    }
  }

  public HiveObjectRef deepCopy() {
    return new HiveObjectRef(this);
  }

  @Override
  public void clear() {
    this.objectType = null;
    this.dbName = null;
    this.objectName = null;
    this.partValues = null;
    this.columnName = null;
  }

  /**
   * 
   * @see HiveObjectType
   */
  public HiveObjectType getObjectType() {
    return this.objectType;
  }

  /**
   * 
   * @see HiveObjectType
   */
  public void setObjectType(HiveObjectType objectType) {
    this.objectType = objectType;
  }

  public void unsetObjectType() {
    this.objectType = null;
  }

  /** Returns true if field objectType is set (has been assigned a value) and false otherwise */
  public boolean isSetObjectType() {
    return this.objectType != null;
  }

  public void setObjectTypeIsSet(boolean value) {
    if (!value) {
      this.objectType = null;
    }
  }

  public String getDbName() {
    return this.dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }

  public void unsetDbName() {
    this.dbName = null;
  }

  /** Returns true if field dbName is set (has been assigned a value) and false otherwise */
  public boolean isSetDbName() {
    return this.dbName != null;
  }

  public void setDbNameIsSet(boolean value) {
    if (!value) {
      this.dbName = null;
    }
  }

  public String getObjectName() {
    return this.objectName;
  }

  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }

  public void unsetObjectName() {
    this.objectName = null;
  }

  /** Returns true if field objectName is set (has been assigned a value) and false otherwise */
  public boolean isSetObjectName() {
    return this.objectName != null;
  }

  public void setObjectNameIsSet(boolean value) {
    if (!value) {
      this.objectName = null;
    }
  }

  public int getPartValuesSize() {
    return (this.partValues == null) ? 0 : this.partValues.size();
  }

  public java.util.Iterator<String> getPartValuesIterator() {
    return (this.partValues == null) ? null : this.partValues.iterator();
  }

  public void addToPartValues(String elem) {
    if (this.partValues == null) {
      this.partValues = new ArrayList<String>();
    }
    this.partValues.add(elem);
  }

  public List<String> getPartValues() {
    return this.partValues;
  }

  public void setPartValues(List<String> partValues) {
    this.partValues = partValues;
  }

  public void unsetPartValues() {
    this.partValues = null;
  }

  /** Returns true if field partValues is set (has been assigned a value) and false otherwise */
  public boolean isSetPartValues() {
    return this.partValues != null;
  }

  public void setPartValuesIsSet(boolean value) {
    if (!value) {
      this.partValues = null;
    }
  }

  public String getColumnName() {
    return this.columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public void unsetColumnName() {
    this.columnName = null;
  }

  /** Returns true if field columnName is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnName() {
    return this.columnName != null;
  }

  public void setColumnNameIsSet(boolean value) {
    if (!value) {
      this.columnName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OBJECT_TYPE:
      if (value == null) {
        unsetObjectType();
      } else {
        setObjectType((HiveObjectType)value);
      }
      break;

    case DB_NAME:
      if (value == null) {
        unsetDbName();
      } else {
        setDbName((String)value);
      }
      break;

    case OBJECT_NAME:
      if (value == null) {
        unsetObjectName();
      } else {
        setObjectName((String)value);
      }
      break;

    case PART_VALUES:
      if (value == null) {
        unsetPartValues();
      } else {
        setPartValues((List<String>)value);
      }
      break;

    case COLUMN_NAME:
      if (value == null) {
        unsetColumnName();
      } else {
        setColumnName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OBJECT_TYPE:
      return getObjectType();

    case DB_NAME:
      return getDbName();

    case OBJECT_NAME:
      return getObjectName();

    case PART_VALUES:
      return getPartValues();

    case COLUMN_NAME:
      return getColumnName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OBJECT_TYPE:
      return isSetObjectType();
    case DB_NAME:
      return isSetDbName();
    case OBJECT_NAME:
      return isSetObjectName();
    case PART_VALUES:
      return isSetPartValues();
    case COLUMN_NAME:
      return isSetColumnName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HiveObjectRef)
      return this.equals((HiveObjectRef)that);
    return false;
  }

  public boolean equals(HiveObjectRef that) {
    if (that == null)
      return false;

    boolean this_present_objectType = true && this.isSetObjectType();
    boolean that_present_objectType = true && that.isSetObjectType();
    if (this_present_objectType || that_present_objectType) {
      if (!(this_present_objectType && that_present_objectType))
        return false;
      if (!this.objectType.equals(that.objectType))
        return false;
    }

    boolean this_present_dbName = true && this.isSetDbName();
    boolean that_present_dbName = true && that.isSetDbName();
    if (this_present_dbName || that_present_dbName) {
      if (!(this_present_dbName && that_present_dbName))
        return false;
      if (!this.dbName.equals(that.dbName))
        return false;
    }

    boolean this_present_objectName = true && this.isSetObjectName();
    boolean that_present_objectName = true && that.isSetObjectName();
    if (this_present_objectName || that_present_objectName) {
      if (!(this_present_objectName && that_present_objectName))
        return false;
      if (!this.objectName.equals(that.objectName))
        return false;
    }

    boolean this_present_partValues = true && this.isSetPartValues();
    boolean that_present_partValues = true && that.isSetPartValues();
    if (this_present_partValues || that_present_partValues) {
      if (!(this_present_partValues && that_present_partValues))
        return false;
      if (!this.partValues.equals(that.partValues))
        return false;
    }

    boolean this_present_columnName = true && this.isSetColumnName();
    boolean that_present_columnName = true && that.isSetColumnName();
    if (this_present_columnName || that_present_columnName) {
      if (!(this_present_columnName && that_present_columnName))
        return false;
      if (!this.columnName.equals(that.columnName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_objectType = true && (isSetObjectType());
    list.add(present_objectType);
    if (present_objectType)
      list.add(objectType.getValue());

    boolean present_dbName = true && (isSetDbName());
    list.add(present_dbName);
    if (present_dbName)
      list.add(dbName);

    boolean present_objectName = true && (isSetObjectName());
    list.add(present_objectName);
    if (present_objectName)
      list.add(objectName);

    boolean present_partValues = true && (isSetPartValues());
    list.add(present_partValues);
    if (present_partValues)
      list.add(partValues);

    boolean present_columnName = true && (isSetColumnName());
    list.add(present_columnName);
    if (present_columnName)
      list.add(columnName);

    return list.hashCode();
  }

  @Override
  public int compareTo(HiveObjectRef other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetObjectType()).compareTo(other.isSetObjectType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObjectType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.objectType, other.objectType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDbName()).compareTo(other.isSetDbName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbName, other.dbName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetObjectName()).compareTo(other.isSetObjectName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObjectName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.objectName, other.objectName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartValues()).compareTo(other.isSetPartValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partValues, other.partValues);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumnName()).compareTo(other.isSetColumnName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columnName, other.columnName);
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
    StringBuilder sb = new StringBuilder("HiveObjectRef(");
    boolean first = true;

    sb.append("objectType:");
    if (this.objectType == null) {
      sb.append("null");
    } else {
      sb.append(this.objectType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dbName:");
    if (this.dbName == null) {
      sb.append("null");
    } else {
      sb.append(this.dbName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("objectName:");
    if (this.objectName == null) {
      sb.append("null");
    } else {
      sb.append(this.objectName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("partValues:");
    if (this.partValues == null) {
      sb.append("null");
    } else {
      sb.append(this.partValues);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("columnName:");
    if (this.columnName == null) {
      sb.append("null");
    } else {
      sb.append(this.columnName);
    }
    first = false;
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HiveObjectRefStandardSchemeFactory implements SchemeFactory {
    public HiveObjectRefStandardScheme getScheme() {
      return new HiveObjectRefStandardScheme();
    }
  }

  private static class HiveObjectRefStandardScheme extends StandardScheme<HiveObjectRef> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HiveObjectRef struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OBJECT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.objectType = org.apache.hadoop.hive.metastore.api.HiveObjectType.findByValue(iprot.readI32());
              struct.setObjectTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbName = iprot.readString();
              struct.setDbNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OBJECT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.objectName = iprot.readString();
              struct.setObjectNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PART_VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.partValues = new ArrayList<String>(_list8.size);
                String _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = iprot.readString();
                  struct.partValues.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setPartValuesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // COLUMN_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.columnName = iprot.readString();
              struct.setColumnNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HiveObjectRef struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.objectType != null) {
        oprot.writeFieldBegin(OBJECT_TYPE_FIELD_DESC);
        oprot.writeI32(struct.objectType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.dbName != null) {
        oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
        oprot.writeString(struct.dbName);
        oprot.writeFieldEnd();
      }
      if (struct.objectName != null) {
        oprot.writeFieldBegin(OBJECT_NAME_FIELD_DESC);
        oprot.writeString(struct.objectName);
        oprot.writeFieldEnd();
      }
      if (struct.partValues != null) {
        oprot.writeFieldBegin(PART_VALUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.partValues.size()));
          for (String _iter11 : struct.partValues)
          {
            oprot.writeString(_iter11);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.columnName != null) {
        oprot.writeFieldBegin(COLUMN_NAME_FIELD_DESC);
        oprot.writeString(struct.columnName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HiveObjectRefTupleSchemeFactory implements SchemeFactory {
    public HiveObjectRefTupleScheme getScheme() {
      return new HiveObjectRefTupleScheme();
    }
  }

  private static class HiveObjectRefTupleScheme extends TupleScheme<HiveObjectRef> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HiveObjectRef struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetObjectType()) {
        optionals.set(0);
      }
      if (struct.isSetDbName()) {
        optionals.set(1);
      }
      if (struct.isSetObjectName()) {
        optionals.set(2);
      }
      if (struct.isSetPartValues()) {
        optionals.set(3);
      }
      if (struct.isSetColumnName()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetObjectType()) {
        oprot.writeI32(struct.objectType.getValue());
      }
      if (struct.isSetDbName()) {
        oprot.writeString(struct.dbName);
      }
      if (struct.isSetObjectName()) {
        oprot.writeString(struct.objectName);
      }
      if (struct.isSetPartValues()) {
        {
          oprot.writeI32(struct.partValues.size());
          for (String _iter12 : struct.partValues)
          {
            oprot.writeString(_iter12);
          }
        }
      }
      if (struct.isSetColumnName()) {
        oprot.writeString(struct.columnName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HiveObjectRef struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.objectType = org.apache.hadoop.hive.metastore.api.HiveObjectType.findByValue(iprot.readI32());
        struct.setObjectTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.dbName = iprot.readString();
        struct.setDbNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.objectName = iprot.readString();
        struct.setObjectNameIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.partValues = new ArrayList<String>(_list13.size);
          String _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = iprot.readString();
            struct.partValues.add(_elem14);
          }
        }
        struct.setPartValuesIsSet(true);
      }
      if (incoming.get(4)) {
        struct.columnName = iprot.readString();
        struct.setColumnNameIsSet(true);
      }
    }
  }

}

