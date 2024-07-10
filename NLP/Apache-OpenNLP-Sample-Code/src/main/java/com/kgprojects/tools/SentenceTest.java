package com.kgprojects.tools;

import java.net.URI;

import com.kgprojects.data.OpenNLPSourceForgeModelURLs;
import com.kgprojects.sample.SampleDataLoader;

import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;

public class SentenceTest
{
	public static void main(String[] args)throws Exception
	{
		SentenceModel sen_model = new SentenceModel(new URI(OpenNLPSourceForgeModelURLs.Sentence_Detector).toURL());
		SentenceDetectorME sen_detect = new SentenceDetectorME(sen_model);
		for(String sen : sen_detect.sentDetect(SampleDataLoader.sampleData()))
		{
			System.out.println(sen);
		}
	}
}