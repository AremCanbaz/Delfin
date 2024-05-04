public class Kontigent extends Member {
    int price;

    public Kontigent(int memberNumber, String firstName, String lastName, int day, int month, int year, boolean under18, boolean motionist, boolean medlemskab, boolean svimteam, int price) {
        super(memberNumber, firstName, lastName, day, month, year, under18, motionist, medlemskab, svimteam);
        this.price = price;
    }

    public int getPrice() {
        if (!isMedlemskab() && isSvimteam()){
            price = 1000;
            return price;
        };
        if(isSvimteam() && isMedlemskab()){
            price = 1600;
            return price;
        }
        else if((year - 2024)< 60 && isMedlemskab()){
            price = 1200;
            return price;
        }
        else {
            price = 500;
            return price;
        }
    }
}