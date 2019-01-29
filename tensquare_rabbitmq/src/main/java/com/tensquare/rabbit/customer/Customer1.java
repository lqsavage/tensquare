package com.tensquare.rabbit.customer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author "zhouhai"
 * @Date2019/1/2823:41
 **/
@Component
@RabbitListener(queues = "itcast")
public class Customer1 {

    @RabbitHandler
    public void getMsg(String msg) {
        System.out.println("直接模式消费消息:"+msg);
    }

}
