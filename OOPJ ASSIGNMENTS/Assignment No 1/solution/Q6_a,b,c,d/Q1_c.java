//String value into boolean value
class Q1_c
{
    public static void main(String args[])
    {
        String s1="false";
        //boolean b1=s1;  // String cannot be converted to boolean
        boolean b1=true;
        b1=Boolean.parseBoolean(s1);
        System.out.print("b1 = "+b1);
    }
}