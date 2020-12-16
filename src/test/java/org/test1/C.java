package org.test1;

import org.testng.annotations.Test;

public class C {
	
	@Test
	private void Testcase3() {
	System.out.println("3"+Thread.currentThread().getId());

	}
	
	@Test
	private void Testcase33() {
		System.out.println("33"+Thread.currentThread().getId());

		}

}
