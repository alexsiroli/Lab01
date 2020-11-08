class TestComplexNum {
  public static void main(String[] args) {
      
      // Testare la classe come segue:
	  
	  // 1) Creare il numero complesso 3+5i e memorizzarlo nella variabile c1
	  
	  ComplexNum c1 = new ComplexNum();
      c1.build(3, 5);
       
	  // 2) Creare il numero complesso 7-4i e memorizzarlo nella variabile c2
	  
      ComplexNum c2 = new ComplexNum();
      c2.build(7, -4);
      
	  // 3) Creare il numero complesso -2+3i e memorizzarlo nella variabile c3
	  
      ComplexNum c3 = new ComplexNum();
      c3.build(-2, 3);
      
	  // 4) Creare il numero complesso -2+3i e memorizzarlo nella variabile c4
	  
      ComplexNum c4 = new ComplexNum();
      c4.build(-2, 3);
      
	  // 5) Stampare in standard output la rappresentazione testuale di
	  // c1,c2,c3,c4 restituita dal metodo toStringRep()
	  
      System.out.println("c1: " + c1.toStringRep());
      System.out.println("c2: " + c2.toStringRep());
      System.out.println("c3: " + c3.toStringRep());
      System.out.println("c4: " + c4.toStringRep());
      
      // 6) Sommare a c1 c2
	  // (somma di due num complessi (a + ib) + (c + id) = (a + c) + i(b + d)
      
      c1.add(c2);
	  
	  // 7) Sommare a c2 c4
	  
      c2.add(c4);
      
	  // 8) Stampare nuovamente in standard output la rappresentazione testuale
	  // di c1,c2,c3,c4
      
      System.out.println("c1: " + c1.toStringRep());
      System.out.println("c2: " + c2.toStringRep());
      System.out.println("c3: " + c3.toStringRep());
      System.out.println("c4: " + c4.toStringRep());
	  
      // 9) Controllare se l'output corrisponde a quanto preventivato
      
      // 10) Invocare il metodo equal su c3 per tre volte, passando come input
      // c1,c2,c4. Stampare il risultato di ciascuna invocazione in standard
      // output
	  
      System.out.println("c3 uguale a c1: " + c3.equal(c1));
      System.out.println("c3 uguale a c2: " + c3.equal(c2));
      System.out.println("c3 uguale a c4: " + c3.equal(c4));
      
      // 11) Controllare se l'output corrisponde a quanto preventivato
  }
}
