package com.example.tinyblog.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author cc_ff
 * @creat 2021-05-12
 * @Description
 */
@Data
@NoArgsConstructor
public class Type {
    private Long id;
    private String name;

    private List<Blog> blogs;
}
