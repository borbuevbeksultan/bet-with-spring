package kg.iceknight.springboottouch.service;

import kg.iceknight.springboottouch.domain.Game;
import kg.iceknight.springboottouch.service.base.Reader;

public interface GameService extends Reader<Game> {
    void dispose(Game game);
}
