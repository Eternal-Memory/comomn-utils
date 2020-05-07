package com.zhangcg.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import com.sun.org.apache.bcel.internal.generic.NEW;
/**
 * ���ڹ�����
 * @author hp
 *
 */
public class DateUtil {
	public static Date SubDate(Date date,int hours) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.HOUR_OF_DAY, -hours);
		return c.getTime();
		
	}
	
	/**
	 * �������ڼ�������
	 * @param birthday
	 * @return
	 */
	public static int getAgeByBirthday(Date birthday) {
		//1��ȡϵͳ��ǰ�� �� ��
		Calendar c = Calendar.getInstance();
		int nowYear = c.get(Calendar.YEAR);
		int nowMonth = c.get(Calendar.MONTH);
		int nowDate = c.get(Calendar.DAY_OF_MONTH);
		//2��ȡ�������ڵ����յ��� �� ��
		Calendar c2 = Calendar.getInstance();
		c2.setTime(birthday);
		int birthdayYear = c2.get(Calendar.YEAR);
		int birthdayMonth = c2.get(Calendar.MONTH);
		int birthdayDate = c2.get(Calendar.DAY_OF_MONTH);
		if(nowYear<birthdayYear) {
			throw new RuntimeException("�������ڴ���");
		}
		//4.���������� �õ����� 2000-04-01
		int age=nowYear-birthdayYear;
		//û�е����������������ȥ1
		if(nowMonth<birthdayMonth) {
			age--;
		}
		//û�е������� �����ȥ1
		if(nowMonth==birthdayMonth && nowDate<birthdayDate) {
			age--;
		}
		return age;
		
	}
	
	/**
	 *  ���ݴ�������ڷ������ڵ��³����紫�� 2020-04-24 ������ 2020-04-01 00:00:00
	 * @param date
	 * @return
	 */
	public static Date getInitMonth(Date date) {
		//Calendar ��һ�������ࡣ�ṩ �������ڣ��Ӽ����ڵȷ������������Ա������������
		Calendar c = Calendar.getInstance();
		//�ô�������ڳ�ʼ��������
		c.setTime(date);
		//����������³������ı�����µ�����Ϊ��һ��
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}
	
	/**
	 *  ���ݴ�������ڷ������ڵ���ĩ���紫�� 2020-04-24  ������ 2020-04-30 23:59:59
	 * @param date
	 * @return
	 */
	public static Date getEndMonth(Date date) {
		//Calendar ��һ�������ࡣ�ṩ �������ڣ��Ӽ����ڵȷ������������Ա������������
		Calendar c = Calendar.getInstance();
		//�ô�������ڳ�ʼ��������
		c.setTime(date);
		//���¼�1  2020-05-24 �� �ٱ���³� 2020-05-01    �� ��ȥһ�룬�ٻ�ȡ����
		c.add(Calendar.MONTH, 1);
		Date nexMonthInit = getInitMonth(c.getTime());
		//��ʼ��������
		c.setTime(nexMonthInit);
		c.add(Calendar.SECOND, -1);//�� ��ȥһ��
		return c.getTime();
	}
	
	/**
	 * �������һ��min��max֮�������
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
