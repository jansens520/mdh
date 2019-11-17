# mdh

SpringBoot+SpringCloud+vue+Element开发项目

项目介绍

Mdh后台权限管理系统是基于Spring Boot、Spring Cloud、Vue.js 、Element UI等主流前后端技术，采用前后端分离架构实现的权限管理系统。
也是一款采用当前主流技术实现的界面优雅、架构优良、代码简洁、注释完善、基础功能相对完整的JAVA EE快速开发平台，
前后端开发人员都可以以此为范例从中学习和汲取技术知识，也可以基于此系统开发和实现具体生产项目。

功能列表

✔ 系统登录：系统用户登录，系统登录认证（token方式）

✔ 用户管理：新建用户，修改用户，删除用户，查询用户

✔ 机构管理：新建机构，修改机构，删除机构，查询机构

✔ 角色管理：新建角色，修改角色，删除角色，查询角色

✔ 菜单管理：新建菜单，修改菜单，删除菜单，查询菜单

✔ 字典管理：新建字典，修改字典，删除字典，查询字典

✔ 配置管理：新建配置，修改配置，删除配置，查询配置

✔ 登录日志：记录用户的登录日志，查看系统登录日志记录

✔ 操作日志：记录用户的操作日志，查看系统操作日志记录

✔ 在线用户：根据用户的登录状态，查看统计当前在线用户

✔ 数据监控：定制Druid信息，提供简洁有效的SQL数据监控

✔ 聚合文档：定制Swagger文档，提供简洁美观的API文档

✔ 备份还原：系统数据备份还原，一键恢复系统初始化数据

✔ 主题切换：支持主题切换，自定主题颜色，实现一键换肤

✔ 服务治理：集成Consul注册中心，实现服务的注册和发现

✔ 服务监控：集成Spring Boot Admin，实现全方位的服务监控

✔ 服务消费：集成Ribbon、Feign，实现服务调用和负载均衡

✔ 服务熔断：集成Hystrix、Turbine，实现服务的熔断和监控

✔ 服务网关：集成Spring Cloud Zuul，实现统一API服务网关

✔ 链路追踪：集成Sleuth、Zipkin，实现服务分布式链路追踪

✔ 配置中心：集成Cloud Config和Bus，实现分布式配置中心

软件架构

前端架构

开发工具
WebStorm

前端框架
Vue 2.x

后端架构

开发环境
IDE : IDEA 2019.2.3

JDK : JDK1.8.x

Maven : Maven 3.5.x

MySQL: MySQL 5.7.x

Consul: Consul 1.6.2

…

技术选型

核心框架：Spring Boot 2.x

服务治理：Spring Cloud Finchley

安全框架：Spring Security 5.x

视图框架：Spring MVC 5.x

持久层框架：MyBatis 3.x

数据库连接池：Druid 1.x

消息队里：RabbitMQ

接口文档：Swagger 2.9.x

日志管理：SLF4J、Log4j

…

项目结构

mdh-common： 公共代码模块，主要放置一些工具类

mdh-core： 封装业务模块，主要封装公共业务模块

mdh-admin： 后台管理模块，包含用户、角色、菜单管理等

mdh-backup： 系统数据备份还原模块，可选择独立部署

mdh-monitor： 系统监控服务端，监控Spring Boot应用

mdh-producer： 服务提供者示例，方便在此基础上搭建模块

mdh-consumer： 服务消费者示例，方便在此基础上搭建模块

mdh-hystrix： 服务熔断监控模块，收集汇总熔断统计信息

mdh-zuul： API服务网关模块，统一管理和转发外部调用请求

mdh-config： 配置中心服务端，生成GIT配置文件的访问接口

mdh-consul： 注册中心，安装说明目录，内附安装引导说明

mdh-zipkin： 链路追踪，安装说明目录，内附安装引导说明

mdh-repo： 配置中心仓库，在GIT上统一存储系统配置文件

mdh-pom： 聚合模块，仅为简化打包，一键执行打包所有模块
