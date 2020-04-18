package com.mystudy.service.impl;

import com.mystudy.service.DogService;

import java.util.concurrent.TimeUnit;

public class DogServiceImpl implements DogService {
    @Override
    public void bark() {
        try {
            TimeUnit.SECONDS.sleep(3);
            System.out.println("汪汪叫");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void runingFast() {
        System.out.println("跑的快");
    }

    @Override
    public void shakeTail() {
        System.out.println("摇尾巴");
    }
}
