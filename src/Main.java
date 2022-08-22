public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        // Первая задача
    byte cars = 4;
    short audio = 17;
    int mechanics = 50;
    long key = 1234355L;
    float number = 0.5f;
    double print = 0.6666666666;
    char game = 77;
    boolean boy = true;

      // Вторая задача
     float oneMenStrong  =  78.2f;
     float secondMenStrong = 82.7f;
     float totalWeight = 78.2f + 82.7f;
     System.out.println( "Общий вес боксёров равен "  +  totalWeight + " кг");
     float difference = (oneMenStrong - secondMenStrong) % totalWeight;
     System.out.println("Разница в весе " +  difference +  " кг");

     // Третья задача
      short weightBananas = 5 * 80;
      short weightMilk = 2* 105;
      short weightIceCream = 2 * 100;
      short weightEgg = 4 * 70;
      int wholeWight = weightBananas + weightMilk + weightIceCream + weightEgg;
      System.out.println("Общий вес завтрака составляет " + wholeWight + " грамм");
      float wightKg = wholeWight / 1000f;
      System.out.println("Общий вес завтрака составляет " + wightKg + " кг");

      // Четвёртая задача
      float mass1 = 7 / 0.25f;
      float mass2 = 7 / 0.5f;
      float average = (mass1 + mass2) / 2;
      System.out.println( "Если спортсмен будет худеть по 250 грамм ежедневно, то чтобы приготовиться к соревнованиям у него уйдет " + mass1 + " дней ,а если по 500 грамм то " + mass2 +  " дней  ,в среднем, он подготовиться к соревнованиям за " + average + " день");

      // Пятая задача

      float Masha = 67760 * 0.1f + 67760;
      float Denis = 83690 * 0.1f + 83690;
      float Christina = 76230 * 0.1f + 76230;

      int OldYearM = 67760 * 12;
      int OldYearD = 83690 * 12;
      int OldYearC = 76230 * 12;

      float NewYearM = Masha * 12;
      float NewYearD = Denis * 12;
      float NewYearC = Christina * 12;

      float oddsM = NewYearM - OldYearM;
      float oddsD = NewYearD - OldYearD;
      float oddsC = NewYearC - OldYearC;
      System.out.println(" Маша теперь получает " + Masha + " рублей в месяц, годовой доход вырос на " + oddsM + " рублей." );
      System.out.println(" Денис теперь получает " + Denis + " рублей в месяц, годовой доход вырос на " + oddsD + " рублей." );
      System.out.println(" Кристина теперь получает " + Christina + " рублей в месяц, годовой доход вырос на " + oddsC + " рублей." );
    }
}
