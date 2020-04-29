package tablice;

public class Tablice {
    
    public static void Przypisanie_wartosci(int[] nazwa_tablicy)
    {   
        nazwa_tablicy[0] = 3;
        nazwa_tablicy[1] = 5;
        nazwa_tablicy[2] = 1;
        nazwa_tablicy[3] = 12;
        nazwa_tablicy[4] = 7;
    }

    public static void Wypisz_tablice(int[] tablica)
    {
        for (int i = 0; i < tablica.length; i++) 
        {
            System.out.println(tablica[i]);
        }
    }
    
    public static void main(String[] args) {
        int[] tablica = new int[5];
        
        Przypisanie_wartosci(tablica);
        
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
        
        // sortowanie bąbelkowe ang. BubbleSort        
        for (int i = 0; i < tablica.length - 1; i++) 
        {    
            for (int j = 0; j < tablica.length - 1; j++) 
            {
                if (tablica[j] > tablica[j + 1]) 
                {
                    int zmienna_pomocnicza = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = zmienna_pomocnicza;
                }
            }
        }
        
        Wypisz_tablice(tablica);
        
        Przypisanie_wartosci(tablica);

        // sortowanie bąbelkowe - optymalizacja
        boolean isChanged;
        int i;
        
        for (i = 0; i < tablica.length - 1; i++) 
        {
            isChanged = false;
            
            for (int j = 0; j < tablica.length - 1; j++) 
            {
                if (tablica[j] > tablica[j + 1]) 
                {
                    int zmienna_pomocnicza = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = zmienna_pomocnicza;
                    
                    isChanged = true;
                }
            }
            
            if (!isChanged) {
                break;
            }
        }
        
        Wypisz_tablice(tablica);
        System.out.println("Liczba przejść: " + i);
    }
    
}
