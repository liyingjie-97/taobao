package cn.fs.taobao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy//启动路由
public class Zuul9527App {

    public static void main(String[] args) {
        SpringApplication.run(Zuul9527App.class);
    }
}
