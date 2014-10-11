package AbstractFactory;

public class EnemyShipTesting {

	public static void main(String[] args) {
		EnemyShipBuilding makeUFOs = new UFOEnemyShipBuilding();
		EnemyShip e1 = makeUFOs.orderTheShip("UFO");
		System.out.println(e1);
		EnemyShip e2 = makeUFOs.orderTheShip("Boss UFO");
		System.out.println(e2);
	}

}
