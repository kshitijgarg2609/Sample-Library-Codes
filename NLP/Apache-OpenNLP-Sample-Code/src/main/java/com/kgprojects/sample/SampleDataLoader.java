package com.kgprojects.sample;

import java.io.File;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;

public class SampleDataLoader
{
	public static File sample = new File(System.getProperty("user.dir"),"sample");
	public static String sampleData()throws Exception
	{
		return FileUtils.readFileToString(sample.listFiles()[0],StandardCharsets.UTF_8);
	}
	public static String sampleSentence()
	{
		return "Albert Einstein revolutionized our understanding of the universe with his groundbreaking theories of relativity and quantum mechanics.";
	}
}