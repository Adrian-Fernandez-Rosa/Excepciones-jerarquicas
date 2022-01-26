package documentacion.codeClean;

/**
 *  La clase UserRegisteredException gestiona las excepciones
 *  generadas por el gestor de usuarios cuando este ya exista.
 */

public class UserRegisteredException extends UserException {

    public UserRegisteredException(String message) {
        super("Usuario ya existe: "+ message);
    }
}
