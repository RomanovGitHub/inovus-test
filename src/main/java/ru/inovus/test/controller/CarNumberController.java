package ru.inovus.test.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.inovus.test.service.CarNumberService;

@RestController
@RequestMapping("/number")
@AllArgsConstructor
public class CarNumberController {

    private final CarNumberService service;


    @GetMapping(value = "/random")
    public String random() {
        return service.nextRandom();
    }

    @GetMapping(value = "/next")
    public String next() {
        return service.nextNumber();
    }

}
