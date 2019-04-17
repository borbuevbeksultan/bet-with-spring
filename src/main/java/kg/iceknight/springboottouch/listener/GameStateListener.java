package kg.iceknight.springboottouch.listener;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameStateListener {



    @PostMapping
    public void updateLines(Object gameStateDto) {

    }

}
