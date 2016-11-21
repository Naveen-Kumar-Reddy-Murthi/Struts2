package org.mnr.service;

import java.util.HashSet;
import java.util.Set;

public class TutorialServiceImpl implements TutorialService {
	
	private Set<String> languages	=	new HashSet<String>();
	
	public TutorialServiceImpl(){
		languages.add("java");
		languages.add("dotnet");
	}

	@Override
	public String search(String language) {
		if(languages.contains(language))
			return " Supported";
		return " Not Supported";
	}

	@Override
	public boolean add(String language) {
		if(languages.add(language))
			return true;
		return false;
	}

	@Override
	public boolean delete(String language) {
		if(languages.remove(language))
			return true;
		return false;
	}

	@Override
	public boolean update(String language) {
		if(languages.contains(language))
			return true;
		return false;
	}

}
