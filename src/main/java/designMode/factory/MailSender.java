package designMode.factory;
/** 
 * @author  �  
 * @date ����ʱ�䣺2017��11��28�� ����11:34:23 
 * @version 1.0 
*/
public class MailSender implements Sender{

	@Override
	public void send() {
		System.out.println("this is mail !");
	}

}
