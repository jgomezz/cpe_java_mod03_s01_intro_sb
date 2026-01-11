package pe.edu.tecsup.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.tecsup.app.beans.EmailService;
import pe.edu.tecsup.app.beans.Message;

@SpringBootApplication
public class IntroSpringBootApplication  implements CommandLineRunner {

    @Autowired
    private EmailService emailService;

    @Autowired
    private Message message;


    private static Logger log = LoggerFactory.getLogger(IntroSpringBootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(IntroSpringBootApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        // log.info("Hola mundo desde Spring Boot");
        emailService.sendEmail("Hola mundo");

        //
        message.send("Hola Munddo");

    }
}
