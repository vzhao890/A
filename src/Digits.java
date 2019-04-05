import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;
    public Digits(int num)
    {
        ArrayList<Integer> digitList = new ArrayList <Integer>();
        String a = ""+num; String Temp; int b;
        for(int i = 0; i < a.length(); i++)
        {
            Temp = a.substring(i,i+1);
            b = Integer.parseInt(Temp);
            digitList.add(i,b);
        }
    }
    public boolean isStrictlyIncreasing()
    {
        for(int i = 0; i <digitList.size();i++)
        {
            if(digitList.get(i)>=digitList.get(i+1))
            {
                return false;
            }
        }
        return true;
    }
}
