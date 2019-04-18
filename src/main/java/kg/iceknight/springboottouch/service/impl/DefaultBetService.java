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
    public Bet makeBet(Game forGame, Line withLine, BigDecimal withAmount) {
        BigDecimal coefficient = withLine.getCoefficient();

        BigDecimal gain = coefficient.multiply(withAmount);
        Bet bet = new Bet();

        bet.setGain(gain);
        bet.setAmount(withAmount);
        bet.setLine(withLine);

        return betRepository.save(bet);
    }

    @Override
    public Bet get(Long id) {
        return betRepository.getOne(id);
    }

}
