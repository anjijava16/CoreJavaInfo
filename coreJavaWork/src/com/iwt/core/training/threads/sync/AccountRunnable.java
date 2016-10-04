package com.iwt.core.training.threads.sync;

public class AccountRunnable implements Runnable {
	private final Account acc;

	public AccountRunnable(Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {
		try {
			acc.add(10);
		} catch (InterruptedException e) {
		}
	}

}
