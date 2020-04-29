/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablice;

/**
 *
 * @author Informatyka
 */
public class Tablice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tablica = new int[5];
        
        // przypisanie wartości
        tablica[0] = 3;
        tablica[1] = 5;
        tablica[2] = 1;
        tablica[3] = 12;
        tablica[4] = 7;
        
        // szukanie najmniejszej wartości
        int najmniejsza_wartosc = tablica[0];
   
        for (int i = 0; i <= tablica.length - 2; i++) 
        {
            if (najmniejsza_wartosc > tablica[i + 1]) 
            {
                najmniejsza_wartosc = tablica[i + 1];
            }
        }
        
        // szukanie największej wartości
        int najwieksza_wartosc = tablica[0];
        
        for (int i = 0; i <= tablica.length - 2; i++) 
        {
            if (najwieksza_wartosc < tablica[i + 1]) 
            {
                najwieksza_wartosc = tablica[i + 1];
            }
        }
        
        System.out.println("Najmniejsza wartość: " + najmniejsza_wartosc);
        System.out.println("Największa wartość: " + najwieksza_wartosc);
        
        // sortowanie tablicy
        int pierwsza_wartosc;
        
        for (int index = 0; index < tablica.length; index++) {
            for (int j = 0; j < tablica.length - 1; j++) {
                pierwsza_wartosc = tablica[index];
                
                if (pierwsza_wartosc > tablica[j+1])  
                {
                    int zmienna_pomocnicza = tablica[index];
                    tablica[index] = tablica[j+1];
                    tablica[j+1] = zmienna_pomocnicza;
                    
                    System.out.println("Zamiana wartości: ");
                    for (int i = 0; i < tablica.length; i++) 
                    {
                        System.out.println(tablica[i]);
                    }
                }
            }
        }
        
        // zmiana
        
//        for (int i = 0; i < tablica.length; i++) {
//            System.out.println(tablica[i]);
//        }
    }
    
}
