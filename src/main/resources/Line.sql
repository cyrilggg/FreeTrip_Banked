CREATE TABLE routes
(
    id    int(10)      NOT NULL AUTO_INCREMENT COMMENT '线路编号',
    name  varchar(10)  NOT NULL,
    line  varchar(255) NOT NULL,
    price decimal(18, 2),
    city  varchar(10)  NOT NULL,
    primary key (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

INSERT INTO routes
VALUES (1, '二号线旅行', '华中师范大学——街道口——江汉路', 200, '武汉');

INSERT INTO routes
VALUES ('2', '一号线旅行', '武汉天地——循礼门', '400', '武汉');
