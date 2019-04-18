package kg.iceknight.springboottouch.listener;

import kg.iceknight.springboottouch.dto.GameStateDto;
import kg.iceknight.springboottouch.endpoint.GameEndpoint;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GameStateListener {

    private final GameEndpoint gameEndpoint;

    public void update(GameStateDto gameStateDto) {
        gameEndpoint.update(gameStateDto);
    }

}
