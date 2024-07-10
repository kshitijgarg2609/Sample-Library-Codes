package com.kgprojects.tools;

import java.net.URI;

import com.kgprojects.data.OpenNLPModelURLs;
import com.kgprojects.sample.SampleDataLoader;

import opennlp.tools.langdetect.Language;
import opennlp.tools.langdetect.LanguageDetector;
import opennlp.tools.langdetect.LanguageDetectorME;
import opennlp.tools.langdetect.LanguageDetectorModel;

public class LanguageDetectorTest
{
	public static void main(String[] args)throws Exception
	{
		LanguageDetectorModel lang_model = new LanguageDetectorModel(new URI(OpenNLPModelURLs.Language_Detector).toURL());
		LanguageDetector lang_detect = new LanguageDetectorME(lang_model);
		Language lang = lang_detect.predictLanguage(SampleDataLoader.sampleData());
		System.out.println("Language : "+lang.getLang());
		System.out.println("Confidence : "+lang.getConfidence());
	}
}