package com.example.demo.Controller;

import com.example.demo.Service.BoardService;
import com.example.demo.database.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @RequestMapping("/")
    public String MainPage(Model model) {
        return boardService.MainPage(model);
    }

    @RequestMapping("/view")
    public String ViewPage(Model model, BoardDTO dto) {
        return boardService.ViewPage(model, dto);
    }

    @RequestMapping("/update")
    public String UpdateForm(Model model, BoardDTO dto) {
        return boardService.UpdateForm(model, dto);
    }

    @RequestMapping(value = "/update.do", method = RequestMethod.POST)
    public String UpdateAction(BoardDTO dto) {
        return boardService.UpdateAction(dto);
    }

    @RequestMapping(value = "/delete")
    public String DeleteAction(BoardDTO dto) {
        return boardService.DeleteAction(dto);
    }

    @RequestMapping("/insert")
    public String InsertForm() {
        return boardService.InsertForm();
    }

    @RequestMapping(value = "/insert.do", method = RequestMethod.POST)
    public String InsertAction(BoardDTO dto) {
        return boardService.InsertAction(dto);
    }

}
