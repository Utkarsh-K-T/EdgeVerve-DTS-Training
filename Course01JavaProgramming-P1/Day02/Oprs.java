public class Oprs{
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 4;
        float num3 = 2;
        int num12 = num1/num2;
        float num13 = num1/num3;
        float numflo = num1/num2;
        float numfloexp = (float)num1/num2;

        System.out.println("num1/num2 = "+num12);
        System.out.println("num1/num3 = "+num13);
        System.out.println("num1/num2 = "+numflo);
        System.out.println("num1/num3 = "+numfloexp);
    }
}