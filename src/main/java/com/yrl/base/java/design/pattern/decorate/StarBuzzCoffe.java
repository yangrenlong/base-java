package com.yrl.base.java.design.pattern.decorate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yrl.base.java.design.pattern.decorate.impl.DarkRoast;
import com.yrl.base.java.design.pattern.decorate.impl.HouseBlend;
import com.yrl.base.java.design.pattern.decorate.impl.Milk;
import com.yrl.base.java.design.pattern.decorate.impl.Mocha;

public class StarBuzzCoffe {
	private static final Logger LOG = LoggerFactory.getLogger(StarBuzzCoffe.class);
public static void main(String[] args) {
	Beverage beverage = new HouseBlend();
	Mocha mocha = new Mocha(beverage);
	Mocha mocha2 = new Mocha(mocha);
	Milk milk = new Milk(mocha2);
	LOG.debug("coffe:{}:{}",milk.getDescription(),milk.cost());
	
	DarkRoast beverage2 = new DarkRoast();
	Mocha mocha3 = new Mocha(beverage2);
	Milk milk2 = new Milk(mocha3);
	LOG.debug("coffe:{}:{}",milk2.getDescription(),milk2.cost());
}
}
