package com.gangxin.common.utils;

import java.util.HashSet;
import java.util.Random;

/**
 * 
 * @ClassName: RandomUtil
 * @Description: 随机数工具类
 * @author: 随风
 * @date: 2019年11月7日 下午2:05:06
 */
public class RandomUtil {
	
	/**
	 * 
	 * @Title: randomCharacter2 
	 * @Description: 随机字母
	 * @return
	 * @return: char
	 */
	public static char randomCharacter2() {
		String str="qwertyuiopasdfghjklzxcvbnm";
		
		
		return str.charAt(random(0, str.length()-1));

	}
	/**
	 * 
	 * @Title: randomString 
	 * @Description: 随机字母数量
	 * @param length
	 * @return
	 * @return: String
	 */
	public static String randomString2(int length) {
		
		String str="";
		for (int i = 0; i < length; i++) {
			str+=randomCharacter2();
		}
		
		return str;

	}
	
	public static String randomEmain() {
		
		String zm = randomString2(random(3, 20));
		String hz = null;
		int num = random(1, 6);
		if(num==1) {
			hz="@qq.com";
		}else if(num==2) {
			hz="@163.com";
		}else if(num==3) {
			hz="@sian.com";
		}else if(num==4) {
			hz="@gmail.com";
		}else if(num==5) {
			hz="@sohu.com";
		}else if(num==6) {
			hz="@hotmail.com";
		}
		
		String email=zm+hz;
		
		return email;
		
	}

	// 方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max) {
		Random random = new Random();

		return random.nextInt(max - min + 1) + min;

	}

	// 方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。
	// (8分)
	public static int[] subRandom(int min, int max, int subs) {

		// 创建一个不可存储重复的set容器
		HashSet<Integer> set = new HashSet<Integer>();

		// 将随机数存入set集合中
		while (set.size() != subs) {
			set.add(random(min, max));
		}

		// 创建一个int数组
		int[] array = new int[subs];
		int i = 0;
		for (Integer sets : set) {
			array[i] = sets;
			i++;
		}

		return array;

	}

	// 方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter() {
		String str="1234567890";
		
		
		return str.charAt(random(0, str.length()-1));

	}
	

	// 方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length) {
		
		String str="";
		for (int i = 0; i < length; i++) {
			str+=randomCharacter();
		}
		
		return str;

	}

}
