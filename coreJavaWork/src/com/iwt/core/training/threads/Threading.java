package com.iwt.core.training.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threading {

	public static void main(String[] args) {

		MyRunnable runnable = new MyRunnable();

		ExecutorService pool = Executors.newSingleThreadExecutor();
		pool.submit(runnable);

	}

}
