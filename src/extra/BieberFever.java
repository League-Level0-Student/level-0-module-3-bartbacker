package extra;

public class BieberFever {
	public static void main(String[] args) {
		for(int i = 1; i < 7; i++){   
		
			if(i%2==0) {
				 speak("Baby Baby Baby No"); }
			if(i%2==0) {
				 speak("I thought you'd always be mine"); }
				 else {
					 speak("Baby Baby Baby Oh"); 
				 }		
			
					 
}
}
static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}
