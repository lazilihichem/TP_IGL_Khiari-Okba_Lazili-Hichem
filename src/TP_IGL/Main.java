package TP_IGL;

/**
 * methode du test du programme
 * @author khiari
 */
public class Main {
    public static void main(String args[])
    {
        VectorHelper vec = new VectorHelper();
        vec.affiche();
        System.out.print("le tableau inverser");
        vec.inverse();
        vec.affiche();
    }
}
