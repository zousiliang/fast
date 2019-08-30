# fast
spring boot工程  基础配置 主从配置 读写分离 

#### 数据库表:
```
DROP TABLE IF EXISTS `t_cut_price`;
CREATE TABLE `t_cut_price` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `luck` varchar(50) DEFAULT NULL COMMENT '幸运值',
  `created_by` varchar(255) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

```


#### 添加数据：

http://localhost/curPrice/add?createdBy=God


#### 查看数据

http://localhost/curPrice/all