package ru.eq0.springbootexamples.redisjsonserializercache.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.eq0.springbootexamples.redisjsonserializercache.dto.CurrentTimeDto;
import ru.eq0.springbootexamples.redisjsonserializercache.service.CurrentTimeService;

@RestController
@RequestMapping("/api/v1/time")
public class CurrentTimeController {

    private final CurrentTimeService currentTimeService;
    private final CurrentTimeService currentTimeCachedService;

    public CurrentTimeController(CurrentTimeService currentTimeService,@Qualifier("currentTimeServiceCacheable") CurrentTimeService currentTimeCachedService) {
        this.currentTimeService = currentTimeService;
        this.currentTimeCachedService = currentTimeCachedService;
    }

    @GetMapping
    public CurrentTimeDto currentTime(){
        return currentTimeService.currentTime();
    }

    @GetMapping("cached")
    public CurrentTimeDto cachedCurrentTime(){
        return currentTimeCachedService.currentTime();
    }
}
