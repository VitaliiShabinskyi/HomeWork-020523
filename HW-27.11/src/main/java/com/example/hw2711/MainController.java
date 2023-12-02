package com.example.hw2711;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/")
public class MainController {

    private int count = 0;
    private final List<Integer> listCounts = new ArrayList<>();

    @GetMapping("/message")
    public String getRandomMessage() {
        String goAway = "мы вам не рады";
        String welcome = "добро пожаловать";

        Random random = new Random();

        return random.nextInt(2) == 1 ? welcome : goAway;
    }

    @GetMapping("/count")
    public void countIncrement() {
        count++;
    }

    @GetMapping("/info")
    public int getCount() {
        return count;
    }

    @GetMapping("/save-and-reset")
    public void saveAndReset() {
        listCounts.add(count);
        count = 0;
    }

    @GetMapping("/list")
    public List<Integer> getList() {
        return listCounts;
    }
}
