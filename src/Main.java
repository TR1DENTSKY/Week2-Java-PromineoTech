
public class Main {

    public static void main(String[] args) {

        boolean isHotOutside = true;
        boolean isWeekday = false;
        boolean hasMoneyInPocket = true;

        double costOfMilk = 2.99;
        int moneyInWallet = 100;
        int thirstLevel = 3;

        boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
        boolean willGoSwimming = isHotOutside && !isWeekday;
        boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
        boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= costOfMilk * 2);


    }
}
