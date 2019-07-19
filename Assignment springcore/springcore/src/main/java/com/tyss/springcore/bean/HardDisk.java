package com.tyss.springcore.bean;

import com.tyss.springcore.interfacee.StorageDevice;

import lombok.extern.java.Log;

@Log
public class HardDisk implements StorageDevice {

	private int capacity;
	private int writingSpeed;
	private int readingSpeed;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getWritingSpeed() {
		return writingSpeed;
	}

	public void setWritingSpeed(int writingSpeed) {
		this.writingSpeed = writingSpeed;
	}

	public int getReadingSpeed() {
		return readingSpeed;
	}

	public void setReadingSpeed(int readingSpeed) {
		this.readingSpeed = readingSpeed;
	}

	public void read() {
		log.info("Content is reading from Harddisk");

	}

	public void write() {
		log.info("Content is Writing to Harddisk");

	}

	public void format() {
		log.info("HardDisk is formatted");

	}

}
