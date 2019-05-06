package cn.fs.taobao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Service8001App {

    public static void main(String[] args) {
        SpringApplication.run(Service8001App.class);
    }
}
