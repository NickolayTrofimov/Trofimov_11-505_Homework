public class pp{
	public static void main(String[] args) {
		
		int[] occupied = new int[30];
		for (int i = 0; i < 7; i++) occupied[i] = i+1;
		for (int i = 10; i < 13; i++) occupied[i] = i+1;
		for (int i = 14; i < 17; i++) occupied[i] = i+1;
		for (int i = 21; i < 24; i++) occupied[i] = i+1;
		for (int i = 25; i < 30; i++) occupied[i] = i+1;
		
		int i = 0;
		int lastPlace;
		int counter = 0;
		int groupSize = 4;
		
		while (counter < 5 && i <= 30 - groupSize) {
			if (occupied[i] == 0){
				counter += 1;
			}
			
			else {
				if (counter == 4) {
					lastPlace = i;
					System.out.println("Номера посадочных мест с " + lastPlace + " по " + (lastPlace - groupSize + 1) + " в обратном порядке");
					break;
				}
				else {
					counter = 0;
				}
			}
			i += 1;
		}
		
		
	}
}