import java.util.ArrayList;

public class unitArray {
    
    private ArrayList<Unit> info;////(?)
    
    public unitArray()
    {
        info = new ArrayList<Unit>();
    }
    public void makeUnit(int unitID)
    {

        if(unitID == 1)
        {
            Unit u1 = new Unit(1, 50, 10, 100);
            info.add(u1);
        }
        if(unitID == 2)
        {
            Unit u2 = new Unit(2, 70, 20, 130);
            info.add(u2);
        }
        if(unitID == 3)
        {
            Unit u3 = new Unit(3, 90, 30, 170);
            info.add(u3);
        }
        if(unitID == 4)
        {
            Unit u4 = new Unit(4, 110, 50, 250);
            info.add(u4);
        }
        if(unitID == 5)
        {
            Unit u5 = new Unit(5, 130, 60, 270);
            info.add(u5);
        }
        if(unitID == 6)
        {
            Unit u6 = new Unit(6, 150, 80, 300);
            info.add(u6);
        }
        if(unitID == 7)
        {
            Unit u7 = new Unit(7, 250, 110, 450);
            info.add(u7);
        }
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



