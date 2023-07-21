package Listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class C02ServletContextAttrListner implements ServletContextAttributeListener{

	
	@Override
	public void attributeAdded(ServletContextAttributeEvent scae) {
		 //속성 추가시 감지 
		System.out.println("C02ServletContextAttrListner's attributeAdded call!");
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		 //속성 제거시 감지
		System.out.println("C02ServletContextAttrListner's attributeRemoved call!");

	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		 //속성 변경시 감지 
		System.out.println("C02ServletContextAttrListner's attributeReplaced call!");

	}

	
	
}
