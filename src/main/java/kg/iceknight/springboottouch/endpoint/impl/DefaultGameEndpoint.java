package kg.iceknight.springboottouch.endpoint.impl;

import kg.iceknight.springboottouch.annotation.Endpoint;
import kg.iceknight.springboottouch.domain.Game;
import kg.iceknight.springboottouch.dto.GameStateDto;
import kg.iceknight.springboottouch.dto.Message;
import kg.iceknight.springboottouch.endpoint.GameEndpoint;
import kg.iceknight.springboottouch.service.GameService;
import kg.iceknight.springboottouch.service.LineService;
import kg.iceknight.springboottouch.service.MailService;
import lombok.RequiredArgsConstructor;

@Endpoint
@RequiredArgsConstructor
public class DefaultGameEndpoint implements GameEndpoint {

    private final GameService gameService;
    private final LineService lineService;
    private final MailService mailService;

    @Override
    public void update(GameStateDto gameStateDto) {
        Game game = gameService.get(gameStateDto.getGameid());

        lineService.getByGame(game);
        gameService.dispose(game);

        Message message = new Message();
        message.setBody("You are winner!!!");

        mailService.send(message);
    }

}
