/**
* @ClassName: Observer
* @Description: TODO(这里用一句话描述这个类的作用)
* @author A18ccms a18ccms_gmail_com
* @date 2017年5月7日 下午2:16:33
*
*/ 
package com.yrl.base.java.design.pattern.observer;

/**
 * @ClassName: Observer
 * @Description: 观察者
 * @author yrl:yangrl2014@163.com
 * @date 2017年5月7日 下午2:16:33
 *
 */
public interface Observer {
/**
 * 
* @Title: update
* @Description: 温度变化的更新操作
* @author:yang
* @date 2017年5月7日 下午2:21:17 
* @param temperature 温度
* @param humidity 湿度
* @param pressure 气压
* @return:void
* @throws
 */
 void update(float temperature,float humidity,float pressure);
}
