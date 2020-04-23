package com.zhangcg.common.utils;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		Random random = new Random();
		int i = RandomUtil.random(1, 3);
		System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		fail("Not yet implemented");
	}

	@Test
	public void testRandomCharacter() {
		fail("Not yet implemented");
	}

	@Test
	public void testRandomString() {
		fail("Not yet implemented");
	}

}
