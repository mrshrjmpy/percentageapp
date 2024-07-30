package com.amdocs.perc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PercentageController {

    @GetMapping("/percentage")
    public String calculatePercentage(@RequestParam double total, @RequestParam double part) {
        if (total == 0) {
            return "Total cannot be zero";
        }
        double percentage = (part / total) * 100;
        return "The percentage of " + part + " out of " + total + " is " + percentage + "%";
    }
}
