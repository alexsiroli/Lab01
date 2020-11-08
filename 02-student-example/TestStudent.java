class TestStudent {
  public static void main(String[] args) {
      Student student = new Student();
      
      /*
       * aggiornare l'invocazione del metodo build con l'aggiunta dei
       * parametri
       */
      
      student.build("Alex", "Siroli", 1001, 2019);
      student.printStudentInfo();
      
      /*
       * Creare dei nuovi oggetti relativi agli studenti:
       *
       * - Nome: Luigi Cognome: Gentile id: 1015, matriculationYear: 2019
       * - Nome: Simone Cognome: Bianchi id: 1016, matriculationYear: 2018
       * - Nome: Andrea Cognome: Bracci id: 1017, matriculationYear: 2017
       *
       * Stampare a video le informazioni relative a ciascuno studente.
       */
      
      Student student01 = new Student();
      student01.build("Luigi", "Gentile", 1015, 2019);
      student01.printStudentInfo();

      Student student02 = new Student();
      student02.build("Simone", "Bianchi", 1016, 2018);
      student02.printStudentInfo();

      Student student03 = new Student();
      student03.build("Andrea", "Bracci", 1017, 2017);
      student03.printStudentInfo();
  }
}
