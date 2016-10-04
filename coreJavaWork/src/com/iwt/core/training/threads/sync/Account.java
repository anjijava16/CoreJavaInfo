package com.iwt.core.training.threads.sync;

import java.util.concurrent.TimeUnit;

public class Account {

	private float balance = 100;

	public void add(float amount) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		balance += amount;
		Thread.sleep(TimeUnit.SECONDS.toMillis(5));
		System.out.println("Add- Balance: " + balance);
	}

	public void substract(float amount) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		balance -= amount;
		Thread.sleep(TimeUnit.SECONDS.toMillis(5));
		System.out.println("Subs- Balance: " + balance);
	}

	public static void main(String[] args) {
		final Account account = new Account();
		// Thread 1
		new Thread(new AccountRunnable(account)).start();
		new Thread(new AccountRunnable(account)).start();
	}

}
