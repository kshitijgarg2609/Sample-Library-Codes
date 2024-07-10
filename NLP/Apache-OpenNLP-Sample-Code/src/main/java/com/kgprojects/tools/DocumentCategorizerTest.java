package com.kgprojects.tools;

import java.net.URI;

import com.kgprojects.data.OpenNLPSourceForgeModelURLs;

import opennlp.tools.doccat.DoccatModel;

public class DocumentCategorizerTest
{
	public static void main(String[] args)throws Exception
	{
		for(String url : OpenNLPSourceForgeModelURLs.getAllUrls())
		{
			try
			{
				System.out.println("Testing : "+url);
				DoccatModel doc_model = new DoccatModel(new URI(url).toURL());
				System.out.println("pass");
			}
			catch(Exception e)
			{
				System.out.println("fail");
			}
		}
	}
}