package main;

import model.Tablet;

public class SistemaPrincipal {
    static void main() {
        Tablet minhaGarrafa = new Tablet();
        minhaGarrafa.cor = "Azul";
        minhaGarrafa.marca = "Apple";
// Fabriquei a segunda (Instância 2)
        Tablet garrafaDoProfessor = new Tablet();
        garrafaDoProfessor.cor = "Preto";
        garrafaDoProfessor.marca = "Motorola";
        System.out.println("Meu Tablet é: " + minhaGarrafa.cor);
        System.out.println("O do professor é: " + garrafaDoProfessor.cor);


    }
}
