/*
 * Copyright 2022 OPPO Goblin Project
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
 * limitations under the License.
 */
package io.github.oitstack.goblin.runtime.config;

import lombok.Builder;
import lombok.Data;

/**
 * docker client configuration.
 * @Author CuttleFish
 * @Date 2022/2/28 下午6:26
 */
@Data
@Builder
public class Configure {

    /**
     * parameter configuration of images.
     */
    @Builder.Default
    ImageOptions imageOptions;

    /**
     * Container creation timeout in milliseconds.
     */
    @Builder.Default
    Long createRuntimeTimeout = 100000L;

}
