package com.zhangcg.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 流处理工具
 * @author hp
 *
 */
public class StreamUtil {
	/**
	 * 方法1：批量关闭流，参数能传无限个。
	 * @param autoCloseables
	 */
	public static void closeAll(AutoCloseable...autoCloseables) {
		if(autoCloseables==null || autoCloseables.length==0) {
			throw new RuntimeException("参数异常");
		}
		for (AutoCloseable autoCloseable : autoCloseables) {
			try {
				autoCloseable.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容
	 * @param src
	 * @return
	 */
	public static String readTextFile(InputStream src) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(src));
		String str=null;
		StringBuffer sb = new StringBuffer();
		try {
			while ((str=reader.readLine())!=null) {
				sb.append(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll(reader);
		}
		return str;
	}
	
	/**
	 *  方法3：传入文本文件对象，返回该文件内容，并且要求内部调用上面第2个方法。
	 * @param txtFile
	 * @return
	 */
	public static String readTextFile(File txtFile) {
		try {
			FileInputStream stream = new FileInputStream(txtFile);
			return readTextFile(stream);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 读取文件到集合
	 * @param txtFile
	 * @return
	 */
	public static List<String> readTextFile2List(File txtFile){
		List<String> list = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(txtFile)));
			String str=null;
			while ((str=reader.readLine())!=null) {
				list.add(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
