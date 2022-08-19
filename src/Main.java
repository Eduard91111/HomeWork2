public class Main {
    public static void main(String[] args) {
        byte a = 2;
        short b = 3333;
        int c = 444444;
        long d = 555555555L;
        float f = 25.75f;
        double j = 1.2000000;

        float boxerFirst = 78.2f;
        float boxerSecond = 82.7f;
        float total =  boxerFirst + boxerSecond;
        System.out.println ("Общий вес боксеров = " + total + "кг.");
        float totalWeight =  boxerSecond - boxerFirst;
        System.out.println ("Разница между весами боксеров = " + totalWeight + "кг.");

        short bananas = 5 * 80;
        short milk = 105 + 105;
        short iceCream = 2 * 200;
        short eggs = 4 * 70;
        int sportsBreakfast = bananas + milk + iceCream + eggs;
        System.out.println ("Общий вес спорт-завтрака = " + sportsBreakfast + "г.");
        double sportsBreakfastKg = sportsBreakfast / 1000f;
        System.out.println ("Общий вес спорт-завтрака = " + sportsBreakfastKg + "кг.");

        short slowWeightLoss = 7000 / 250;
        System.out.println ("При похудении на 250г в день, для достижения результата 7кг понадобится " + slowWeightLoss + " дней ");
        short fastWeightLoss = 7000 / 500;
        System.out.println ("При похудении на 500г в день, для достижения результата 7кг понадобится " + fastWeightLoss + " дней ");
        int averageWeightLoss = (slowWeightLoss + fastWeightLoss) / 2;
        System.out.println ("В среднем, для достижения результата 7кг понадобится " + averageWeightLoss + " день ");

        float Masha = 67760 + 67760.0f / 100 * 10;
        float annualIncreaseMasha = 12 * 67760.0f / 100 * 10;
        System.out.println ("Маша теперь получает " + Masha + "р. Годовой доход вырос на " + annualIncreaseMasha + "р.");
        float Denis = 83690 + 83690.0f / 100 * 10;
        float annualIncreaseDenis = 12 * 83690.0f / 100 * 10;
        System.out.println ("Денис теперь получает " + Denis + "р. Годовой доход вырос на " + annualIncreaseDenis + "р.");
        float Christina = 76230 + 76230.0f / 100 * 10;
        float annualIncreaseChristina = 12 * 76230.0f / 100 * 10;
        System.out.println ("Кристина теперь получает " + Christina + "р. Годовой доход вырос на " + annualIncreaseChristina + "р.");









    }
}