package com.example.demo.Service;

import com.example.demo.database.mybatis.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper boardMapper;

    public String MainPage() {

        return "index";
    }

}
