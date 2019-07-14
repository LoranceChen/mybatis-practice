package test.mybatis.intercept;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("test.mybatis.intercept.mapper")
public class InterceptTestApp {

    public static void main(String[] args) {
        SpringApplication.run(InterceptTestApp.class, args);

    }
}
