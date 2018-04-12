/**
  * @filename TimerMain.java
  * @description 
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.route;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

 /**
 * @type TimerMain
 * @description 
 * @author qye.zheng
 */
public final class TimerMain implements Runnable {

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void run() {
		final CamelContext camelContext = new DefaultCamelContext();
		try {
			camelContext.addRoutes(new TimerRouteBuilder());
			camelContext.setTracing(true);
			// 启动
			camelContext.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
