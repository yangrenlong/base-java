package com.yrl.base.java.design.pattern.decorate.impl;


import com.yrl.base.java.design.pattern.decorate.Beverage;
import com.yrl.base.java.design.pattern.decorate.CordimentDecorator;

public class Mocha extends CordimentDecorator {
	//这里是饮料的基础类，可以通过这个类或者父类及其他装饰类的描述，及花费
    private Beverage beverage;
    public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ",Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost()+0.20;
	}

}
