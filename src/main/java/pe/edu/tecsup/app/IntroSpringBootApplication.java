package pe.edu.tecsup.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroSpringBootApplication  implements CommandLineRunner {

    private static Logger log = LoggerFactory.getLogger(IntroSpringBootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(IntroSpringBootApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        log.info("Hola mundo desde Spring Boot");
    }
}
