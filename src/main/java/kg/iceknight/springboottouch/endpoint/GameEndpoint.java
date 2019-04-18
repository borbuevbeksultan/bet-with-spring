package kg.iceknight.springboottouch.endpoint;

import kg.iceknight.springboottouch.dto.GameStateDto;

public interface GameEndpoint {
    void update(GameStateDto gameStateDto);
}
