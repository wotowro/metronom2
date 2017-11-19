package metronom;

public class Metronom extends Thread{//implements Runnable{
	static Audio audio = new Audio();
	//int bpm;
	Tempo tempo = new Tempo(120);
	boolean czy = false;
	
	@Override
	public void run() {
		
	    while(!czy) {
	    	
	    	if(tempo.czyGra() == true ) {
	    	audio.play();
	    	}
	    
	    }
		
	}	
	
	public void stopMe() {
		
		czy = true;
	}
}
