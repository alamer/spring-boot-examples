package ru.eq0.springbootexamples.webflux.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import ru.eq0.springbootexamples.webflux.dto.ClientInfo;

import java.text.MessageFormat;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Service
public class ClientInfoServiceImpl implements ClientInfoService {



    @Override
    public Flux<ClientInfo> getAllClientInfo(){

        final Stream<ClientInfo> clientInfoStream = IntStream.range(0, 10).mapToObj(x -> {
            final ClientInfo clientInfo = new ClientInfo();
            clientInfo.setEmail(MessageFormat.format("{0}@mail.ru", x));
            clientInfo.setCity(MessageFormat.format("city_id_{0}", x));
            clientInfo.setPhone(MessageFormat.format("phone_{0}", x));
            return clientInfo;
        });
        return Flux.fromStream(clientInfoStream);
    }
}
