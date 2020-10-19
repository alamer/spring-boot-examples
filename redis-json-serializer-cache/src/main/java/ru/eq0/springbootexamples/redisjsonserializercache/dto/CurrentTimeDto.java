package ru.eq0.springbootexamples.redisjsonserializercache.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CurrentTimeDto {

    LocalDateTime currentTime;
}
