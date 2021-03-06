/**
 *  Copyright 2020 The ModiTect authors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

import org.moditect.layrry.platform.PluginLifecycleListener;

import com.example.greeter.api.GreeterFactory;
import com.example.greeter.app.internal.GreeterPluginLifecycleListener;

module com.example.greeter.core {
    requires org.moditect.layrry.platform;
    exports com.example.greeter.api;
    exports com.example.greeter.app;
    provides PluginLifecycleListener with GreeterPluginLifecycleListener;
    uses GreeterFactory;
}
