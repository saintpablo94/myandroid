package org.androidtown.myintent;

import java.io.Serializable;

/**
 * Created by pablo94 on 2016-01-10.
 */
public class Person implements Serializable{

    String name = null;
    int age = 0 ;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
