/**
 * Copyright 2018 LinkedIn Corporation. All rights reserved.
 * Licensed under the BSD-2 Clause license.
 * See LICENSE in the project root for license information.
 */
package com.linkedin.transport.hive.types;

import com.linkedin.transport.api.types.StdArrayType;
import com.linkedin.transport.api.types.StdType;
import com.linkedin.transport.hive.HiveWrapper;
import org.apache.hadoop.hive.serde2.objectinspector.ListObjectInspector;


public class HiveArrayType implements StdArrayType {

  final ListObjectInspector _listObjectInspector;

  public HiveArrayType(ListObjectInspector listObjectInspector) {
    _listObjectInspector = listObjectInspector;
  }

  @Override
  public Object underlyingType() {
    return _listObjectInspector;
  }

  @Override
  public StdType elementType() {
    return HiveWrapper.createStdType(_listObjectInspector.getListElementObjectInspector());
  }
}
