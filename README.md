# fast
spring boot工程  基础配置 主从配置 读写分离 

#### 数据库表:
```
DROP TABLE IF EXISTS `t_cut_price`;
CREATE TABLE `t_cut_price` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `luck` varchar(50) DEFAULT NULL COMMENT '幸运值',
  `created_by` varchar(255) DEFAULT NULL COMMENT '创建人',
  `created_date` datetime DEFAULT NULL  COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

```


#### 添加数据：

http://localhost/curPrice/add?createdBy=1&luck=1


#### 查看数据

http://localhost/curPrice/all

#### 创建两个数据库 并同时创建两个表

```
DROP TABLE IF EXISTS `t_cut_price0`;
CREATE TABLE `t_cut_price0` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `luck` varchar(50) DEFAULT NULL COMMENT '幸运值',
  `created_by` varchar(255) DEFAULT NULL COMMENT '创建人',
  `created_date` datetime DEFAULT NULL  COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

```


```
DROP TABLE IF EXISTS `t_cut_price1`;
CREATE TABLE `t_cut_price1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `luck` varchar(50) DEFAULT NULL COMMENT '幸运值',
  `created_by` varchar(255) DEFAULT NULL COMMENT '创建人',
  `created_date` datetime DEFAULT NULL  COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

```