package designMode.factory;
/** 
 * @author  �  
 * @date ����ʱ�䣺2017��11��28�� ����11:36:10 
 * @version 1.0 
*/
public class SendFactory {

	public Sender smSender(){
		return new SmsSender();
	}
	
	public Sender mailSender(){
		return new MailSender();
	}
}
