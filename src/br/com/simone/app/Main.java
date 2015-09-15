
package br.com.simone.app;

import dao.DBConnection;
import form.LivroForm;
import form.LivroForm1;


public class Main {

    public static void main(String[] args) {
        DBConnection.createTable();
        new LivroForm1();
    }
    
}
