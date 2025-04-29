public class SingleTable{
    private int seats = 4;
    private int height;
    private double viewQuality;

    public SingleTable(int s, int h, double v){
        seats = s;
        height = h;
        viewQuality = v;
    }

    public int getNumSeats(){
        return seats;
    }

    public int getHeight(){
        return height;
    }

    public double getViewQuality(){
        return viewQuality;
    }

    public void setViewQuality(double value){
        viewQuality = value;
    }
}