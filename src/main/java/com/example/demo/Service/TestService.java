package com.example.demo.Service;

import com.example.demo.database.mybatis.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestMapper testMapper;

    public String TestPage(Model model) {
        model.addAttribute("list", testMapper.findAll());
        return "test";
    }
}
