package kr.ac.kopo.lsw.firstspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example02Controller {
    @RequestMapping(value = "/exam02",method = RequestMethod.GET)
    public String reQuestMethod(){
        return "@RequestController 연습중";
    }
}
