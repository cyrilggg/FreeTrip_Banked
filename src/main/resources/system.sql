DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS blogs;
CREATE TABLE users
(
    id       int(10)      NOT NULL AUTO_INCREMENT,
    name     varchar(50)  NOT NULL,
    password varchar(50)  NOT NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 26
  DEFAULT CHARSET = utf8;

INSERT INTO users
VALUES ('1', 'admin', 'admin');
INSERT INTO users
VALUES ('2', 'user', 'user');
INSERT INTO users
VALUES ('3', '1', '1');
INSERT INTO users
VALUES ('4', '2', '2');
INSERT INTO users
VALUES ('22', '3', '3');
INSERT INTO users
VALUES ('25', '4', '4');


CREATE TABLE blogs
(
    id      int(10)     NOT NULL AUTO_INCREMENT COMMENT '博客ID',
    user_id int(10)     NOT NULL COMMENT '用户id',
    title   varchar(10) NOT NULL COMMENT '博客标题',
    content varchar(20)     NOT NULL DEFAULT 0 COMMENT '博客内容',
    praise  int(10)     NOT NULL COMMENT '获赞数',
    CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users (id),
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

INSERT INTO blogs
VALUES ('1', '2', 'aaa', 'bbb', '3');
INSERT INTO blogs
VALUES ('2', '2', 'aaa', 'bbb', '3');

