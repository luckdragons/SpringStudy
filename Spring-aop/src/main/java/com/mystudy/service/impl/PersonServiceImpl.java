package com.mystudy.service.impl;

import com.mystudy.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;
@Service
public class PersonServiceImpl implements PersonService {


    @Override
    public void walk() {
        try {
            TimeUnit.SECONDS.sleep(3);
            System.out.println("人站立走路");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void singSong() {
        System.out.println("唱好听的歌");
    }

    @Override
    public void makeFriend() {
        System.out.println("交不同的朋友");
    }
}
