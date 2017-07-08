package com.yrl.base.java.lock;
/**
 * 生产者-消费者模型：消费者
 * @ClassName: Consumer
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yrl:yangrl2014@163.com
 * @date 2017年5月7日 下午2:47:26
 *
 */
public class Consumer {
private ProductFactory factory = null;

public Consumer(ProductFactory factory) {
	this.factory = factory;
}
public void consumer(){
	synchronized (factory) {
		//想象一下这里为什么用的是while循环，因为，如果这里只是用的if判断，
		//当wait被唤醒的时候，对于一个生产者多个消费者模型而言，如果多个消费者被唤醒之后，、
		//这里只用if一次判断，可能消费者1取走了产品，但是消费者2wait之后没有再加判断，直接去取product
		//但是product已经被消费者1取走了，所以就会报错，因此用while
		while(factory.isEmpity()){
			try {
				System.out.println("工厂已空,等待生产者消费");
				factory.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("消费者在消费");
		factory.getProduct();
		factory.notifyAll();
	}
}
}
