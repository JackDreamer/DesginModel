package designMode.factory.abstractFactory;
/** 
 * @author  �  
 * @date ����ʱ�䣺2017��11��28�� ����2:51:01 
 * @version 1.0 
*/
public class MailFactory implements Provide{

	@Override
	public Sender produce() {
				
		return new MailSend();
	}

}
