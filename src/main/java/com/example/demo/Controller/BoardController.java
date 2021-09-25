package com.example.demo.Controller;

import com.example.demo.Service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @RequestMapping("/")
    public String MainPage() {
        return boardService.MainPage();
    }
}