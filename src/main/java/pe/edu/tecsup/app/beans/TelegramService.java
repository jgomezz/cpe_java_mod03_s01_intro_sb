package pe.edu.tecsup.app.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TelegramService implements Message {
    @Override
    public void send(String mensaje) {
        System.out.println("[Telegram] -> " + mensaje);
    }
}
