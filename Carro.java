public class Carro{
    private String Cor;
    private String Modelo;
    private int Aro;
    private double ValorCarro;


    public int getAro(){
        return Aro;
    }
    public void setAro(int Aro){
        this.Aro=Aro;
    }


    public String getMOdelo(){
        return Modelo;
    }
    public void setModelo(String Modelo){
        this.Modelo=Modelo;
    }


    public String getCor(){
        return Cor;
    }
    public void setCor(String Cor){
        this.Cor=Cor;
    }


    public double getValorCarro(){
        return ValorCarro;
    }
    public void setValorCarro(double ValorCarro){
        this.ValorCarro=ValorCarro;
    }

    public Carro(){

    }
    public Carro(int Aro){
        this.Aro=Aro;  
    }
    public Carro(int Aro, String Modelo){
        this.Aro=Aro;
        this.Modelo=Modelo;
    }
    public Carro(int Aro, String Modelo, double ValorCarro){
        this.Aro=Aro;
        this.Modelo=Modelo;
        this.ValorCarro=ValorCarro;
    }
    public Carro(int Aro, String Modelo, double ValorCarro, String Cor){
        this.Aro=Aro;
        this.Modelo=Modelo;
        this.ValorCarro=ValorCarro;
        this.Cor=Cor;
    }

    //4 atributos para o carro e faca 3 construtores
}

