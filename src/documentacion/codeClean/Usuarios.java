package documentacion.codeClean;

import java.util.ArrayList;
import java.util.Locale;

/**
 * La clase Usuarios implementa diversos métodos para la gestión del
 * nideki "Usuario". Provee funciones que hacen "crud" e implementa
 * el patrón iterator
 *
 * El objetivo de esta clase es sustituir a la vieja clase "UsuariosManager"
 * tras una refacorizacion donde maneter el códgico antiguo era mas costoso
 * que implementar esta nueva clase.
 *
 * A consecuencia de estos cambios, y al mantener durante un tiempo de transicion
 * la vieja clase, se recomienda utilizar un patrón "facade" que esconda al desarrollador
 * final esta transición
 *
 * Al utilizar el patron facade, en primera instancia, el desarrollador deberá invocar
 * a los nuevos métodos, pero garantizamos que a futuro, no deba volver a cambiar el
 * código que interactua con la base de datos de usuarios.
 *
 * resumen
 * Como consecuencia hay que cambiar las instancias de UserManager por Usuarios.
 * @See https://www.google.com
 */

public class Usuarios {

    /** Lista de usuarios */
    private ArrayList<Usuario>  usuarios = new ArrayList();

    public void anadirUsuario(Usuario usuario) throws UserRegisteredException {
        if (usuarios.contains(usuario)) {
            throw new UserRegisteredException( usuario.nombre);
        }

        usuarios.add(usuario);
    }

    /**
     * Determina si es día domingo
     * @param numeroDia Numero de día a validar, de 0 a 7
     * @return true si es domingo, false en caso contrario
     * @since 26/1/2022
     */
    private boolean hoyEsDomingo(int numeroDia) {
        //si numeroDia es 0, lo consideramos Domingo por el calendario que siguen
        // los estadounidenses.
        return numeroDia == 0 || numeroDia == 7;
    }


    /* AdrianFernandez @25/1/2022 cambio la implementación a una con argumentos variables */
    //otro ejemplo
    /* Esta función añade un numero variable de objetos del tipo Usuario en la
        instancia actual.
     */


    // Añade un nuevo usuario a la lista de usuarios.
    //
    // El parámetro de entrada es variable, del tipo Usuario.


    // Si el usuario ya existe (la propiedad name del objeto existe, entonces
    // devolveremos una excepcion del tipo UserRegisteredException.

    //////OTRO EJEMPLO PERO CON JAVA DOC

    /**
     * Añade un nuevo usuario a la lista
     * @param usuarios Uno o varios objetos de tipo Usuario
     * @throws UserException Si el usuario ya esta registrado
     */
    public void anadirUsuarios(Usuario...usuarios) throws UserException{

        //comentario incorrecto: Iteramos sobre la lista de usuarios
        for ( Usuario usuario : usuarios ){
            //comentario incorrecto2: sobre cada usuario en el cual estamos iterando, verificamos que ya exista
            for(Usuario existente : this.usuarios) {
            if (this.usuarios.contains(usuario)) {
                // Si , existe, lanzamos una excepción:
                if(existente.nombre.toLowerCase() == usuario.nombre.toLowerCase()){

                    throw new UserRegisteredException(usuario.nombre);
                }
            }
            this.usuarios.add(usuario);
        }
        }
    }


}
