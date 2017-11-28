package designMode.factory.abstractFactory;
/** 
 * @author  �  
 * @date ����ʱ�䣺2017��11��28�� ����2:55:03 
 * @version 1.0 
*/
public class SmsFactory implements Provide{

	@Override
	public Sender produce() {
		return new SmsSend();
	}

}
