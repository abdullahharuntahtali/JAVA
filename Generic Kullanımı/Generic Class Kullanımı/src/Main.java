
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
      
        
        ArrayList<String> arrayList1=new ArrayList<String>();
        ArrayList<Integer> arrayList2=new ArrayList<Integer>();
        

        
        Character[] char_dizi={'J','A','V','A'};
        Integer[] integer_dizi={1,2,3,4,5,6};
        String[] string_dizi={"Java","Python","C++","PHP"};
    
        Ogrenci[] ogrenci_Dizi={new Ogrenci("Mustafa"),new Ogrenci("Merve"),new Ogrenci("Mehmet")};
    
        CharYazdir.yazdir(char_dizi);
        System.out.println("**************************");
        IntegerYazdir.yazdir(integer_dizi);
        System.out.println("**************************");
        StringYazdir.yazdir(string_dizi);
        System.out.println("**************************");
        OgrenciYazdir.yazdir(ogrenci_Dizi);
        
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println(""); 
        
        YazdirmaSinifi<Character> yazdir_char=new YazdirmaSinifi<Character>();
        YazdirmaSinifi<String> yazdir_string=new YazdirmaSinifi<String>();
        YazdirmaSinifi<Integer> yazdir_integer=new YazdirmaSinifi<Integer>();
        YazdirmaSinifi<Ogrenci> yazdir_ogrenci=new YazdirmaSinifi<Ogrenci>();
    
        yazdir_char.yazdir(char_dizi);
        System.out.println("**************************");
        yazdir_integer.yazdir(integer_dizi);
        System.out.println("**************************");
        yazdir_string.yazdir(string_dizi);
        System.out.println("**************************");
        yazdir_ogrenci.yazdir(ogrenci_Dizi);
    
    }
    
  
}
