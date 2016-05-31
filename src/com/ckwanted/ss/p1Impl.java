package com.ckwanted.ss;

import java.util.Scanner;

import javax.jws.WebService;

@WebService(endpointInterface="com.ckwanted.ss.SimpleService")
public class p1Impl implements SimpleService{

	public String eliminar(String in) {
		EliminarResponse eliminarResponse = new EliminarResponse();
		String myStringSin = "";
        Scanner scanner = new Scanner(in);
        while (scanner.hasNextLine()) {
          String line = scanner.nextLine();
          if (!line.contains("azúcar")) myStringSin += line+"\n";
        }
        scanner.close();
		eliminarResponse.setOut(myStringSin);
        return eliminarResponse.getOut();
	}

}
