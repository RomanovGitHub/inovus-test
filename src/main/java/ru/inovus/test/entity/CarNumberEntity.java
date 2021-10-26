package ru.inovus.test.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "car_numbers")
@AllArgsConstructor
@Getter
@Setter
public class CarNumberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.PRIVATE)
    private Integer id;

    @Column(name = "first_letter")
    private String firstLetter;

    @Column(name = "second_letter")
    private String secondLetter;

    @Column(name = "third_letter")
    private String thirdLetter;

    @Column(name = "number")
    private int number;

    public CarNumberEntity() {
    }

}
