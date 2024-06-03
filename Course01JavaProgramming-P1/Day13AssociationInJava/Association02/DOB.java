package Association02;
public class DOB {
    int dd;
    int mm;
    int yyyy;

    public DOB(int dd, int mm, int yyyy){
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
    }

    @Override
    public String toString(){
        return "  = "+dd+" , houseName = "+mm+" , street = "+yyyy;
    }
}
