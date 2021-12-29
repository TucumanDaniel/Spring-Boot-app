package com.sistema.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Passgenerator {
	public static void main(String ...args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);

        //El String que mandamos al metodo encode es el password que queremos encriptar.
        System.out.println(bCryptPasswordEncoder.encode("1234"));
        /*
         * Resultado: $04$Nqbw8n2nuC.d/przhn2dxOxzZOTmLtta.pEe50qbVO3lPWfsv1XXa
         */
    }
}