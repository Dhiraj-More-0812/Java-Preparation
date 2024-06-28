public class CWH_14_string_methods {
    public static void main(String[] args){
        String name = "Harry";
/*        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name);
        name = name.toLowerCase();
        System.out.println(name);*/
        String nonTrim= "                          Dhiraj                      ";
        System.out.println(nonTrim);
        String trim = nonTrim.trim();
        System.out.println(trim);
        System.out.println(name.substring(2,4));
        System.out.println(name.replace('r','p'));
        System.out.println(name);
        System.out.println(name.replace('r','ier'));
    }
}
