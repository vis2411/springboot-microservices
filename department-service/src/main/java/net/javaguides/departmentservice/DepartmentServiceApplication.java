package net.javaguides.departmentservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
@OpenAPIDefinition(
		info = @Info(
				title = "Department Service REST APIs",
				description = "Department Service Documentation",
				version = "V1.0",
				contact = @Contact(
						name = "vishwa",
						email = "vishwa@gmail.com"
				)

		)
)
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
