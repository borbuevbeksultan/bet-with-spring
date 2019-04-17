package kg.iceknight.springboottouch.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Setter
@Getter

@Entity
@Table(name = "lines")
public class Line {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "game")
    private Game game;

    @Column(name = "coefficient")
    private BigDecimal coefficient;

}
