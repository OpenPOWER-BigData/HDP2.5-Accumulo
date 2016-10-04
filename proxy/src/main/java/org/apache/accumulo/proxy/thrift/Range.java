/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.accumulo.proxy.thrift;

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

@SuppressWarnings({"unchecked", "serial", "rawtypes", "unused"}) public class Range implements org.apache.thrift.TBase<Range, Range._Fields>, java.io.Serializable, Cloneable, Comparable<Range> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Range");

  private static final org.apache.thrift.protocol.TField START_FIELD_DESC = new org.apache.thrift.protocol.TField("start", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField START_INCLUSIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("startInclusive", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField STOP_FIELD_DESC = new org.apache.thrift.protocol.TField("stop", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField STOP_INCLUSIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("stopInclusive", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RangeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RangeTupleSchemeFactory());
  }

  public Key start; // required
  public boolean startInclusive; // required
  public Key stop; // required
  public boolean stopInclusive; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    START((short)1, "start"),
    START_INCLUSIVE((short)2, "startInclusive"),
    STOP((short)3, "stop"),
    STOP_INCLUSIVE((short)4, "stopInclusive");

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
        case 1: // START
          return START;
        case 2: // START_INCLUSIVE
          return START_INCLUSIVE;
        case 3: // STOP
          return STOP;
        case 4: // STOP_INCLUSIVE
          return STOP_INCLUSIVE;
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
  private static final int __STARTINCLUSIVE_ISSET_ID = 0;
  private static final int __STOPINCLUSIVE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START, new org.apache.thrift.meta_data.FieldMetaData("start", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Key.class)));
    tmpMap.put(_Fields.START_INCLUSIVE, new org.apache.thrift.meta_data.FieldMetaData("startInclusive", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.STOP, new org.apache.thrift.meta_data.FieldMetaData("stop", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Key.class)));
    tmpMap.put(_Fields.STOP_INCLUSIVE, new org.apache.thrift.meta_data.FieldMetaData("stopInclusive", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Range.class, metaDataMap);
  }

  public Range() {
  }

  public Range(
    Key start,
    boolean startInclusive,
    Key stop,
    boolean stopInclusive)
  {
    this();
    this.start = start;
    this.startInclusive = startInclusive;
    setStartInclusiveIsSet(true);
    this.stop = stop;
    this.stopInclusive = stopInclusive;
    setStopInclusiveIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Range(Range other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStart()) {
      this.start = new Key(other.start);
    }
    this.startInclusive = other.startInclusive;
    if (other.isSetStop()) {
      this.stop = new Key(other.stop);
    }
    this.stopInclusive = other.stopInclusive;
  }

  public Range deepCopy() {
    return new Range(this);
  }

  @Override
  public void clear() {
    this.start = null;
    setStartInclusiveIsSet(false);
    this.startInclusive = false;
    this.stop = null;
    setStopInclusiveIsSet(false);
    this.stopInclusive = false;
  }

  public Key getStart() {
    return this.start;
  }

  public Range setStart(Key start) {
    this.start = start;
    return this;
  }

  public void unsetStart() {
    this.start = null;
  }

  /** Returns true if field start is set (has been assigned a value) and false otherwise */
  public boolean isSetStart() {
    return this.start != null;
  }

  public void setStartIsSet(boolean value) {
    if (!value) {
      this.start = null;
    }
  }

  public boolean isStartInclusive() {
    return this.startInclusive;
  }

  public Range setStartInclusive(boolean startInclusive) {
    this.startInclusive = startInclusive;
    setStartInclusiveIsSet(true);
    return this;
  }

  public void unsetStartInclusive() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARTINCLUSIVE_ISSET_ID);
  }

  /** Returns true if field startInclusive is set (has been assigned a value) and false otherwise */
  public boolean isSetStartInclusive() {
    return EncodingUtils.testBit(__isset_bitfield, __STARTINCLUSIVE_ISSET_ID);
  }

  public void setStartInclusiveIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARTINCLUSIVE_ISSET_ID, value);
  }

  public Key getStop() {
    return this.stop;
  }

  public Range setStop(Key stop) {
    this.stop = stop;
    return this;
  }

  public void unsetStop() {
    this.stop = null;
  }

  /** Returns true if field stop is set (has been assigned a value) and false otherwise */
  public boolean isSetStop() {
    return this.stop != null;
  }

  public void setStopIsSet(boolean value) {
    if (!value) {
      this.stop = null;
    }
  }

  public boolean isStopInclusive() {
    return this.stopInclusive;
  }

  public Range setStopInclusive(boolean stopInclusive) {
    this.stopInclusive = stopInclusive;
    setStopInclusiveIsSet(true);
    return this;
  }

  public void unsetStopInclusive() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STOPINCLUSIVE_ISSET_ID);
  }

  /** Returns true if field stopInclusive is set (has been assigned a value) and false otherwise */
  public boolean isSetStopInclusive() {
    return EncodingUtils.testBit(__isset_bitfield, __STOPINCLUSIVE_ISSET_ID);
  }

  public void setStopInclusiveIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STOPINCLUSIVE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case START:
      if (value == null) {
        unsetStart();
      } else {
        setStart((Key)value);
      }
      break;

    case START_INCLUSIVE:
      if (value == null) {
        unsetStartInclusive();
      } else {
        setStartInclusive((Boolean)value);
      }
      break;

    case STOP:
      if (value == null) {
        unsetStop();
      } else {
        setStop((Key)value);
      }
      break;

    case STOP_INCLUSIVE:
      if (value == null) {
        unsetStopInclusive();
      } else {
        setStopInclusive((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case START:
      return getStart();

    case START_INCLUSIVE:
      return Boolean.valueOf(isStartInclusive());

    case STOP:
      return getStop();

    case STOP_INCLUSIVE:
      return Boolean.valueOf(isStopInclusive());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case START:
      return isSetStart();
    case START_INCLUSIVE:
      return isSetStartInclusive();
    case STOP:
      return isSetStop();
    case STOP_INCLUSIVE:
      return isSetStopInclusive();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Range)
      return this.equals((Range)that);
    return false;
  }

  public boolean equals(Range that) {
    if (that == null)
      return false;

    boolean this_present_start = true && this.isSetStart();
    boolean that_present_start = true && that.isSetStart();
    if (this_present_start || that_present_start) {
      if (!(this_present_start && that_present_start))
        return false;
      if (!this.start.equals(that.start))
        return false;
    }

    boolean this_present_startInclusive = true;
    boolean that_present_startInclusive = true;
    if (this_present_startInclusive || that_present_startInclusive) {
      if (!(this_present_startInclusive && that_present_startInclusive))
        return false;
      if (this.startInclusive != that.startInclusive)
        return false;
    }

    boolean this_present_stop = true && this.isSetStop();
    boolean that_present_stop = true && that.isSetStop();
    if (this_present_stop || that_present_stop) {
      if (!(this_present_stop && that_present_stop))
        return false;
      if (!this.stop.equals(that.stop))
        return false;
    }

    boolean this_present_stopInclusive = true;
    boolean that_present_stopInclusive = true;
    if (this_present_stopInclusive || that_present_stopInclusive) {
      if (!(this_present_stopInclusive && that_present_stopInclusive))
        return false;
      if (this.stopInclusive != that.stopInclusive)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Range other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStart()).compareTo(other.isSetStart());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.start, other.start);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartInclusive()).compareTo(other.isSetStartInclusive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartInclusive()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startInclusive, other.startInclusive);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStop()).compareTo(other.isSetStop());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStop()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stop, other.stop);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStopInclusive()).compareTo(other.isSetStopInclusive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStopInclusive()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stopInclusive, other.stopInclusive);
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
    StringBuilder sb = new StringBuilder("Range(");
    boolean first = true;

    sb.append("start:");
    if (this.start == null) {
      sb.append("null");
    } else {
      sb.append(this.start);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("startInclusive:");
    sb.append(this.startInclusive);
    first = false;
    if (!first) sb.append(", ");
    sb.append("stop:");
    if (this.stop == null) {
      sb.append("null");
    } else {
      sb.append(this.stop);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stopInclusive:");
    sb.append(this.stopInclusive);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (start != null) {
      start.validate();
    }
    if (stop != null) {
      stop.validate();
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

  private static class RangeStandardSchemeFactory implements SchemeFactory {
    public RangeStandardScheme getScheme() {
      return new RangeStandardScheme();
    }
  }

  private static class RangeStandardScheme extends StandardScheme<Range> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Range struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.start = new Key();
              struct.start.read(iprot);
              struct.setStartIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // START_INCLUSIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.startInclusive = iprot.readBool();
              struct.setStartInclusiveIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STOP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.stop = new Key();
              struct.stop.read(iprot);
              struct.setStopIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STOP_INCLUSIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.stopInclusive = iprot.readBool();
              struct.setStopInclusiveIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Range struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.start != null) {
        oprot.writeFieldBegin(START_FIELD_DESC);
        struct.start.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(START_INCLUSIVE_FIELD_DESC);
      oprot.writeBool(struct.startInclusive);
      oprot.writeFieldEnd();
      if (struct.stop != null) {
        oprot.writeFieldBegin(STOP_FIELD_DESC);
        struct.stop.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(STOP_INCLUSIVE_FIELD_DESC);
      oprot.writeBool(struct.stopInclusive);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RangeTupleSchemeFactory implements SchemeFactory {
    public RangeTupleScheme getScheme() {
      return new RangeTupleScheme();
    }
  }

  private static class RangeTupleScheme extends TupleScheme<Range> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Range struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStart()) {
        optionals.set(0);
      }
      if (struct.isSetStartInclusive()) {
        optionals.set(1);
      }
      if (struct.isSetStop()) {
        optionals.set(2);
      }
      if (struct.isSetStopInclusive()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetStart()) {
        struct.start.write(oprot);
      }
      if (struct.isSetStartInclusive()) {
        oprot.writeBool(struct.startInclusive);
      }
      if (struct.isSetStop()) {
        struct.stop.write(oprot);
      }
      if (struct.isSetStopInclusive()) {
        oprot.writeBool(struct.stopInclusive);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Range struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.start = new Key();
        struct.start.read(iprot);
        struct.setStartIsSet(true);
      }
      if (incoming.get(1)) {
        struct.startInclusive = iprot.readBool();
        struct.setStartInclusiveIsSet(true);
      }
      if (incoming.get(2)) {
        struct.stop = new Key();
        struct.stop.read(iprot);
        struct.setStopIsSet(true);
      }
      if (incoming.get(3)) {
        struct.stopInclusive = iprot.readBool();
        struct.setStopInclusiveIsSet(true);
      }
    }
  }

}

