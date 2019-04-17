package kg.iceknight.springboottouch.controller;

import kg.iceknight.springboottouch.dto.BettingDto;
import kg.iceknight.springboottouch.endpoint.BetEndpoint;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/bets")
public class BetController {

    private final BetEndpoint betEndpoint;

    @PostMapping
    public void makeBet(@RequestBody BettingDto bettingDto) {
        betEndpoint.makeBet(bettingDto);
    }

}
