package TP_IGL;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * une class de testes
 * les testes unitaires avec JUnit5
 * @author  lazili
 */
class VectorHelperTest {
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    /**
     * le test de la methode du MIN
     */
    @org.junit.jupiter.api.Test
    void MIN() {
        // premier cas
        ArrayList<Integer> liste = new ArrayList<Integer>();
        liste.add(15);
        liste.add(2);
        liste.add(0);
        liste.add(17);
        liste.add(3);
        liste.add(4);
        VectorHelper vec = new VectorHelper(liste);
        int res = vec.MIN();
        if(res != 0 ){
             fail("erreur dans le cas ou le MIN = 0");
        }

        //deuxiemme cas

        ArrayList<Integer> liste2 = new ArrayList<Integer>();
        liste2.add(1);
        liste2.add(22);
        liste2.add(17);
        liste2.add(17);
        liste2.add(3);
        liste2.add(4);
        VectorHelper vec2 = new VectorHelper(liste2);
        int res2 = vec2.MIN();
        if(res2 != 1 ){
            fail("erreur dans le cas ou le MIN est dans la premier case");
        }

        //troisiemme cas

        ArrayList<Integer> liste3 = new ArrayList<Integer>();
        liste3.add(11);
        liste3.add(22);
        liste3.add(17);
        liste3.add(17);
        liste3.add(3);
        liste3.add(1);
        VectorHelper vec3 = new VectorHelper(liste3);
        int res3 = vec3.MIN();
        if(res3 != 1 ){
            fail("erreur dans le cas ou le MIN est dans la dernier case");
        }
    }

    /**
     * le test de la methode du MAX
     */
    @org.junit.jupiter.api.Test
    void MAX() {
        // premier cas
        ArrayList<Integer> liste = new ArrayList<Integer>();
        liste.add(155);
        liste.add(2);
        liste.add(0);
        liste.add(17);
        liste.add(3);
        liste.add(4);
        VectorHelper vec = new VectorHelper(liste);
        int res = vec.MAX();
        if(res != 155 ){
            fail("erreur dans le cas ou le MAX est dans la premier case");
        }

        //deuxiemme cas

        ArrayList<Integer> liste2 = new ArrayList<Integer>();
        liste2.add(0);
        liste2.add(22);
        liste2.add(17);
        liste2.add(17);
        liste2.add(3);
        liste2.add(40);
        VectorHelper vec2 = new VectorHelper(liste2);
        int res2 = vec2.MAX();
        if(res2 != 40 ){
            fail("erreur dans le cas ou le MAX est dans la dernier case");
        }
    }

    /**
     * le test de la methode de l'invers
     */
    @org.junit.jupiter.api.Test
    void inverse() {
        ArrayList<Integer> liste = new ArrayList<Integer>();
        liste.add(155);
        liste.add(2);
        liste.add(0);
        liste.add(17);
        liste.add(3);
        liste.add(4);
        VectorHelper vec = new VectorHelper(liste);
        vec.inverse();
        if((vec.getelem(0)!=4)||(vec.getelem(1)!=3)||(vec.getelem(2)!=17)||(vec.getelem(3)!=0)||(vec.getelem(4)!=2)||(vec.getelem(5)!=155))
            fail("erreur dans l'inveresement");
    }

    /**
     * le test de la methode du somme
     * @throws TailleException en cas ou les tailles sont differents
     */
    @org.junit.jupiter.api.Test
    void additionVectTailleEgale() throws TailleException {
        ArrayList<Integer> liste = new ArrayList<Integer>();
        liste.add(15);
        liste.add(2);
        liste.add(0);
        liste.add(17);
        liste.add(3);
        liste.add(4);
        VectorHelper vec = new VectorHelper(liste);
        ArrayList<Integer> liste2 = new ArrayList<Integer>();
        liste2.add(12);
        liste2.add(22);
        liste2.add(01);
        liste2.add(7);
        liste2.add(0);
        liste2.add(4);

        try {
            ArrayList<Integer> res = vec.additionVect(liste2);

            if ((res.get(0) != 27) || (res.get(1) != 24) || (res.get(2) != 1) || (res.get(3) != 24) || (res.get(4) != 3) || (res.get(5) != 8))
                fail("erreur dans l'addition ");
        }
        catch (TailleException e){
            fail("exception ne doit pas ce lancer");
        }
    }
    @org.junit.jupiter.api.Test
    /**
     * test en cas des tailles differents
     */
    void additionVectTailleDiffernet() throws TailleException {
        ArrayList<Integer> liste = new ArrayList<Integer>();
        liste.add(12);
        liste.add(12);
        liste.add(12);
        liste.add(12);
        VectorHelper vec = new VectorHelper(liste);
        ArrayList<Integer> liste2 = new ArrayList<Integer>();
        liste2.add(12);
        liste2.add(22);
        try {
            ArrayList<Integer> res = vec.additionVect(liste2);
            fail("exception fail");
        }
        catch (TailleException e){

        }
    }

    /**
     * le test de la methode du trie
     */
    @org.junit.jupiter.api.Test
    void trieTable()
    {
        ArrayList<Integer> liste = new ArrayList<Integer>();
        liste.add(15);
        liste.add(2);
        liste.add(0);
        liste.add(17);
        liste.add(3);
        liste.add(4);
        VectorHelper vec = new VectorHelper(liste);
        vec.trieTable();
        if ((vec.getelem(0) != 0) || (vec.getelem(1) != 2) || (vec.getelem(2) != 3) || (vec.getelem(3) != 4) || (vec.getelem(4) != 15) || (vec.getelem(5) != 17))
            fail("erreur dans l'addition ");
    }
}