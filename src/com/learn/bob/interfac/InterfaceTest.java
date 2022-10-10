package com.learn.bob.interfac;

import java.time.format.DateTimeFormatter;

/**
 * @author bob
 * @date 2022-10-08
 */
public interface InterfaceTest {
    /**
     * 来自java 8 新增
     */
    default void a() {
        System.out.println("来自接口default方法");
        b();
        d();
    }
    default void a1() {
        DateTimeFormatter.ofPattern("B");
        System.out.println("来自接口default方法");
        b();
        d();
    }

    static void b() {
        System.out.println("来自接口static方法");
        c();
    }
    static void b1() {
        System.out.println("来自接口static方法");
        c();
    }

    private static void c() {
        System.out.println("来自接口static private方法");
    }

    /**
     * 来自java 9 新增
     */
    private void d() {
        System.out.println("来自接口private方法");
    }

    public static void main(String[] args) {
        InterfaceTest obj = new InterfaceTest() {
        };
        obj.a();
        InterfaceTest.b();
    }

}
