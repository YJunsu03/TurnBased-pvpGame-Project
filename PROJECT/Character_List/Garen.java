package PROJECT.Character_List;

import java.util.Random;
import java.util.Scanner;

public class Garen {
    static String Garen = "Garen";
    static int GarenAD = 30;
    static int GarenHP = 750;
    static int GarenCri = 30;
    static Random Garenchp = new Random(); //랜덤 객체 생성(디폴트 시드값 : 현재시간)

    public static void main(String[] args) {
        Garenchp.setSeed(System.currentTimeMillis()); // 시드값 설정을 따로 둠
        Garenchp.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("________________________");
        System.out.println("캐릭터 이름 : " + Garen);
        System.out.println("공격력 : " + GarenAD);
        System.out.println("체력 : " + GarenHP);
        System.out.println("치명타 확률 : " + GarenCri + "%");
        System.out.println("________________________");

        System.out.print("치명타 확률 테스트를 해보시겠습니까? (Y/N)");
        String Critest = sc.next();
        System.out.println("");

        if(Critest.equals("Y") || Critest.equals("y")) {
            System.out.println("치명타 확률 테스트 프로그램을 실행합니다.");
            System.out.println("_______________________________________");
            while(true) {
                int GarenCri = (int)(Math.random()*100);
                    if (GarenCri < 30) {
                        System.out.println( "치명타! 데미지가 두배가 들어갑니다!");
                        System.out.println("");
                        System.out.println("적에게 입힌 데미지 : " + GarenAD*2);
                    }
                    else {
                        System.out.println("치명타가 발생하지 않았습니다.");
                    }
                System.out.println("한번 더 하시겠습니까? (Y/N)");
                String yn = sc.next();
                System.out.println("__________________________");
               
                    if(yn.equals("Y") || yn.equals("y")) {
                        continue;
                    }
                    else {
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    }
            }
        }
    }
}