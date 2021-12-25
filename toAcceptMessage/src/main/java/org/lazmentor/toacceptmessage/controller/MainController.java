package org.lazmentor.toacceptmessage.controller;

import lombok.RequiredArgsConstructor;
import org.lazmentor.toacceptmessage.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
public class MainController {

    private final HelloService helloService;

    @GetMapping("accept")
    public String getCount(){
        return "Hello accepted " + helloService.getCount() + "once";
    }

}
