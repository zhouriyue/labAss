package com.gxuwz.lab_assistant.web.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	
	/**
	 * 格式化时间字符串yyyy/MM/DD
	 * @param date
	 * @return
	 */
	public static String formatDateStringYMD(String date) {
		return date.substring(0,10).replace("-", "/");
	}
	
	/**
	 * 格式化时间
	 * @param date
	 * @return
	 */
	public static String format(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	
		return df.format(date);
	}
	
	/**
	 * 格式化当前时间
	 * @return
	 */
	public static String formatCurrentDate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	
		return df.format(new Date());
	}
	
	public String createId() {
		SimpleDateFormat df = new SimpleDateFormat("yyMMddHHmmss");
		return null;
	}

}
