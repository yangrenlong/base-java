package com.yrl.base.java.design.pattern.decorate.impl;

import com.yrl.base.java.design.pattern.decorate.Beverage;
import com.yrl.base.java.design.pattern.decorate.CordimentDecorator;

public class Milk extends CordimentDecorator {
    private Beverage beverage;
    public Milk(Beverage beverage) {
          this.beverage = beverage;
    }
	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",milk";
	}

	@Override
	public double cost() {
		
		return beverage.cost()+0.23;
	}

}
