package com.dodo.project.base.dao.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * <b>Application</b></br>
 *
 * <pre>
 * 启动类
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2018/10/26 15:32
 * @Since JDK 1.8
 */
@SpringBootApplication
@MapperScan("com.dodo.project.base.dao.mybatis.mapper")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
