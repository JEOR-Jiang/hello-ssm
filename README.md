hello-ssm
===========================
整合ssm（spring,springmvc,mybatis）框架的例子   
参考：https://www.jb51.net/article/150315.htm

---------------------------
#### 开发环境
java8 + mysql5.7.20 + idea2019.3.2
  
---------------------------
#### 项目结构简介
- java.com.jeor.hellossm
    - controller
    - service
        - impl 
    - mapper
    - entity
- resources
    - application.yml
    - mappers
---------------------------
#### 测试  
* 启动类：com.jeor.hellossm.HelloSsmApplication
* 数据库添加数据：INSERT INTO user (name,birthday,address) VALUES ("jeor", "2020-02-25", "guangdong")
* 浏览器访问：http://localhost:8080/user/find

---------------------------
作者列表

|Author|email
|---|---
|Jeor|843082179@qq.com
---------------------------
#### 更新链接

---------------------------
#### 历史版本
|Time|Tersion
|---|---
|2020-02-25|1.0
---------------------------
#### 联系方式
843082179@qq.com




