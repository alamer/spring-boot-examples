package ru.eq0.springbootexamples.webflux.service;

import reactor.core.publisher.Flux;
import ru.eq0.springbootexamples.webflux.dto.ClientInfo;

public interface ClientInfoService {
    Flux<ClientInfo> getAllClientInfo();
}
