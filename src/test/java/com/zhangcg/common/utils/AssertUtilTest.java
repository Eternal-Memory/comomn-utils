package com.zhangcg.common.utils;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class AssertUtilTest {

	@Test
	public void testIsTrue() {
		try {
			AssertUtil.isTrue(3 > 10, "3不大于10");
		} catch (AssertException e) {
			System.out.println(e.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("程序出现异常，请联系管理员");
		}
	}

	@Test
	public void testIsFalse() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotNull() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsNull() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotEmptyCollectionOfQString() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotEmptyMapOfQQString() {
		fail("Not yet implemented");
	}

	@Test
	public void testHasText() {

		try {

			String username = "abc";

			AssertUtil.hasText(username, "用户名不能为空");

		} catch (AssertException e) {

			System.out.println(e.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("程序出现异常，请联系管理员");
		}

	}

	@Test
	public void testGreaterThanZero() {
		try {
           //正常
			AssertUtil.greaterThanZero(new BigDecimal(100), "100值不能小于等于0");
			System.out.println("正常");
			//不正常
			AssertUtil.greaterThanZero(new BigDecimal(-2), "-2值不能小于等于0");

		} catch (AssertException e) {

			System.out.println(e.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("程序出现异常，请联系管理员");
		}
	}

}
