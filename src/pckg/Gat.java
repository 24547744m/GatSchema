package pckg;

import pckg.interfaces.Caminable;
import pckg.interfaces.Miolable;

/**
 * Created by damuser on 1/03/16.
 */
public class Gat {

    Miolable miol;
    Caminable camina;

    public void mostra(){

        miol = new MiauNormal();//Instanciando en la clase MiauNormal
        miol.miau();//Llamando al método implementado

        camina = new Caminable() {
            @Override
            public void caminar() {
                System.out.println("caminaa...");
            }
        };

        camina.caminar();


    }



}
