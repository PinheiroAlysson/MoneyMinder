package br.com.fiap.moneyminder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class MoneyminderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyminderApplication.class, args);
	}

	@RequestMapping("/home")
	@ResponseBody
	public String home(){
		return "ooii";
	}

}
