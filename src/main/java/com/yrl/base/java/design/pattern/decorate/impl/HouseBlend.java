package com.yrl.base.java.design.pattern.decorate.impl;


import com.yrl.base.java.design.pattern.decorate.Beverage;
/**
 * 
 * @ClassName: HouseBlend
 * @Description: 基础咖啡（首选咖啡）
 * @author yrl:yangrl2014@163.com
 * @date 2017年5月7日 下午2:47:26
 *
 */
public class HouseBlend extends Beverage {
  

	@Override
	public double cost() {
		return 0.89;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getDescription() {
		return "HouseBlend Coffe";
	}

	

}
