package com.platform.boot;

import org.springframework.context.ApplicationContext;

public class SpringContextUtil {
    
    private static ApplicationContext application;
    
    public static ApplicationContext getApplication() {
        return application;
    }
    
    public static void setApplication(ApplicationContext application) {
        SpringContextUtil.application = application;
    }
    
}
