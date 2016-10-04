package com.iwt.core.training.collections;

import java.util.ArrayList;
import java.util.List;

public class TestCollections {

	public static void main(String[] args) {

		String[] strs = new String[] { "first", "second", "third" };

		List strList1 = new ArrayList();
		strList1.add(new Object());
		strList1.add("first");
		strList1.add("second");
		strList1.add("third");

		String object = (String) strList1.get(0);

		List<String> strList = new ArrayList<String>();
		strList.add("first");
		strList.add("second");
		strList.add("third");

		String string = strList.get(0);

	}

}
