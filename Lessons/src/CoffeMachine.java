public class CoffeMachine {
    public static void main(String[] args){

        System.out.println("Кофе машина");

        int moneyAmount = 120;

        int cappucinoPrice = 150;
        int espressoPrice = 80;
        int waterPrice = 20;
        int milkPrice = 40;

        boolean canBuyAnything = false;

        if(moneyAmount >= cappucinoPrice) {
            System.out.println("Вы можете купить капучино");
            canBuyAnything = true;
        }

        if(moneyAmount >= espressoPrice) {
            System.out.println("Вы можете купить экспрессо");
            canBuyAnything = true;
        }

        if(moneyAmount >= milkPrice) {
            System.out.println("Вы можете купить молоко");
            canBuyAnything = true;
        }

        if(moneyAmount >= waterPrice) {
            System.out.println("Вы можете купить воду");
            canBuyAnything = true;
        }

        if(canBuyAnything == false) {
            System.out.println("Недостаточно средств :(");
        }

        }
    }