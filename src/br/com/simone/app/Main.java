
package br.com.simone.app;

import dao.DBConnection;
import form.LivroForm;

public class Main {

    public static void main(String[] args) {
        DBConnection.createTable();
        new LivroForm();
    }
    
}
