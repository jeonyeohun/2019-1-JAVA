import java.util.Scanner;

class BasePair {
  // Your code here
  String sequence;
  String newseq="";
  
  public void setSequence (String sequence){
    this.sequence = sequence;
  }
  public String getSequence(){
    return this.sequence;
  }
  
  public String getPairSequence(){
    for (int i=0 ; i<sequence.length() ; i++){
        if(sequence.charAt(i) == 'A'){
          newseq += "T";
        }
        else if(sequence.charAt(i) == 'T'){
          newseq += "A";
        }
        else if(sequence.charAt(i) == 'G'){
          newseq += "C";
        }
        else if(sequence.charAt(i) == 'C'){
          newseq += "G";
        }
    }
        return newseq;
  }
}

class Main {
  public static void main(String[] args) {
    int flag = 0;
    String str = "ATGC";
    Scanner keyboard = new Scanner(System.in);
		BasePair dna = new BasePair();
		String sequence;
		
		// Your code here
		
		
		while(true){
		  flag=0;
		  System.out.print("Input the sequence: ");
		  sequence = keyboard.next();
		  
		  for (int i=0 ; i<sequence.length() ; i++){
		    for(int j=0 ; j<str.length() ; j++){
		      if (sequence.charAt(i) == str.charAt(j) ){
		        flag += 1;
		      }
		    }
		  }
		  
		  if (flag == sequence.length()){
		    dna.setSequence(sequence);
		    break;
		  }
		  else{
		    System.out.println("Input sequence isn't substring of ATGC.");
		  }
		}
		
		System.out.println("Sequence " + dna.getSequence() +
			" paired with " + dna.getPairSequence() + ".");
		keyboard.close();

  }
}