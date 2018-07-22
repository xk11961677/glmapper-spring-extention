package com.glmapper.extention;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: [描述文本]
 * @email: <a href="guolei.sgl@antfin.com"></a>
 * @author: guolei.sgl
 * @date: 18/7/21
 */
public class MainTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        GlmapperInitializingBean glmapperInitializingBean = (GlmapperInitializingBean) applicationContext.getBean("glmapperInitializingBean");
    }
}