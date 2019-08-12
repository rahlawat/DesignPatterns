package com.vapasi.singleton;

public class DbSingleton {

    private static DbSingleton instance;

    private DbSingleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        } //to avoid reflection class from making a new instance
    }

    //lazy loading
    public static DbSingleton getInstance() {
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if(instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}


//synchronise