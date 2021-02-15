package com.maersk.responsecodedemo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class Controller {

    @GetMapping(path = "test")
    public void test() {
        throw new ResponseStatusException(HttpStatus.I_AM_A_TEAPOT);
    }

}
