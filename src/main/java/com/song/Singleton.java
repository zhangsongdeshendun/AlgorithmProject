package com.song;

/**
 * 包含所有的单例模式设计
 */
public class Singleton {

    /******************************************************************/
    //饿汉模式 线程安全的
//    private final static Singleton instance = new Singleton();
//
//    private Singleton() {
//    }
//
//    public static Singleton getInstance() {
//        return instance;
//    }

    /******************************************************************/
    //懒汉模式 线程不安全的
//    private static Singleton instance = null;
//
//    private Singleton() {
//
//    }
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
    /******************************************************************/
    //懒汉模式线程安全的 小龙不高
    private static Singleton instance = null;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    /******************************************************************/



    public static void main(String[] args) {
        System.out.println(Singleton.getInstance() == Singleton.getInstance());
    }


}
