package com.zhangcg.common.utils;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class AssertUtilTest {

	@Test
	public void testIsTrue() {
		try {
			AssertUtil.isTrue(3 > 10, "3������10");
		} catch (AssertException e) {
			System.out.println(e.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��������쳣������ϵ����Ա");
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

			AssertUtil.hasText(username, "�û�������Ϊ��");

		} catch (AssertException e) {

			System.out.println(e.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��������쳣������ϵ����Ա");
		}

	}

	@Test
	public void testGreaterThanZero() {
		try {
           //����
			AssertUtil.greaterThanZero(new BigDecimal(100), "100ֵ����С�ڵ���0");
			System.out.println("����");
			//������
			AssertUtil.greaterThanZero(new BigDecimal(-2), "-2ֵ����С�ڵ���0");

		} catch (AssertException e) {

			System.out.println(e.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��������쳣������ϵ����Ա");
		}
	}

}
