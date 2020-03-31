package br.com.brazilcode.cb.report;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.com.brazilcode.cb.libs.repository")
@EntityScan(basePackages = "br.com.brazilcode.cb.libs.model")
public class CbReportServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CbReportServiceApplication.class, args);
	}

}
