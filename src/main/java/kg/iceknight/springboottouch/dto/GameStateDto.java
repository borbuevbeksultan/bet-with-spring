package kg.iceknight.springboottouch.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameStateDto {
    private Long gameid;
    private Object[] params;
}
