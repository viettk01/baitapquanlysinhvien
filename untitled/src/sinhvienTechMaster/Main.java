package sinhvienTechMaster;

import javax.naming.Name;

public class Main {
    public static void main(String[] args) {

        int sttsvit = 0;
        int sttsvbiz = 0;
//        Sinh viên IT
        SinhvienTechmaster[] svIt = new SinhvienIT[11];

        svIt[0] = new SinhvienIT("Nguyễn Văn Việt", "Mang Vịt", 2, 3, 4);
        svIt[1] = new SinhvienIT("Nguyễn Văn Việt", "Mang Vịt", 6, 5, 7);
        svIt[2] = new SinhvienIT("Nguyễn Văn Việt", "Mang Vịt", 7, 7, 7);
        svIt[3] = new SinhvienIT("Nguyễn Văn Việt", "Mang Vịt", 6, 7, 7);
        svIt[4] = new SinhvienIT("Nguyễn Văn Việt", "Mang Vịt", 10, 10, 10);
        svIt[5] = new SinhvienIT("Nguyễn Văn Việt", "Mang Vịt", 1, 5, 7);
        svIt[6] = new SinhvienIT("Nguyễn Văn Việt", "Mang Vịt", 7, 8, 2);
        svIt[7] = new SinhvienIT("Nguyễn Văn Việt", "Mang Vịt", 6, 5, 7);
        svIt[8] = new SinhvienIT("Nguyễn Văn Việt", "Mang Vịt", 6, 5, 7);
        svIt[9] = new SinhvienIT("Nguyễn Văn Việt", "Mang Vịt", 3, 6, 3);
        svIt[10] = new SinhvienIT("Nguyễn Văn Việt", "Mang Vịt", 6, 7, 7);





//        sinh vien biz
        SinhvienTechmaster[] svBiz = new SinhvienBiz[10];

        svBiz[0] = new SinhvienBiz("Mr Đạt", "Mang Nồi Chiên Không Dầu", 6, 10);
        svBiz[1] = new SinhvienBiz("Mr Đạt", "Mang Nồi Chiên Không Dầu", 8, 10);
        svBiz[2] = new SinhvienBiz("Mr Đạt", "Mang Nồi Chiên Không Dầu", 10, 10);
        svBiz[3] = new SinhvienBiz("Mr Đạt", "Mang Nồi Chiên Không Dầu", 4, 4);
        svBiz[4] = new SinhvienBiz("Mr Đạt", "Mang Nồi Chiên Không Dầu", 4, 5);
        svBiz[5] = new SinhvienBiz("Mr Đạt", "Mang Nồi Chiên Không Dầu", 10, 10);
        svBiz[6] = new SinhvienBiz("Mr Đạt", "Mang Nồi Chiên Không Dầu", 3, 7);
        svBiz[7] = new SinhvienBiz("Mr Đạt", "Mang Nồi Chiên Không Dầu", 10, 10);
        svBiz[8] = new SinhvienBiz("Mr Đạt", "Mang Nồi Chiên Không Dầu", 5, 5);
        svBiz[9] = new SinhvienBiz("Mr Đạt", "Mang Nồi Chiên Không Dầu", 10, 10);

        System.out.println("sinh viên IT");

        for (SinhvienTechmaster sv : svIt) {
            System.out.println(sttsvit++);
            sv.printInfo();
        }


        System.out.println("sinh viên Biz");

        for (SinhvienTechmaster svbz : svBiz) {
            System.out.println(sttsvbiz++);
            svbz.printInfo();
        }


    }
}