package designMode.factory.abstractFactory;
/** 
 * @author  �  
 * @date ����ʱ�䣺2017��11��28�� ����2:48:59 
 * @version 1.0 
*/
public class MailSend implements Sender{

	@Override
	public void send() {
		System.out.println("this is mail!");
	}

}
