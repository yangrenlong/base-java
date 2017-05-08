package com.yrl.base.java.design.pattern.observer.impl;

import java.util.Observable;

import com.yrl.base.java.design.pattern.observer.Subject;

/**
 * @ClassName: WeatherDataBulitin
 * @Description: 继承java内置观察者类
 * @author yrl:yangrl2014@163.com
 * @date 2017年5月7日 下午3:05:42
 *
 */
public class WeatherDataBulitin extends Observable {
private float temperature;
private float humidity;
private float pressure;
public void setChange(){
	this.setChanged();
	this.notifyObservers();
}

/**
 * @return the temperature
 */
public float getTemperature() {
	return temperature;
}
/**
 * @param temperature the temperature to set
 */
public void setTemperature(float temperature) {
	this.temperature = temperature;
}
/**
 * @return the humidity
 */
public float getHumidity() {
	return humidity;
}
/**
 * @param humidity the humidity to set
 */
public void setHumidity(float humidity) {
	this.humidity = humidity;
}
/**
 * @return the pressure
 */
public float getPressure() {
	return pressure;
}
/**
 * @param pressure the pressure to set
 */
public void setPressure(float pressure) {
	this.pressure = pressure;
}

}
