class Student {

    // ... Aggiungere qui la definizione dei campi
	
	String name;
    String surname;
	int id;
    int matriculationYear;

    void build(String name, String surname, int id, int year) {
        // ... Inizializzazione dei campi della classe
    	this.name = name;
        this.surname = surname;
        this.id = id;
        this.matriculationYear = year;
    	
    }

    void printStudentInfo() {
        /*
         * Aggiungere i comandi per la stampa delle informazioni sullo studente
         */
    	System.out.println("Nome: " + this.name);
        System.out.println("Cognome: " + this.surname);
        System.out.println("Matricola: " + this.id);
        System.out.println("Anno immatricolazione: " + this.matriculationYear);
    }
}
