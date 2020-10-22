package ru.eq0.springbootexamples.events.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;


@Getter
public class ShutdownEvent extends ApplicationEvent {

    private final String message;
    private final int code;

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     * @param code
     */
    public ShutdownEvent(Object source, int code, String message) {
        super(source);
        this.code = code;
        this.message = message;
    }
}
