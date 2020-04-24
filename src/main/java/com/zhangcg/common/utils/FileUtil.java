package com.zhangcg.common.utils;

import java.io.File;

/**
 * 文件工具类
 * @author hp
 *
 */
public class FileUtil {
	/**
	 * 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”
	 * @param fileName
	 * @return
	 */
	public static String getExtendName(String fileName) {
		if(!StringUtil.hasText(fileName) || !fileName.contains(".")) {
			throw new RuntimeException("不是文件");
		}
		return fileName.substring(fileName.lastIndexOf("."));
	}
	
	/**
	 * 方法2：返回操作系统临时目录
	 * @return
	 */
	public static File getTempDirectory() {
		String path = System.getProperty("java.io.tmpdir");
		return new File(path);
	}
	
	/**
	 * 方法3：返回操作系统用户目录(5分)
	* 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}>
	 */
	public static File getUserDirectory() {
		String path = System.getProperty("user.home");
		return new File(path);
	}
}
