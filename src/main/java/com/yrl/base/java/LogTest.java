package com.yrl.base.java;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
private static final Logger LOG = LoggerFactory.getLogger(LogTest.class);
public static void printLog(){
	LogTest.class.getClassLoader();
	InputStream  in = ClassLoader.getSystemResourceAsStream("config/base.properties");
	Properties pros = new Properties();
	try {
		pros.load(in);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	LOG.debug("properties:name:{}",pros.get("name"));
}
public static void main(String[] args) {
	printLog();
}
}
