package kr.ac.kopo.lsw.firstspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController06_1 {
    @GetMapping("/exam06_1")
    public String reQuestMethod(Model model){
        model.addAttribute("data1","Model 예제");
        model.addAttribute("data2","Web 요청할때 url은 http://localhost:8080/exam06");
        return "viewPage06_1";
    }
}
