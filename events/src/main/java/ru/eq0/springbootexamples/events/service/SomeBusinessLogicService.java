package ru.eq0.springbootexamples.events.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import ru.eq0.springbootexamples.events.event.AnotherGenericEvent;
import ru.eq0.springbootexamples.events.event.GenericEvent;
import ru.eq0.springbootexamples.events.event.ShutdownEvent;

import java.math.BigInteger;

@Service
public class SomeBusinessLogicService {
    private final ApplicationEventPublisher applicationEventPublisher;

    public SomeBusinessLogicService(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }


    public void test(String message, int code) {
        ShutdownEvent event = new ShutdownEvent(this, code, message);
        applicationEventPublisher.publishEvent(event);
    }


    public void hello(String hello) {
        applicationEventPublisher.publishEvent(new GenericEvent<>(hello));
        applicationEventPublisher.publishEvent(new AnotherGenericEvent<>(this, hello));

    }

    public void hello(BigInteger bigInteger) {
        applicationEventPublisher.publishEvent(new GenericEvent<>(bigInteger));

    }
}
