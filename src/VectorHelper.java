import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Okba on 15/10/2017.
 */

    public class VectorHelper {
        private ArrayList<Integer> tableau;
        private int Min = 0;
        private int MAx = 0;
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
        public void affiche()
        {
            int i;
            for(i=1;i<=tableau.size();i++)
            {

                System.out.println(tableau.get(i));

            }
        }
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


