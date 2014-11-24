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


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum BinaryOperator implements org.apache.thrift.TEnum {
  LT(0),
  LE(1),
  EQ(2),
  NE(3),
  GE(4),
  GT(5);

  private final int value;

  private BinaryOperator(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static BinaryOperator findByValue(int value) { 
    switch (value) {
      case 0:
        return LT;
      case 1:
        return LE;
      case 2:
        return EQ;
      case 3:
        return NE;
      case 4:
        return GE;
      case 5:
        return GT;
      default:
        return null;
    }
  }
}
