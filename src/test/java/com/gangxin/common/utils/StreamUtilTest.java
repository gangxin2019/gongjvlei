package com.gangxin.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		
		System.out.println(StreamUtil.readTextFile(new FileInputStream("D:/b.txt")));
	}

	@Test
	public void testReadTextFileFile() throws FileNotFoundException {
		System.out.println(StreamUtil.readTextFile(new File("D:/b.txt")));
	}
	
	@Test
	public void readLineTextFile() throws IOException {
		System.out.println(StreamUtil.readLineTextFile(new File("D:/b.txt")));
	}

}
