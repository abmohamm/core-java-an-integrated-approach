//compile this program suing jdk1.6 compiler or later version of it.
//The message given by compiler is suppressed with the help of @SuppressWarnings annotation.
package com.app.samples.enumerationsandannotations;

import java.util.Hashtable;

public class SuppressWarningsDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		Hashtable hashTable = new Hashtable();
		hashTable.put(10, "Abid");
		hashTable.put(11, "Mohammad");
	}

}
