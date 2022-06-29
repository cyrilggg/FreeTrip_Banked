DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS blog;

CREATE TABLE users
(
    id       int(10)      NOT NULL AUTO_INCREMENT COMMENT'用户id',
    name     varchar(10)  NOT NULL,
    password varchar(10) NOT NULL ,
    primary key (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 26
  DEFAULT CHARSET = utf8;

INSERT INTO users(name)
VALUES ('小王'),('小李');

CREATE TABLE blog
(
    id         int(10)     NOT NULL AUTO_INCREMENT COMMENT 'blogID',
    user_id    int(10)     NOT NULL COMMENT'用户id',
    title      varchar(10) NOT NULL COMMENT 'blog标题',
    content    text        NOT NULL COMMENT 'blog内容',
    build_time varchar(25) NOT NULL COMMENT 'blog时间',
    praise     int(10)     NOT NULL COMMENT'用户id',
    CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users (id),
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

insert into blog(user_id,title, content, build_time,praise)
values(26,'shanghai','shanghai is one of Chinese busiest cities','2022-6-01',100),
      (26,'wuhan','wuhan is one of Chinese busiest cities','2022-6-02',110),
      (27,'guangdong','guangdong is one of Chinese busiest cities','2022-6-01',100);

-- ALTER TABLE 表名 ADD 字段名 VARCHAR(500) DEFAULT NULL COMMENT 注释
ALTER TABLE users ADD password VARCHAR(10) ;



delete from blog where id = '1';
