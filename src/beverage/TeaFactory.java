package beverage;

public class TeaFactory extends AbstractBeverageChoose{

	@Override
	public Coffee getCoffee(String coffee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tea getTea(String tea) {
		// TODO Auto-generated method stub
		Class<?> c=null;
		Tea res=null;
		if(tea.equalsIgnoreCase("blacktea")) {
			tea="BlackTea";
		}else if(tea.equalsIgnoreCase("greentea")) {
			tea="GreenTea";
		}else if(tea.equalsIgnoreCase("yellowtea")) {
			tea="YellowTea";
		}
		try {
			c=Class.forName("beverage.tea."+tea);
			res=(Tea) c.getDeclaredConstructor().newInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}

}
