
public class Main {

    public static void main(String[] args) {

        boolean isHotOutside = true;
        boolean isWeekday = false;
        boolean hasMoneyInPocket = true;

        double costOfMilk = 2.99;
        int moneyInWallet = 100;
        int thirstLevel = 3;

        boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
        System.out.println("Its hot outside and there is money in my pocket = " + shouldByIcecream);

        boolean willGoSwimming = isHotOutside && !isWeekday;
        System.out.println("Its hot outside and it is not a weekday = " + willGoSwimming);

        boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
        System.out.println("Its hot outside, there's money in my pocket, and its not a weekday = " + isAGoodDay);

        boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= costOfMilk * 2);
        System.out.println("Its hot outside, thirstLevel is >= to 3, money is >= 2x cost of milk = " + willBuyMilk);


    }
}
