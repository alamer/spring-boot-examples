package ru.eq0.springbootexamples.redisjsonserializercache.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import ru.eq0.springbootexamples.redisjsonserializercache.dto.CurrentTimeDto;

@Service
@Qualifier("currentTimeServiceCacheable")
public class CurrentTimeServiceCacheableImpl implements CurrentTimeService {


    private final CurrentTimeService timeService;

    public CurrentTimeServiceCacheableImpl(CurrentTimeService timeService) {
        this.timeService = timeService;
    }

    @Override
    @Cacheable(cacheNames = "currentTimeCache",
            cacheManager = "defaultCacheManager")
    public CurrentTimeDto currentTime() {
        return timeService.currentTime();
    }
}
