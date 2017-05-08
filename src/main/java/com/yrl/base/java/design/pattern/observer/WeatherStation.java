/**
* @ClassName: WeatherStation
* @Description: TODO(这里用一句话描述这个类的作用)
* @author A18ccms a18ccms_gmail_com
* @date 2017年5月7日 下午2:54:47
*
*/ 
package com.yrl.base.java.design.pattern.observer;

import com.yrl.base.java.design.pattern.observer.impl.CurrentConditionDisplay;
import com.yrl.base.java.design.pattern.observer.impl.StasticConditionDisplay;
import com.yrl.base.java.design.pattern.observer.impl.WeatherData;

/**
 * @ClassName: WeatherStation
 * @Description: 气象工作站
 * @author yrl:yangrl2014@163.com
 * @date 2017年5月7日 下午2:54:47
 *
 */
public class WeatherStation {
public static void main(String[] args) {
	WeatherData weatherData = new WeatherData();
	//注册主题
	CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
	StasticConditionDisplay stasticConditionDisplay = new StasticConditionDisplay(weatherData);
    //数据变化，通知观察者，这里通过set方法模拟数据的变化
	weatherData.setTemperature(37.00f);
	weatherData.setHumidity(0.43f);
	weatherData.setPressure(108.00f);
	//通知数据变化了
	weatherData.setChange();
	//删除观察者：
	weatherData.unRegister(stasticConditionDisplay);
	//通知数据变化了
	weatherData.setChange();

}
}
