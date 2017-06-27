/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.exoplayer2.extractor.mp3;

import android.test.InstrumentationTestCase;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.testutil.TestUtil;

/**
 * Unit test for {@link Mp3Extractor}.
 */
public final class Mp3ExtractorTest extends InstrumentationTestCase {

  public void testMp3Sample() throws Exception {
    TestUtil.assertOutput(new TestUtil.ExtractorFactory() {
      @Override
      public Extractor create() {
        return new Mp3Extractor();
      }
    }, "mp3/bear.mp3", getInstrumentation());
  }

  public void testTrimmedMp3Sample() throws Exception {
    TestUtil.assertOutput(new TestUtil.ExtractorFactory() {
      @Override
      public Extractor create() {
        return new Mp3Extractor();
      }
    }, "mp3/play-trimmed.mp3", getInstrumentation());
  }

}
