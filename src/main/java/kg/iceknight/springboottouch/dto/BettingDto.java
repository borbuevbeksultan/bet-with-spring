package kg.iceknight.springboottouch.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@Getter
@Setter
public class BettingDto {

    @NotNull
    public Long gameId;

    @NotNull
    public Long lineId;

    @NotNull
    @Positive
    public BigDecimal amount;

}
