
package banka;

import java.util.Scanner;

public class Banka 
{ 
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        Ucet uc1 = new Ucet(scanner.next(),scanner.next());
        uc1.menu();
        
    }
}



******************************class ucet*************************
package banka;

import java.util.Scanner;

public class Ucet 
{
    private int zostatok;
    private int predoslaTransakcia;
    private String meno;
    private String id;
    
    public Ucet(String meno,String id)
    {
        this.meno = meno;
        this.id = id;
    }
    
    public void vklad(int ciastka)
    {
        if (ciastka != 0)
        {
          zostatok = zostatok + ciastka; 
          predoslaTransakcia = ciastka;
        }
    }
    
    public void vyber(int ciastka)
    {
        if (ciastka != 0)
        {
          zostatok = zostatok - ciastka; 
          predoslaTransakcia = ciastka;
        }
    }
    
    public void posldenaTransakcia()
    {
        if(predoslaTransakcia > 0)
            System.out.println("Vložené:" +predoslaTransakcia);
        else if(predoslaTransakcia < 0)
            System.out.println("Vybrané:" +predoslaTransakcia);
        else
            System.out.println("Neprebehla žiadn transakcia.");
    }
    public void menu()
    {
        char option='\0';
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Vitaj "+meno);
        System.out.println("Tvoje id je:" +id);
        System.out.println("\n");
        System.out.println("A. Zostatok");
        System.out.println("B. Vklad");
        System.out.println("C. Výber");
        System.out.println("D. Predošlá transakcia");
        System.out.println("E. Napoveda");
        System.out.println("F. Koniec");
        
        do
        {
            System.out.println("--------------------------------------");
            System.out.println("Vyber ukon: ");
            System.out.println("--------------------------------------");
            option = scanner.next().charAt(0);
            System.out.println("\n");
            
            switch(option)
            {
                case 'A':
                    System.out.println("--------------------------------------");
                    System.out.println("Zostatok =  "+zostatok+"€");
                    System.out.println("--------------------------------------");
                    System.out.println("\n"); 
                    break;
                    
                case 'B':
                    System.out.println("--------------------------------------");
                    System.out.println("Zadaj výšku vkladu :  ");
                    System.out.println("--------------------------------------");
                    int ciastka = scanner.nextInt();
                    vklad(ciastka);
                    System.out.println("\n");
                    break;
                    
                case 'C':
                    System.out.println("--------------------------------------");
                    System.out.println("Zadaj koľko chceš vybrať :  ");
                    System.out.println("--------------------------------------");
                    int ciastka2 = scanner.nextInt();
                    vyber(ciastka2);
                    System.out.println("\n");
                    break;
                    
                case 'D':
                    System.out.println("--------------------------------------");
                    posldenaTransakcia();
                    System.out.println("--------------------------------------");
                    System.out.println("\n");
                    break;
                case 'E':
                    System.out.println("--------------------------------------");
                    System.out.println("A. Zostatok");
                    System.out.println("B. Vklad");
                    System.out.println("C. Výber");
                    System.out.println("D. Predošlá transakcia");
                    System.out.println("E. Napoveda");
                    System.out.println("F. Koniec");
                    System.out.println("--------------------------------------");
                    System.out.println("\n");   
                    break;
                    
                case 'F':
                    System.out.println("**************************************");
                    break;
                            
                default:
                    System.out.println("Neplatný úkon!");
                    break;  
            }
        }
        while(option != 'F');
            System.out.println("Dovidenia!");
    }
}
