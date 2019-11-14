package beverage.tea;

import beverage.Tea;

public class GreenTea implements Tea {

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.print("Green Tea is making");
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
