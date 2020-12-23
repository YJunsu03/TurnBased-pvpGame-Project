package PROJECT.Character_List;

import java.util.Random;
import java.util.Scanner;

public class Maokai {
    static String Maokai = "Maokai";
    static int MaokaiAD = 25;
    static int MaokaiHP = 1000;
    static int MaokaiCri = 15;
    static int MaokaiPS = 20; // 입힌 피해의 20% 생명력 흡수 [마오카이의 패시브] LifeSteal
    static Random Maokaichp = new Random(); //랜덤 객체 생성(디폴트 시드값 : 현재시간)

    public static void main(String[] args) {
        Maokaichp.setSeed(System.currentTimeMillis()); // 시드값 설정을 따로 둠
        Maokaichp.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("________________________");
        System.out.println("캐릭터 이름 : " + Maokai);
        System.out.println("공격력 : " + MaokaiAD);
        System.out.println("체력 : " + MaokaiHP);
        System.out.println("치명타 확률 : " + MaokaiCri + "%");
        System.out.println("________________________");

        System.out.print("치명타 확률 테스트를 해보시겠습니까? (Y/N)");
        String Critest = sc.next();
        System.out.println("");

        if(Critest.equals("Y") || Critest.equals("y")) {
            System.out.println("치명타 확률 테스트 프로그램을 실행합니다.");
            System.out.println("_______________________________________");
            while(true) {
                int MaokaiCri = (int)(Math.random()*100);
                    if (MaokaiCri > 70) {
                        System.out.println( "치명타! 데미지가 두배가 들어갑니다!");
                        System.out.println("");
                        System.out.println("적에게 입힌 데미지 : " + MaokaiAD*2);
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