public class ChatBotRunner
{
    public static void main(String[] args) {

        ChatBot debbie = new ChatBot("debbie",1);
        debbie.greeting("Jacky");
        debbie.weather();
        debbie.favoriteNumber(17);

        double FtM = debbie.convertFeetToMeters(5);
        System.out.println( "there are " + FtM + " Meters in 5 feet");

        int add_num = debbie.addNumbers(1,2,3);
        System.out.println("1 + 2 + 3 is equal to " + add_num);

        String bye = debbie.goodbye();
        System.out.println(bye);

        debbie.one_hundred(92);
        String joke = debbie.taxes();
        System.out.println(joke);



    }
}
