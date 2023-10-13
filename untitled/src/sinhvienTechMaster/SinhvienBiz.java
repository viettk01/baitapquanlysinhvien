package sinhvienTechMaster;

public class SinhvienBiz extends SinhvienTechmaster{

    public double marketing;
    public double sales;

    public SinhvienBiz(String name, String major, double marketing, double sales) {
        super(name, major);
        this.marketing = marketing;
        this.sales = sales;
    }

    @Override
    public double getScore() {
        return (2*marketing + sales)/3;
    }
}
