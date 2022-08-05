package com.collectors;

import java.util.Comparator;

public class ComparatorName implements Comparator<ComparatorExample> {

	@Override
	public int compare(ComparatorExample o1, ComparatorExample o2) {
	
		return o1.getName().compareTo(o2.getName());
	}

}

