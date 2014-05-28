
package cyclopeptidesequencingoop;
import java.util.Arrays;
import java.util.*; 


public class Sequence {
    protected String DNA = "";
    protected String RCDNA = "";
    protected String RNA = "";
    protected String Protein = "";
    protected String AAfragment = "";
    static String[] DNA_Array;
    static String[] AA_Array;
    static String[] DNA_Array2;
    static String[] AA_Array2;
    ArrayList DNA_Arraylist = new ArrayList();
    ArrayList AA_Arraylist = new ArrayList();
    private String[] K = {"AAA", "AAG"};
    private String[] N = {"AAC","AAU"};
    private String[] T = {"ACA","ACC","ACG","ACU"};
    private String[] R = {"AGA", "AGG", "CGA", "CGC", "CGG", "CGU"};
    private String[] S = {"AGC", "AGU","UCA","UCC","UCG","UCU"};
    private String[] I = {"AUA", "AUC", "AUU"};
    private String[] M = {"AUG"};
    private String[] Q = {"CAA", "CAG"};
    private String[] H = {"CAC", "CAU"};
    private String[] P = {"CCA", "CCC", "CCG", "CCU"};
    private String[] L = {"CUA","CUC","CUG", "CUU","UUA","UUG"};
    private String[] E = {"GAA","GAG"};
    private String[] D = {"GAC","GAU"};
    private String[] A = {"GCA","GCC","GCG","GCU"};
    private String[] G = {"GGA","GGC","GGG","GGU"};
    private String[] V = {"GUA","GUC","GUG","GUU"};
    private String[] Y = {"UAC","UAU"};
    private String[] C = {"UGC","UGU"};
    private String[] F = {"UUC","UUU"};
    private String[] W = {"UGG"};
    private String[] Stop = {"UAA", "UAG", "UGA"};
    
    
    
    
    
   public Sequence(String type, String sequence ){
        if (type.equalsIgnoreCase("dna")) DNA = sequence;
        else if (type.equalsIgnoreCase("rna")) RNA = sequence;
        else if (type.equalsIgnoreCase("protein")) Protein = sequence;
             
    }
      public Sequence(String type, String dna_sequence, String AAfrag ){
        this.AAfragment = AAfrag;
        this.DNA = dna_sequence;
        setDNAtoRNA();
        setRNAtoProtein();
        this.AA_Array = new String[Protein.length()-AAfragment.length()+1];     
        this.DNA_Array = new String[AA_Array.length];
        
        
        for(int i = 0; i < AA_Array.length; i++ ){
            this.AA_Array[i] = "";
            for(int j = 0; j < AAfragment.length(); j++ ){
                this.AA_Array[i] = AA_Array[i] + Protein.charAt(i+j);
            }
        }

    
        for (int i = 0; i<AA_Array.length; i++){
        this.DNA_Array[i]="";    
            for (int k = 0; k<AAfragment.length()*3; k++){
            DNA_Array[i] = DNA_Array[i] + DNA.charAt(i*3+k);
                }

                }            
              }
      public Sequence(int type, String dna_sequence, String AAfrag ){
        this.AAfragment = AAfrag;
        this.DNA = RCDNA(dna_sequence);
        setDNAtoRNA();
        setRNAtoProtein();
        this.AA_Array2 = new String[Protein.length()-AAfragment.length()+1];     
        this.DNA_Array2 = new String[AA_Array2.length];
        
        
        for(int i = 0; i < AA_Array2.length; i++ ){
            this.AA_Array2[i] = "";
            for(int j = 0; j < AAfragment.length(); j++ ){
                this.AA_Array2[i] = AA_Array2[i] + Protein.charAt(i+j);
            }
        }

    
        for (int i = 0; i<AA_Array2.length; i++){
        this.DNA_Array2[i]="";    
            for (int k = 0; k<AAfragment.length()*3; k++){
            DNA_Array2[i] = DNA_Array2[i] + DNA.charAt(i*3+k);
                }

                }            
              }      
   
