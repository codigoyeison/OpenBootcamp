package es.codigoyeison;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* Coche coche = new Coche();
        coche.velocidadMaxima = 14;
        coche.matricula = "ABCDEF";
        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.matricula = "ASDFG";
        System.out.println(cocheElectrico.compruebaMatricula(cocheElectrico.matricula));*/

        Coche coche = new Coche();
        coche.setSonido("BRRR");
        Moto moto = new Moto();
        moto.setSonido("GGGG");
        System.out.println(coche.getSonido());
    }
}

abstract class Vehiculo{
    int velocidadMaxima;
    String matricula;
    String sonido;

    public Vehiculo(){
        System.out.println("Estoy en el constructor de vehiculo");
    }

    abstract public String getSonido();

    abstract public void setSonido(String sonido);



    public boolean compruebaMatricula(String matricula){
        if(matricula == "XXX"){
            return true;
        }
        return false;
    }
}

class Coche extends Vehiculo{

    public String getSonido() {
        return "Soy un supersonido " + this.sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}

class Moto extends Vehiculo{

    public String getSonido() {
        return "Soy un sonidillo " + this.sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}

class CocheElectrico extends Coche{

}
