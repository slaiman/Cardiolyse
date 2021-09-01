package com.CardiolyseTest.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/cardiolyse")
public class ReverseController {

    @RequestMapping(path = "/reverse", produces = "application/json")
    public String reverse(@RequestParam String input) {

        return input != null ? new StringBuilder(input).reverse().toString():null;
    }

}
