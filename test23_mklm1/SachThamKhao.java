package test23_mklm1;

public class SachThamKhao extends SachHoc implements ISach {
    private boolean loai;

    public SachThamKhao() {
    }

    public SachThamKhao(String ten, String nhaXB,boolean loai, double gia) {
        super(ten, nhaXB, gia);
        this.loai = loai;
    }

    public boolean isLoai() {
        return loai;
    }
    public String theloai(){
        if(this.isLoai()== true) return "co ban";
        else return "nang cao";
    }

    public void setLoai(boolean loai) {
        this.loai = loai;
    }
 
    @Override
    public void setMa() {
        super.setMa(); 
    }

    @Override
    public String getMa() {
        String[] s = this.getNhaXB().split("\\s");
        String b ="";
        for(int i = 0 ; i < s.length;i++)
        {
            b += s[i].charAt(0);
        }
        return b.toUpperCase() + super.getMa();
    }

    @Override
    public double getGia() {
        double re = 0;
        if(this.isLoai() == true){
            re = super.getGia() + super.getGia()*10/100;
        }else re = super.getGia() + super.getGia()*15/100;
        return re;
    }
    
    //ma, ten, nhaxb, co ban/nang cao, gia
    @Override
    public String toString()
    {
        return this.getMa()+" "+super.getTen()+" "
                +super.getNhaXB()+" "+ this.theloai()+ " "+String.format("%.0f", this.getGia());
    }
}