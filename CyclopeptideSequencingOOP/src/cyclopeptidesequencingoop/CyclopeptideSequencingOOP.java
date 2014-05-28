
package cyclopeptidesequencingoop;

public class CyclopeptideSequencingOOP {
    
   

    public static void main(String[] args) {

       Sequence s1 = new Sequence("dna", "ATGGCCATGGCCCCCAGAACTGAGATCAATAGTACCCGTATTAACGGGTGA", "MA");
       Sequence s2 = new Sequence(1, "ATGGCCATGGCCCCCAGAACTGAGATCAATAGTACCCGTATTAACGGGTGA","MA");
       System.out.println(s2.DNA);
       System.out.println(s2.RNA);
       System.out.println(s2.Protein);


       


   for(int i= 0; i < s1.AA_Array.length; i++) {
    if (s1.AA_Array[i].equals(s1.AAfragment)) System.out.println(s1.DNA_Array[i]);
    if (s2.AA_Array2[i].equals(s2.AAfragment)) System.out.println(s2.RCDNA(s2.DNA_Array2[i]));
    } 
    
      
       

       

        
        
       
        



        

        
        
        

        

        

    }
}
