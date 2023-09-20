package com.by;

import com.by.web.InitProject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author 白也
 * @date 2023/9/20 16:00
 * @title com.by 启动类
 */

@SpringBootApplication
@EnableConfigurationProperties({InitProject.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
