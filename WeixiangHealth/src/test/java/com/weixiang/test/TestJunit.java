package com.weixiang.test;
import com.weixiang.service.IPushnewsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lzq on 16/6/15.
 */
public class TestJunit {

    @Test
    public void runTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring-mvc.xml"
                ,"classpath:spring-mybatis.xml"});
        IPushnewsService service = (IPushnewsService) context.getBean("pushnewsService");
        service.pushnewsById(2);
    }

}
