package cn.fs.taobao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer//启用配置服务端
public class Config8848App {

    public static void main(String[] args) {
        SpringApplication.run(Config8848App.class);
    }
}
