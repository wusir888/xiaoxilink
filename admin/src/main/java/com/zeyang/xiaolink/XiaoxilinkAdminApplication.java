/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zeyang.xiaolink;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication
/**
 * @SpringBootApplication 是 Spring Boot 应用程序的核心注解，它的作用包括：
 *
 * 标识启动类。
 * 启用自动配置。
 * 扫描 Spring 组件。
 * 简化配置。
 * 通过使用 @SpringBootApplication，开发者可以快速启动和配置 Spring Boot 应用程序，而无需编写大量的配置代码。它是 Spring Boot 简化开发的重要特性之一。
 */
@EnableDiscoveryClient  // 启用注册中心
/**
 * @EnableDiscoveryClient 是 Spring Cloud 中用于启用服务发现功能的注解，它的作用包括：
 *
 * 将应用程序注册到服务发现组件中。
 * 支持从服务发现组件中查找和调用其他服务。
 * 通过使用 @EnableDiscoveryClient，开发者可以轻松实现微服务之间的动态发现和调用，从而构建灵活、可扩展的微服务架构。
 */
@EnableFeignClients("com.zeyang.xiaolink.admin.remote") // 启用feign
/**
 * 启用 Spring Cloud 的 Feign 客户端功能。
 * 扫描指定包（com.zeyang.xiaolink.admin.remote）下的 Feign 客户端接口，并将它们注册为 Spring Bean。
 * 通过这种方式，开发者可以轻松地定义和使用 HTTP 客户端，实现微服务之间的远程调用，而无需手动编写 HTTP 请求代码。
 *
 */
@MapperScan("com.zeyang.xiaolink.admin.dao.mapper")
/**
 * 扫描指定包（com.zeyang.xiaolink.admin.dao.mapper）下的 MyBatis Mapper 接口。
 * 将扫描到的 Mapper 接口注册为 Spring Bean，使其可以在 Spring 容器中使用。
 * 通过使用 @MapperScan，开发者可以简化 MyBatis Mapper 接口的配置，提高开发效率。它是 Spring Boot 集成 MyBatis 时的常用注解之一。
 */
public class XiaoxilinkAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(XiaoxilinkAdminApplication.class, args);
    }
}
