package inde.dubbo;

import inde.dubbo.api.IProvider;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @ClassName: Client
* @Description: 客户端接收
* @author 谢振海
* @date 2017年9月26日 下午11:53:14
*/
public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "dubbo.xml" });
		context.start();
		IProvider demoService = (IProvider) context.getBean("providerService"); // 获取bean
		String message = "";
		try {
			System.out.println("服务消费方");
			message = demoService.build("客户端");
			System.out.println("这个信息来自服务端:" + message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void dubbo2Test( ) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "dubbo2.xml" });
		context.start();
		IProvider demoService = (IProvider) context.getBean("providerService"); // 获取bean
		String message = "";
		try {
			System.out.println("服务消费方");
			message = demoService.build("客户端");
			System.out.println("这个信息来自服务端:" + message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}