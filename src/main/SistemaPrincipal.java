package main;

import model.Tablet;

public class SistemaPrincipal {
    static void main() {
        Tablet meuTablet= new Tablet("azul" ,"Apple",500);
// Fabriquei a segunda (Instância 2)
        Tablet tabletDoProfessor = new Tablet("preto","Motorola",1);
        System.out.println("Meu Tablet é: " + meuTablet.getCor());
        System.out.println("O do professor é: " + tabletDoProfessor.getCor());


    }
}
