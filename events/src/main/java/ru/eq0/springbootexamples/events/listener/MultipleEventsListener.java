package ru.eq0.springbootexamples.events.listener;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MultipleEventsListener {

    @EventListener(classes = {ContextRefreshedEvent.class, ContextStartedEvent.class})
    public void listenMultipleEvents() {
        System.out.println("Multiple events listener");
    }
}
