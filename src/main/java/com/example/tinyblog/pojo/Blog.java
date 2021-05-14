package com.example.tinyblog.pojo;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author cc_ff
 * @creat 2021-05-12
 * @Description
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "t_blog")
public class Blog {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String flagType;
    private Integer viewTimes;
    private boolean appreciation;
    private boolean shareStatement;
    private boolean commentated;
    private boolean published;
    private boolean recommend;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;
    @ManyToOne
    private Type type;
    @ManyToOne
    private User user;
    @ManyToMany(mappedBy = "blogList")
    private List<Tag> tagList;
    @OneToMany(mappedBy = "blog")
    private List<Comment> commentList;
}
