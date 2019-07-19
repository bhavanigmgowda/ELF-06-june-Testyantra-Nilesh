package com.tyss.springcore.bean;

import org.springframework.beans.factory.annotation.Autowired;

import com.tyss.springcore.interfacee.Laptop;
import com.tyss.springcore.interfacee.StorageDevice;

import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class Hp implements Laptop {
	String brand;
	String color;
	double cost;
	double weight;
	int ram;
	String os;
	@Autowired
	StorageDevice device;

	public StorageDevice getDevice() {
		return device;
	}

	public void setDevice(StorageDevice device) {
		this.device = device;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public void display() {

	}

	public void process() {

	}

	public void showSpecificatiion() {

		log.info("" + getBrand());
		log.info("" + getColor());
		log.info("" + getCost());
		log.info("" + getRam());
		log.info("" + getWeight());
		log.info("" + getOs());

	}

}
