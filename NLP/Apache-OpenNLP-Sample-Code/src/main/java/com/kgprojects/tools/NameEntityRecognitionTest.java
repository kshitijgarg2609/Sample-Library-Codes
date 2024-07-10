package com.kgprojects.tools;

import java.net.URI;
import java.util.Arrays;

import com.kgprojects.data.OpenNLPSourceForgeModelURLs;
import com.kgprojects.sample.SampleDataLoader;

import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import opennlp.tools.util.Span;

public class NameEntityRecognitionTest
{
	public static void main(String[] args)throws Exception
	{
		TokenizerModel token_model = new TokenizerModel(new URI(OpenNLPSourceForgeModelURLs.Tokenizer).toURL());
		Tokenizer tokenizer = new TokenizerME(token_model);
		
		TokenNameFinderModel name_finder_model = new TokenNameFinderModel(new URI(OpenNLPSourceForgeModelURLs.Name_Finder_Person).toURL());
		NameFinderME name_finder = new NameFinderME(name_finder_model);
		
		String tokens[] = tokenizer.tokenize(SampleDataLoader.sampleSentence());
		
		System.out.println(Arrays.toString(tokens));

		for(Span span : name_finder.find(tokens))
		{
			for(int i=span.getStart();i<span.getEnd();i++)
			{
				System.out.println(tokens[i]+" : "+span.getProb()+" : "+span.getType());
			}
		}
		name_finder.clearAdaptiveData();
	}
}