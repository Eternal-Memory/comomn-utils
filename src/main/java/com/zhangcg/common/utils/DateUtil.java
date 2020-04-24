package com.zhangcg.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import com.sun.org.apache.bcel.internal.generic.NEW;
/**
 * 日期工具类
 * @author hp
 *
 */
public class DateUtil {
	/**
	 * 根据日期计算年龄
	 * @param birthday
	 * @return
	 */
	public static int getAgeByBirthday(Date birthday) {
		Calendar c = Calendar.getInstance();
		int nowYear = c.get(Calendar.YEAR);
		int nowMonth = c.get(Calendar.MONTH);
		int nowDate = c.get(Calendar.DAY_OF_MONTH);
		Calendar c2 = Calendar.getInstance();
		c2.setTime(birthday);
		int birthdayYear = c2.get(Calendar.YEAR);
		int birthdayMonth = c2.get(Calendar.MONTH);
		int birthdayDate = c2.get(Calendar.DAY_OF_MONTH);
		if(nowYear<birthdayYear) {
			throw new RuntimeException("传入日期错误");
		}
		int age=nowYear-birthdayYear;
		if(nowMonth<birthdayMonth) {
			age--;
		}
		if(nowMonth==birthdayMonth && nowDate<birthdayDate) {
			age--;
		}
		return age;
		
	}
	
	/**
	 *  根据传入的日期返回日期的月初。如传入 2020-04-24 ，返回 2020-04-01 00:00:00
	 * @param date
	 * @return
	 */
	public static Date getInitMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}
	
	/**
	 *  根据传入的日期返回日期的月末。如传入 2020-04-24  ，返回 2020-04-30 23:59:59
	 * @param date
	 * @return
	 */
	public static Date getEndMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.MONTH, 1);
		Date nexMonthInit = getInitMonth(c.getTime());
		c.setTime(nexMonthInit);
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}
	
	/**
	 * 随机产生一个min和max之间的日期
	 * @param min
	 * @param max
	 * @return
	 */
	public static Date random(Date min, Date max){
		long t1 = min.getTime();
		long t2 = max.getTime();
		long t=(long) (Math.random()*(t2-t1)+t1);
		return new Date(t);
	}
}
