package model.entities;

import java.util.HashMap;

//This class link each Entity Creator to ASCII character.
public class EntityToChar {
	HashMap<String,Character> entityhm; //This HashMap link Entity class name to ASCII character.
	
	public EntityToChar() {
		//Initializing HashMap.
		entityhm = new HashMap<String,Character>();
		
		entityhm.put(new RegularBox().getClass().getName(), '@');
		entityhm.put(new RegularBoxTarget().getClass().getName(), 'O');
		entityhm.put(new RegularFigure().getClass().getName(), 'A');
		entityhm.put(new RegularWall().getClass().getName(), '#');		
	}
	
	//This method get AbstractEntity and return the concurrent ASCII character.
	public char getChar(AbstractEntity ae)
	{
		if(ae!=null)
			return entityhm.get(ae.getClass().getName());
		return ' ';
		}
	
}
