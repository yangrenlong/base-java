/**
* @ClassName: CurrentConditionDisplay
* @Description: TODO(这里用一句话描述这个类的作用)
* @author A18ccms a18ccms_gmail_com
* @date 2017年5月7日 下午2:37:53
*
*/ 
package com.yrl.base.java.design.pattern.observer.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yrl.base.java.design.pattern.observer.Display;
import com.yrl.base.java.design.pattern.observer.Observer;
import com.yrl.base.java.design.pattern.observer.Subject;

/**
 * @ClassName: StasticConditionDisplay
 * @Description: 统计显示
 * @author yrl:yangrl2014@163.com
 * @date 2017年5月7日 下午2:37:53
 *
 */
public class StasticConditionDisplay implements Observer,Display {

	private static final Logger LOG = LoggerFactory.getLogger(StasticConditionDisplay.class);
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject subject;
	public StasticConditionDisplay(Subject subject) {
		this.subject = subject;
		subject.register(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
       
		this.humidity = humidity;
		this.pressure = pressure;
		this.temperature = temperature;
		 //这里可以做些逻辑业务，这里只是显示
		display();
	}
	@Override
    public void display(){
    	LOG.debug("统计显示天气情况：温度：{},湿度：{},气压:{}",temperature,humidity,pressure);
    }
}
