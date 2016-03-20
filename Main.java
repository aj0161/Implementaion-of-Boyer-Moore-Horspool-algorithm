public class Main {

    public static void main(String[] args) {

        Main.TestCase();
    }

    public static void TestCase() {

        String pattern = "ajay";
        String text = "name is ajay";

        int result = BoyerMooreHorspool.FindUsingArray(pattern, text);

        if (result != -1) {
           for (int i = 0; i < text.length(); i++) {

               if ( i >= result) {
                   //System.out.println("");
                   System.out.println(text.charAt(i));
                   System.out.println("");
               }
               else  {
                   System.out.print(text.charAt(i));

               }

           }
        }


        //Findall

    }

}
