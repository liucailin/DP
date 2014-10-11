package Factory;
/*
 * Factory Pattern
 * 1. Factory method
 * 2. A set of classes have same super class
 */

// This is a factory thats only job is creating ships
// By encapsulating ship creation, we only have one
// place to make modifications
public class EnemyShipFactory {
	
	// This could be used as a static method if we
		// are willing to give up subclassing it
		
		public EnemyShip makeEnemyShip(String newShipType){
			
			//EnemyShip newShip = null;
			
			if (newShipType.equals("U")){
				
				return new UFOEnemyShip();
				
			} else 
			
			if (newShipType.equals("R")){
				
				return new RocketEnemyShip();
				
			} else 
			
			if (newShipType.equals("B")){
				
				return new BigUFOEnemyShip();
				
			} else return null;
			
		}
}
