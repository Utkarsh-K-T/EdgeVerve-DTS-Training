public  class BitwiseOpr{
    public static void main(String[] args){
        int a = 1, b=3;
        // & bitwise and
        /*
           1
        0011
        0001
        */
        System.out.println(a&b);
        // | bitwise or
        /*
        0001
        0011
        0011
        */
        System.out.println(a|b);
        // ^ bitwise xor
        /*
        0001
        0011
        0010
        */
        System.out.println(a^b);
        // ~ bitwise not
        /*
        0011
        1100
        */
        System.out.println(~b);
        // >> bitwise left shift
        /*
        0001
        0000
        */
        System.out.println(a>>1);
        // << bitwise right shift
        /*
        0001
        0010
        */
        System.out.println(a<<1);
        //>>> Bitwise shift Unsigned Right Shift;
        /*
        11111111111111111111111111111111 -> negative number
        01111111111111111111111111111111 ->huge +ve number
        */
        int c = -3;
        System.out.println(c>>>1);
    }
}