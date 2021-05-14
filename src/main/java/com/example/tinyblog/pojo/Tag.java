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
@Table(name = "t_tag")
public class Tag {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<Blog> blogList = new ArrayList<>();
}
