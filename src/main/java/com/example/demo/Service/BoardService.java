package com.example.demo.Service;

import com.example.demo.database.dto.BoardDTO;
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

    public String ViewPage(Model model, BoardDTO dto) {
        model.addAttribute("boardView", boardMapper.findById(dto));
        System.out.println(dto.getBd_name());
        return "view";
    }

    public String UpdateForm(Model model, BoardDTO dto) {
        model.addAttribute("boardView", boardMapper.findById(dto));

        return "update";
    }

    public String UpdateAction(BoardDTO dto) {
        boardMapper.updateById(dto);

        return "redirect:/";
    }

    public String DeleteAction(BoardDTO dto) {
        boardMapper.deleteById(dto);

        return "redirect:/";
    }

    public String InsertForm() {
        return "insert";
    }

    public String InsertAction(BoardDTO dto) {
        boardMapper.createOne(dto);

        return "redirect:/";
    }

}
