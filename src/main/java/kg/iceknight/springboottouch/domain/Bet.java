package kg.iceknight.springboottouch.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Setter
@Getter

@Entity
@Table(name = "bets")
public class Bet {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "amount")
    private BigDecimal amount;
}
