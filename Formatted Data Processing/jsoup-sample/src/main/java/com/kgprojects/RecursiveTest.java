package com.kgprojects;

import java.io.File;

import org.jsoup.parser.Parser;

public class RecursiveTest
{
	public static void main(String[] args)
	{
		File html_dir = new File(System.getProperty("user.dir"),"html");
		(new ElementRecursion()).recall(Parser.parse(html_dir.list()[0], html_dir.toURI().toString()));
	}
}
