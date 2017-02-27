package com.turanaydin.timezone;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeCheck {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

		Date now = new Date();
		System.out.println("Date : " + sdf.format(now));

	}

}
