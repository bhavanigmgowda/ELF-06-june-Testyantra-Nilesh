package com.tyss.javaprogram.thread;

import lombok.extern.java.Log;

@Log
public class ThreadLamda {
	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				log.info("" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					log.severe("" + e);
				}
			}
		};

		Thread t = new Thread(r);
		t.start();

	}
}
