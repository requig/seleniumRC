package com.example.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import com.thoughtworks.selenium.*;
import java.util.regex.Pattern;
import org.junit.*;

public class Testsuite {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(com.example.tests.test1.class);
		return suite;
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}
}
