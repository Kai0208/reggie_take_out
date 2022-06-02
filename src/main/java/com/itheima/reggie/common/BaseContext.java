package com.itheima.reggie.common;

public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrenctId(long id) {
        threadLocal.set(id);
    }

    public static Long getCurrenctId(){
        return threadLocal.get();
    }
}
