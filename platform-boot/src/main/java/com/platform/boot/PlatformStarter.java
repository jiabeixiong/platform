package com.platform.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


/**
 * 平台启动器
 * @author yangming
 *
 */
@SpringBootApplication(scanBasePackages="com.**")
public class PlatformStarter {

	public static ApplicationContext start(String[] args) {
		ConfigurableApplicationContext application = SpringApplication.run(PlatformStarter.class, args);
		SpringContextUtil.setApplication(application);
		return application;
	}

}
