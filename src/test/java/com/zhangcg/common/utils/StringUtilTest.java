package com.zhangcg.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {
	
	@Test
	public void testGetPlaceholderValue() {
		String str="http://news.cnstock.com/news,yw-201908-4413224.htm";
		String string = StringUtil.getPlaceholderValue(str, "[0-9]+(?=[^0-9]*$)");
		System.out.println(string);
	}
	
	@Test
	public void testIsNumber() {
		String str ="a";
		boolean b = StringUtil.isNumber(str);
		if(b) {
			System.out.println("是数字");
		}else {
			System.out.println("不是数字");

		}
	}

	@Test
	public void testIdPhone() {
		String str ="18799999991";
		boolean b = StringUtil.isPhone(str);
		 if(b) {
			 System.out.println("是");
		 }else {
			 System.out.println("不是");

		 }
	}

	@Test
	public void testHasLength() {
		String str=" ";
		System.out.println(StringUtil.hasLength(str));
	}

	@Test
	public void testHasText() {
		String str=" ";
		System.out.println(StringUtil.hasText(str));
	}

	@Test
	public void testRandomChineseString() {
		String string = StringUtil.randomChineseString(100);
		System.out.println(string);
	}

	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 100; i++) {
			String name = StringUtil.generateChineseName();
			System.out.println(name);
		}
	}

}
