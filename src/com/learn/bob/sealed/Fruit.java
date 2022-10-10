package com.learn.bob.sealed;

/**
 * 密封类示例
 * @author bob
 * @date 2022/10/8
 */
public sealed interface Fruit permits Apple,Pear {
}
