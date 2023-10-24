public class Principal{

public static void main(String[] args) {

    Carro car = new Carro();
    Carro carAro = new Carro(14);
    Carro carTresParametros= new Carro (14, "HB 20 2021 sense", 60000);
    Carro carQuatroParametros = new Carro (14, "HB 2022 sense", 60000, "Branco");

    System.out.println(carAro.getAro());
    System.out.println(carTresParametros);
    System.out.println(carAro);
    System.out.println(carAro);

}
}