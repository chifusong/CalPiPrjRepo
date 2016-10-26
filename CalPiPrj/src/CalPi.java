public class CalPi {

	public static void main(String[] args) {
		float hit=0;
		float total=0;
		
		
		
		while(true) {
			float x=(float) Math.random()*2 - 1;	
			float y=(float) Math.random()*2 - 1;	

			if( x*x + y*y < 1) {
				hit++;
			}
			total++;
			
			System.out.println("hit="+hit+" total="+total+" PI="+ (float) hit/(float) total * 4);
		}
	}

}
