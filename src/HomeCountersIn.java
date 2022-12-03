import java.util.Scanner;

public class HomeCountersIn {

        public static void main(String[] args) {
            double couldWater = 49.58;
            double hotWater = 138.01;
            double waterDisposal = 33.4;
            double electricity = 2.77;

            System.out.println("Введите расход холодной воды в целых кубах");
            int countCouldWater = new Scanner(System.in).nextInt();
            System.out.println("Введите расход горячей воды в целых кубах");
            int countHotWater = new Scanner(System.in).nextInt();
            System.out.println("Введите расход электричества в целых киловатах");
            int countElectricity = new Scanner(System.in).nextInt();

            double countWater = (countCouldWater * couldWater) + (countHotWater * hotWater) + ((countCouldWater + countHotWater) * waterDisposal);
            double countPower = electricity * countElectricity;
            double totalPrice = Math.round((countWater + countPower)* 100);
            totalPrice = totalPrice/100;

            System.out.println("Ваши расходы по счетчикам " + totalPrice);

        }
    }
