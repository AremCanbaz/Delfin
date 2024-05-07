public class Main{
    static Member motionist = new Member(1,"a","a",1,1,1,"Mand",true,false,true, true,0);
    static Member motionist1 = new Member(1,"a","a",1,1,1,"Kvinde",true,false,false, true,0);
    static Member motionist3 = new Member(1,"a","a",1,1,1960,"Kvinde",false,true,true, true,0);
    static Member motionist4 = new Member(1,"a","a",1,1,1,"Mand",false,false,false, true,0);
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