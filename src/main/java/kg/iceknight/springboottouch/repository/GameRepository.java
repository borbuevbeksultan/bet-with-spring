package kg.iceknight.springboottouch.repository;

import kg.iceknight.springboottouch.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
