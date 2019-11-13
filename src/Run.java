import java.util.Scanner;

import beverage.*;
import temperature.*;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage res=null;
		Scanner scan=new Scanner(System.in);
		System.out.println("Choose your Beverage: Coffee or Tea?");
		String target=scan.nextLine();
		AbstractBeverageChoose beverageFactory=FactoryProducer.getFactory(target);
		if(target.equalsIgnoreCase("coffee")) {
			System.out.println("Which kind of coffee? Americano/Espresso/Latte:");
			target=scan.nextLine();
			res=beverageFactory.getCoffee(target);
		}else if(target.equalsIgnoreCase("tea")){
			System.out.println("Which kind of tea? BlackTea/GreenTea/YellowTea:");
			target=scan.nextLine();
			res=beverageFactory.getTea(target);
		}
		System.out.println("Cold or Hot?");
		target=scan.nextLine();
		Temperature temp=FactoryProducer.getTemperature(target);
		System.out.println("Accepted your choose.");
		res.create();
		temp.fill();
	}

}
