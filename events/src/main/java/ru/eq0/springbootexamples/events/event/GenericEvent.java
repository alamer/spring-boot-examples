package ru.eq0.springbootexamples.events.event;

import lombok.Getter;
import org.springframework.core.ResolvableType;
import org.springframework.core.ResolvableTypeProvider;

@Getter
public class GenericEvent<T> implements ResolvableTypeProvider {


    T obj;


    public GenericEvent(T obj) {
        this.obj = obj;
    }

    @Override
    public ResolvableType getResolvableType() {
        return ResolvableType.forClassWithGenerics(
                getClass(),
                ResolvableType.forInstance(this.obj)
        );
    }
}
