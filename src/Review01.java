
public class Review01 {

    public static void main(String[] args) {
    double a = 1500;
    double salesTax = (10.0/100.0);
    //System.out.println("消費税は" + salesTax);
    double result;
    result = tax(a, salesTax);
    double b = a + result;
        System.out.println((int)a + "円の商品の税込価格は"+ (int)b + "円（消費税は" + (int)result + "円）です。");
    }

    public static double tax(double a, double salesTax) {
        double Tax = a * salesTax;
        return Tax;
    }
}

