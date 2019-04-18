package kg.iceknight.springboottouch.service;

import kg.iceknight.springboottouch.dto.Message;

public interface MailService {
    void send(Message message);
}
