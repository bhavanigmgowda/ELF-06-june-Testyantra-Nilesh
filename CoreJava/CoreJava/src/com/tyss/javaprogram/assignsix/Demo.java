package com.tyss.javaprogram.assignsix;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class Demo {
	public static void main(String[] args) {

		ArrayList<StudentInfo> al = new ArrayList<>();
		StudentInfo sf = new StudentInfo("Gurpreet", 'M',2);
		StudentInfo sf1 = new StudentInfo("Shubham", 'M',1);
		StudentInfo sf2 = new StudentInfo("kriti", 'F',3);

		al.add(sf);
		al.add(sf1);
		al.add(sf2);

		Function<StudentInfo, StudentInfo> f = (i) -> {
			if (i.gender == 'M') {
				i.name = "MR." + i.name;
				return i;
			} else {
				i.name = "Miss." + i.name;
				return i;
			}
		};
		

		List<StudentInfo> lst = al.stream().map(f).collect(Collectors.toList());
	        lst.forEach(i->log.info(""+i.name));
	}
}
