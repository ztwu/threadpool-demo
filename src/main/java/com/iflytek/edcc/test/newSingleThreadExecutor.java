package com.iflytek.edcc.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * created with idea
 * user:ztwu
 * date:2019/5/23
 * description
 */
public class newSingleThreadExecutor {

    public static void main(String[] args) {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            singleThreadExecutor.execute(new Runnable() {
                public void run() {
                    try {
                        System.out.println(index);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

}
