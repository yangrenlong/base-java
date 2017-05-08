package com.yrl.base.java.design.pattern.observer.impl;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yrl.base.java.design.pattern.observer.Observer;
import com.yrl.base.java.design.pattern.observer.Subject;

/**
 * @ClassName: WeatherData
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yrl:yangrl2014@163.com
 * @date 2017年5月7日 下午2:26:40
 *
 */
public class WeatherData implements Subject {
	private float temperature;
	private float humidity;
	private float pressure;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
    private static final Logger LOG = LoggerFactory.getLogger(WeatherData.class);
 /**
  * 
 * @Title: setChange
 * @Description: 主题数据变化会调用该方法
 * @author:yang
 * @date 2017年5月7日 下午2:35:26 
 * @return:void
 * @throws
  */
    public void setChange(){
    	LOG.debug("weather is changed");
        this.notifyObservers();
    }
    
    @Override
	public void register(Observer observer) {
		if(observers.contains(observer)){
			LOG.debug("observer has already register");
			System.exit(0);
		}
		observers.add(observer);

	}
	@Override
	public void unRegister(Observer observer) {
		if(!observers.contains(observer)){
			LOG.debug("observer has not register");
			System.exit(0);
		}
		observers.remove(observer);

	}
	@Override
	public void notifyObservers() {
      for(Observer observer : observers){
    	  observer.update(temperature, humidity, pressure);
      }
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
