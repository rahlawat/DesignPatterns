package com.vapasi.observer;

public interface Observable {
    public void subscribe(Observer observeer);
    public void unsubscribe(Observer observeer);
}
