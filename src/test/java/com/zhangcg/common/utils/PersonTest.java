package com.zhangcg.common.utils;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		/*
		 * 姓名属性值调用StringUtil.generateChineseName()创建（4分）
		 * 年龄属性值调用RandomUtil.random()创建，必须在1-120岁之间（4分）
		 * 介绍属性值调用StringUtil.randomChineseString()创建，字数为140个随机汉字（4分）
		 * 注册日期属性值模拟2010年1月1日至今任意随机时间（4分）。 批量生成1万个，并在控制台输出（4分）
		 */
		for (int i = 0; i < 10000; i++) {
			Person person = new Person();
			person.setName(StringUtil.generateChineseName());
			person.setAge(RandomUtil.random(1, 120));
			person.setAbout(StringUtil.randomChineseString(140));
			Calendar c = Calendar.getInstance();
			c.set(2010, 0,1);
			person.setCreated(DateUtil.random(c.getTime(), new Date()));
			System.out.println(i+1+" "+person);
		}
	}

}
