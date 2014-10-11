package AbstractFactory;

public class UFOEnemyShip extends EnemyShip {

	// We define the type of ship we want to create
	// by stating we want to use the factory that
	// makes enemy ships

	EnemyShipFactory shipFactory;

	// The enemy ship required parts list is sent to
	// this method. They state that the enemy ship
	// must have a weapon and engine assigned. That
	// object also states the specific parts needed
	// to make a regular UFO versus a Boss UFO

	public UFOEnemyShip(EnemyShipFactory shipFactory) {
		this.shipFactory = shipFactory;
	}

	@Override
	void makeShip() {
		System.out.println("make enemy ship " + getName());
		weapon = shipFactory.addESGun();
		engine = shipFactory.addESEngine();

	}

}
