package es.codigoyeison;

public class Main {

    public static void main(String[] args) {

        int numeroIf = 4;

        if(numeroIf == 0){
            System.out.println("La variable numeroIf es 0");
        }else{
            if(numeroIf > 0){
                System.out.println("La variable es mayor que 0");
            }else{
                System.out.println("La variable es menor que 0");
            }
        }

        int  numeroWhile = 0;

        while(numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        do{
            numeroWhile = 3;
            System.out.println(numeroWhile);
        }while (numeroWhile<3);


        for(int numeroFor = 0; numeroFor <=3; numeroFor++){
            System.out.println(numeroFor);
        }

        int estacion = 2;
        switch (estacion){
            case 1:
                System.out.println("Otoño");
                break;
            case 2:
                System.out.println("Invierno");
                break;
            case 3:
                System.out.println("Primavera");
                break;
            case 4:
                System.out.println("Verano");
                break;
            default:
                System.out.println("No es una estación");
                break;
        }

    }


}
