import java.util.ArrayList;
import java.util.*;
public class unitArray {
	private ArrayList<Unit> info;////(?)
	public unitArray()
	{
		info = new ArrayList<Unit>();
	}
	public void makeUnit(String name, int health, int damage)//GUI needs to pass in these paremeters as user chooses
	{
		Unit a = new Unit();
		a.setName(name);
		a.setHealth(health);
		a.setDamage(damage);
		info.add(a);///////ALL THE INFORMATION OF THE NEW UNIT
	}
	public ArrayList<Unit> getArray()
	{
		return info;
	}
	public void updateArray()
	{
		for(Unit a : info)
		{
			if(a.getHealth()==0)
			{
				info.remove(a);
			}
		}
	}
}
