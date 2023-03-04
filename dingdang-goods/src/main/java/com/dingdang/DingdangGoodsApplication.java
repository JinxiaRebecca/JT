package com.dingdang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("src/main/java/com/dingdang/product/mapper")
@SpringBootApplication
@EnableDiscoveryClient
public class DingdangGoodsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DingdangGoodsApplication.class, args);
	}

}
