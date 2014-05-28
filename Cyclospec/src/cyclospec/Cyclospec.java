
package cyclospec;
import java.util.ArrayList;
import java.util.Arrays;

public class Cyclospec {
    static String str1="FCTYPGKAWAGE";
    static String str2="";
    static int index=0;
    static String pom="";
    static char [] AA = {'G','A','S','P','V','T','C','I','L','N','D','K','Q','E','M','H','F','R','Y','W'};
    static int[] AAmass = {57, 71, 87, 97, 99, 101, 103, 113, 113, 114, 115, 128, 128, 129, 131, 137, 147, 156, 163, 186};  
    static ArrayList sumy = new ArrayList(); 
    public static int [] sumy_array = new int[220];
    
    
    
        public static void cyclospec(){
        for (int i=0 ; i<str1.length();i++){
         str2 = pom + str1.charAt(i); 
          System.out.println(str2);

          sumyar();
          for (int j=1 ; j<str1.length();j++){
              if ((i+j)<str1.length()){
                  str2=str2+str1.charAt(i+j);
                  System.out.println(str2);

                  sumyar();
              
              }
              else {
                      for (int k=0 ;str2.length()+1<str1.length();k++){
                      str2 = str2 + str1.charAt(k);
                       System.out.println(str2);

                       sumyar();
                      
                      
                  }                
         
                  
              } 
              
          }
        
        } }
    
    

  
    public static void sumyar(){
      int suma = 0;
      for (int i = 0; i< str2.length(); i++){
            for (int j = 0; j< AA.length; j++){ 
            if (str2.charAt(i)==AA[j]) suma=suma+AAmass[j];   
      }
      
  }
      sumy_array[index] = suma;
      index++;
  }


    public static void main(String[] args) {
       cyclospec();
       Arrays.sort(sumy_array);
       for (int i = 0; i <sumy_array.length; i++){
           System.out.print(sumy_array[i] + " ");
       }

       
       
      
       
  
       
       
       

        

        

    }
}
