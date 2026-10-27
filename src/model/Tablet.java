package model;

public class Tablet extends Eletronico implements Notificavel {
    private boolean caneta;

    public Tablet(String cor, String marca, double armazenamento, boolean caneta) {
        super(cor,marca,armazenamento);
    }
    
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("[CENTRAL DE NOTIFICAÇÕES | Tablet " + getMarca() + "]: " + mensagem);
    }

    @Override
    public void calcularAutonomiaBateria() {
        System.out.println("Tablet: Autonomia prolongada de 8 horas ativando o modo de economia.");
    }
}
