package com.jojo.mainapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.jojo.base.basecomponent.ELModuleApi;
import com.jojo.base.basecomponent.ELPublicApi;
import com.jojo.coreapp.AbActivity;

import java.util.HashMap;
import java.util.Map;

/**
 * ********************************************************************
 *
 * @author sufun
 * @version 1.40.12
 * @createtime 17/7/6
 * @description ********************************************************************
 */

public class ModuleInvokeActivity extends AbActivity implements ELPublicApi.AddressApi {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_invoke_act);
        findViewById(R.id.id_invoke).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public Map<Class<? extends ELModuleApi>, ELModuleApi> getModuleApi() {
        Map<Class<? extends ELModuleApi>,ELModuleApi> map=new HashMap<>();
        map.put(ModuleInvokeActivity.class,ModuleInvokeActivity.this);
        return map;
    }

    @Override
    public void showAddresses() {

    }

    @Override
    public void addressUpdate(String js_data) {

    }

    @Override
    public void addAddress() {

    }
}
