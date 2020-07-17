package com.sbt.jscool.homework5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class BeanUtils {
    /**
     * Scans object "from" for all getters. If object "to"
     * contains correspondent setter, it will invoke it
     * to set property value for "to" which equals to the property
     * of "from".
     * <p/>
     * The type in setter should be compatible to the value returned
     * by getter (if not, no invocation performed).
     * Compatible means that parameter type in setter should
     * be the same or be superclass of the return type of the getter.
     * <p/>
     * The method takes care only about public methods.
     *
     * @param to   Object which properties will be set.
     * @param from Object which properties will be used to get values.
     */
    public static void assign(Object to, Object from) throws InvocationTargetException, IllegalAccessException {
        Class fromClass = from.getClass();
        Class toClass = to.getClass();

        ArrayList<Method> getters = getGetters(fromClass.getMethods());
        ArrayList<Method> setters = getSetters(toClass.getMethods());
        for (var f:getters){
            for (var t:setters){
                if (f.getName().substring(3).equals(t.getName().substring(3))
                    && f.getReturnType().equals(t.getParameterTypes()[0])){
                    Object returnVal = t.invoke(to, f.invoke(from));
                }

            }
        }

    }

    public static ArrayList<Method> getGetters(Method[] methods){
        ArrayList<Method> getters = new ArrayList<>();
        for(var m:methods){
            if (m.getName().startsWith("get")
                    && m.getParameterCount()==0
                    && !m.getReturnType().equals(void.class))
                getters.add(m);
        }
        return getters;
    }

    public static ArrayList<Method> getSetters(Method[] methods){
        ArrayList<Method> setters = new ArrayList<>();
        for (var m:
             methods) {
            if(m.getName().startsWith("set") && m.getParameterCount()==1)
                setters.add(m);
        }
        return setters;
    }

}
