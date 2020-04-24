package com.zhangcg.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {
	@Test
	public void testSql() {
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		Date initMonth = DateUtil.getInitMonth(new Date());
		Date endMonth = DateUtil.getEndMonth(new Date());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date1 = format.format(initMonth);
		String date2 = format.format(endMonth);
		String newSql = sql.replace("{1}", date1).replace("{2}", date2);
		System.out.println(newSql);
		
	}
	
	@Test
	public void testGetAgeByBirthday() {
		Calendar c = Calendar.getInstance();
		c.set(2000, 5, 23);
		int age = DateUtil.getAgeByBirthday(c.getTime());
		System.out.println(age);
	}

	@Test
	public void testGetInitMonth() {
		Date date = DateUtil.getInitMonth(new Date());
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = fm.format(date);
		System.out.println(format);
	}

	@Test
	public void testGetEndMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2020, 4, 24);
		Date date = DateUtil.getEndMonth(c.getTime());
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = fm.format(date);
		System.out.println(format);
	}

	@Test
	public void testRandom() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 9, 1);
		Date date = DateUtil.random(c.getTime(), new Date());
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd ");
		String format = fm.format(date);
		System.out.println(format);
	}

}
