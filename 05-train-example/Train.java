public class Train {
	
	int nTotSeats; 						//Numero dei posti totali del treno
	int nFirstClassSeats; 				//Numero dei posti in prima classe
	int nSecondClassSeats; 				//Numero dei posti in seconda classe
	int nFirstClassReservedSeats; 		//Numero dei posti in prima classe già prenotati
	int nSecondClassReservedSeats; 		//NUmero dei posti in seconda classe già prenotati

	void build(int nFirst, int nSecond) {
		this.nTotSeats = nFirst + nSecond;
		this.nFirstClassSeats = nFirst;
		this.nSecondClassSeats = nSecond;
		this.nFirstClassReservedSeats = 0;
		this.nSecondClassReservedSeats = 0;
	}
	
	void reserveFirstClassSeats(int nSeats) {
		this.nFirstClassReservedSeats = nFirstClassReservedSeats + nSeats;
	}
	
	void reserveSecondClassSeats(int nSeats) {
		this.nSecondClassReservedSeats = nSecondClassReservedSeats + nSeats;
	}
	
	double getTotOccupancyRatio() {
		return (nFirstClassReservedSeats + nSecondClassReservedSeats) * 100.00 / nTotSeats;
	}
	
	double getFirstClassOccupancyRatio() {
		return (nFirstClassReservedSeats * 100.00) / nFirstClassSeats;
	}
	
	double getSecondClassOccupancyRatio() {
		return (nSecondClassReservedSeats * 100.00) / nSecondClassSeats;
	}
	
	void deleteAllReservations() {
		// (annulla tutte le prenotazioni)
		this.nFirstClassReservedSeats = 0;
		this.nSecondClassReservedSeats = 0;
	}
	

}
