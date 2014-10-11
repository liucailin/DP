package AbstractFactory;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {

	@Override
	protected EnemyShip makeEnemyShip(String typeOfShip) {
		EnemyShip theShip = null;

		if (typeOfShip.equals("UFO")) {
			theShip = new UFOEnemyShip(new UFOEnemyShipFactory());
		} else if (typeOfShip.equals("Boss UFO")) {
			theShip = new UFOBossEnemyShip(new UFOBossEnemyShipFactory());
		}
		theShip.setName(typeOfShip);
		return theShip;
	}
}
