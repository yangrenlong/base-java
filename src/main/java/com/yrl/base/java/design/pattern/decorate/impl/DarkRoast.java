package com.yrl.base.java.design.pattern.decorate.impl;

import com.yrl.base.java.design.pattern.decorate.Beverage;

public class DarkRoast extends Beverage {

	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDescription() {
		return "DarkRoast Coffe";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
