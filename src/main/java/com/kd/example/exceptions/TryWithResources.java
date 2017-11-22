package com.kd.example.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * May be in some cases you are using resources that needs to be closed. The one
 * way you use finally clause to be sure no opened resources stay in
 * application. But many time developers missed that part, knowingly or
 * unknowingly. To avoid that problem Java 7 comes with additional feature
 * called try-with-resources. As we can see, in testException method of this
 * class we have created FileInputStream in try(), now closing of this resources
 * will be taken care by JVM itself and you do not have to do it manually. This
 * is recommended way of using resources.
 * 
 * @author kuldeep.s
 *
 */
public class TryWithResources {
	public void testException(String fileName) {
		try (FileInputStream fio = new FileInputStream(new File(fileName))) {
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
