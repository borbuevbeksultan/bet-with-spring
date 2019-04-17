package kg.iceknight.springboottouch.service.impl;

import kg.iceknight.springboottouch.domain.Line;
import kg.iceknight.springboottouch.repository.LineRepository;
import kg.iceknight.springboottouch.service.LineService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultLineService implements LineService {

    private final LineRepository lineRepository;

    @Override

    public Line get(Long id) {
        return lineRepository.getOne(id);
    }

}
