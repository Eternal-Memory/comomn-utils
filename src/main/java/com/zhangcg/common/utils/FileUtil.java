package com.zhangcg.common.utils;

import java.io.File;

/**
 * �ļ�������
 * @author hp
 *
 */
public class FileUtil {
	/**
	 * ����1������һ���ļ��������ظ��ļ�������չ�������硰aaa.jpg�������ء�.jpg��
	 * @param fileName
	 * @return
	 */
	public static String getExtendName(String fileName) {
		if(!StringUtil.hasText(fileName) || !fileName.contains(".")) {
			throw new RuntimeException("�����ļ�");
		}
		return fileName.substring(fileName.lastIndexOf("."));
	}
	
	/**
	 * ����2�����ز���ϵͳ��ʱĿ¼
	 * @return
	 */
	public static File getTempDirectory() {
		String path = System.getProperty("java.io.tmpdir");
		return new File(path);
	}
	
	/**
	 * ����3�����ز���ϵͳ�û�Ŀ¼(5��)
	* ����Linuxϵͳ����/home/{�û��˺���}��Windowsϵͳ����C:\Users\{�û��˺���}>
	 */
	public static File getUserDirectory() {
		String path = System.getProperty("user.home");
		return new File(path);
	}
}
