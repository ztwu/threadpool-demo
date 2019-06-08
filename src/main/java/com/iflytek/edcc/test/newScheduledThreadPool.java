package com.iflytek.edcc.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * created with idea
 * user:ztwu
 * date:2019/5/23
 * description
 */
public class newScheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println("delay 1 seconds, and excute every 3 seconds");
            }
        }, 1, 3, TimeUnit.SECONDS);
    }
}
