package com.gangxin.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	/*
	* 方法1：(5分)
	* 给一个时间对象，返回该时间所
	* 在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		
		//获取当前系统时间的日历类
		Calendar c = Calendar.getInstance();
		
		//用传入的日期构建日历类
		c.setTime(src);
		
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY,0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		//将时间转化为毫秒值 以1970年1月1日 00：00：00开始计算
		return c.getTime();
	
	}
	/*
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		
		//创建一个日历类
		Calendar c = Calendar.getInstance();
		//通过该时间获取时间类
		c.setTime(src);
		
		c.add(Calendar.MONTH, 1);//月份+1
		Date date = getDateByInitMonth(c.getTime());
		c.setTime(date);
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	
	}
	
	//生成指定范围内随机日期.如 2010年1月1日至今任意随机时间
	public static Date randomDate(Date d1,Date d2) {
		
		//开始的毫秒数
		long l1 = d1.getTime();
		//结束的毫秒数
		long l2 = d2.getTime();
		
		
		
		long l3= (long) ((Math.random() * (l2-l1 +1)) +l1);
		
		return new Date(l3);
		
	}
	/**
	 * 给定时间 随机日期(字符串参数)
	 * @param stratDate  "yyyy-MM-dd"
	 * @param endDate "yyyy-MM-dd"
	 * @return
	 */
	public static Date randomDate(String stratDate,String endDate) {
		SimpleDateFormat st = new SimpleDateFormat("yyyy-MM-dd");
		long date = 0L;
		Date d1=null;
		Date d2=null;
		try {
			if(stratDate != null && !stratDate .equals("")) {
				 d1 = st.parse(stratDate);
			}
			if(endDate != null && !stratDate .equals("")) {
				 d2 = st.parse(endDate);
			}
			
			
			date = (long) (Math.random() * (d2.getTime() - d1.getTime() + 1) +d1.getTime());
			
			
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new Date(date);
		
	}


}
