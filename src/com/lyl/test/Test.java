package com.lyl.test;

import com.lyl.beanfactory.BeanFactory;
import com.lyl.dao.CourseDao;

public class Test {

	public static void main(String[] args) {
		//实例化BeanFactory
		BeanFactory factory = new BeanFactory();
		//调用初始化方法，传入xml路径
		factory.init("com/lyl/config/Spring.xml");
		//通过BeanFactory获取对象
		CourseDao courseDao = (CourseDao) factory.getBean("courseDao");
		//调用方法
		courseDao.test();;
	}

}
