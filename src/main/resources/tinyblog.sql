drop table  if exists blog;
CREATE TABLE `blog` (
  `id` INTEGER NOT NULL AUTO_INCREMENT COMMENT 'id',
  `title` VARCHAR(255) NOT NULL COMMENT '标题',
  `content` VARCHAR(255) COMMENT '内容',
  `flag_type` VARCHAR(255) COMMENT '来源类型',
  `view_times` INT COMMENT '访问次数',
  `appreciation` bit NOT NULL COMMENT '是否赞赏',
  `share_statement` bit NOT NULL COMMENT '是否分享',
  `commentabled` bit NOT NULL COMMENT '是否评论',
  `published` bit NOT NULL COMMENT '是否发布',
  `recommend` bit NOT NULL COMMENT '是否推荐',
  `create_time` DATETIME COMMENT '创建日期',
  `update_time` DATETIME COMMENT '更新日期',
  `type_id` INTEGER COMMENT 'type_id',
  `user_id` INTEGER COMMENT 'type_id',
  PRIMARY KEY (`id`, `type_id`, `user_id`)
);

drop table  if exists type;
CREATE TABLE `type` (
  `id` INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` VARCHAR(255) NOT NULL COMMENT '类型名'
);

drop table  if exists tag;
CREATE TABLE `tag` (
  `id` INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL COMMENT '标签名'
);

drop table  if exists comment;
CREATE TABLE `comment` (
  `id` INTEGER NOT NULL AUTO_INCREMENT,
  `nick_name` VARCHAR(255) NOT NULL COMMENT '昵称',
  `email` VARCHAR(255) NOT NULL COMMENT '邮箱',
  `content` VARCHAR(255) NOT NULL COMMENT '评论内容',
  `avatar` VARCHAR(255) NOT NULL COMMENT '头像',
  `date` DATETIME NOT NULL COMMENT '日期',
  `parent_comment_id` INTEGER,
  `blog_id` INTEGER,
  PRIMARY KEY (`id`, `parent_comment_id`, `blog_id`)
);


drop table  if exists user;
CREATE TABLE `user` (
  `id` INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `nick_name` VARCHAR(255) NOT NULL COMMENT '昵称',
  `username` VARCHAR(255) NOT NULL COMMENT '用户名',
  `password` VARCHAR(255) NOT NULL COMMENT '密码',
  `email` VARCHAR(255) NOT NULL COMMENT '邮箱',
  `avatar` VARCHAR(255) NOT NULL COMMENT '头像',
  `type` INT NOT NULL COMMENT '用户类型'
);

drop table  if exists blog_tags;
CREATE TABLE `blog_tags` (
  `blog_id` INTEGER,
  `tags_id` INTEGER,
  PRIMARY KEY (`blog_id`, `tags_id`)
);

ALTER TABLE `blog` ADD FOREIGN KEY (`type_id`) REFERENCES `type` (`id`);

ALTER TABLE `blog` ADD FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);

ALTER TABLE `comment` ADD FOREIGN KEY (`parent_comment_id`) REFERENCES `comment` (`id`);

ALTER TABLE `comment` ADD FOREIGN KEY (`blog_id`) REFERENCES `blog` (`id`);

ALTER TABLE `blog_tags` ADD FOREIGN KEY (`blog_id`) REFERENCES `blog` (`id`);

ALTER TABLE `blog_tags` ADD FOREIGN KEY (`tags_id`) REFERENCES `tag` (`id`);

ALTER TABLE user add creat_Time datetime;


ALTER TABLE user add update_Time datetime;