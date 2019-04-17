package kg.iceknight.springboottouch.repository;

import kg.iceknight.springboottouch.domain.Bet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BetRepository extends JpaRepository<Bet, Long> {
}
