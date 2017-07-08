package com.yrl.base.java.lock;

/**
 * 需要2点注意：
 * 1 在多消费者多生产者模型下:notify和notifyAll notify会引起假死
 * 2 在一个生产者和多消费者模式下：if while的使用区别。
 * @ClassName: ProConMain
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yrl:yangrl2014@163.com
 * @date 2017年5月7日 下午2:47:26
 *
 */
public class ProConMain {
public void test(ProductFactory factory){
	synchronized (factory) {
		factory.notify();
	}
}
public static void main(String[] args) {
	final ProductFactory factory = new ProductFactory();
	for(int i=0;i<100;i++){
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
             new Producer(factory).produce();				
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
             new Consumer(factory).consumer();				
			}
		});
		t.start();
		t2.start();
	}
}
}
