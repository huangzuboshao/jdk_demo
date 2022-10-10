package com.learn.bob.str;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import java.time.LocalDate;
import java.util.List;

/**
 * @author bob
 * @date 2022-10-08
 */
public class StrTest {
    public static void main(String[] args) throws RuntimeException {
        testString();
    }

    private static void testString() {
        var a = 20;
        int c = 40;
        Integer d = 50;
        String str = """
                这是一段文本
                可以换行的
                来自jdk版本15 Text Blocks
                """;
        List<String> list = List.of("元素1", "元素2", "list.of方式创建的元素3", "list.of方式创建的元素4");
        list.add("加一个元素会报错");
        // JEP 420 测试instance of
        try {
            Constructor<?>[] strConstructors = String.class.getConstructors();
            Object o = strConstructors[9].newInstance("测试 instanceof");
            if (o instanceof String str2) {
                System.out.println(str2);
            }
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public void openFile() throws IOException {
        // jdk8
        try (FileOutputStream fos = new FileOutputStream(new File("aaa.txt")); FileInputStream fis = new FileInputStream("")) {
            FileChannel channel = fos.getChannel();
        } catch (Exception e) {
        }

        //jdk9+ 改进的try with resource
        FileWriter fw = new FileWriter(new File("aaa.txt"));
        FileInputStream fis2 = new FileInputStream("");
        try (fw; fis2) {
        } catch (Exception e) {
        }
    }

    /**
     * @param o
     * @return
     */
    private String switchTest(Object o) {
        int numLetters = switch (LocalDate.now().getDayOfWeek()) {
            case MONDAY -> 1;
            case TUESDAY -> 2;
            default -> 0;
        };
        // JEP 420
        return switch (o) {
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            default -> o.toString();
        };
    }

    /**
     * The following code shows how to use {@code Optional.isPresent}:
     * {@snippet :
     *  if (v.isPresent()) {
     *      System.out.println("v: " + v.get());
     *  }
     *}
     */
    private void docTest() {
    }

    /**
     * The following code shows how to use {@code Optional.isPresent}:
     * {@snippet file = "StrTest.java" region = "switchTest"}
     */
    private void docTest2() {
    }
}
