
public class IntPhone extends Phone{
    private String maQG;

//    public IntPhone(int start, String s){
//        super(s.indexOf("-")+1, s);
//        maQG = s.substring(0, s.indexOf("-"));
//    }
    public IntPhone(String s){
        super(s.substring(s.indexOf("-")+1));
        maQG = s.substring(0, s.indexOf("-"));
    }
    public String getMaQG() {
        return maQG;
    }

    public void setMaQG(String maQG) {
        this.maQG = maQG;
    }

  
    @Override
    public String toString() {
        return maQG + "-" + super.getMaVung() + "-" + super.getNoiVung();
    }
    @Override
    public void out() {
        System.out.println(this);
    }
    
}
