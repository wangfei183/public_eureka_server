package com.example.public_eureka_server;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 王飞
 * @Date: 2020/10/29/15:24
 * @Description:
 */
@RestController
public class RedisTest {


//    TimeUnit.DAYS          //天
//    TimeUnit.HOURS         //小时
//    TimeUnit.MINUTES       //分钟
//    TimeUnit.SECONDS       //秒
//    TimeUnit.MILLISECONDS  //毫秒 
//    TimeUnit.NANOSECONDS   //毫微秒
//    TimeUnit.MICROSECONDS  //微秒

    @Resource
    private RedisTemplate redisTemplate;
    @RequestMapping("aa")
    public void aa(){
        redisTemplate.opsForValue().set("wf123","12312",60, TimeUnit.SECONDS);
    }
    @RequestMapping("bb")
    public void bb(){

        System.out.println(redisTemplate.opsForValue().get("wf123"));

    }
}
