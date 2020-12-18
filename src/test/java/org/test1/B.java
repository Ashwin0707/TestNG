package org.test1;

import org.testng.annotations.Test;

public class B {
	
	@Test
	private void Testcase2() {
	System.out.println("2"+Thread.currentThread().getId());

	}
	
	@Test
	private void Testcase22() {
		System.out.println("22"+Thread.currentThread().getId());

		}
	@Test
	private void Testcase222() {
		System.out.println("22"+Thread.currentThread().getId());

		}

}
