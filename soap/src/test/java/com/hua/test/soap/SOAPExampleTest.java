/**
 * 描述: 
 * SOAPExampleTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.soap;

// 静态导入
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;

import org.junit.Ignore;
import org.junit.Test;
import org.w3c.dom.Document;

import com.hua.test.BaseTest;


/**
 * 描述: SOAP webservice - 测试
 * 
 * @author qye.zheng
 * SOAPExampleTest
 */
public final class SOAPExampleTest extends BaseTest {

	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSOAPExample() {
		try {
			String ns = "http://axisversion.sample";
			// WSDL
			String wsdlUrl = "http://127.0.0.1:8080/axis2/services/Version?wsdl";
			
			// 1. 创建服务
			URL url = new URL(wsdlUrl);
			QName qname = new QName(ns, "Version");
			Service service = Service.create(url, qname);
			
			// 2. 创建Dispatcher 
			Dispatch<SOAPMessage> dispatch = service.createDispatch(new QName(ns, "VersionHttpSoap11Endpoint"), 
					SOAPMessage.class, Service.Mode.MESSAGE);
			
			// 3. 创建SOAPMessage
			SOAPMessage message = MessageFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL).createMessage();
			SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
			SOAPBody body = envelope.getBody();
			
			// 4. 创建QName来指定消息中传递数据
			QName ename = new QName(ns, "getVersion", "axis");
			SOAPBodyElement ele = body.addBodyElement(ename);
			
			// 传递参数
			message.writeTo(System.out);
			System.out.println("\n invoking ...");
			
			// 5. 通过Dispatch 传递消息，会返回响应消息
			SOAPMessage response = dispatch.invoke(message);
			response.writeTo(System.out);
			System.out.println();
			
			// 6. 响应消息处理，将响应的消息转换为dom (w3c dom)对象
			Document doc = response.getSOAPPart().getEnvelope().getBody().extractContentAsDocument();
			
			String result = doc.getElementsByTagName("ns:return").item(0).getTextContent();
			System.out.println("响应报文: ");
			System.out.println(result);
			
		} catch (Exception e) {
			log.error("testSOAPExample =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void test() {
		try {
			
			
		} catch (Exception e) {
			log.error("test =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSOAP() {
		try {
			
			
		} catch (Exception e) {
			log.error("testSOAP =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testTemp() {
		try {
			
			
		} catch (Exception e) {
			log.error("testTemp=====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testCommon() {
		try {
			
			
		} catch (Exception e) {
			log.error("testCommon =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSimple() {
		try {
			
			
		} catch (Exception e) {
			log.error("testSimple =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBase() {
		try {
			
			
		} catch (Exception e) {
			log.error("testBase =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 解决ide静态导入消除问题 
	 * @author qye.zheng
	 * 
	 */
	@Ignore("解决ide静态导入消除问题 ")
	private void noUse() {
		String expected = null;
		String actual = null;
		Object[] expecteds = null;
		Object[] actuals = null;
		String message = null;
		
		assertEquals(expected, actual);
		assertEquals(message, expected, actual);
		assertNotEquals(expected, actual);
		assertNotEquals(message, expected, actual);
		
		assertArrayEquals(expecteds, actuals);
		assertArrayEquals(message, expecteds, actuals);
		
		assertFalse(true);
		assertTrue(true);
		assertFalse(message, true);
		assertTrue(message, true);
		
		assertSame(expecteds, actuals);
		assertNotSame(expecteds, actuals);
		assertSame(message, expecteds, actuals);
		assertNotSame(message, expecteds, actuals);
		
		assertNull(actuals);
		assertNotNull(actuals);
		assertNull(message, actuals);
		assertNotNull(message, actuals);
		
		assertThat(null, null);
		assertThat(null, null, null);
		
		fail();
		fail("Not yet implemented");
		
	}

}
