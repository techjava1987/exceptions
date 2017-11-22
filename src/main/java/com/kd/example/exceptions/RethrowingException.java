package com.kd.example.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RethrowingException {

	public void testException(String fileName) throws FileNotFoundException {
		try {
			FileInputStream fio = new FileInputStream(new File(fileName));
			fio.close();
		} catch (IOException e) {
			if (e instanceof FileNotFoundException) {
				throw new FileNotFoundException(e.getMessage());
				// If Exception occurred at line number 12, We are handling this
				// in this catch block.
				// But we are not actually doing anything with this exception,
				// we are creating instance of some other type of exception and
				// throwing it manually(line number 14).
				// So, this is rethrowing exception.
			}
		}
	}

}
