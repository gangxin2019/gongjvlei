package com.gangxin.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		for (int i = 0; i < 50; i++) {
			int random = RandomUtil.random(2, 10);
			System.out.println(random);
		}

	}

	@Test
	public void testSubRandom() {
		for (int i = 0; i < 10; i++) {

			// 数组不可直接打印 需要for循环
			int[] subRandom = RandomUtil.subRandom(1, 7, 3);
			for (int b : subRandom) {
				System.out.print(b);
			}
			System.out.println();
		}

	}

	@Test
	public void testRandomCharacter() {

		char randomCharacter = RandomUtil.randomCharacter();
		System.out.println(randomCharacter);
	}

	@Test
	public void testRandomString() {
		String string = RandomUtil.randomString(4);
		System.out.println(string);
	}

}
