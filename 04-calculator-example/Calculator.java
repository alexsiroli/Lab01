class Calculator {

	int nOpDone;      // conta il numero di operazioni compiute dalla calcolatrice
    double lastRes;   // memorizza l'ultimo risultato computato
    
    void build(){
        this.nOpDone = 0;
        this.lastRes = 0;
    }
    
	double add(double a, double b){
        this.nOpDone++;
        this.lastRes = (a+b);
        return this.lastRes;
    }

    double sub(double a, double b){
        this.nOpDone++;
        this.lastRes = (a-b);
        return this.lastRes;
    }

    double mul(double a, double b){
        this.nOpDone++;
        this.lastRes = (a*b);
        return this.lastRes;
    }

    double div(double a, double b){
        this.nOpDone++;
        this.lastRes = (a/b);
        return this.lastRes;
    }
    
}
