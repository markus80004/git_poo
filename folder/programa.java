public class Programa {
    String mensaje = "Hola mundo";
    public static void main(String[] args) {
        System.out.println(mensaje);
         
        // cambios hecho en el pograma..
        System.out.println("Retoques realizados");

        //update
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un mensaje: ");
        String mensajeUsuario = entrada.nextLine();
        System.out.println("El mensaje ingresado es: " + mensajeUsuario);
    }
}