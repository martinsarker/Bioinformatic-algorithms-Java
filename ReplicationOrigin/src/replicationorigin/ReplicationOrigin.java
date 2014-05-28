
package replicationorigin;


public class ReplicationOrigin {
        // tu definujem vsetky premenne
        static int pocetopakovani = 5; // najmenej kolko opakovani
        static int velkostokna = 50;
        static int n = 14;  // ake velke n-mery         
        static String sequence = "ACGTACGTACGTACGT";
        static int sequence_lenght=sequence.length();
        static String[] pole = new String[sequence_lenght];
        static String[] pole2 = new String[sequence.length()-n+1];
        static int[] opakovania_pole2 = new int[sequence.length()-n+1];
        static String[] opakovania_pole_cisla = new String[sequence.length()-n+1];
        // koniec definovania premennych
        static String[] vytvorPole(String sequence){
              for (int i =0; i < sequence.length(); i++){
                  pole[i] = Character.toString(sequence.charAt(i));
                  
                  
              }
        
          
          return pole;
        }
        
        static String[] po3vytvorPole(){
              for (int i =0; i < sequence.length()-n+1; i++){ 
                  if (n ==3) pole2[i] = pole[i] + pole[i + 1] + pole[i + 2];
                  else if (n ==4) pole2[i] = pole[i] + pole[i + 1] + pole[i + 2] + pole[i + 3];
                  else if (n ==5) pole2[i] = pole[i] + pole[i + 1] + pole[i + 2] + pole[i + 3] +  pole[i + 4] ;
                  else if (n ==6) pole2[i] = pole[i] + pole[i + 1] + pole[i + 2] + pole[i + 3] +  pole[i + 4] + pole[i + 5];
                  else if (n ==7) pole2[i] = pole[i] + pole[i + 1] + pole[i + 2] + pole[i + 3] +  pole[i + 4] + pole[i + 5] + pole[i+6];
                  else if (n ==8) pole2[i] = pole[i] + pole[i + 1] + pole[i + 2] + pole[i + 3] +  pole[i + 4] + pole[i + 5] + pole[i+6] + pole[i+7];
                  else if (n ==9) pole2[i] = pole[i] + pole[i + 1] + pole[i + 2] + pole[i + 3] +  pole[i + 4] + pole[i + 5] + pole[i+6] + pole[i+7] + pole[i+8];
                  else if (n ==10) pole2[i] = pole[i] + pole[i + 1] + pole[i + 2] + pole[i + 3] +  pole[i + 4] + pole[i + 5] + pole[i+6] + pole[i+7] + pole[i+8] + pole[i+9];
                  else if (n ==11) pole2[i] = pole[i] + pole[i + 1] + pole[i + 2] + pole[i + 3] +  pole[i + 4] + pole[i + 5] + pole[i+6] + pole[i+7] + pole[i+8] + pole[i+9]+pole[i+10];
                  else if (n ==12) pole2[i] = pole[i] + pole[i + 1] + pole[i + 2] + pole[i + 3] +  pole[i + 4] + pole[i + 5] + pole[i+6] + pole[i+7] + pole[i+8] + pole[i+9]+pole[i+10]+pole[i+11];
                  else if (n ==13) pole2[i] = pole[i] + pole[i + 1] + pole[i + 2] + pole[i + 3] +  pole[i + 4] + pole[i + 5] + pole[i+6] + pole[i+7] + pole[i+8] + pole[i+9]+pole[i+10]+pole[i+11]+pole[i+12];
                  else if (n ==14) pole2[i] = pole[i] + pole[i + 1] + pole[i + 2] + pole[i + 3] +  pole[i + 4] + pole[i + 5] + pole[i+6] + pole[i+7] + pole[i+8] + pole[i+9]+pole[i+10]+pole[i+11]+pole[i+12] + pole[i+13];
              }
        
          
          return pole2;
        }
      
       
        static int[] opakovania(){
              
              for (int i =0; i < sequence.length()-n; i++){                  
              if (i!=0) opakovania_pole2[i]=0; 
              else opakovania_pole2[i]=1; 
                 
                  for (int ii =0; ii < sequence.length()-n; ii++){
                      if (pole2[i].equals(pole2[ii+1])) opakovania_pole2[i]++;
                  }
                  
              
                  
                  
             
              }

        
          
          return opakovania_pole2;
        } 
        
        static String[] opakovaniaPlusCisla(){
              
              for (int i =0; i < sequence.length()-n; i++){              
              opakovania_pole_cisla[i] = Integer.toString(i) + pole2[i] + Integer.toString(opakovania_pole2[i]);
                 
                
                  
              
                  
                  
             
              }

        
          
          return opakovania_pole_cisla;
        }   
       
        static int vypisOpakovani(int minimalnyPocetOpakovani){
            int maximum = 0;
            for (int i =0; i < sequence.length()-n+1; i++){
                if (opakovania_pole2[i] >= minimalnyPocetOpakovani) {
                    System.out.println("Sekvencia: " + pole2[i] + " , pocet opakovani : " + opakovania_pole2[i]);
                }
            }
            
            
            return maximum;
        }
        static int vypisOpakovaniDoRiadku(int minimalnyPocetOpakovani){ 
            int maximum = 0;
            for (int i =0; i < sequence.length()-n+1; i++){
                if (opakovania_pole2[i] >= minimalnyPocetOpakovani) {
                    System.out.print( pole2[i] + " ");
                    if (i%10==0) System.out.println();
                }
            }
            
            
            return maximum;
        }

     static int vypisClumpsDoRiadku(){ 
            int maximum = 0;
            for (int i =0; i < sequence.length()-n+1; i++){
                for (int ii =0; ii < sequence.length()-n+1; ii++){
                if ((opakovania_pole2[i] >= pocetopakovani) ) {
                    System.out.print( pole2[i] + " ");
                    if (i%10==0) System.out.println();
                }
            }
            }
            
            
            return maximum;
        }

         
          
        
        
        

    public static void main(String[] args) {
        vytvorPole(sequence);
        po3vytvorPole();
        opakovania();
        opakovaniaPlusCisla();
        System.out.println("sekvencia: " + sequence);
        System.out.println("index 1: " + pole2[1]);
        System.out.println("opakovani: " + opakovania_pole2[1]);
        System.out.println(opakovania_pole_cisla[0]);
        System.out.println(Character.getNumericValue(5));

        
        
        
        
       
           
    }
}
