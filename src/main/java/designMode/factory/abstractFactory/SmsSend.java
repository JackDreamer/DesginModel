package designMode.factory.abstractFactory;
/** 
 * @author  �  
 * @date ����ʱ�䣺2017��11��28�� ����2:49:40 
 * @version 1.0 
*/
public class SmsSend implements Sender{

	@Override
	public void send() {
		System.out.println("this is massage!");
	}
}
