package com.zhangcg.common.utils;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		/*
		 * ��������ֵ����StringUtil.generateChineseName()������4�֣�
		 * ��������ֵ����RandomUtil.random()������������1-120��֮�䣨4�֣�
		 * ��������ֵ����StringUtil.randomChineseString()����������Ϊ140��������֣�4�֣�
		 * ע����������ֵģ��2010��1��1�������������ʱ�䣨4�֣��� ��������1��������ڿ���̨�����4�֣�
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
