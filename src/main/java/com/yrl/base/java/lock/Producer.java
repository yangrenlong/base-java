package com.yrl.base.java.lock;

/**
 * wait-notfy：生产消费者模型：生产者
 * 
 * @ClassName: Producer
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yrl:yangrl2014@163.com
 * @date 2017年5月7日 下午2:47:26
 *
 */
public class Producer {
	private ProductFactory factory = null;

	public Producer(ProductFactory factory) {
		this.factory = factory;
	}

	public void produce() {
		synchronized (factory) {
			//想象一下这里为什么用的是while循环，因为，如果这里只是用的if判断，
			//在消费者那边介绍
			while (factory.isFull()) {
				try {
					System.out.println("工厂已经库满,等待消费者消费");
					factory.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("工厂还没有满库,继续生产");
			factory.addProduct();
			//如果这里使用的notify。在多消费者--多生产者的情况下导致
			//假死，就是死锁了，因为可能唤醒的是另外一个直等待的同类线程，造成异类线程一直等待
			//所以用notify比较保险，唤醒所有的wait线程，包括异类的
			factory.notifyAll();
		}
	}
}
