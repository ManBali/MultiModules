package com.jojo.base.basecomponent;

import java.util.HashMap;
import java.util.Map;

/**
 * ********************************************************************
 *
 * @author sufun
 * @version 1.40.12
 * @createtime 17/7/5
 * @description
 *
 * ********************************************************************
 */

public class ELPublicApiHelper {

    public static Map<Class<? extends ELModuleApi>,ELModuleApi> moduleApis=new HashMap<>();

    public static <T extends ELModuleApi> T getModuleApi(Class<T> tClass){
        if (tClass==null){
            return null;
        }
        ELModuleApi api=null;
        if (moduleApis.containsKey(tClass)){
            api=moduleApis.get(tClass);
        }
        return (T)api;
    }

    public static void register(Class<? extends  ELModuleApi> clazz,ELModuleApi api){
        if (moduleApis.containsKey(clazz)){
            return;
        }
        moduleApis.put(clazz,api);
    }

    public static void registerAll(Map<Class<? extends ELModuleApi>,ELModuleApi> allapi){
        if (allapi!=null){
            moduleApis.putAll(allapi);
        }
    }

    public static void unregister(Class<? extends ELModuleApi> clazz){
        if (moduleApis.containsKey(clazz)){
            moduleApis.remove(clazz);
        }
    }
}
