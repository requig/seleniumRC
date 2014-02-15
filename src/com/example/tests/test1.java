package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class test1 extends SeleneseTestCase {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.ringoman.ru/");
		selenium.start();
	}

	@Test
	public void testTest1() throws Exception {
		selenium.open("/info/logo.html");
		selenium.click("link=exact:Что такое рингтон?");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Логотипы");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Контакты");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=О нас");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=exact:Как создавать выдающиеся рингтоны?");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
