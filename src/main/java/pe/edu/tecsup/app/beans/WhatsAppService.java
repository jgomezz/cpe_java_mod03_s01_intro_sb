package pe.edu.tecsup.app.beans;

import org.springframework.stereotype.Component;

@Component
public class WhatsAppService implements Message {

    @Override
    public void send(String mensaje) {
        System.out.println("[WhatsApp] -> " + mensaje);
    }
}
