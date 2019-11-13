import beverage.AbstractBeverageChoose;
import temperature.Temperature;

public class FactoryProducer {
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
}
