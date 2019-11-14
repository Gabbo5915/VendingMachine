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
		FactoryProducer factPro=new FactoryProducer();
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
		System.out.println("Need Sugar?Y/N:");
		String addSugar=scan.nextLine();
		System.out.println("Need Milk?Y/N:");
		String addMilk=scan.nextLine();
		scan.close();
		System.out.println("Accepted your choose.");
		res.create();
		temp.fill();
		if(addSugar.equalsIgnoreCase("Y")) {
			factPro.addSugar();
		}
		if(addMilk.equalsIgnoreCase("Y")) {
			factPro.addMilk();
		}
		System.out.println("Done. Please take your beverage.");
	}

}
