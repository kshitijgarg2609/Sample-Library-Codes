package com.kgprojects.tools;

import java.net.URI;
import java.util.Arrays;

import com.kgprojects.data.OpenNLPSourceForgeModelURLs;
import com.kgprojects.sample.SampleDataLoader;

import opennlp.tools.lemmatizer.LemmatizerME;
import opennlp.tools.lemmatizer.LemmatizerModel;
import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;

public class LemmatizerTest
{
	public static void main(String[] args)throws Exception
	{
		TokenizerModel token_model = new TokenizerModel(new URI(OpenNLPSourceForgeModelURLs.Tokenizer).toURL());
		Tokenizer tokenizer = new TokenizerME(token_model);
		
		POSModel pos_model = new POSModel(new URI(OpenNLPSourceForgeModelURLs.POS_Tagger_Maxent).toURL());
		POSTaggerME pos_tagger = new POSTaggerME(pos_model);
		
		LemmatizerModel lemma_model = new LemmatizerModel(new URI("https://raw.githubusercontent.com/richardwilly98/elasticsearch-opennlp-auto-tagging/master/src/main/resources/models/en-lemmatizer.dict").toURL());
		LemmatizerME lemmatizer = new LemmatizerME(lemma_model);
		
		String tokens[] = tokenizer.tokenize(SampleDataLoader.sampleSentence());
		String tags[] = pos_tagger.tag(tokens);
		String lemmas[] = lemmatizer.lemmatize(tokens, tags);
		System.out.println(Arrays.toString(tokens));
		System.out.println(Arrays.toString(tags));
		System.out.println(Arrays.toString(lemmas));
	}
}