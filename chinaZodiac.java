import java.util.Scanner;

/**
 * chinaZodiac
 */
public class chinaZodiac {

  public static void main(String[] args) {
    int birthDay, zodiac;
    Scanner date = new Scanner(System.in);

    System.out.print("Doğum Yılınızı Giriniz: ");
    birthDay = date.nextInt();

    zodiac = (birthDay % 12);

    System.out.print("Çin Yılı Burcunuz: ");

    switch (zodiac) {
        case 0:
        System.out.println("Maymun");
        break;

        case 1:
        System.out.println("Horoz");
        break;

        case 2:
        System.out.println("Köpek");
        break;

        case 3:
        System.out.println("Domuz");
        break;

        case 4:
        System.out.println("Fare");
        break;

        case 5:
        System.out.println("Öküz");
        break;

        case 6:
        System.out.println("Kaplan");
        break;

        case 7:
        System.out.println("Tavşan");
        break;

        case 8:
        System.out.println("Ejderha");
        break;

        case 9:
        System.out.println("Yılan");
        break;

        case 10:
        System.out.println("At");
        break;

        case 11:
        System.out.println("Koyun");
        break;
    
      default:

      System.out.println("Hatalı Veri Girdiniz..");
        break;
    }
    date.close();
  }
}