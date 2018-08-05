import java.util.Random;

public class Main {

    public static void main(String args[]) {
        Random LottoNumber = new Random();

        String []one = {"1","2","4","3","5"};
        String []two = {"12","8","10","14","15"};
        String []three = {"20","18","19","15","17"};
        String []four = {"26","25","24","27","23"};
        String []five = {"34","37","29","35","33"};
        String []six = {"44","43","45","40","42"};
        String []bonus = {"16","4","12","39","2"};

        String[] fullNumber = new String[100];

        for (int i = 0; i < 100; i++) {
            fullNumber[i] = one[LottoNumber.nextInt(5)] + " "
                    + two[LottoNumber.nextInt(5)] + " "
                    + three[LottoNumber.nextInt(5)] + " "
                    + four[LottoNumber.nextInt(5)] + " "
                    + five[LottoNumber.nextInt(5)] + " "
                    + six[LottoNumber.nextInt(5)] + " "
                    + bonus[LottoNumber.nextInt(5)];
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(fullNumber[i]);
        }
    }
}

