fun makeComplement(dna : String) : String {
    var complement = ""; //var for new return string
        
      for(i in dna.indices){
        if(dna[i] == 'T'){
          complement += 'A';
        }
        if(dna[i] == 'A'){
          complement += 'T';
        }
        if(dna[i] == 'C'){
          complement += 'G';
        }
        if(dna[i] == 'G'){
          complement += 'C';
        }
    
    }
      return complement
    
    }

    fun main(){
        makeComplement("AGCA")
    }