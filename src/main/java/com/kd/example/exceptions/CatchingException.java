package com.kd.example.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchingException {
	public void testException(String fileName) {
		try {
			FileInputStream fio = new FileInputStream(new File(fileName));
			fio.close();
		} catch (FileNotFoundException e) {
			// If FileNotFoundException occurred at line 10, exception will be
			// handle with this catch block.
			// This is the place where you can perform acvitity that should be
			// executed when exception occurred.
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			// You can add multiple catch blocks for handling different type of
			// exceptions.
			// If you have multiple catch blocks, make sure you handle most
			// specific exception first and more generic exception after that.
			// In this example, we have FileNotFoundException and IOException
			// from same hierarchy and we are handling FileNotFoundException
			// first because FileNotFoundException is subclass of IOException
		}
	}
}
