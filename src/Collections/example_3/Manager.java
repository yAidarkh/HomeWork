package Collections.example_3;

import java.util.*;

public class Manager {
    private List<Integer> numbers = new ArrayList<>();

    public void randomNumbers(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество случайных чисел: ");
        String countNumbersString = scanner.nextLine();
        System.out.print("Введите нижний предел для случайных чисел: ");
        String minNumbersString = scanner.nextLine();
        System.out.print("Введите верхний предел для случайных чисел: ");
        String maxNumbersString = scanner.nextLine();
        for (int i = 0; i<Integer.parseInt(countNumbersString); i++){
            int randomInRange = random.nextInt(Integer.parseInt(maxNumbersString)-Integer.parseInt(minNumbersString)+1)+Integer.parseInt(minNumbersString);
            numbers.add(randomInRange);
        }
        lastMenu();

    }

    public void simpleNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целые числа по одному. Пустая строка завершит ввод.");
        System.out.print("Если хотите установить верхний предел для чисел, введите его: ");
        String answerString = scanner.nextLine();
        if (answerString.equals("")) {
            enterNumbers(Integer.MAX_VALUE);
        } else {
            enterNumbers(Integer.parseInt(answerString));
        }
        lastMenu();

    }

    public void enterNumbers(int maxNubmber) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число (или оставьте пустую строку для завершения): ");
            String answerString = scanner.nextLine();
            if (answerString.equals("")) {
                break;
            } else if (Integer.parseInt(answerString) > maxNubmber) {
                System.out.printf("Число должно быть не больше %d. Попробуйте снова.\n", maxNubmber);
            } else {
                numbers.add(Integer.parseInt(answerString));
            }
        }
    }

    public void lastMenu() {
        System.out.print("Элементы списка: ");
        System.out.println(numbers);
        System.out.printf("""
                Количество элементов: %d
                Наибольшее значение: %d
                Наименьшее значение: %d
                Среднее значение: %.2f\n
                """, numbers.size(), Collections.max(numbers), Collections.min(numbers),calculateAverage(numbers) );
        List<Integer> usedNumber = new ArrayList<>();
        for (int num : numbers) {
            int count = 0;
            for (int num2 : numbers){
                if (num2==num){
                    count+=1;
                }
            }
            if(!usedNumber.contains(num)){
            System.out.printf("Число %d: %d раз(а)\n",num,count);
            }
            usedNumber.add(num);
        }

    }

    protected double calculateAverage(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return (double) sum / numbers.size();
    }
}
