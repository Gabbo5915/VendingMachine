package temperature.options;

import temperature.Temperature;

public class ColdWater implements Temperature {

	@Override
	public void fill() {
		// TODO Auto-generated method stub
		System.out.print("Now filling Cold Water");
		for(int i=0;i<3;i++) {
			System.out.print(". ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
	}

}
