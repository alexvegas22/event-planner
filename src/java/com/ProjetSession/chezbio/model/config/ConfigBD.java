/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProjetSession.chezbio.model.config;

/**
 *
 * @author djeaiimen
 */
public interface ConfigBD {
    public final static String URL = "jdbc:mysql://127.0.0.1:3306/utilisateurdb?serverTimezone=UTC&allowPublickeyRetrieval=true&useSSL=false";
    //utilisateur de la bd
    public final static String USER = "root";
    public final static String PASSWORD = "Djemaoune2020";
    //le driver mysql
    public final static String DRIVER ="com.mysql.cj.jdbc.Driver";
    
}
