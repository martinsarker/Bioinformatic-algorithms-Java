
package approximatepatternmatching;

public class ApproximatePatternMatching {
    static String find ="";
    static String sequence ="ACGTTGCATGTCGCATGATGCATGAGAGCT";
    static int d = 1;
    static int k2 = 4;
    static int length=sequence.length();
    static int k = find.length();
    static String[] Array = new String[length - k +1];
    
/*    static String[] createArray(){
        for(int i =0; i < length - k + 1; i++){
           Array[i] = "";
           for(int j =0; j <k; j++){ 
               
               Array[i] = Array[i] + Character.toString(sequence.charAt(i+j));
           }
        }

        return Array;
       
    }
    */ 
/* static String[] Matches(){
        int pomocna =1;
        for(int i =0; i < length - k + 1; i++){
           int tolerance = d;
           for(int j =0; j < k; j++){
           if (find.charAt(j) != sequence.charAt(i+j)) tolerance=tolerance - 1 ;
           
           }
           if (tolerance >= 0) { 
               System.out.print(i + " ");
               pomocna++;
                       
           
           }
           if (pomocna % 40 ==0) System.out.print("");
        }

        return Array;
       
    }   */
    
static String[] createArray(){
        for(int i =0; i < length - k2 + 1; i++){
           Array[i] = "";
           for(int j =0; j <k2; j++){ 
               
               Array[i] = Array[i] + Character.toString(sequence.charAt(i+j));
           }
        }

        return Array;
       
    }
static void Matches(){
        for(int i =0; i < length - k2 + 1; i++){                     
          
           int tolerance = d;
           for(int j =0; j <  length - k2 + 1 ; j++){
           for(int l =0; l <  k2  ; l++){ 
           if (Array[i].charAt(l) != Array[j].charAt(l)) tolerance-- ;
           
           }
               if (tolerance >= 0)
               System.out.print(Array[i] + " ");
           
        }
                                                                
        }       
    }   
    
    
   
   

    public static void main(String[] args) {
        createArray();
        Matches();



    }
}
