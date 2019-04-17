package kg.iceknight.springboottouch.service.impl;

import kg.iceknight.springboottouch.domain.Bet;
import kg.iceknight.springboottouch.domain.Game;
import kg.iceknight.springboottouch.domain.Line;
import kg.iceknight.springboottouch.repository.BetRepository;
import kg.iceknight.springboottouch.service.BetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class DefaultBetService implements BetService {

    private final BetRepository betRepository;

    @Override
    public Bet madeBet(Game forGame, Line withLine, BigDecimal withAmount) {
        return null;
    }

    @Override
    public Bet get(Long id) {
        return betRepository.getOne(id);
    }

}
