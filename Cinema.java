public class Proba { 
	public static void main (String [] args) {
		
		int vanymax;
		int andreymax;
		int katyamin;
		int vikadop;
		int prisestep2D;
		int prisestep3D;
		double skidka; 
		
		vanymax = 500;
		andreymax = 200;
		katyamin = 300;
		vikadop = 200;
		prisestep2D = 27;
		prisestep3D = 35;
		skidka = 0.15;
		
		boolean vanya3D = true;
		boolean andrey3D = true;
		boolean vika3D = true;
		boolean katya3D = true;
		boolean vanya2D = false;
		boolean andrey2D = true;
		boolean vika2D = true;
		boolean katya2D = true;
		
		boolean goto3D = vanya3D && andrey3D && vika3D && katya3D;
		boolean goto2D = vanya2D && andrey2D && vika2D && katya2D;
		
		if (goto3D == true) { 
			System.out.println("Они пойдут в 3D");
			System.out.println("Цена на билет без скидки:");
			int currentprice3D = prisestep3D;
			while (currentprice3D <= vanymax + 1) {
				if (currentprice3D >= katyamin && currentprice3D <= vanymax){
					int pricewihtoutskidka3D = currentprice3D;
					double pricewithskidka3D = (1-skidka) * pricewihtoutskidka3D;
					System.out.println("---" + pricewihtoutskidka3D + "---");
					System.out.println("Цена со скидкой, при придъявлении студенческого билета:");
					System.out.println("---" + pricewithskidka3D + "---");
					break;
				}
				currentprice3D = currentprice3D + prisestep3D;
			}
		}
		if (goto2D == true) {
			System.out.println("Они пойдут в 2D");
			System.out.println("Цена на билет без скидки:");
			int currentprice2D = prisestep2D;
			while (currentprice2D <= vanymax + 1) {
				if (currentprice2D >= katyamin && currentprice2D <= vanymax){
					int pricewihtoutskidka2D = currentprice2D;
					double pricewithskidka2D = (1-skidka) * pricewihtoutskidka2D;
					System.out.println("---" + pricewihtoutskidka2D + "---");
					System.out.println("Цена со скидкой, при придъявлении студенческого билета:");
					System.out.println("---" + pricewithskidka2D + "---");
					break;
				}
				currentprice2D = currentprice2D + prisestep2D;
			}
		}
	}
}	