package main;

import model.Tablet;
import model.Pelicula;

public class SistemaPrincipal {
    static void main() {
        Tablet meuTablet= new Tablet("Azul" ,"Apple",500, true);
        Pelicula minhaPelicula = new Pelicula("Alta","Vidro");
// Fabriquei a segunda (Instância 2)
        Tablet tabletDoProfessor = new Tablet("Preto","Motorola",1, false);
        Pelicula pelucilaDoProfessor = new Pelicula("Media","Plastico");
        System.out.println("Meu Tablet é: " + meuTablet.getCor() + " " + minhaPelicula.getMaterial());
        System.out.println("O do professor é: " + tabletDoProfessor.getCor() + " " + pelucilaDoProfessor.getMaterial());


    }
}
