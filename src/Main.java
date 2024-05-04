public class Main{
    static Kontigent motionist = new Kontigent(1,"a","a",1,1,1,true,true,true,false, 0);
    static Kontigent motionist1 = new Kontigent(1,"a","a",1,1,1,true,true,false,true, 0);
    static Kontigent motionist3 = new Kontigent(1,"a","a",1,1,1,false,true,true,false, 0);
    static Kontigent motionist4 = new Kontigent(1,"a","a",1,1,1,false,false,false,false, 0);
    public static void main(String[] args) {
        String a;
        String c;
        IDPassword idpassword = new IDPassword();
        LoginPage Loginpage = new LoginPage(idpassword.getLogininfo());
        int getPrice = motionist.getPrice();
        int getPrice1 = motionist1.getPrice();
        int getPrice3 = motionist3.getPrice();
        int getPrice4 = motionist4.getPrice();

        System.out.println(motionist.getPrice());
        System.out.println(motionist1.getPrice());
        System.out.println(motionist3.getPrice());
        System.out.println(motionist4.getPrice());
    }
}