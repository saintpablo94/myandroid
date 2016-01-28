package com.example.nhnent.mylist;

/**
 * Created by nhnent on 2016. 1. 27..
 */
public class SingerItem {

    String name;
    String age;

    public SingerItem() {
    }

    public SingerItem(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
