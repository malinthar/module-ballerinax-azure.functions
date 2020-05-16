/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.ballerinax.azurefunctions;

import com.google.gson.JsonElement;
import org.wso2.ballerinalang.compiler.semantics.model.symbols.BVarSymbol;
import org.wso2.ballerinalang.compiler.tree.BLangFunction;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the Azure functions context.
 */
public class FunctionDeploymentContext {

    private static final String VAR_PREFIX = "v";

    public GlobalContext globalCtx;

    public BVarSymbol handlerParams;

    public List<ParameterHandler> parameterHandlers = new ArrayList<>();

    public ReturnHandler returnHandler;

    public JsonElement functionDefinition;
    
    public BLangFunction function;

    private int varCounter = 0;

    public String getNextVarName() {
        return VAR_PREFIX + (++varCounter);
    }
    
}
