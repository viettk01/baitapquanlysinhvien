package sinhvienTechMaster;

public class SinhvienIT extends SinhvienTechmaster{

    public double html;
    public double java;
    public double css;

    public SinhvienIT(String name, String major, double html, double java, double css) {
        super(name, major);
        this.html = html;
        this.java = java;
        this.css = css;
    }

    @Override
    public double getScore() {
        return (2*java + html + css)/4 ;
    }



}
