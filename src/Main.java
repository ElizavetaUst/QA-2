public class Main {
    public static void main(String[] args) {
        int price = 5020; //стоимость билета
        int miles = 20; //стоимость мили
        int bonus = (price / miles); //расчет количества бонусных миль от стоимости билета


        System.out.println("При покупке билета заданной стоимости, вам будет начислено бонсных миль:");
        System.out.println(bonus);
    }
}