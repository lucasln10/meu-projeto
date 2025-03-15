package com.example.meu_primeiro_springboot.security;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.util.Date;
import java.util.jar.JarException;

public class JwtUtil {

    private static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    private static final long EXPIRATION_TIME = 86400000;

    public static String generateToken (String username){
        return Jwts.builder()
                .setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    public static String extractUsername (String token){
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build().parseClaimsJwt(token)
                .getBody()
                .getSubject();

    }

    public static boolean validateToken (String token){
        try {
            Jwts.parserBuilder()
            .setSigningKey(key)
            .build().parseClaimsJwt(token);
            return true;
        }catch (JwtException e){
            return false;
        }
    }

}
