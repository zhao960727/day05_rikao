package com.zyf.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zyf.dao.BookDao;
import com.zyf.entity.Book;
import com.zyf.utils.IOUtils;
import com.zyf.utils.StringUtil;

public class BookTest {
	
	public static void main(String[] args) {
		ApplicationContext aic=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BookDao dao = aic.getBean(BookDao.class);
		
		List<Object[]> list = IOUtils.readFile("ab.aci","\t");
		
		for (Object[] objects : list) {
			if (!StringUtil.judgeTelephoneIsOk(objects[3]+"") ) {
				//建立一个记录表error_record【图书id ,错误原因【0 表示手机号码不正确，1 表示受欢迎程度 错误】
				dao.addError(Integer.parseInt(objects[0]+""), 0);
			}else if(!StringUtil.isNumber(objects[5]+"")){
				dao.addError(Integer.parseInt(objects[0]+""), 1);
			}else{
				Book book = new Book(Integer.parseInt(objects[0]+""), objects[1]+"", objects[2]+"", objects[3]+"", objects[4]+"", Integer.parseInt(objects[5]+""));
				dao.addBook(book);
			}
		}
	}
}
