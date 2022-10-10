package com.learn.bob.sealed;

/**
 * @author bob
 * @date 2022/10/8
 */
public sealed class Pear implements Fruit permits GoldPear, PerfumePear {
}
