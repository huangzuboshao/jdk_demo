package com.learn.bob.record;

/**
 * @author bob
 * @date 2022/10/8
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("1", "张三", 15);
        System.out.println(person);
        Person nullPerson = new Person();
        System.out.println(nullPerson);
    }
}
