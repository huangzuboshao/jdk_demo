package com.learn.bob.record;

/**
 * 声明类示例
 *
 * @param id
 * @param name
 * @param age
 * @since Java 14
 */
public record Person(String id, String name, int age) {
    public Person() {
        this(null, null, 0);
    }

   /* @Override
    public String toString() {
        return String.format("id:%s,name:%s,age:%s", id, name, age);
    }*/
}
