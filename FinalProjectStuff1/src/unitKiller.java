import java.util.ArrayList;
import java.util.*;
public class unitKiller {
public ArrayList<Unit> (ArrayList<Unit> ary)
{
	for(int a = ary.size(); a > 0; a--)
	{
		if (ary.get(a).getHealth()==0)
		{ary.remove(a);}
	}
}
}
