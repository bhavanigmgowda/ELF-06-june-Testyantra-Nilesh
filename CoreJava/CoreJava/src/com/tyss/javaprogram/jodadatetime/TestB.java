package com.tyss.javaprogram.jodadatetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

import lombok.extern.java.Log;

@Log
public class TestB {

	public static void main(String[] args) {
		LocalTime lt = LocalTime.now();
		LocalDate d = LocalDate.now();
		log.info("" + lt);
		log.info("" + lt.getHour());
		log.info("" + lt.minusHours(2));
		LocalDate dateOfBirth = LocalDate.of(1947, 8, 15);

		log.info("" + dateOfBirth);
		log.info("" + Period.between(dateOfBirth, d));

		Period.between(dateOfBirth, d);
		LocalDate ls = LocalDate.of(2020, 8, 9);

		Period p = Period.between(d, ls);

		log.info("" + p.getYears());
		log.info("" + p.getMonths());
		log.info("" + p.getDays());

		ZoneId z = ZoneId.systemDefault();

		log.info("" + z);

		ZoneId t = ZoneId.of("Australia/Sydney");
		ZonedDateTime za = ZonedDateTime.now(t);
		log.info("" + za.toLocalDateTime());
		
		

	}

}
