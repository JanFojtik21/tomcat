/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$15 {

    static final FunctionDescriptor SSL_CTX_set_verify$FUNC = FunctionDescriptor.ofVoid(
        ADDRESS,
        JAVA_INT,
        ADDRESS
    );
    static final MethodHandle SSL_CTX_set_verify$MH = RuntimeHelper.downcallHandle(
        "SSL_CTX_set_verify",
        constants$15.SSL_CTX_set_verify$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_set_cert_verify_callback$cb$FUNC = FunctionDescriptor.of(JAVA_INT,
        ADDRESS,
        ADDRESS
    );
    static final MethodHandle SSL_CTX_set_cert_verify_callback$cb$MH = RuntimeHelper.downcallHandle(
        constants$15.SSL_CTX_set_cert_verify_callback$cb$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_set_cert_verify_callback$FUNC = FunctionDescriptor.ofVoid(
        ADDRESS,
        ADDRESS,
        ADDRESS
    );
    static final MethodHandle SSL_CTX_set_cert_verify_callback$MH = RuntimeHelper.downcallHandle(
        "SSL_CTX_set_cert_verify_callback",
        constants$15.SSL_CTX_set_cert_verify_callback$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_use_PrivateKey$FUNC = FunctionDescriptor.of(JAVA_INT,
        ADDRESS,
        ADDRESS
    );
    static final MethodHandle SSL_CTX_use_PrivateKey$MH = RuntimeHelper.downcallHandle(
        "SSL_CTX_use_PrivateKey",
        constants$15.SSL_CTX_use_PrivateKey$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_use_certificate$FUNC = FunctionDescriptor.of(JAVA_INT,
        ADDRESS,
        ADDRESS
    );
    static final MethodHandle SSL_CTX_use_certificate$MH = RuntimeHelper.downcallHandle(
        "SSL_CTX_use_certificate",
        constants$15.SSL_CTX_use_certificate$FUNC, false
    );
}

