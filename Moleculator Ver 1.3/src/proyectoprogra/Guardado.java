
package proyectoprogra;
import java.util.ArrayList;
public class Guardado {
    public static ArrayList<Atomo> Lista = new ArrayList();
    
   

    static ArrayList Eliminar(int i){
        i=i-1;
        Lista.remove(i);
        return Lista;
    }

    static String[] box(){
        int n = Lista.size();
        String [] lista = new String[n];
        for(int i=0;i<n;i++){
            lista[i]= Lista.get(i).getNombre();
        }
        return lista;
    }
}

