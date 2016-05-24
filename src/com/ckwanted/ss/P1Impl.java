package com.ckwanted.ss;

import javax.jws.WebService;

@WebService(endpointInterface="com.ckwanted.ss.SimpleService")
public class P1Impl implements SimpleService{
	
	public EliminarResponseT concat(EliminarT eliminarT) {
		EliminarResponseT eliminarResponse = new EliminarResponseT();
		eliminarResponse.setBody("");
		return eliminarResponse;
	}
	
}
