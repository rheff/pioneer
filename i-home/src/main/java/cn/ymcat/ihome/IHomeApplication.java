package cn.ymcat.ihome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 86152
 */
@SpringBootApplication
@MapperScan("cn.ymcat.ihome.mapper")
public class IHomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(IHomeApplication.class, args);
    }

}
