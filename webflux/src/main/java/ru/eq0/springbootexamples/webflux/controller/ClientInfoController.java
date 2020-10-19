package ru.eq0.springbootexamples.webflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ru.eq0.springbootexamples.webflux.dto.ClientInfo;
import ru.eq0.springbootexamples.webflux.service.ClientInfoService;

@RestController
@RequestMapping("/api/v1/client-info")
public class ClientInfoController {


    private final ClientInfoService clientInfoService;

    public ClientInfoController(ClientInfoService clientInfoService) {
        this.clientInfoService = clientInfoService;
    }

    @GetMapping
    public Flux<ClientInfo> getAllClients(){
        return clientInfoService.getAllClientInfo();
    }



}
