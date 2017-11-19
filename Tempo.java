package metronom;

public class Tempo {
	
	static int bpm;
	static int a = 0;
	
	public Tempo(int bpm) {
		a = 60000/bpm;
	}
	
	
   public boolean czyGra()
    {
		if ((System.currentTimeMillis() % a) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
   public void zmienBPM(int bpm) {
	   a = 60000/bpm;
   }
   
}
