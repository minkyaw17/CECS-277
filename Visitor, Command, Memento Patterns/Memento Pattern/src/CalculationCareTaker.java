import java.util.ArrayList;
import java.util.List;

public class CalculationCareTaker
{
    private List<MementoCalculator> mList = new ArrayList<MementoCalculator>();

    public void add(MementoCalculator m)
    {
        mList.add(m);
    }

    public MementoCalculator get(int index)
    {
        return mList.get(index);
    }
}
