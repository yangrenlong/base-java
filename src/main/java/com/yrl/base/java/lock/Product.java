package com.yrl.base.java.lock;
/**
 * 生产消费者模型：产品
 * @ClassName: Product
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yrl:yangrl2014@163.com
 * @date 2017年5月7日 下午2:47:26
 *
 */
public class Product {
private String name;
private int size;
private double price;
public Product(String name, int size, double price) {
	super();
	this.name = name;
	this.size = size;
	this.price = price;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the size
 */
public int getSize() {
	return size;
}
/**
 * @param size the size to set
 */
public void setSize(int size) {
	this.size = size;
}
/**
 * @return the price
 */
public double getPrice() {
	return price;
}
/**
 * @param price the price to set
 */
public void setPrice(double price) {
	this.price = price;
}

}
