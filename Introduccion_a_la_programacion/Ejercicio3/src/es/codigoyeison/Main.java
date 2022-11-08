package es.codigoyeison;

public class Main {

    public static void main(String[] args) {
        System.out.println(suma(1,2,6));
        Coche micoche = new Coche();
        micoche.incrementarPuertas();
        System.out.println(micoche.puertas);

    }

    public static int suma(int a, int b, int c){
        return  a+b+c;
    }

}
