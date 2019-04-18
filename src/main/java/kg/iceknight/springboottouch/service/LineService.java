package kg.iceknight.springboottouch.service;

import kg.iceknight.springboottouch.domain.Game;
import kg.iceknight.springboottouch.domain.Line;

import java.util.List;

public interface LineService extends Reader<Line> {
    List<Line> getByGame(Game game);
}
