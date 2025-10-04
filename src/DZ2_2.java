public class DZ2_2{
	public static void main(String[] args){
		int busyPlace[] = {1, 2, 3, 4, 5, 6, 7, 0, 0, 0, 11, 12, 13, 0, 15, 16, 17, 0, 0, 0, 0, 22, 23, 24, 0, 26, 27, 28, 29, 30};
		int allPlace[] = new int[30];
		for (int i = 0; i<allPlace.length; i++){
			allPlace[i] = i+ 1;
		}
		int placeCount = 0;
		int freePlace[] = new int[4];
		for (int i = 0; i < allPlace.length; i++){
			if (allPlace[i] == busyPlace[i]){
				placeCount = 0;
				continue;
			}
			placeCount++;
			freePlace[placeCount-1] = i+1;
			if (placeCount == 4){
				int countOfPeople = 0;
				double totalPrice = 0;
				System.out.println("Свободные места:");
				for (int y = 3; y >-1; y--){
					System.out.println(freePlace[y]);
				}
				for (int pl : freePlace){
					countOfPeople+=1;
					double priceInPlace = 315.0;
					System.out.print("Цена за место номер " + pl);
					if (10 <= pl & pl <= 20){
						priceInPlace = priceInPlace *1.05;
					}
					if (countOfPeople != 2){
						System.out.print(" со скидкой");
						priceInPlace = priceInPlace * 0.85;
					} else{
						System.out.print(" без скидки");
					}
					System.out.println(": " + priceInPlace);
					totalPrice += priceInPlace;
				}
				System.out.println("Общая стоимость:");
				System.out.println(totalPrice);
			}
		}
	}
}