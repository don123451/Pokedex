/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pokebuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import java.net.MalformedURLException;
import java.security.cert.Certificate;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.io.IOException;
import com.google.gson.Gson;
/**
 *
 * @author DAM2_Alu10
 */
public class Conexion {

    public static String peticionHttpGet(String urlParaVisitar) throws Exception {
        // Esto es lo que vamos a devolver
        StringBuilder resultado = new StringBuilder();
        // Crear un objeto de tipo URL
        URL url = new URL("https://pokeapi.co/api/v2/pokemon/" + urlParaVisitar);
        System.out.println(String.valueOf(url));
        // Abrir la conexión e indicar que será de tipo GET
        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("GET");
        conexion.addRequestProperty("User-Agent", "Google Chrome");
        conexion.setReadTimeout(5000);
        conexion.setConnectTimeout(5000);
        // Búferes para leer
        BufferedReader rd = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
        String linea;
        // Mientras el BufferedReader se pueda leer, agregar contenido a resultado
        while ((linea = rd.readLine()) != null) {
            resultado.append(linea);
        }
        // Cerrar el BufferedReader
        rd.close();
        // Regresar resultado, pero como cadena, no como StringBuilder
        return resultado.toString();
    }

    public static void main(String[] args) {
        String url = "6";
        String respuesta = "";
        try {
            respuesta = peticionHttpGet(url);
        } catch (Exception e) {
            // Manejar excepción
            e.printStackTrace();
        }
        Gson gson = new Gson();
        Pokemon p = gson.fromJson(respuesta, Pokemon.class);
        System.out.println(p.getMoves().get(50).getMove());
        System.out.println(p.getTypes().get(1).getType());
        System.out.println(p.getStats().get(2).toString());
    }

}
