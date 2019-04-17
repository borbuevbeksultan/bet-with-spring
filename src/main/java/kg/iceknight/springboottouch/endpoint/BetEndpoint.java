package kg.iceknight.springboottouch.endpoint;

import kg.iceknight.springboottouch.dto.BettingDto;

public interface BetEndpoint {

    void makeBet(BettingDto bettingDto);

}
