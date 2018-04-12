/**
  * @filename TimerRouteBuilder.java
  * @description 
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

 /**
 * @type TimerRouteBuilder
 * @description 
 * @author qye.zheng
 */
public final class TimerRouteBuilder extends RouteBuilder {

	/**
	 * @description 
	 * @throws Exception
	 * @author qye.zheng
	 */
	@Override
	public void configure() throws Exception {
		from("timer://timer?period=1000").process(new Processor() {
			/**
			 * @description 
			 * @param exchange
			 * @throws Exception
			 * @author qye.zheng
			 */
			@Override
			public void process(Exchange exchange) throws Exception {
				System.out.println(exchange.toString());
			}
		});
	}

}
