package players;

import game.*;
import java.io.*;
import java.lang.*;

public class Player implements Serializable {
	public String name;
	public Type type;
	
	public Player(String name, Type type) {
		this.name = name;
		this.type = type;
	}

	public String GetName() {
		return this.name;
	}
}
