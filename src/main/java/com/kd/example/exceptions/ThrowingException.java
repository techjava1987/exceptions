
package com.kd.example.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ThrowingException {

	public void testException(String fileName) throws IOException {
		FileInputStream fio = new FileInputStream(new File(fileName));
		fio.close();
		// Exception can be occurred at line number 10 if fileName file is not
		// exist at specified path.
		// Here we are not handling exception, check method signature, we have
		// throws clause with possible exceptions occurred during execution of
		// above code. We are delegating exception handling responsibility to
		// the client who will call this method. So this is throwing exception.
		// You can add any number of exceptions in throws clause.
	}
}
