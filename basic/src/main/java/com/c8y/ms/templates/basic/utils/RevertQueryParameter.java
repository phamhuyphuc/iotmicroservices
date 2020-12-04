package com.c8y.ms.templates.basic.utils;

import com.cumulocity.sdk.client.Param;
import com.cumulocity.sdk.client.QueryParam;

public class RevertQueryParameter extends QueryParam {
    private static final Param REVERT_PARAM = new Param() {
        @Override
        public java.lang.String getName() {
            return "revert";
        }
    };

    public RevertQueryParameter() {
        super(REVERT_PARAM, "true");
    }
}