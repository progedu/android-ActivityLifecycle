package com.example.android.lifecycle.util;

public class RecreateCounter {

    private static RecreateCounter ourInstance = new RecreateCounter();
    private int counter;

    public static RecreateCounter getInstance() {
        return ourInstance;
    }

    private RecreateCounter() {
        this.counter = 0;
    }

    public int getCount() {
        return this.counter;
    }

    public void increment() {
        counter++;
    }
}
