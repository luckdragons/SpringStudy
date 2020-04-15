package com.mystudy.config;

import com.mystudy.pojo.Dog;
import com.mystudy.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//相当于一个配置文件 applicationcontext.xml
@Configuration
public class ApplicationConfig {
    @Bean
    public Dog dog(){
        return new Dog("星星","哈士奇","黄色",person());
    }
    @Bean
    public Person person(){
        return new Person("红兵",19);
    }
    @Bean(name = "person1")
    public Person personBean(){
        return new Person("小李",20);
    }

}
