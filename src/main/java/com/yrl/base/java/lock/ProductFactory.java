package com.yrl.base.java.lock;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品生产工厂
 * @ClassName: ProductFactory
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yrl:yangrl2014@163.com
 * @date 2017年5月7日 下午2:47:26
 *
 */
public class ProductFactory {
public static final int CAPACITY=10;
private static List<Product> products = new ArrayList<Product>();
public static void addProduct(){
	products.add(new Product("mi5", 5, 1999));
}
public static Product getProduct(){
	return products.remove(0);
}
public static boolean isFull(){
	return products.size()==CAPACITY;
}
public static boolean isEmpity(){
	return products.size() == 0;
}
}
