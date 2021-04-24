package com.pattern.hfdp.adapter;

import com.pattern.hfdp.adapter.entity.Duck;
import com.pattern.hfdp.adapter.entity.Turkey;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quick() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i<5; i++) {
            turkey.fly();
        }
    }
}
