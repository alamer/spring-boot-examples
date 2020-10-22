package ru.eq0.springbootexamples.events.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import ru.eq0.springbootexamples.events.event.GenericEvent;

import java.math.BigInteger;

@Component
public class GenericEventListener {

    @EventListener
    public void listenString(GenericEvent<String> stringEvent) {
        System.out.println("Generic event with string: " + stringEvent.getObj());
    }


    @EventListener
    public void listenBigInteger(GenericEvent<BigInteger> bigIntegerGenericEvent) {
        System.out.println("Generic event with BigInteger: " + bigIntegerGenericEvent.getObj());
    }
}
