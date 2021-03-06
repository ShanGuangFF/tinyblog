package com.example.tinyblog.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author cc_ff
 * @creat 2021-05-12
 * @Description
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "t_type")
public class Type {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(mappedBy = "type")
    private List<Blog> blogs = new ArrayList<>();
}
