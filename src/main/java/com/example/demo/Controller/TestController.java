package com.example.demo.Controller;

import com.example.demo.Service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String TestPage(Model model) {
        return testService.TestPage(model);
    }
}
