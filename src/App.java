public class App {
    public static void main(String[] args) throws Exception {
    //testando o Laço For Each
        String[] vect = new String[] {"Maria", "Bob", "Alex" };
		
		for(int i=0; i< vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("--------------------------");
		
      for (String obj : vect) {
    	  System.out.println(obj);
      }
    }
}
