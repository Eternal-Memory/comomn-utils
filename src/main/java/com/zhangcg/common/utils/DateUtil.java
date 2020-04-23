package com.zhangcg.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.sun.org.apache.bcel.internal.generic.NEW;
/**
 * 日期工具类
 * @author hp
 *
 */
public class DateUtil {
	public static Date random(Date min, Date max){
		long t1 = min.getTime();
		long t2 = max.getTime();
		long t=(long) (Math.random()*(t2-t1)+t1);
		return new Date(t);
	}
}
