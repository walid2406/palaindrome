package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String line = "soososo";
//        System.out.println(line.charAt(0));
//        System.out.println(5 / 2);
//        System.out.println(line.charAt(line.length() - 1));
//        String partieDroite=line.substring(0,(line.length())/2);
//        String partieGauche=line.substring((line.length())/2,(line.length()));


        int n = 0, j = 0, i = 0;
        Boolean result = null;

        try {
//            in = new BufferedReader(new FileReader(new File(args[0])));
//            String line = in.readLine();
            /*YOUR CODE HERE */
            boolean ConditionDebut = line.charAt(0) == line.charAt(line.length()-1);

            i = 1;
            j = line.length() - 2;


            while (ConditionDebut && (line.charAt(i) == line.charAt(j)) && i < j) {
                i++;
                j--;
            }
            result = (i > j);


            //pour verifier changement adjacent
            //il fau quelle forme un palaindrome ici le tri
            // deux cas lors de construction des deux partie il faut ajouter if
            String partieDroite,  partieGauche;
            if(line.length()%2==0) {
                 partieDroite = line.substring(0, (line.length()) / 2);
                 partieGauche = line.substring((line.length()) / 2, (line.length()));
            } else{
                partieDroite = line.substring(0, ((line.length()) / 2));
                partieGauche = line.substring(((line.length()) / 2)+1, (line.length()));
                System.out.println(partieDroite);
                System.out.println(partieGauche);




            }


            // tester si ca construit un palaindrome pour verifier autre changement de adjacant
            char[] ArDroite = partieDroite.toCharArray();
            char[] ArGauche = partieGauche.toCharArray();
          Arrays.sort(ArDroite);
         Arrays.sort(ArGauche);
            i = 0;
            j = 0;
            String affichage = null;



            if (Arrays.equals(ArDroite,ArGauche)) {
                for (i = 0; i < partieDroite.length()-1 ; i++)
                    if ((partieDroite.charAt(i) != partieGauche.charAt(partieGauche.length()-i-1)) && (Arrays.equals(ArDroite,ArGauche))) {
                        System.out.println( (partieDroite.charAt(i) != partieGauche.charAt(i)) && (Arrays.equals(ArDroite,ArGauche)));
                        j++;
                    }
                //deux affichage selon taille line
                affichage = "Pour " + line + "=> Vrai " + j + " Changement " + partieDroite + partieDroite.substring(0, partieDroite.length());


                System.out.println(partieDroite);
                System.out.println(partieGauche);
                System.out.println("resultat= " + result);
                System.out.println(affichage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



/*


	// write your code here

        BufferedReader in;
        int n = 0, j = 0, i = 0;
        Boolean result = null;
        try {
            in = new BufferedReader(new FileReader(new File(args[0])));
            String line = in.readLine();
//            YOUR CODE HERE ********************************
            boolean ConditionDebut = line.charAt(0) == line.charAt(line.length());

            i = 1;
            j = line.length() - 2;
            while (ConditionDebut && (line.charAt(i) == line.charAt(j)) && i < j) {
                i++;
                j--;
            }
            result = (i == j);

            //pour verifier changement adjacent
            //il fau quelle forme un palaindrome ici le tri
            // deux cas lors de construction des deux partie il faut ajouter if
            String partieDroite = line.substring(0, (line.length() - 1) / 2);
            String partieGauche = line.substring((line.length() - 1) / 2, (line.length() - 1));
            // tester si ca construit un palaindrome pour verifier autre changement de adjacant
            char[] ArDroite = partieDroite.toCharArray();
            char[] ArGauche = partieGauche.toCharArray();
            Arrays.sort(ArDroite);
            Arrays.sort(ArGauche);
            i=0;
            j=0;
            if (ArDroite.equals(ArGauche))
            {
                for(i=0;i<partieDroite.length()-1;i++)
                    if((partieDroite.charAt(i)!=partieGauche.charAt(i) ) && (partieDroite.charAt(i)!=partieGauche.charAt(i)) ){
                        j++;
                    }
                //deux affichage selon taille line
                String affichage= "Pour"+line+"=> Vrai"+j+" Changement"+partieDroite+partieDroite.substring(1,partieDroite.length());


            }




            if (result != null) {
                System.out.println(result ? 1 : 0);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
*/
    }

}

