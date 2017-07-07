package com.jojo.coreapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import com.jojo.base.basecomponent.ELModuleApi;
import com.jojo.base.basecomponent.ELPublicApiHelper;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ********************************************************************
 *
 * @author sufun
 * @version 1.40.12
 * @createtime 17/7/6
 * @description
 *
 * ********************************************************************
 */

public abstract class AbActivity extends FragmentActivity {

    //Map<Class<? extends >>

    Map<Class<? extends ELModuleApi>,ELModuleApi> map;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //初始化进程间的服务
        if (map==null){
            map=getModuleApi();
        }
        if (map!=null&&!map.isEmpty()){
            ELPublicApiHelper.registerAll(map);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //注销这个服务
        if (map==null){
            map=getModuleApi();
        }
        if (map!=null&&!map.isEmpty()){
            Set<Class<? extends ELModuleApi>> keyset=map.keySet();
            Iterator<Class<? extends ELModuleApi>> iterator=keyset.iterator();
            while (iterator.hasNext()){
                ELPublicApiHelper.unregister(iterator.next());
            }
        }

    }

    public abstract Map<Class<? extends ELModuleApi>,ELModuleApi> getModuleApi();
}
