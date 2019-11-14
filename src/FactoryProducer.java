import beverage.AbstractBeverageChoose;
import decorate.ICondiments;
import temperature.Temperature;

public class FactoryProducer implements ICondiments{
	public static AbstractBeverageChoose getFactory(String choice) {
		Class<?> cls=null;
		AbstractBeverageChoose res=null;
		if(choice.equalsIgnoreCase("coffee")) {
			choice="CoffeeFactory";
		}else if(choice.equalsIgnoreCase("tea")) {
			choice="TeaFactory";
		}
		try {
			cls=Class.forName("beverage."+choice);
			res=(AbstractBeverageChoose) cls.getDeclaredConstructor().newInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public static Temperature getTemperature(String choice) {
		Class<?> cls=null;
		Temperature res=null;
		if(choice.equalsIgnoreCase("hot")) {
			choice="HotWater";
		}else if(choice.equalsIgnoreCase("cold")) {
			choice="ColdWater";
		}
		try {
			cls=Class.forName("temperature.options."+choice);
			res=(Temperature) cls.getDeclaredConstructor().newInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public void addSugar() {
		// TODO Auto-generated method stub
		System.out.print("Adding sugar");
		for(int i=0;i<3;i++) {
			System.out.print(". ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("\nSugar Added!");
		
	}

	@Override
	public void addMilk() {
		// TODO Auto-generated method stub
		System.out.print("Adding milk");
		for(int i=0;i<3;i++) {
			System.out.print(". ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("\nMilk Added!");
		
	}
}
