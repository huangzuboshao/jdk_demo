package com.learn.bob.virtualthread;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * @author bob
 * @date 2022/10/8
 */
public class VirtualThreadTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();
        IntStream.range(0, 1000000).forEach(i-> {
            executorService.submit(()->{
                Thread.sleep(Duration.ofSeconds(1));
                System.out.println(i);
                return i;
            });
        });
        executorService.close();
    }
}
