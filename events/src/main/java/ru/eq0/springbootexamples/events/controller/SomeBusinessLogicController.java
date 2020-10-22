package ru.eq0.springbootexamples.events.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.eq0.springbootexamples.events.service.SomeBusinessLogicService;

import java.math.BigInteger;

@RestController
@RequestMapping("api/v1/test")
public class SomeBusinessLogicController {

    private final SomeBusinessLogicService service;

    public SomeBusinessLogicController(SomeBusinessLogicService service) {
        this.service = service;
    }

    @GetMapping
    public void test() {
        service.test("Shutdown from business logic",20);
    }

    @GetMapping("/message/{message}")
    public void stringEvent(@PathVariable String message) {
        service.hello(message);
    }

    @GetMapping("/number/{number}")
    public void bigIntegerEvent(@PathVariable BigInteger number) {
        service.hello(number);
    }
}
