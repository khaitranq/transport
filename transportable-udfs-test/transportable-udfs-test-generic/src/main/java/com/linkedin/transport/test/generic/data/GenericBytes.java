/**
 * Copyright 2018 LinkedIn Corporation. All rights reserved.
 * Licensed under the BSD-2 Clause license.
 * See LICENSE in the project root for license information.
 */
package com.linkedin.transport.test.generic.data;

import com.linkedin.transport.api.data.PlatformData;
import com.linkedin.transport.api.data.StdBytes;
import java.nio.ByteBuffer;


public class GenericBytes implements StdBytes, PlatformData {

  private ByteBuffer _byteBuffer;

  public GenericBytes(ByteBuffer aByteBuffer) {
    _byteBuffer = aByteBuffer;
  }

  @Override
  public ByteBuffer get() {
    return _byteBuffer;
  }

  @Override
  public Object getUnderlyingData() {
    return _byteBuffer;
  }

  @Override
  public void setUnderlyingData(Object value) {
    _byteBuffer = (ByteBuffer) value;
  }
}
