/**
* @ClassName: Subject
* @Description: TODO(这里用一句话描述这个类的作用)
* @author A18ccms a18ccms_gmail_com
* @date 2017年5月7日 下午2:14:55
*
*/ 
package com.yrl.base.java.design.pattern.observer;

/**
 * @ClassName: Subject
 * @Description: 观察者主题
 * @author yrl:yangrl2014@163.com
 * @date 2017年5月7日 下午2:14:55
 *
 */
public interface Subject {
	/**
	 * 
	* @Title: register
	* @Description: 注册观察者
	* @author:yang
	* @date 2017年5月7日 下午2:22:38 
	* @param observer
	* @return:void
	* @throws
	 */
void register(Observer observer);
/**
 * 
* @Title: unRegister
* @Description: 注销观察者
* @author:yang
* @date 2017年5月7日 下午2:23:05 
* @param observer
* @return:void
* @throws
 */
void unRegister(Observer observer);
/**
 * 
* @Title: notifyObservers
* @Description: 通知观察者
* @author:yang
* @date 2017年5月7日 下午2:25:07 
* @return:void
* @throws
 */
 
void notifyObservers();
}
