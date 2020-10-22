package ru.eq0.springbootexamples.events.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import ru.eq0.springbootexamples.events.event.ShutdownEvent;

@Component
public class ShutdownEventListener  {

    final
    ApplicationContext applicationContext;

    public ShutdownEventListener(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @EventListener
    public void onApplicationEvent(ShutdownEvent event) {
        System.out.println(event.getMessage());
        SpringApplication.exit(applicationContext, event::getCode);
    }
}
