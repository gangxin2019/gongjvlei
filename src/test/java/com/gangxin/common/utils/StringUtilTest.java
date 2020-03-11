package com.gangxin.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean hasLength = StringUtil.hasLength("");
		if(hasLength==true) {
			System.out.println("有值");
		}else {
			System.out.println("无值");
		}
		
		
	}
	@Test
	public void testIsUrl() {
		boolean httpUrl = StringUtil.isHttpUrl("www.xinhuanet.com");
		if(httpUrl==true) {
			System.out.println("是");
		}else {
			System.out.println("不是");
		}
		
		
	}

	@Test
	public void testHasText() {
		boolean hasText = StringUtil.hasText(" a ");
		if(hasText==true) {
			System.out.println("有值");
		}else {
			System.out.println("无值");
		}
	}

	@Test
	public void testRandomChineseString() {
		
		String name = StringUtil.randomChineseString(3);
		System.out.println(name);
	}

	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 20; i++) {
			String name = StringUtil.generateChineseName();
			System.out.println(name+" ");
		}

	}

}
