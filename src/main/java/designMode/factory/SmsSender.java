package designMode.factory;
/** 
 * @author  �  
 * @date ����ʱ�䣺2017��11��28�� ����11:35:15 
 * @version 1.0 
*/
public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("this is massage!");
	}

}
