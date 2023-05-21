package in.mubarak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplic
@RestController
public class SpringbokMailAppApplication {

	@GetMapping
	public String getMess(){
		return "Welcome to automated pipelines in jenkins for second onces";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbokMailAppApplication.class, args);
	}

}
