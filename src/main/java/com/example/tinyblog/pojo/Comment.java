package com.example.tinyblog.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

/**
 * @author cc_ff
 * @creat 2021-05-12
 * @Description
 */
@Data
@NoArgsConstructor
public class Comment {
    private Long id;
    private String nickName;
    private String email;
    private String content;
    private String avatar;
    private Date date;

    private Comment parentComment;
    private Blog blog;
    private List<Comment> replyCommentList;
}
