package com.yrl.base.java.design.pattern.single;

import java.beans.Customizer;
import java.lang.reflect.Constructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 
* @ClassName: SimpleSingle
* @Description: 最简单的单例模式
* @author yrl:yangrl2014@163.com
* @date 2017年5月6日 下午6:31:47
*
 */
public class SimpleSingle {
private static final Logger LOG = LoggerFactory.getLogger(SimpleSingle.class);
private static SimpleSingle simpleSingle=null;
private static SimpleSingle simpleSingle2= new SimpleSingle();
private static boolean flag = false;
private SimpleSingle(){
	if(!flag){
		synchronized (SimpleSingle.class) {
			flag =!flag;
		}
	}else{
		throw new RuntimeException("正在遭受反射单例攻击");
	}
}
/**
 * 
* @Title: getInstance
* @Description: 获取单例实例(饿汉)，这种模式化不能保证线程安全，反射攻击
* @author:yang
* @date 2017年5月6日 下午6:44:20 
* @param:
* @return:SimpleSingle
* @throws
 */

public static SimpleSingle getInstance(){
	if(simpleSingle == null){
		simpleSingle = new SimpleSingle();
	}
	return simpleSingle;
}
/**
 * 
* @Title: getInstance2
* @Description:线程安全，但是不能防止反射攻击
* @author:yang
* @date 2017年5月6日 下午7:00:45 
* @param:@return
* @return:SimpleSingle
* @throws
 */
public static SimpleSingle getInstance2(){
	
	return simpleSingle2;
}
/**
 * 
* @Title: getInstance3
* @Description: 两次检查防止多线程带来的问题
* @author:yang
* @date 2017年5月6日 下午7:21:55 
* @param:@return
* @return:SimpleSingle
* @throws
 */
public static SimpleSingle getInstance3(){
	if(simpleSingle == null){
		synchronized (SimpleSingle.class) {
			if(simpleSingle == null){//两次检查
              	simpleSingle = new SimpleSingle();			
			}
		}
	}
	return simpleSingle;
}
public static void main(String[] args) {
	Class clazz = SimpleSingle.class;
	try {
		
		Constructor constructor = clazz.getDeclaredConstructor(null);
		constructor.setAccessible(true);
		SimpleSingle simpleSingle = (SimpleSingle) constructor.newInstance(null);
		SimpleSingle simpleSingle2 = (SimpleSingle) constructor.newInstance(null);
		LOG.debug("simpleSingle == simpleSingle2 :{}",simpleSingle == simpleSingle2);
		LOG.debug("simpleSingle == simpleSingle2 :{}",simpleSingle == simpleSingle2);
		SimpleSingle instance3 = getInstance3();
		SimpleSingle instance4 = getInstance3();
		LOG.debug("simpleSingle == simpleSingle2 :{}",instance3 == instance4);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}
}
