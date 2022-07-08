package neipclova.survey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaAuditing //시간에 대해서 자동으로 값을 넣어주는 기능
@SpringBootApplication
@EnableJpaRepositories("neipclova.survey.repository")
public class SurveyApplication {
	public static void main(String[] args) {
		SpringApplication.run(SurveyApplication.class, args);
		System.out.println("asdf");
	}

}
