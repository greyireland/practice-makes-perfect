package com.finalx.basic;

/**
 * Created by tengyu on 2016/7/11.
 */
public class Single {
    private static Single ourInstance = new Single();

    public static Single getInstance() {
        return ourInstance;
    }

    private Single() {
    }
    public void hello(){
        System.out.print("hello,world,single test");
    }
}
