class ComplexNum {

    // Inserire qui la dichiarazione dei campi della classe

    double re;	//parte reale
    double im;	//parte immaginaria
    
    void build(double re, double im) {
    	
    	// Inserire qui l'inizializzazione dei campi con i parametri forniti in
        // input
        
    	this.re = re;
        this.im = im;
    }

    boolean equal(ComplexNum num) {
        
        // Implementare il metodo in modo che restituisca true se e solo se il
        // numero complesso � uguale al parametro num passato in input
    
        return this.re == num.re && this.im == num.im;
    }

    void add(ComplexNum num) {
        
        // Implementare il metodo in modo che venga aggiunto il numero complesso
        // passato in input - Rif. Appendice A1 (slide)
         
    	this.re = this.re + num.re;
        this.im = this.im + num.im;
    }

    String toStringRep() {
        
        // Implementare il metodo in modo che restituisca una rappresentazione
        // testuale del numero complesso
         
    	if (this.im > 0){
            if (this.im == 1){
                return this.re + "+" + "i";
            }
            return this.re + "+" + this.im + "i";
        }
        if (this.im == 0){
             return "" + this.re;
        }
        return "" + this.re + this.im + "i";
    }
}
