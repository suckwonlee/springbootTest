package kr.ac.kopo.lsw.firstspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ExampleController07 {
    @GetMapping("/exam07")
    public String requestMethod(ModelMap modelMap){
        modelMap.addAttribute("message1","ModelMap 클래스는 Model 인터페이스를 상속받아서 구현되었다.");
        modelMap.addAttribute("message2","ModelMap 클래스는 Model 인터페이스의 기능과 동일하거나 더 확장된 기능을 사용할 수 있다.");

        List<String> list=new ArrayList<>();
        list.add("오렌지");
        list.add("귤");
        list.add("복숭아");
        list.add("참외");
        modelMap.addAttribute("fruitsList",list);
        return "viewPageModelMap";
    }

}
