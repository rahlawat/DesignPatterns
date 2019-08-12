package com.vapasi.singleton;

public class DbSingletonDemo {

    public static void main(String[] args){
        DbSingleton singleton = DbSingleton.getInstance();

//        DbSingleton constructor = new DbSingleton();

        System.out.println(singleton);

        DbSingleton singleton2 = DbSingleton.getInstance();

        System.out.println(singleton2);
    }
}
