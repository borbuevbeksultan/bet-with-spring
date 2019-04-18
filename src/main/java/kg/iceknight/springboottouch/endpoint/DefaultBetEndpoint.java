package kg.iceknight.springboottouch.endpoint;

import kg.iceknight.springboottouch.annotation.Endpoint;
import kg.iceknight.springboottouch.domain.Game;
import kg.iceknight.springboottouch.domain.Line;
import kg.iceknight.springboottouch.dto.BettingDto;
import kg.iceknight.springboottouch.service.BetService;
import kg.iceknight.springboottouch.service.GameService;
import kg.iceknight.springboottouch.service.LineService;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import java.math.BigDecimal;

@Endpoint
@RequiredArgsConstructor
public class DefaultBetEndpoint implements BetEndpoint {

    private final BetService betService;
    private final LineService lineService;
    private final GameService gameService;

    @Override
    @Transactional
    public void makeBet(@Valid BettingDto bettingDto) {
        Long gameId = bettingDto.getGameId();
        BigDecimal amount = bettingDto.getAmount();
        Long lineId = bettingDto.getLineId();

        Line line = lineService.get(lineId);
        Game game = gameService.get(gameId);

        betService.makeBet(game, line, amount);
    }

}
