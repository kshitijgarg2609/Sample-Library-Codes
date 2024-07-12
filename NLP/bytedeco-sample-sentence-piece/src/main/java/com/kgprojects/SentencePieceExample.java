package com.kgprojects;

import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.Loader;
import org.bytedeco.sentencepiece.IntVector;
import org.bytedeco.sentencepiece.SentencePieceProcessor;
import org.bytedeco.sentencepiece.Status;
import org.bytedeco.sentencepiece.global.sentencepiece;

public class SentencePieceExample
{
	public static void main(String[] args)
	{
		Loader.load(sentencepiece.class);
		SentencePieceProcessor processor = new SentencePieceProcessor();
        Status status = processor.Load("en.wiki.bpe.vs10000.model");
        if (!status.ok()) {
            throw new RuntimeException(status.ToString());
        }

        IntVector ids = new IntVector();
        processor.Encode("hello world!", ids);

        for (int id : ids.get()) {
            System.out.print(id + " ");
        }
        System.out.println();

        BytePointer text = new BytePointer("");
        processor.Decode(ids, text);
        System.out.println(text.getString());
	}
}