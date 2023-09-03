package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();

		LocalDate d04 = LocalDate.parse("2023-05-31");

		Instant d06 = Instant.parse("2023-05-31T02:00:49Z");
		Instant d07 = Instant.parse("2023-05-31T02:00:49-03:00");

		LocalDate d08 = LocalDate.parse("31/05/2023", fmt1);
		LocalDate d09 = LocalDate.of(2023, 8, 31);

		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());

		System.out.println(d01.toString());
		System.out.println(d02.toString());
		System.out.println(d03.toString());
		System.out.println(d04.toString());

		System.out.println(d06.toString());
		System.out.println(d07.toString());
		System.out.println(d08.toString());
		System.out.println(d09.toString());

		System.out.println(fmt2.format(d06));

	}
}
