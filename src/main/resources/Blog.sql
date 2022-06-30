use freetrip;

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS blogs;

CREATE TABLE users
(
    id       int(10)      NOT NULL AUTO_INCREMENT COMMENT'用户id',
    name     varchar(10)  NOT NULL,
    password varchar(10) NOT NULL ,
    primary key (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8;

INSERT INTO users
VALUES ('1', 'admin', 'admin');
INSERT INTO users
VALUES ('2', 'user', 'user');
INSERT INTO users
VALUES ('3', '1', '1');
INSERT INTO users
VALUES ('4', '2', '2');

CREATE TABLE blogs
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

INSERT INTO blogs
VALUES ('4', '2', '2', '2', '2', '2');
INSERT INTO blogs
VALUES ('1', '2', '2', '2', '2', '2');