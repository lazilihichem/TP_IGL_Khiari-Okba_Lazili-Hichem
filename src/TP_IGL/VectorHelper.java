package TP_IGL;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Cette class est une class qui aide a utiliser les tableauX
 * elle vous permet de
 * <ul>
 *     <li> remplir un tableau</li>
 *     <li> afficher les elements du tableau</li>
 *     <li> donner le Min et le Max</li>
 *     <li> Inverser le Tableau</li>
 *     <li> Trie le tableau</li>
 *
 * </ul>
 * @author lazili_khiari
 *
 */
    public class VectorHelper {
    private ArrayList<Integer> tableau;
    private int Min = 0;
    private int MAx = 0;
    int j= 0;

    /**
     * constructeur de la class
     *
     * @author lazili
     */
    public VectorHelper() {
        Scanner sc = new Scanner(System.in);
        System.out.print("entrez la taille du tableau : ");
        int taille = sc.nextInt();
        tableau = new ArrayList<Integer>();
        int i = 1;
        System.out.print("entrez les elements du tableau : ");
        for (i = 0; i < taille; i++) {
            System.out.print("");
            int element = sc.nextInt();
            tableau.add(element);
        }
    }

    public VectorHelper(ArrayList<Integer> liste) {
        tableau = new ArrayList<Integer>();
        int i=0;
        for (i = 0; i < liste.size(); i++) {
            tableau.add(liste.get(i));
        }
    }

    /**
     * afficher les elements du tableau
     *
     * @author lazili
     */
    public void affiche() {
        int i;
        for (i = 0; i < tableau.size(); i++) {

            System.out.println(tableau.get(i));

        }
    }

    /**
     * trouver le minimum dans un tableau
     *
     * @return elle retourn le plus petit element dans le tableau
     * @author lazili
     */
    public int MIN() {
        int min = tableau.get(0);
        int i;
        for (i = 1; i < tableau.size(); i++) {
            if (tableau.get(i) < min) {
                min = tableau.get(i);
            }
        }
        return min;
    }

    /**
     * trouver le maximum dans le tableau
     *
     * @return elle retourn le plus grand element dans le tableau
     * @author lazili
     */
    public int MAX() {
        int max = tableau.get(0);
        int i;
        for (i = 2; i <tableau.size(); i++) {
            if (tableau.get(i) > max) {
                max = tableau.get(i);
            }
        }
        return max;
    }

    /**
     * inverser le tableau
     *
     * @author lazili
     */
    public void inverse() {
        int i = 1;
        int j = tableau.size() / 2;
        int temp;
        for (i = 0; i < j; i++) {
            temp = tableau.get(i);
            tableau.set(i, tableau.get(tableau.size() - i - 1));
            tableau.set(tableau.size() - i - 1, temp);
        }
    }

    /**
     * renvoie l'elemnet du tableau
     * @param indx l'index de l'element a retourner
     * @return l'element ayant l'index donner en parametre
     */
    public int getelem(int indx) {
        return tableau.get(indx);
    }

    /**
     * additionne deux vecteurs
     * @param x le vecteur a additioner
     * @return le resultas dee laddition
     * @throws TailleException elle declanche une exception en cas ou les tableau ont des tailles differents
     */
    public ArrayList<Integer> additionVect(ArrayList<Integer> x) throws TailleException {
        ArrayList<Integer> Resulta=new ArrayList<>();
        if(x.size()!=this.tableau.size())throw new TailleException();
        else {
            for (int i = 0; i < this.tableau.size(); i++) {
                Resulta.add(i, x.get(i) + this.tableau.get(i));
            }
        }
        return Resulta;
    }
    //////////////////////////////////////////
    //////////////////////////////////////////

    /**
     * trier le tableau
     */
    public  void trieTable()
    {
        int temp,i,j,size=tableau.size();
        for (i=0;i<=size-2;i++){

            j = i;

            while ((j>=0)&& tableau.get(j) > tableau.get(j+1)) {
                temp = tableau.get(j);
                tableau.set(j, tableau.get(j+1));
                tableau.set(j+1, temp);
                j = j - 1;

            }
        }
    }
}


