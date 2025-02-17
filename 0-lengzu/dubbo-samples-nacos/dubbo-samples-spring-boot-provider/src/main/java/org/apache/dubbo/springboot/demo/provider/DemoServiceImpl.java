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
package org.apache.dubbo.springboot.demo.provider;


import com.google.protobuf.Empty;
import org.apache.dubbo.common.serialize.protobuf.support.ProtobufUtils;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.springboot.demo.DemoService;
import org.apache.dubbo.springboot.demo.SayHelloReply;
import org.apache.dubbo.springboot.demo.SayHelloRequest;

@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public SayHelloReply sayHello(SayHelloRequest request) {
        System.out.println("sayHello request:" + request);
        String name = request.getName();
        SayHelloReply reply = SayHelloReply.newBuilder().build();
        if (name.equals("lengzu")) {
            return SayHelloReply.newBuilder().setResult("Hello " + name).build();
        } else {
            return null;
        }
    }
}
