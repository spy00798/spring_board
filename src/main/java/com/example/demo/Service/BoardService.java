package com.example.demo.Service;

import com.example.demo.database.mybatis.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper boardMapper;

    public String MainPage(Model model) {
        model.addAttribute("boardList", boardMapper.findAll());
        return "index";
    }

}
