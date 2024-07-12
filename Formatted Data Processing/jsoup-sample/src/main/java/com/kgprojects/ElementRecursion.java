package com.kgprojects;

import org.jsoup.nodes.Node;

public class ElementRecursion
{
	public void recall(Node e)
	{
		System.out.println("______________________________________________________");
		System.out.println(e.toString());
		System.out.println("______________________________________________________");
		for(Node child : e.childNodes())
		{
			recall(child);
		}
	}
}
