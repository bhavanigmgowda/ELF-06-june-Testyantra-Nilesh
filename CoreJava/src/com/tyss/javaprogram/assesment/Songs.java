package com.tyss.javaprogram.assesment;

import java.sql.Time;
import java.time.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class Songs {

	String SongName;
	LocalDateTime dateTime;

	public Songs(String songName) {
		SongName = songName;
		dateTime = LocalDateTime.now();
	}

	public static void main(String[] args) {
		Songs song4 = new Songs("f");
		Songs song1 = new Songs("B");
		Songs song2 = new Songs("A");
		Songs song3 = new Songs("C");

		System.out.println(song1.dateTime);

		ArrayList<Songs> arrayList = new ArrayList<Songs>();
		arrayList.add(song1);
		arrayList.add(song2);
		arrayList.add(song3);
		arrayList.add(song4);
		Comparator<Songs> songs = (i, j) -> {
			String songDate = i.dateTime.toString();
			String songDate1 = j.dateTime.toString();

			return songDate.compareTo(songDate1);

		};

		List<Songs> order = arrayList.stream().sorted(songs).collect(Collectors.toList());

		order.forEach(i -> log.info(" " + i.SongName + " " + i.dateTime));

	}
}
