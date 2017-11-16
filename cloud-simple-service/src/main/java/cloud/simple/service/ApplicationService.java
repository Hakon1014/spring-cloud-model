package cloud.simple.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zht
 * @date 2017/11/16 0016
 **/
@EnableAutoConfiguration
@SpringBootApplication
public class ApplicationService {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationService.class, args);
	}
}
