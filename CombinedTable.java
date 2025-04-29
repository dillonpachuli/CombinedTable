public class CombinedTable{
    private SingleTable t1;
    private SingleTable t2;

    public CombinedTable(SingleTable one, SingleTable two){
        t1 = one;
        t2 = two;
    }

    public boolean canSeat(int value){
        if (value <= t1.getNumSeats() + t2.getNumSeats() - 2) return true;
        return false;
    }

    public double getDesirability(){
        if (t1.getHeight() == t2.getHeight()) return (t1.getViewQuality() + t2.getViewQuality()) / 2;
        else return ((t1.getViewQuality() + t2.getViewQuality()) / 2) - 10;
    }
}