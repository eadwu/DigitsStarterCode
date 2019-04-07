import java.util.ArrayList;

public class Digits
{
    //The list of digits from the number used to //construct this object
    ArrayList<Integer> digitList;

    //Constructs a Digits object that
    //represents num
    public Digits (int num)
    {
        this.digitList = new ArrayList<>();
        if (num == 0) this.digitList.add(0);
        while (num > 0) {
            this.digitList.add(0, num % 10);
            num = num / 10;
        }
    }
    public boolean isStrictlyIncreasing()
    {
        for (int i = 1; i < this.digitList.size(); i++) {
            if (this.digitList.get(i) <= this.digitList.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
    //Extra method to make the runner easier to read
    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }

}
