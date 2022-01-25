package codeClean;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;

public class Usuarios {
    private ArrayList<Usuario>  usuarios = new ArrayList();

    public void añadirUsuario(Usuario usuario) throws  UserRegisteredException {
        if (usuarios.contains(usuario)) {
            throw new UserRegisteredException( usuario.nombre);
        }

        usuarios.add(usuario);
    }

    public void añadirUsuarios(Usuario ...usuarios) throws  UserRegisteredException {
        for ( Usuario usuario : usuarios ){
            if (this.usuarios.contains(usuario)) {
                throw new UserRegisteredException( usuario.nombre);
            }
            this.usuarios.add(usuario);
        }



    }


}
