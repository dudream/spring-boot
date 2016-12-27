package com.dudream;

import com.duduream.Application;
import com.duduream.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by dudream on 2016/12/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class HelloTest {

    @Autowired
    private HelloService helloService;

    @Test
    public void testHello() {
        helloService.sayHello();
    }

}
