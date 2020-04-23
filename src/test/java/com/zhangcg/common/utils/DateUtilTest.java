package com.zhangcg.common.utils;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class DateUtilTest {

	@Test
	public void test() {
		System.out.println(DateUtil.random(new Date(1290000000000l), new Date()));
	}

}
