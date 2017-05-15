import java.util.ArrayList;
import java.util.*;
public class unitArray {
	private ArrayList<Unit> info;////(?)
	public unitArray()
	{
		info = new ArrayList<Unit>();
	}
	public void makeUnit()
	{
		Unit a = new Unit();
		info.add(a);///////ALL THE INFORMATION OF THE NEW UNIT
	}
	public ArrayList<Unit> getArray()
	{
		return info;
	}
}
