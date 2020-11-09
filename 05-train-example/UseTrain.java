class UseTrain {
    public static void main(String[] args) {

        // 1) Creare un oggetto della classe Train specificando valori
        // a piacere per i parametri
         
    	Train treno = new Train();
    	treno.build(200, 400);
    	
        // 2) Effettuare delle prenotazioni in prima e seconda classe
        // specificando un numero di posti da prenotare consistente
    	
    	treno.reserveFirstClassSeats(50);
    	treno.reserveSecondClassSeats(100);
         
        // 3) A seguito di ciascuna prenotazione stampare la ratio di
        // occupazione totale e per ciascuna classe.
    	
    	System.out.println(treno.getTotOccupancyRatio());
    	System.out.println(treno.getFirstClassOccupancyRatio());
    	System.out.println(treno.getSecondClassOccupancyRatio());
         
        // 4) Cancellare tutte le prenotazioni
    	
    	treno.deleteAllReservations();
         
        // 5) Prenotare nuovamente dei posti e stampare le nuove percentuali di
        // occupazione
    	
    	treno.reserveFirstClassSeats(102);
    	treno.reserveSecondClassSeats(50);
    	System.out.println(treno.getTotOccupancyRatio());
    	System.out.println(treno.getFirstClassOccupancyRatio());
    	System.out.println(treno.getSecondClassOccupancyRatio());
    	
    }
}
