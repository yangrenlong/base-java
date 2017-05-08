package com.yrl.base.java.design.pattern.decorate;
/**
 * 
 * @ClassName: Beverage
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yrl:yangrl2014@163.com
 * @date 2017年5月7日 下午2:47:26
 *
 */
public abstract class Beverage {

protected String description="base beverage";
/**
 * 
 * @Title: setDescription
 * @Description: 设置描述信息
 * @author:yang
 * @date 2017年5月7日 下午2:48:23 
 * @return:void
 * @throws
 */
public abstract void setDescription(String description);
public abstract String getDescription();
/**
 * 
 * @Title: cost
 * @Description: 价钱
 * @author:yang
 * @date 2017年5月7日 下午2:48:23 
 * @return:double
 * @throws
 */
public abstract double cost();
}
