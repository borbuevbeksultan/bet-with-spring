package kg.iceknight.springboottouch.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {
    public Object[] recipients;
    public String body;
}
