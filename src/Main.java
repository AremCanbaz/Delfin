public class Main{
    static Konkurrencesvømmere motionist = new Konkurrencesvømmere(1,"a","a",1,1,1,true,true,true,false,1,1,12,1990);
    public static void main(String[] args) {
        String a;
        String c;
        IDPassword idpassword = new IDPassword();
        LoginPage Loginpage = new LoginPage(idpassword.getLogininfo());
        String getFulldate = motionist.getFulldate();
        System.out.println(getFulldate);

    }
}