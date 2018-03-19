package br.opet.tds172a.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.opet.util.Reader;

public class MyReader extends Reader {

	private static Scanner scanner = new Scanner(System.in);

	public static final Date readDate() throws Exception {

		String d = scanner.nextLine();
		Date dd = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			dd = sdf.parse(d);
		} catch (Exception e) {
			System.out.println("Não foi possivel transformar: " + d + " em Date");
			throw e;
		}
		return dd;
	}
}
