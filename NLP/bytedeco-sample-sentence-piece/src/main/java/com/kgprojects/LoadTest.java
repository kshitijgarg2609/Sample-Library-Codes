package com.kgprojects;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.sentencepiece.global.sentencepiece;

public class LoadTest
{
	public static void main(String[] args)
	{
		Loader.load(sentencepiece.class);
		System.out.println("Tested !!!");
	}
}