package com.github.wemilli.study_apir.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // todas as classes de controle precisam dessa notação
@RequestMapping("ping")
public class ControllerPing {

    @GetMapping
    public String ping() {
        return "pong";
    }

    public String mensagem() {
        return "pong";
    }
}
