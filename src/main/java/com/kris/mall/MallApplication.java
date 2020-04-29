package com.kris.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author KRIS
 * @email 2449207463@qq.com
 * @link https://github.com/newbee-ltd
 */
@MapperScan("com.kris.mall.dao")
@SpringBootApplication
public class MallApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallApplication.class, args);
    }
}
