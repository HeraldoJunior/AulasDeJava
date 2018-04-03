package br.opet.tds172a.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyReader {

	private static Scanner scanner = new Scanner(System.in);
	
	/**
	 * M�todo de leitura com a classe scanner de uma variavel String digitada pelo console
	 * @return
	 */
	public static final String readString(){
        String text = scanner.nextLine();
        return text;
    }

	/**
	 * M�todo de leitura com a classe scanner de uma variavel Int digitada pelo console
	 * @return
	 */
    public static final int readInt() throws Exception{
        String i = scanner.nextLine();
        int ii = 0;
        try{
            ii = Integer.parseInt(i);
        }catch(Exception e){
            System.out.println("N�o foi poss�vel transformar: " + i + " em Inteiro");
            throw e;
        }
        return ii;
    }

    /**
	 * M�todo de leitura com a classe scanner de uma variavel Double digitada pelo console
	 * @return
	 */
    public static final double readDouble() throws Exception{
        String db = scanner.nextLine();
        double dd = 0;
        try{
            dd = Double.parseDouble(db);
        }catch(Exception e){
            System.out.println("N�o foi poss�vel transformar: " + db + " em Double");
            throw e;
        }
        return dd;
    }

    /**
	 * M�todo de leitura com a classe scanner de uma variavel Boolean digitada pelo console
	 * @return
	 */
    public static final boolean readBoolean() throws Exception{
        String b = scanner.nextLine();
        boolean bb = false;
        try{
            bb = Boolean.parseBoolean(b);
        }catch(Exception e){
            System.out.println("N�o foi poss�vel transformar: " + b + " em Boolean");
            throw e;
        }
        return bb;
    }

	/**
	 * Fun��o criada para retornar a data no formato DATE quando � inserida no formato STRING
	 * @return
	 * @throws Exception
	 */
	public static final Date readDate() throws Exception {

		String d = scanner.nextLine();
		Date dd = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			dd = sdf.parse(d);
		} catch (Exception e) {
			System.out.println("N�o foi possivel transformar: " + d + " em Date");
			throw e;
		}
		return dd;
	}
}
