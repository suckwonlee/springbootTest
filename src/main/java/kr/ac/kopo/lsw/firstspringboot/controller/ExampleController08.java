package kr.ac.kopo.lsw.firstspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ExampleController08 {
    @GetMapping("/exam08")
    public ModelAndView requestMethod(){
        ModelAndView modelView = new ModelAndView("viewPageModelAndView");
//        modelView.setViewName("viewPageModelAndView");
        modelView.addObject("msg1","ModelAndView 클래스 예제");
        modelView.addObject("msg2","ModelAndView 클래스는 View의 이름을 생성자 또는 메소드를 통해서 설정할 수 있다.");
        modelView.addObject("msg3","ModelAndView 클래스는 값이나 객체 참조값을 전달할 때 Model 또는 ModelMap과 사용하는 메소드가 다르다.");
        modelView.addObject("msg4","ModelAndView 클래스는 요청 메소드의 매개변수를 통해 사용하는 것이 아니라 객체 생성을 통해서 사용해야하며, 리턴 값으로 ModelAndView 객체의 참조값을 사용한다..");

        List<String> fList=new ArrayList<String>();
        fList.add("Orange");
        fList.add("Banana");
        fList.add("Grape");
        modelView.addObject("fList",fList);

        return modelView;
    }
}
