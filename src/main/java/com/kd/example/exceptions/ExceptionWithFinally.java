package com.kd.example.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * In this example, we have used finally clause with try-catch. Finally can
 * directly be used with try without catch. Finally keyword make sure that code
 * inside finally clause executes in all cases, exception occurred or not.
 * 
 * @author kuldeep.s
 *
 */
public class ExceptionWithFinally {

	public void testException(String fileName) {
		FileInputStream fio = null;
		try {
			fio = new FileInputStream(new File(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fio != null) {
				try {
					fio.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
