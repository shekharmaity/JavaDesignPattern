package com.pattern.hfdp.adapter;

import com.pattern.hfdp.adapter.entity.Duck;
import com.pattern.hfdp.adapter.entity.MallardDuck;
import com.pattern.hfdp.adapter.entity.WildTurkey;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck mDuck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("the turkey says....");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n The Duck says...");
        testDuck(mDuck);

        System.out.println("\nThe Turkey says....");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quick();
        duck.fly();
    }
}
