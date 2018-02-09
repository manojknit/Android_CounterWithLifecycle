package com.cloudjibe.counterwithlifecycle;

/**
 * Created by mk194903 on 2/8/18.
 */

public class BaseApplicationClass extends android.app.Application {
    private int counterVar;

    public int getCounterVar() {
        return counterVar;
    }

    public void setIncrementCounterVar() {
        this.counterVar = this.counterVar + 1;
    }
}
