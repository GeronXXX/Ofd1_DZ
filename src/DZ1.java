public class DZ1 {
    public static void main(String[] args) {

        byte value1 = 120;
        byte value2 = 3;
        byte value3 = (byte) (value1 + value2);

        int value = 10;
        int valueNew = 6;
        value = --value;
        value = value--;
        int val = 6/2;
        int val1 = 6%2;
        double val2 = 6/2;
        float val3 = 5.2F;
        int value4 = 5;

        boolean c = (value > valueNew);
        boolean b = (value == value4);
        boolean d = (value != value4);


        System.out.println(value1 + value2);
        System.out.println(value1 - value2);
        System.out.println(value3);
        System.out.println(value);
        System.out.println(valueNew);
        System.out.println(val);
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(c);
        System.out.println(b);
        System.out.println(d);
    }
}