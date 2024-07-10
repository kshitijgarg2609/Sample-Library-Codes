package com.kgprojects.data;

public class OpenNLPSourceForgeModelURLs
{
	public static final String Tokenizer = "https://opennlp.sourceforge.net/models-1.5/en-token.bin";
	public static final String Sentence_Detector = "https://opennlp.sourceforge.net/models-1.5/en-sent.bin";
	public static final String POS_Tagger_Maxent = "https://opennlp.sourceforge.net/models-1.5/en-pos-maxent.bin";
	public static final String POS_Tagger_Perceptron = "https://opennlp.sourceforge.net/models-1.5/en-pos-perceptron.bin";
	public static final String Name_Finder_Date = "https://opennlp.sourceforge.net/models-1.5/en-ner-date.bin";
	public static final String Name_Finder_Location = "https://opennlp.sourceforge.net/models-1.5/en-ner-location.bin";
	public static final String Name_Finder_Money = "https://opennlp.sourceforge.net/models-1.5/en-ner-money.bin";
	public static final String Name_Finder_Organization = "https://opennlp.sourceforge.net/models-1.5/en-ner-organization.bin";
	public static final String Name_Finder_Percentage = "https://opennlp.sourceforge.net/models-1.5/en-ner-percentage.bin";
	public static final String Name_Finder_Person = "https://opennlp.sourceforge.net/models-1.5/en-ner-person.bin";
	public static final String Name_Finder_Time = "https://opennlp.sourceforge.net/models-1.5/en-ner-time.bin";
	public static final String Chunker = "https://opennlp.sourceforge.net/models-1.5/en-chunker.bin";
	public static final String Parser = "https://opennlp.sourceforge.net/models-1.5/en-parser-chunking.bin";
	public static final String Coreference = "https://opennlp.sourceforge.net/models-1.4/english/coref/";
	
	public static String[] getAllUrls()
	{
		return new String[]
				{
					Tokenizer,
					Sentence_Detector,
					POS_Tagger_Maxent,
					POS_Tagger_Perceptron,
					Name_Finder_Date,
					Name_Finder_Location,
					Name_Finder_Money,
					Name_Finder_Organization,
					Name_Finder_Percentage,
					Name_Finder_Time,
					Chunker,
					Parser,
					Coreference
				};
	}
}