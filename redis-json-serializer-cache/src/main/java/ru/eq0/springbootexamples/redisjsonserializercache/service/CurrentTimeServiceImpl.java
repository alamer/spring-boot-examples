package ru.eq0.springbootexamples.redisjsonserializercache.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.eq0.springbootexamples.redisjsonserializercache.dto.CurrentTimeDto;

import java.time.LocalDateTime;

@Service
@Primary
public class CurrentTimeServiceImpl implements CurrentTimeService {

    @Override
    public CurrentTimeDto currentTime() {
        return CurrentTimeDto.builder().currentTime(LocalDateTime.now()).build();
    }
}
