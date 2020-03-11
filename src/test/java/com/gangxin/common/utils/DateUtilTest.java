package com.gangxin.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetDateByInitMonth() {
		Date date = DateUtil.getDateByInitMonth(new Date());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
	}

	@Test
	public void testGetDateByFullMonth() {
		Date date = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
	}
	

	@Test
	public void testRandomDate() {
		Date date = DateUtil.randomDate(new Date(909000000l), new Date());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
	}
	
	@Test
	public void testSql() {
		Date s1=DateUtil.getDateByInitMonth(new Date());
		Date s2=DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String d1=sdf.format(s1);
		String d2=sdf.format(s2);
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		String sql2 = sql.replace("{1}", d1).replace("{2}", d2);
		
		System.out.println(sql2);
	}

}
