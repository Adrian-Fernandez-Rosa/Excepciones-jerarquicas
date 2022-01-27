package documentacion.codeClean;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //TODO: Mejorar el código con buenos comentarios
        // TO DO: POR HACER

    Usuarios usuarios = new Usuarios();

    Usuario usuario = new Usuario();
    usuario.nombre = "Pepe";
    usuario.apellidos = "Grillo";
    usuario.puedeConducir = false;

    try {
        usuarios.anadirUsuarios(usuario,usuario);

    } catch(UserException e){
        System.out.println("Error al añadir objeto de usuario: "+ e.getMessage());
    }

        //System.out.println(sumarInfinitamente(2,4,5,10));

    }

    public static int sumarInfinitamente(int ...numeros) {

        Integer resultado = Arrays.stream(numeros).reduce(0 , (x, y ) -> {
            return x + y;
        });

         return resultado;
    }

}