    public void setDNAtoRNA() {
        for (int i = 0 ; i <DNA.length() ; i++) {
            if (DNA.charAt(i) == 'A') this.RNA = RNA + DNA.charAt(i);
            else if (DNA.charAt(i) == 'C') this.RNA = RNA + DNA.charAt(i);            
            else if (DNA.charAt(i) == 'G') this.RNA = RNA + DNA.charAt(i);
            else if (DNA.charAt(i) == 'T') this.RNA = RNA + "U";
        }

    }
    public void setRNAtoDNA() {
        for (int i = 0 ; i <RNA.length() ; i++) {
            if (RNA.charAt(i) == 'A') this.DNA = DNA + RNA.charAt(i);
            else if (RNA.charAt(i) == 'C') this.DNA = DNA + RNA.charAt(i);            
            else if (RNA.charAt(i) == 'G') this.DNA = DNA + RNA.charAt(i);
            else if (RNA.charAt(i) == 'U') this.DNA = DNA + "T";
        }    
        }
    public void setRNAtoProtein() {
        if (this.RNA.length()%3 == 0) {
        for (int i = 0 ; i <this.RNA.length() ; i = i + 3) {
            if (Arrays.asList(K).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "K";
           else if (Arrays.asList(N).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "N";
            else if (Arrays.asList(T).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "T";
            else if (Arrays.asList(R).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "R";
            else if (Arrays.asList(S).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "S";
            else if (Arrays.asList(I).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "I";
            else if (Arrays.asList(M).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "M";
            else if (Arrays.asList(Q).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "Q";
            else if (Arrays.asList(H).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "H";
            else if (Arrays.asList(P).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "P";
            else if (Arrays.asList(L).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "L";
            else if (Arrays.asList(E).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "E";
            else if (Arrays.asList(D).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "D";
            else if (Arrays.asList(A).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "A";
            else if (Arrays.asList(G).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "G";
            else if (Arrays.asList(V).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "V";
            else if (Arrays.asList(Y).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "Y";
            else if (Arrays.asList(C).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "C";
            else if (Arrays.asList(F).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "F";
            else if (Arrays.asList(W).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "W";
            else if (Arrays.asList(Stop).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "s";
        } }
  else if (this.RNA.length()%3 == 1) {
        for (int i = 0 ; i <this.RNA.length() - 1 ; i = i + 3) {
            if (Arrays.asList(K).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "K";
           else if (Arrays.asList(N).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "N";
            else if (Arrays.asList(T).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "T";
            else if (Arrays.asList(R).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "R";
            else if (Arrays.asList(S).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "S";
            else if (Arrays.asList(I).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "I";
            else if (Arrays.asList(M).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "M";
            else if (Arrays.asList(Q).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "Q";
            else if (Arrays.asList(H).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "H";
            else if (Arrays.asList(P).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "P";
            else if (Arrays.asList(L).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "L";
            else if (Arrays.asList(E).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "E";
            else if (Arrays.asList(D).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "D";
            else if (Arrays.asList(A).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "A";
            else if (Arrays.asList(G).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "G";
            else if (Arrays.asList(V).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "V";
            else if (Arrays.asList(Y).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "Y";
            else if (Arrays.asList(C).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "C";
            else if (Arrays.asList(F).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "F";
            else if (Arrays.asList(W).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "W";
            else if (Arrays.asList(Stop).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "s";
        } }
  else if (this.RNA.length()%3 == 2) {
        for (int i = 0 ; i <this.RNA.length() - 2 ; i = i + 3) {
            if (Arrays.asList(K).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "K";
           else if (Arrays.asList(N).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "N";
            else if (Arrays.asList(T).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "T";
            else if (Arrays.asList(R).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "R";
            else if (Arrays.asList(S).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "S";
            else if (Arrays.asList(I).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "I";
            else if (Arrays.asList(M).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "M";
            else if (Arrays.asList(Q).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "Q";
            else if (Arrays.asList(H).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "H";
            else if (Arrays.asList(P).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "P";
            else if (Arrays.asList(L).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "L";
            else if (Arrays.asList(E).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "E";
            else if (Arrays.asList(D).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "D";
            else if (Arrays.asList(A).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "A";
            else if (Arrays.asList(G).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "G";
            else if (Arrays.asList(V).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "V";
            else if (Arrays.asList(Y).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "Y";
            else if (Arrays.asList(C).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "C";
            else if (Arrays.asList(F).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "F";
            else if (Arrays.asList(W).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "W";
            else if (Arrays.asList(Stop).contains(Character.toString( RNA.charAt(i)) + Character.toString( RNA.charAt(i+1)) 
                    + Character.toString( RNA.charAt(i+2)) )) this.Protein = Protein + "s";
        }         

         
        }    
        }
   public String RCDNA(String seqDNA){
        String r ="";
        String rc ="";
        for(int i = seqDNA.length()-1; i>=0;i-- ){
            r = r + seqDNA.charAt(i);
        }
        for(int i = 0 ; i<=seqDNA.length()-1;i++ ){
       if (r.charAt(i)== 'A')rc = rc + "T";
       if (r.charAt(i)== 'C')rc = rc + "G";
       if (r.charAt(i)== 'G')rc = rc + "C";
       if (r.charAt(i)== 'T')rc = rc + "A";
        }
       return rc;
    }
    }
    
    
    

