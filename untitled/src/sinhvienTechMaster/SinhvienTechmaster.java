package sinhvienTechMaster;

public abstract class SinhvienTechmaster {
    public String name;
    public String major;

    public SinhvienTechmaster(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public abstract double getScore();

    public String getRank() {
        if (getScore() < 5) {
            return "Yếu";
        } else if (getScore() >= 5 && getScore() < 6.5) {
            return "TB";
        } else if (getScore() >= 6.5 && getScore() < 7.5) {
            return "Khá";
        } else if (getScore() >=7.5 && getScore() <= 10){
            return "Giỏi";
        } else return "nhập điểm từ 1 đến 10";


    }

    public void printInfo() {
        System.out.println("tên học sinh: "+name+ "\nchuyên ngành: "+major+ "\nđiểm số: "+getScore()+ "\nhọc lực: "+getRank());
    }




}
