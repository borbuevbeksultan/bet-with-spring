package kg.iceknight.springboottouch.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

}
