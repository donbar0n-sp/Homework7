public class Main {
    public static void main(String[] args) {

        //task1
        System.out.println("task1");
        int total = 0;
        int savings = 15000;
        int i = 0;
        while (total < 2_459_000) {
            i ++;
            total = total + total / 100;
            total = total + savings;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }

        //task2
        System.out.println("task2");
        int x = 0;
        while (x < 10){
            x++;
            System.out.print(x + " ");
        }
        System.out.println();
        for (; x > 0 ; x--){
            System.out.print(x + " ");
        }
        System.out.println();
        //task3
        System.out.println("task3");
        int population = 12_000_000;
        double birthrate = 0.017;
        double deathrate = 0.008;
        for (int p = 1; p <= 10; p++){
            population = (int) (population + population * birthrate - population * deathrate);
            System.out.println("Год " + p + ", численность населения составляет " + population);
        }
        //task4
        System.out.println("task4");
        int deposit = 15_000;
        double rate = 0.07;
        int month = 0;
        while (deposit < 12_000_000){
            month++;
            deposit = (int) (deposit + deposit * rate);
            System.out.println("Месяц " + month + ", сумма накоплений: " + deposit);
        }
        //task5
        System.out.println("task5");
        int deposit1 = 15_000;
        double rate1 = 0.07;
        int month1 = 0;
        while (deposit1 < 12_000_000) {
            month1++;
            deposit1 = (int) (deposit1 + deposit1 * rate1);
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + ", сумма накоплений: " + deposit1);
            }
        }
        //task6
        System.out.println("task6");
        int deposit2 = 15000;
        double rate2 = 0.07;
        int month2 = 0;
        while (month2 < 108){
            month2++;
            deposit2 = (int) (deposit2 + deposit2 * rate2);
            if (month2 % 6 == 0) {
                System.out.println(deposit2);
            }
        }
        //task7
        System.out.println("task7");
        int friday = 5;
        for (; friday < 31; friday += 7){
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
        //task8
        System.out.println("task8");
        for (int year = 1824; year < 2124; year++){
            if (year % 79 == 0){
                System.out.println(year);
            }
        }
    }
}