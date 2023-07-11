public class String_methods {
    static void stringMethods(){
        String str = "I am student of Brainware University";
        String sen = "i am student of brainware university";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.replace('a','o'));
        System.out.println( str.equals(sen));
        System.out.println( str.equalsIgnoreCase(sen));
        System.out.println( str.length());
        System.out.println( str.charAt(16));
        String str5  = str.concat(sen);
        System.out.println(str.substring(5,22));
        System.out.println(str.substring(22));
        System.out.println(str.indexOf('y'));
        System.out.println(str.compareTo(sen));
    }
    public static void main(String[] args) {
        stringMethods();
    }
}
