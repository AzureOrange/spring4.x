package com.smart.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MailSenderTest {

    public ApplicationContext ctx = null;

    private static String[] CONFIG_FILES = {"com/smart/event/beans.xml"};

    @BeforeClass
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext(CONFIG_FILES);
    }

    @Test
    public void testMailSender() {
        MailSender mailSender = ctx.getBean(MailSender.class);
        mailSender.sendEmail("aaa@bbb.com");
    }
}
