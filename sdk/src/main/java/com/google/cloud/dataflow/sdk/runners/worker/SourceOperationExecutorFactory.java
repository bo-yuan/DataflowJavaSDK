/*******************************************************************************
 * Copyright (C) 2015 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/

package com.google.cloud.dataflow.sdk.runners.worker;

import com.google.api.services.dataflow.model.SourceOperationRequest;
import com.google.cloud.dataflow.sdk.options.PipelineOptions;
import com.google.cloud.dataflow.sdk.util.common.CounterSet;

/**
 * Creates a SourceOperationExecutor from a SourceOperation.
 */
public class SourceOperationExecutorFactory {
  public static SourceOperationExecutor create(
      PipelineOptions options, SourceOperationRequest request) throws Exception {
    CounterSet counters = new CounterSet();
    return new SourceOperationExecutor(options, request, counters);
  }
}
