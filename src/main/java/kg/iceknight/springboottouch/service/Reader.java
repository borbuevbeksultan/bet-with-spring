package kg.iceknight.springboottouch.service;

public interface Reader<T> {
    T get(Long id);
}
