package online.qsx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class LoginMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginMybatisApplication.class, args);
	}
}
