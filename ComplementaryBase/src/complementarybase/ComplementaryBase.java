/*
Character.toString(sequence.charAt(i))
* pole2[i].equals(pole2[ii+1])
 */

package complementarybase;





public class ComplementaryBase {
    static String sekvencia = "ACGT";


      
    static String komplementarita(String baza){
        String komplementarnaBaza ="";
        if (baza.equals("A")) komplementarnaBaza = "T";
       else if (baza.equals("C")) komplementarnaBaza = "G";
       else if (baza.equals("G")) komplementarnaBaza = "C";
       else if (baza.equals("T")) komplementarnaBaza = "A";
       else komplementarnaBaza = "x";
      
        return komplementarnaBaza;
    }
    static String komplementarnyRetazec(String sequence){
        String komplementarny_retazec = "";
        for (int i = 0; i<sekvencia.length();i++){ //priraduje komplementarne bazy
        komplementarny_retazec = komplementarny_retazec + komplementarita(Character.toString(sekvencia.charAt(i))); 
            
        }
        
        return komplementarny_retazec;
    }
     static String komplementarnyRetazecPrevrateny(){
         String komplementarny_retazec = komplementarnyRetazec(sekvencia);
         String komplementarny_retazec_prevrateny ="";
     for (int i = sekvencia.length()-1; i>-1; i--){ // otaca retazec
          komplementarny_retazec_prevrateny = komplementarny_retazec_prevrateny + Character.toString(komplementarny_retazec.charAt(i));
      System.out.print(Character.toString(komplementarny_retazec.charAt(i)));
          if (((sekvencia.length()-i)%1000)==0) System.out.println(); 
        }
     System.out.println();
     
     return komplementarny_retazec_prevrateny;
     }
    
     


    public static void main(String[] args) {
    komplementarnyRetazecPrevrateny();  
        
       
    }
}
