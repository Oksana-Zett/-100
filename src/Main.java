public class Main {
    public static void main(String[] args) {
        int currentSum = 100;
        int refillSum = 220;
        int bonus = 1;
        int amount = 100;
        int totalSum = currentSum + refillSum;
        int countBonus = refillSum * bonus / amount;
        int result = totalSum + countBonus;
        if (refillSum > 1000) {
            System.out.println("Сумма на счете:" + result + "рублей");
            System.out.println("Количество начисленных бонусов:" + countBonus + "рублей");
        } else {
            System.out.println("Сумма на счете:" + totalSum + "рублей");
            System.out.println("Количество начисленных бонусов: 0 рублей");
        }
    }
}
