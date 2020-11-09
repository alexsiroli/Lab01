class TestComplexNumCalculator {
    public static void main(String[] args) {
    	
    	ComplexNumCalculator calc = new ComplexNumCalculator();
    	ComplexNum n1 = new ComplexNum();
    	ComplexNum n2 = new ComplexNum();
    	ComplexNum res;

        // - add(1+2i, 2+3i) = 3+5i
         
    	n1.build(1, 2);
    	n2.build(2, 3);
    	res = calc.add(n1, n2);
    	System.out.println(n1.toStringRep() + " + " + n2.toStringRep() + " = " + res.toStringRep());
    	
        // - sub(4+5i, 6+7i) = -2-2i
         
    	n1.build(4, 5);
    	n2.build(6, 7);
    	res = calc.sub(n1, n2);
    	System.out.println(n1.toStringRep() + " - " + n2.toStringRep() + " = " + res.toStringRep());
    	
        // - mul(8+2i, 3-i) = 26 - 2i
         
    	n1.build(8, 2);
    	n2.build(3, -1);
    	res = calc.mul(n1, n2);
    	System.out.println(n1.toStringRep() + " * " + n2.toStringRep() + " = " + res.toStringRep());
    	
        // - div(26-2i, 3-i) = 8 + 2i
    	
    	n1.build(26, -2);
    	n2.build(3, -1);
    	res = calc.div(n1, n2);
    	System.out.println(n1.toStringRep() + " / " + n2.toStringRep() + " = " + res.toStringRep());
         
        // 2) Verificare il corretto valore dei campi nOpDone, lastRes
         
    	System.out.println("nOpDone = " + calc.nOpDone);
    	System.out.println("lastRes = " + calc.lastRes.toStringRep());
        
    }
}
