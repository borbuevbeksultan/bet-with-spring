package kg.iceknight.springboottouch.service.impl;

import kg.iceknight.springboottouch.domain.Game;
import kg.iceknight.springboottouch.repository.GameRepository;
import kg.iceknight.springboottouch.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultGameService implements GameService {

    private final GameRepository gameRepository;

    @Override
    public Game get(Long id) {
        return gameRepository.getOne(id);
    }

    @Override
    public void dispose(Game game) {
        gameRepository.delete(game);
    }

}
