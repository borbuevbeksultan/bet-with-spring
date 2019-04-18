package kg.iceknight.springboottouch.service;

import kg.iceknight.springboottouch.domain.Bet;
import kg.iceknight.springboottouch.domain.Game;
import kg.iceknight.springboottouch.domain.Line;
import kg.iceknight.springboottouch.service.base.Reader;

import java.math.BigDecimal;

public interface BetService extends Reader<Bet> {

    Bet makeBet(Game forGame, Line withLine, BigDecimal withAmount);

}
