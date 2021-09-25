package com.example.demo.database.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {
    private long idx;
    private String bd_name;
    private String bd_content;
    private String bd_writer;
    private String bd_date;
}
