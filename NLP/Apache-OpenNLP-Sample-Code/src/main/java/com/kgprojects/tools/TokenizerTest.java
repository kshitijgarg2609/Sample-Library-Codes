package com.kgprojects.tools;

import java.net.URI;

import com.kgprojects.data.OpenNLPSourceForgeModelURLs;
import com.kgprojects.sample.SampleDataLoader;

import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;

public class TokenizerTest
{
	public static void main(String[] args)throws Exception
	{
		TokenizerModel token_model = new TokenizerModel(new URI(OpenNLPSourceForgeModelURLs.Tokenizer).toURL());
		Tokenizer tokenizer = new TokenizerME(token_model);
		for(String tokens : tokenizer.tokenize(SampleDataLoader.sampleSentence()))
		{
			System.out.println(tokens);
		}
	}
}