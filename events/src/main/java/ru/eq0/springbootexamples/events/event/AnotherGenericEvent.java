package ru.eq0.springbootexamples.events.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class AnotherGenericEvent<T> extends ApplicationEvent {


    private final T obj;

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public AnotherGenericEvent(Object source, T obj) {
        super(source);
        this.obj=obj;
    }
}
