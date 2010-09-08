package com.ant.oms.web;

import java.util.Locale;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractMessageSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/applicationContext.xml","file:src/main/webapp/WEB-INF/applicationContext.xml"})
public class MessageSourceTest {
	@Autowired
	AbstractMessageSource messageSource;
	
	@Test
	public void checkAppSettings(){
		String value = messageSource.getMessage("app.name",null,"UNDEF",Locale.getDefault());
		Assert.assertNotNull(value);
	}
}
