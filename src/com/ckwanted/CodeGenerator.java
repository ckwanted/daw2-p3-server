package com.ckwanted;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

public class CodeGenerator {

	public static void main(String[] args) {
		
		WSDLToJava.main(new String[] {
			"-server",
			"-d", "src",
			"src/main/resources/SimpleService.wsdl"
		});
		
		System.out.println("Archivos generados correctamente ...");

	}

}
