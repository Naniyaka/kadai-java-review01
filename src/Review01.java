
public class Review01 {

    public static void main(String[] args) {
    int a = 1500;
    double salesTax = (10.0/100.0);
    //System.out.println("消費税は" + salesTax);
    int result;
    result = tax(a, salesTax);
    int b = a + result;
        System.out.println(a + "円の商品の税込価格は"+ b + "円（消費税は" + result + "円）です。");
    }

    public static int tax(int a, double salesTax) {
        double Tax = Math.floor(a * salesTax);
        return (int)Tax;
    }
}

