
package matchoccurances;

public class MatchOccurances {
    // tu definujem vsetky premenne
        static String hladat = "TTGGTGTT";
        static String sequence = "TGTTGGTGTGCGACTTGGTGTTGGTGTGCCCTTGGTGCTTGGTGCCGTTTACTTGGTGGTGTTGGTGTTGGTGGCTTGGTGGTTTGGTGGTTGGTGTAGCTTGGTGTGGAATTGGTGTTGGTGATTGGTGAGTTGGTGCTTGGTGTTGGTGGTGGTTGGTGACCTCATTTGGTGCCCCGTTGGTGTTGGTGATTGGTGCCCGGTCACCTTGGTGTTGGTGGTTGGTGATTGGTGCCCCTTTGGTGTTGGTGTTGGTGTTCGGCTTGGTGTTTCTTTGGTGTTGGTGAATCAGATTGGTGCGACTTGGTGTGCTATGACTTGGTGCGTTGGTGTTGGTGATGTTTGACGCGTTTTGGTGCTACACTCATTGGTGTCTTGGTGTCTATTGGTGGCCTATTGGTGATCTTGGTGTTGGTGTATTACAGTATTGGTGGCGAACTTGGTGTTGGTGTCTTGGTGTTGGTGTTGGTGTTGGTGATTGGCAAGTTGGTGGTTAGCCGTTGGTGTTGGTTGGTGTGATTGGTGGTGGGGGAACACGATTGGTGGTTGGTGTCGCACGAACTCGTTATTGTTGGTGTATTTGGTGTTGGTGCACATGTTGGTGTTTGGTGTTGGTGGTTGGTGGCAATTTGGTGGCTGTTGGTGTATTGGTGTTGGTGCCTCTTGGTGATTGGTGTTGGTGGAATAATTGGTGTATTGGTGGTTTTGGTGGTTGGTGTTGGTGTCTTTATCCCACAGTATTGGTGAGTTTTTGGTGTTGGTGGTTGGTGGTTGGTGCCCCGGTTGGTGGGGTGTTGGTGATTGGTGTATTGGTGGGGTTGGTGTCCAACCTTGGTGTTGGTGGGTTGGTGTTTGGTGTTTGGTGGTTGGTGTTGTTTGGTGTCAATTGGTGGGTTTGGTGGTTGGTGCTTGGTGGCTTGGTGAGTTGGTGTTGGTGATTGGTGATTTTGGTGGCTTTGGTGCTATTTGGTGGCATTGGTGCGTTGGTGTTGGTGGGCCTTGGTGCCCGCCTTGGTGTTGGTGCTTGGTGGCCGCTCGGGATAACGCTTGGTGCGTTTTGGTGTGGGGTTTGGTGTCCACGGAGATTGGTGTTTGGTGTTGGTGCCTTGGTGGCTTGGTGTTGAATTGGTGAATTGGTGTTTGGTGGTTGGTGGTTGCTTGGTGTTCTCAGTTTGGTGTTGGTGGAATTGGTGAGTTGGTGATTGGTGATTGGTGTCTTGGTGATTTGGTGATTGGTGCTGAACCATTTGGTGGTTGGTGTATTGGTGTTGGTGACATTGGTGCTTTGGTGTTGGTGCAACCTACGATTGGTGTTGGTGTTGGTGAACCCGCTGATTGGTGACTTGGTGTTGGTGGACACGTATCGTTGGTGCTCCTTTTGGTGTGGTTGGTGTTGGTGTCTTTGGTGGCCATTGGTGTAGTTGGTGGGAAGGTTGGTGGCTGTTGGTGAAGCGATTGGTGTTTGGTGTTGGTGATTCATTGGTGTTGGTGAAACTTGGTGTTGGTGTTACTGTTGGTGTTTGGTGTGCTTCCTTGGTGCATTTCTTTGGTGGTGATTGACACTTGGTGATTGGTGACAGCTAGATTGGTGGAGGTGTTTGGTGTTGGTGCAGTTGGTGCAGTTGGTGTGTTGGTGAAACGTCCTTGGTGTTGGTGCTTGGTGTTGGTGTTGGTGGGGGACAGTCATTTGGTGCTTCTTGGTGCAGCTTGGTGTTGGTGTTGGTGCCTTGGTGTTGGTGTGTTGGTGTTGGTGCATTTGGTGAGTTGGTGTTGCTTGGTGATTGGTGACATTGGTGCTTGGTGCCTTGGTGTTGGTGATTGGTGGTTGGTGGTTGGTGTTGGTGATTGGTGCATTGGTGCTTGGTGATTGGTGATTGGTGGGATGAGTTGGTGTTGGTGGCTTGGTGACGCACACTTGGTGTATTCTTGGTGTCATGCCCATTTGGTGATTTGGTGGTTGGTGTTGGTGCTTGTTGGTGATTGGTGTTGGTGTTGGTGTTGGTGTACCGCTGGTTGGTGCTTGGTGTTGGTGAGGGTTTGGTGGAGATTGGTGTGTTGGTGTTGGTGTTGGTGCTTGGTGCTTGTTGGTGTTGGTGTTGGTGTTGGTGCTTGGTGCGAATGCTTTGGTGACTCTTGGTGCGGCTCCTTGGTGTTGCCTCAATTGGTGGTTGGTGCCAGTTGGTGTTTTGGTGATTGGTGTTGGTGCTTGGTGTTGGTGTTGGTGAGTTGGTGCGAGTTGGTGGTTACGCCGTTTGGTGGAAACGATCATTGGTGCCTTGGTGTTGGTGTTTGGTGTATGCCTTGGTGTTGGTGTTGGTGAGATTGGTGTTGGTGGCTTTGGTGTTGGTGCTTGGTGAACTTGGTGTTGGTGGCCTTGGTGTTTGGTGCTTGGTGTTGGTGGTATTGGTGCGCGTATTGGTGGTTGGTGATTTGGTGGAATTGGTGATTGGTGCTAGAATTGGTGGCTCTATTGGTGTCTTGGTGGCGGTTGGTGTTTGGTGATTTGGTGTTACGAATTTACGTTGGTGTTTGGTGTCAGGTGTCCCTTATTGGTGTTGTTGGTGTGTTGGTGCCCTTGGTGGGTTGGTGCGCATTGGTGTGTTTGGTGACTACTGTTGGTGTTGGTGCTTGGTGGACTTGGTGAAATGTTGGTGGTATTGGTGTAAGATTGGTGTCGGGTACCGTGGATTGGTGTTGGTGATTGGTGGCGTTGGTGGTTGATTGGTGTTGGTGTTGGTGTTGGTGTTTGGTGTATTGGTGTCTTGGTGCCGTTGGTGTTTGGTGTCTTGGTGTCCGCCTATTTGGTGTCATTGGTGGTCTTGGTGGCATTGGTGCTTGGTGCACTTGGTGTTGGTGTTGGTGTGTTGGTGTTGGTGTTTGGTGGTTGGTGTTGGTGATATTGGTGTTGGTGACGCTTGGTGTTGGTGTTGGTGTTGCATTGGTGTTGGTGATTGGTGGATTGGTGCGACTTTGGTGATCCTTGGTGCCTATTGGTGGCGATTGGTGTGATTGGTGACTTGGTGTTGGTGTTGGTGTTGGTGCGACCGGTTGGTGCTTGGTGAGGAGGCGACGTTTGGTGCCTGCGTTGGTGGGCCTTGGTGCTTGGTGATTGATCACTTGGTGATTTTGGTGATTGGTGTTGGTGTTGGTGGCTTTGGTGCGAAATTTTGGTGCGTTGGTGCGCTTGGTGCTTGGTGTTGGTGACTTGGTGATCCGACTTTGGTGTTGGTGAAGACCATTTGGTGATTGGTGATTGGTGTTGGTGCTTGGTGTTGGTGAGTTGGTGGGCTTGGTGATTGGTGTTGGTGTTGGTGTTGGTGTTTGGTGGTTTTTGGTGTTTGGTGCTCTTGGTGTTGGTGTTGGTGCTTGGTGATTGGTGTTGGTGATTGGTGTTGGTGGATTGGTGTGCTTGGTGCTTGGTGATTGGTGCAGCGTTGGTGTTGGTGGTACCTTGGTGACTTGGTGGTTGGTGTTGGTGTTGGTGATTTTGGTGATCTTGGTGTGTCTTGGTGTTGGTGTGTTGGTGCATTGGTGCTTGGTGTCCTTGGTGTTGGTGATGTATTGGTGATTTGGTGGTTGGTGTGTACGTTTTGGTGCTAAATTGGTGAATTGGTGCGGAAACTCTTGGTGATCCCTTGGTGTGCTTGGTGCTAAGGTTGGTGCTCATTGGTGTTGGTGACTTGGTGATACACTTTGGTGCTGATTGGTGATTTTGGTGTTATTGGTGTTTGGTGTGTCGTTGGTGATTGGTGTTGGTGTTGGTGTTGGTGTTGGTGCACTTGGTGGGTCTTGGTGTGTTCGAATCACACCTCTTTATTCCATTGGTGTTGGCATTGGTGACTTGGTGTTGGTGTTGGTGTAATTTGGTGTTGGTGTTGGTGCATTGGTGTTTGGTGTTGGTGTCGAACTTTGGTGTCATTGGTGAAGTTGGTGATTCACGCTTGGTGACATTGGCCGTTGGTGTTTTGGTGTTGGTGGTTGGTGTTGGTGGGCTTGGTGTTTGGTGGTACCAGAAGCTTGGTGTGCTTGGACGTTGGTGGATTTGGTGCGAGACTTGGTGCTTTTTGGTGTTGGTGATGTTTGGTGTGTAGCGTTGGTGTTTGGTGCGTTGGTGGACTTTACCCATCTTGGTGCTTGGTGTTGGTGAACTAGAGTTGGTGGTTTGGTGATTTGGTGGAGCTTGGTGTGTCAGAGGTGTTTGGTGGTTGGTGATTGGTGTGTTTGGTGGTGCTTGGTGTTGGTGTTGGTGAACATTGTTGGTGTTGGTGTTGGTGAGTTGGTGCTTTCTTGGTGGCTGGCTTGGTGTTGGTGAACCATTGGTGGGGACGTTGGTGAGGTTGGTGGTTGGTGTTGGTGTTGGTGTATTGGTGTTGGTGTTGGTGTTTGGTGAGTTGGTGAAGAACGCTATATTGGTGTCTTGGTGAAGTTGGTGATTGGTGTTCCCCTCCGTTGGTGTTTGGTGTTTGGTGAATTGGTGTTGGTGCGTTGGTGTTGGTGGACTTTGGTGTTGGTGGTTTGGTGTCCCATTGGTGCGTCTCCCATTGGTGCGTTGGTGTCTAATTGGTGGTTGGTGCGGCGTTGGTGGATTGGTGTGTGCATTGGTGGTTAGTTGGTGGTTGGTGCTTTGGTGACAAGATTTTTAGTTGGTGATTTTGGTGTTTGGTGTCTTGGTGTTGGTGTAGATTGGTGAGTTGGTGTTGGTGCTTGGTGATCTTGCTTGGTGGAAGATTGGTGTCTTGGTGTAATCAGAGTTGGTGTGTTGGTGTTGGTGCTTGGTGCATCTTGGTGGCAAATTGGTGTTGGTGTTGGTGCTCTTGGTGTTGGTGTTGGTGAAGTTGGTGTTTTGGTGTTTTGGTGGTTGGTGCGTTGGTGTTGGTGTTGGTGTTGGTGGTTTGGTGTTGTACTTTGGTGAGCTTGGTGTTGGTGATTGGTGAATTGGTGGCTTGGTGCTGCATTTTGGTGCCTGATTTTTTTGGTGGTTGGTGTGTTGGTGTCCTCGCATTGGTGCGTTGGTGTACGATGATTGGTGTTGGTGGCTATATCCGGCTGTTGGTGTTTGGTGCATTGGTGGTTGGTGCGTTGGTGGTATTGGTGGTTTTGGTGTAATTTGGTGTTGGTGATTGGTGCTTGGTGATTGGTGGCCCGAATACCAATTTGGTGTTTGGTGTTTGGTGTTGGTGTTTTGGTGTTGGTGGACCTTGGTGGTTGGTGGCATTGGTGTAATCCGATTGGTGGATTGGTGCTTTGGTGGCGTTGGTGGACACTTGGTGTTTGGTGATTTGGTGTTGGTGGGATTGGTGCTTGGTGTTGGTGCGACATTCTTGGTGAGCTCCGTTTGGTGCTTTTTTGGTGTTGGTGCTTTGGTGTTGGTGAATTGGTGACATAGTTGGTGTTGGTGCTTGGTGTTGGTGAGTGTAAGTTGGTGCTTATTGGTGTTGGTGGGTTGGTGTTGGTGTTGGTGTTTGGTGGCTCTTGGTGCATCTATTGGTGGGCTACAAGTTGGTGAGTTGGTGACCGAATTGGTGTCTCAACCTTGGTGTATTGGTGTTTGGTGGGTTGGTGTTGGTGCATTGGTGAGGGTTGGTGATCTTGGTGCTTGGTGTTGGTGATTGGTGTATTGGTGTTTGGTGCGTTGGTGGTTGGTGGTCTTTTGGTGTGGTTGGTGTCTTGGTGCCGCTTGGTGTTGGTGGCAGTTGGTGTTGGTGTTTTGGTGATTGGTGATGAGGTCGATTGGTGATTGGTGACGTATATTGGTGTTGGTGCCTTGGTGTCTGATAACTTGGTGTTGGTGTTGGTGTTGGTGTAGTTGGTGTTGGTGTTGGTGATTGGTGTGTTTTTTGGTGTTATTGGTGGATTCCGCTTGGTGTTTGGTGCTTGGTGGATTGGTGACCTACTTGGTGACGTTGGTGTTGGTGTTGGTGCTTGGTGACACTTGGTGTTGGTGTTGGTGTTTGTTGGTGTTGGTGTTGGTGTTTGGTGTCTTGGTGAAAGAGTTGGTGATTGGTGACATTGGTGGCAGTTGCTTTGGTGCACCATTGGTGGCCGCCCCTGATTTGGTGGTTGGTGTTGGTGGTTGGTGCTTGGTGTTGGTGATTGGTGCCTTGGTGTTGGTGAATTGGTGTTGGTGTTGGTGAATTTGGTGTTGGTGTTGGTGGGTTGGTGTGACGTGTTGGTGACATATTGGTGTTGGTGATTGGTGATTGGTGTTTCTTGGTGTTGGTGTTGGTGCACGCGATTGGTGTTGGTGTTTTGGTGTTGGTGTTTGGTGCGTTGGTGCGGTTTGAACCGGTTGGTGTTGGTGAAACTTGGTGTTTGGTGAACTTGGTGGCTTGGTGCCTTGGTGTTCAAGGTTGGTGTTTGGTGTTGAAGGTTGGTGCAATTCATTTTGGTGGCTTACCATGCCAATTGGTGCTTGGTGCGAAATTGGTGATCTTGGTGGGATGGGATACAAATTGGTGAAGTTTGGTGAGATTGGTGTTTGGTGGGTAGTTTGGTGGTTGGTGTGCTTTGGTGTTGGTGTCTCTTGGTGGGTTGGTGTTGGTGCCTTTGGTGTTGGTGTTGGTGTTGGTGCTTGGTGCTTGGTGGTTGGTGTTGGTGTTGGTGTTGGTGCCGATTTTGGTGAAGTCCTTTGGTGTATTGGTGGTTGGTGCTTGGTGTTGGTGATTTGGTGTATTCTTGGTGTTGGTGAATATTGGTGCCGTTTGGTGTTGGTGCTTGGTGCTTGGTGTATTTTGGTGTTCCTTGGTGGTTTGGTGCATTGGTGTGACTATTGGTGTCCGTCTGCCTTGGTGCTTGGTGGGCATTGGTGTTGGTGGCTTTGGTGAGGACATTGGTGTACAAATTGGTGTTTGGTGTTGGTGCAACCTTGGTGTTTGGTGTTGGTGAGACAGTTATTGGTGTTGGTGCTTGGTGTTGGTGTTGGTGATTACTTGGTGTTGGTGATTGGTGTATACTGCTAATTGGTGCTACTGCCTTTGGTGTTGGTGCATTGGTGTTGGTGTTATACCTTGGTGCCTTTCTCTCCTTGGTGATTGGTGTAGGGGTTGGTGAATTGGTGAGTTGGTGTTCAGTTTGGTGGCGTTGGTGTTGGTGTTGGTGTGTCATTGGTGCTTGGTGTATGTATGCTTGGTGCATTGGTGACGATTGGTGTTGGTGGTATTGGTGCATTGTTGGTGATTTGGTGGTTGGTGTATTGGTGTTGGTGAAGGGGAACGTTGGTGAATTTGGTGTTGGTGATTGGTGGATTGGTGTTGGTGTTGGTGGTTGTGTTGGTGTACCCCTTTGGTGTTGGTGTTCAAAGTTGGTGTTCTTGGTGGAGCACGCTTGGTGCGGTTTGGTGTTGGTGACGTTGGTGCGTGGTGGTGTCGGCCTTGGTGTAATTATTTGGTGACTTAGCTTGGTGATCAATTGGTGCTTGGTGTATCTTGGTGTTGGTGATCTTGGTGTTTGGTGAGCCATTGGTGTTGGTGTTCTTGGTGAGCTGTATTGGTGGTTGGTGTTTGGTGTTGGTGGCCTTTGGTGAGGTTGGTGCTTGGTGTTGGTGACCTTGGTGTGGATTTTGGTGTGTTCTTGGTGAGTTGGTGTTGGTGTTGGTGTTGGTGGGATTTGGTGACTTGGTGTTGGTGGAAATCCTTTTGGTGTGCAGCTTTCATTGGTGACGTTGGTGATTTTGGTGTTGGTGGGAGTTTGGTGTCTTGGTGTGAAGTTGGTGTTGGTGTCTAAGCCTTGGTGATAATTGGTGTACGTAGCTGTGGCGCTTGGTGGTTGGTGTTGGTGTTGGTGCTTGGTGGCTATTTGGTGGTTGGTGGGTATTTTGGTGGATTGGTGTTGGTGGCATTGGTGAGTTGGTGGATTGGTGTTGGTGGGACTTGGTGTTATTGCTGCTTGGTGATTGGTGGGTTTGGTGACTTGGTGAACACCTTGGTGTTGGTGTTTTGGTGCAGGTTGGTGATTTGGTGTTGGTGAGTTGGTGTTGGTGATTGGTGGCCGTTGGTGCAGACCGTTGGTGTATTGCCCCGTTGGTGTTTGGTGTGTTTTGTTGGTGCGTTGGTGTTGGTGTCACGCTAAAGTTGGTGGTACCCAGCGTTGGTGTACTTTGGTGTTAGTTGGTGATTGGTGCCTCGATTGGTGGGTTGGTGTGCGAATTGGTGATTGGTGATTGGTGCCGATTTGGTGTTGGTGGTTGGTGAAATTGGTGTTGGTGGTTGGTGTTGGTGGCTGCTACTTGGTGTTTGGTGATCGATTTTGGTGACATTGGTGGTTGGTGTTGGTGGTTGGTGTTGGTGCTTTGGTGTTGGTGTTGGTGGGTTGGTGGACATCTTGGTGTTTTGGTGGTTGGTGATGTTTTTGGTGATTGGTGGCGTTATTGGTGCCGGCTAAAATTGGTGATTGGTGCATTGGTGCGACAGCTTTGGTGGGACCTTGGTGTTGGTGACATCTAGCAAGTTGGTGATACCCAGTTACTTGGTGTATTGGTGTGTTGGTGAAGCTTGGTGATTGGTGAAGTTGGTGTCATTGGTGTTTGGTGTTGGTGGCCTTTGGTGTCGTTGGTGCATTGGTGTCACGTTTTGGTGATTGGTGTTGGTGTACTTGGTGTGTGTACACTCGTGATTGGTGGCTATTGGTGCCTCTCTTGTAGACCCCTTGGTGCATTTACGGTCGATTGGTGTTTGGTGCGTTTTGGTGCTTGGTGTTGGTGTTGGTGGAAAATTTGGTGTCTTGGTGTTCTTGGTGGTAAAATAATTGGTGATTGGTGTTGGTGTATCATATTGGTGCGATTGGTGAGGCTATTGGTGCTTGGTGTTGGTGAGCCGACTTGGTGCCAAATTGGTGGTCAAGACGCTTGGTGCACATGCTGATCCCATTGGTGCATTGGTGTTGGTGATTGGTGGATTGGTGCTTGGTGTTTGGTGCTTTACTTTGGTGCTTGGTGGTTGGTGCTTGGTGTTTATTGGTGGATTGGTGAGTTGGTGATATTGGTGTATTGGTGTTGGTGGGAGTTGGTGTTGGTGTTGGTGGGATTGAGGGCTGTTGGTGTTTAGTTGGTGCGCTTGGTGTTGGTGCTTGGTGACCCCTATTGGTGTTTGGTGAGCGTCCAGCCAGGCCTTGGTGAGTCGACTTTTGGTGGTTGGTGGCACTTGGTGTTGGTGTCCACTGTTGGTGTTGGTGTTGGTGGCTCG";  
        static int n = hladat.length();  // ake velke n-mery           
        static int sequence_lenght=sequence.length();
        static String[] pole = new String[sequence_lenght];
        static String[] pole2 = new String[sequence.length()-n+1];
        static int[] opakovania_pole2 = new int[sequence.length()-n+1];
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
              
              for (int i =0; i < sequence.length()-n+1; i++){                  
              if (hladat.equals(pole2[i])) System.out.print(i + " ");
              
              }
        
          
          return opakovania_pole2;
        }   

   
    public static void main(String[] args) {
        
        vytvorPole(sequence);
        po3vytvorPole();
        opakovania();

    }
}
