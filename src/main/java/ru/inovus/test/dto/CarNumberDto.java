package ru.inovus.test.dto;

import lombok.*;

import java.util.function.BiPredicate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CarNumberDto {

    private static final String REGION = "116 RUS";
    private String firstLetter;
    private String secondLetter;
    private String thirdLetter;
    private int number;

    private String addZero(int num) {
        return String.format("%03d", num);
    }

    @Override
    public String toString() {
        return firstLetter + addZero(number) + secondLetter + thirdLetter + " " + REGION;
    }

}
