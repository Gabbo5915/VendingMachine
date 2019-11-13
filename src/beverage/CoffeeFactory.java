package beverage;

import beverage.AbstractBeverageChoose;

public class CoffeeFactory extends AbstractBeverageChoose{

	@Override
	public Coffee getCoffee(String coffee) {
		// TODO Auto-generated method stub
		Class<?> c=null;
		Coffee res=null;
		if(coffee.equalsIgnoreCase("americano")) {
			coffee="Americano";
		}else if(coffee.equalsIgnoreCase("espresso")) {
			coffee="Espresso";
		}else if(coffee.equalsIgnoreCase("latte")) {
			coffee="Latte";
		}
		try {
			c=Class.forName("beverage.coffee."+coffee);
			res = (Coffee) c.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public Tea getTea(String tea) {
		// TODO Auto-generated method stub
		return null;
	}

}
