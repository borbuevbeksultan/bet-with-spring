package kg.iceknight.springboottouch.service.base;

public interface Reader<T> {
    T get(Long id);
}
