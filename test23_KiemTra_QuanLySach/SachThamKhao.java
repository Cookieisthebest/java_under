
package test23_KiemTra_QuanLySach;
import java.util.StringTokenizer;

/**
 *
 * @author DAO NGOC ANH
 */
public class SachThamKhao extends sachHoc implements iSach {
    private boolean loai;

    public SachThamKhao() {
    }

    public SachThamKhao(boolean loai) {
        this.loai = loai;
    }

    public SachThamKhao( String ten, String nhaXB, boolean loai,double gia) {
        super(ten, nhaXB, gia);
        this.loai = loai;
    }

    public boolean isLoai() {
        return loai;
    }

    public void setLoai(boolean loai) {
        this.loai = loai;
    }
    @Override
    public void setMa(){
        super.setMa();
        String a="";
        StringTokenizer s=new StringTokenizer(super.getNhaXB().trim().toUpperCase());
        while(s.hasMoreTokens()){
            a+=s.nextToken().charAt(0);
        }
        super.setMa(a+super.getMa());
    }
    @Override
       public double getGia(){
           if(isLoai()){
               return super.getGia()+super.getGia()*0.1;
           }else{
               return super.getGia()+super.getGia()*0.15;
           }
       }
    @Override
    public String toString(){
       String loai1;
        if(isLoai()){
            loai1="co ban";
        }else loai1="nang cao";
        return super.getMa()+" "+super.getTen()+" "+super.getNhaXB()+" "+ loai1 +" "+(int)getGia();
    }
}
