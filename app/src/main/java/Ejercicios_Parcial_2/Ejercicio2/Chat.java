package Ejercicios_Parcial_2.Ejercicio2;

import java.util.Vector;

public class Chat implements IMediator{

    private Vector<Usuario> usuarios = new Vector<>();

    public void addUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    @Override
    public void send(String message, Usuario usuario, String tipo) {
        if(tipo.toLowerCase().equals("todos")){
            for(int i=0;i<usuarios.size();i++){
                if(!usuario.getNombre().equals(usuarios.get(i).getNombre())){
                    usuarios.get(i).messageReceived(message);
                }
            }
        }else if(tipo.toLowerCase().equals("docentes")){
            for(int i=0;i<usuarios.size();i++){
                if(!usuario.getNombre().equals(usuarios.get(i).getNombre())
                && usuarios.get(i) instanceof Docente
                ){
                    usuarios.get(i).messageReceived(message);
                }
            }
        }else if(tipo.toLowerCase().equals("administrativos")){
            for(int i=0;i<usuarios.size();i++){
                if(!usuario.getNombre().equals(usuarios.get(i).getNombre())
                && usuarios.get(i) instanceof Administrativos
                ){
                    usuarios.get(i).messageReceived(message);
                }
            }
        }else if(tipo.toLowerCase().equals("estudiantes")){
            for(int i=0;i<usuarios.size();i++){
                if(!usuario.getNombre().equals(usuarios.get(i).getNombre())
                && usuarios.get(i) instanceof Estudiantes
                ){
                    usuarios.get(i).messageReceived(message);
                }
            }
        }
    }
    
}
