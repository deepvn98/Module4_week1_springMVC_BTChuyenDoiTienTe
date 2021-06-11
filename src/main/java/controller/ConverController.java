package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConverController {
    @GetMapping("Conver")
    public String list(){
        return "/convermoney";
    }

    @PostMapping("Conver")
    public ModelAndView getConver(double usd, double rate){
        double vnd = usd*rate;
        ModelAndView modelAndView =new ModelAndView("/convermoney");
        modelAndView.addObject("vnd",vnd);
        return modelAndView;
    }
}
