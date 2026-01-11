package pe.edu.tecsup.app.beans;

import org.springframework.stereotype.Component;

@Component
public class EmailService {

    public void sendEmail(String mensaje) {
        System.out.println(mensaje);
    }

}
