package es.codigoyeison;


public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(30);
        persona.setNombre("Pepito");
        persona.setTelefono(123465789);

        System.out.println("Edad: "+persona.getEdad());
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Teléfono: "+persona.getTelefono());
    }

    public static class Persona{

        private int edad;
        private String nombre;
        private int telefono;

        public void setEdad(Integer edad){
            this.edad = edad;
        }
        public Integer getEdad(){
            return edad;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getNombre(){
            return nombre;
        }

        public void setTelefono(Integer telefono){
            this.telefono = telefono;
        }

        public Integer getTelefono(){
            return telefono;
        }
    }
}
