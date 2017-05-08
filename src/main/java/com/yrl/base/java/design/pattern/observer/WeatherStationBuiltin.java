package com.yrl.base.java.design.pattern.observer;

import com.yrl.base.java.design.pattern.observer.impl.CurrentConditionDisplayBuiltin;
import com.yrl.base.java.design.pattern.observer.impl.WeatherDataBulitin;

/**
 * @ClassName: WeatherStationBuiltin
 * @Description: 气象工作站(内置java观察者模式)
 * @author yrl:yangrl2014@163.com
 * @date 2017年5月7日 下午2:54:47
 *
 */
public class WeatherStationBuiltin {
public static void main(String[] args) {
	WeatherDataBulitin weatherData = new WeatherDataBulitin();
	
	CurrentConditionDisplayBuiltin currentConditionDisplay = new CurrentConditionDisplayBuiltin();
    //数据变化，通知观察者，这里通过set方法模拟数据的变化
	weatherData.setTemperature(37.00f);
	weatherData.setHumidity(0.43f);
	weatherData.setPressure(108.00f);
	//注册主题
	weatherData.addObserver(currentConditionDisplay);
	//通知数据变化了
	weatherData.setChange();
	//删除观察者：
	weatherData.deleteObserver(currentConditionDisplay);
	//通知数据变化了
	weatherData.setChange();

}
}
