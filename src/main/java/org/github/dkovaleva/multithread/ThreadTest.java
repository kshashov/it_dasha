package org.github.dkovaleva.multithread;

import java.util.ArrayList;
import java.util.List;

public class ThreadTest {

    public static void main(String[] args) {

        new Thread(() -> {

        }).start();

        runMultipleThreads();

    }

    private static void runMultipleThreads() {
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int finalI = i;
            Thread th = new Thread(() -> {
                System.out.println("thread: " + finalI);
            });
            threads.add(th);
        }

        threads.forEach(th -> th.start());
    }
}
