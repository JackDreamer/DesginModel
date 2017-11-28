package designMode.factoryTest;

import org.junit.Test;

import designMode.factory.SendFactory;
import designMode.factory.Sender;
import designMode.factory.abstractFactory.MailFactory;
import designMode.factory.abstractFactory.Provide;

/** 
 * @author  �  
 * @date ����ʱ�䣺2017��11��28�� ����11:41:09 
 * @version 1.0 
*/
public class FactoryTest {
	
	@Test
	public void test1(){
		SendFactory sendFactory = new SendFactory();
		Sender send = sendFactory.smSender();
		send.send();
	}
	
	@Test
	public void test2(){
		Provide provide = new MailFactory();
		provide.produce().send();
	}

}
