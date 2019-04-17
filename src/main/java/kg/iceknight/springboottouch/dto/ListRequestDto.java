package kg.iceknight.springboottouch.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListRequestDto {
    private Integer limit;

    private Integer page;

    private String sort;
}
