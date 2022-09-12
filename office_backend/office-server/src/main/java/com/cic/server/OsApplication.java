package com.cic.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author zfr
 * @version 1.0
 */
@SpringBootApplication
//扫描注册的mapper接口
@MapperScan("com.cic.server.mapper")
//@EnableScheduling
public class OsApplication {
    public static void main(String[] args) {
        SpringApplication.run(OsApplication.class, args);
    }
}
