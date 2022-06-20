package com.example.javapractice.common.executor;

import java.util.concurrent.*;

public class ExecutorsExample {

    static class Task implements Callable<String> {

        @Override
        public String call() throws Exception {
            Thread.sleep(2000L);
            return Thread.currentThread() + " world";
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);

        Future<String> submit = service.submit(new Task());

        System.out.println(Thread.currentThread() + " hello");

        System.out.println(submit.get());

        service.shutdown();
    }

}