public class Carro{
    private String cor;
    private String modelo;
    private int aro;
    private double ValorCarro;

    public Carro(){

    }
    public Carro(int aro){
        this.aro=aro;  
    }
    public Carro(int aro, String modelo){
        this.aro=aro;
        this.modelo=modelo
    }
    public Carro(int aro, String modelo, double ValorCarro){
        this.aro=aro;
        this.modelo=modelo;
        this.ValorCarro=ValorCarro;
    }
    public Carro(int aro, String modelo, double ValorCarro, String cor){
        this.aro=aro;
        this.modelo=modelo;
        this.ValorCarro=ValorCarro;
        this.cor=cor;
    }

    //4 atributos para o carro e faca 3 construtores
}

