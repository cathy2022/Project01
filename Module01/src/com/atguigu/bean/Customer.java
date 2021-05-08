package com.atguigu.bean;

import java.util.ArrayList;

public class Customer extends Person {

    private static int i;

    public static void main(String[] args) {
        //region Description
        System.out.println("hellomodule");

        System.out.println("helloworld");
        //endregion
        ArrayList list = new ArrayList();

        i = 10;

        list.add("hi");
        list.add("myworld");
        list.add(0, "test1");

        System.out.println("helloworld2");

        System.out.println(list);


    }

    public void eat() {

        System.out.println("eat");
    }

}
