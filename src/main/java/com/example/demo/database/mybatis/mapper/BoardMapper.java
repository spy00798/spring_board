package com.example.demo.database.mybatis.mapper;

import com.example.demo.database.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<BoardDTO> findAll();
    BoardDTO findById(BoardDTO params);
}
