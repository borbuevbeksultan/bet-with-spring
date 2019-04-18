package kg.iceknight.springboottouch.service.impl;

import kg.iceknight.springboottouch.dto.Message;
import kg.iceknight.springboottouch.service.MailService;
import org.springframework.stereotype.Service;

@Service
public class DefaultMailService implements MailService {

    @Override
    public void send(Message message) {
        //send
    }

}
