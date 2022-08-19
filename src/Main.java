public class Main {
    public static void main(String[] args) {
        task1 (); task2 (); task3 (); task4 (); task5 ();
    }
    public static void task1 () {
        byte a = 2;
        short b = 3333;
        int c = 444444;
        long d = 555555555L;

        float f = 25.75f;
        double j = 1.2000000;

        boolean i = true;
        char ch = 'n';
    }
    public static void task2 () {
        float boxerFirst = 78.2f;
        float boxerSecond = 82.7f;
        float total =  boxerFirst + boxerSecond;
        float totalWeight =  boxerSecond - boxerFirst;
        System.out.println ("Общий вес боксеров = " + total + "кг.");
        System.out.println ("Разница между весами боксеров = " + totalWeight + "кг.");
    }
    public static void task3 () {
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int sportsBreakfast = bananas + milk + iceCream + eggs;
        int gramsInKg = 1000;
        double sportsBreakfastKg = sportsBreakfast / (gramsInKg * 1.0);
        System.out.println ("Общий вес спорт-завтрака = " + sportsBreakfastKg + "кг.");
    }
    public static void task4 () {
        int weight = 7;
        int gramsInKilogram = 1000;
        int totalNumberOfGrams = weight * gramsInKilogram;
        int minGramsPerDay = 250;
        int maxGramsPerDay = 500;
        int slowWeightLoss = totalNumberOfGrams / minGramsPerDay;
        int fastWeightLoss = totalNumberOfGrams / maxGramsPerDay;
        int averageWeightLoss = (slowWeightLoss + fastWeightLoss) / 2;
        System.out.println ("При похудении на 250г в день, для достижения результата 7кг понадобится " + slowWeightLoss + " дней ");
        System.out.println ("При похудении на 500г в день, для достижения результата 7кг понадобится " + fastWeightLoss + " дней ");
        System.out.println ("В среднем, для достижения результата 7кг понадобится " + averageWeightLoss + " день ");
    }
    public static void task5 () {
        int percent = 10;
        double multiplayer = percent / (100 * 1.0);
        int Masha = 67_760;
        int Denis = 83_690;
        int Christina = 76_230;

        int MashaNewSalary = (int) (Masha + (Masha * multiplayer));
        int DenisNewSalary = (int) (Denis + (Denis * multiplayer));
        int ChristinaNewSalary = (int) (Christina + (Christina * multiplayer));

        int annualIncreaseMasha = (MashaNewSalary - Masha) * 12;
        int annualIncreaseDenis = (DenisNewSalary - Denis) * 12;
        int annualIncreaseChristina = (ChristinaNewSalary - Christina) * 12;

        System.out.println ("Маша теперь получает " + MashaNewSalary + "р. Годовой доход вырос на " + annualIncreaseMasha + "р.");
        System.out.println ("Денис теперь получает " + DenisNewSalary + "р. Годовой доход вырос на " + annualIncreaseDenis + "р.");
        System.out.println ("Кристина теперь получает " + ChristinaNewSalary + "р. Годовой доход вырос на " + annualIncreaseChristina + "р.");
    }









}