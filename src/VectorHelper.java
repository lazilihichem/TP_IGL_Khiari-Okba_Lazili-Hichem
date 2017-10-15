import java.util.ArrayList;
import java.util.Scanner;

/**
 * Cette class est une class qui aide a utiliser les tableau
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
        /**
         * constructeur de la class
         * @author lazili
         *
        */
        public VectorHelper()
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("entrez la taille du tableau : ");
            int taille = sc.nextInt();
            tableau = new ArrayList<Integer>();
            int i=1;
            System.out.print("entrez les elements du tableau : ");
            for(i=1;i<taille;i++)
            {
                System.out.print("");
                int element = sc.nextInt();
                tableau.add(element);
            }
        }
    /**
     * afficher les elements du tableau
     * @author lazili
     *
     */
        public void affiche()
        {
            int i;
            for(i=1;i<=tableau.size();i++)
            {

                System.out.println(tableau.get(i));

            }
        }
    /**
     * trouver le minimum dans un tableau
     * @author lazili
     *@return elle retourn le plus grand element dans le tableau
     */
        public int MIN()
        {
            int min = tableau.get(1);
            int i;
            for(i=2;i<=tableau.size();i++)
            {
                if (tableau.get(i) < min)
                {
                    min = tableau.get(i);
                }
            }
            return min;
        }
    /**
     * trouver le maximum dans le tableau
     * @author lazili
     * @return elle retourn le plus petit element dans le tableau
     */
        public int MAX()
        {
            int max = tableau.get(1);
            int i;
            for(i=2;i<=tableau.size();i++)
            {
                if (tableau.get(i) > max)
                {
                    max = tableau.get(i);
                }
            }
            return max;
        }
    /**
     * inverser le tableau
     * @author lazili
     *
     */
        public void inverse()
        {
            int i = 1;
            int j = tableau.size()/2;
            int temp;
            for(i=1;i<=j;i++)
            {
                temp = tableau.get(i);
                tableau.set(i,tableau.size()-i+1);
                tableau.set(tableau.size()-i+1,temp);
            }
            int lolo = 1;
        }
    }


