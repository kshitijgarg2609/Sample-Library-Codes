package com.kgprojects.tools;

import java.net.URI;
import java.util.Arrays;

import com.kgprojects.data.OpenNLPSourceForgeModelURLs;
import com.kgprojects.sample.SampleDataLoader;

import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;

public class POSTagger
{
	public static void main(String[] args)throws Exception
	{
		TokenizerModel token_model = new TokenizerModel(new URI(OpenNLPSourceForgeModelURLs.Tokenizer).toURL());
		Tokenizer tokenizer = new TokenizerME(token_model);
		
		POSModel pos_model = new POSModel(new URI(OpenNLPSourceForgeModelURLs.POS_Tagger_Maxent).toURL());
		POSTaggerME pos_tagger = new POSTaggerME(pos_model);
		
		String tokens[] = tokenizer.tokenize(SampleDataLoader.sampleSentence());
		String tags[] = pos_tagger.tag(tokens);
		double prob[] = pos_tagger.probs();
		System.out.println(Arrays.toString(tokens));
		System.out.println(Arrays.toString(tags));
		System.out.println(Arrays.toString(prob));
	}
}