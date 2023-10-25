package kiem_tra_cuc;
import java.util.StringTokenizer;

public class vanban {
    private String xau = "";
    vanban(){
        
    }
    vanban(String xau)
    {
        this.xau = xau;
    }
    public void soCau()
    {
        StringTokenizer tmp = new StringTokenizer(xau,".!?");
        int cnt = 0;
        while(tmp.hasMoreTokens())
        {
            tmp.nextToken();
            cnt++;
        }
        System.out.println(cnt);
    }
    public void chuanHoa(){
        xau = xau.trim();
        String[] str = xau.split("\\s+");
        String tmp = "";
        for(int i = 0; i < str.length; i++)
        {
            if(str[i] == "." || str[i] == "?" || str[i] == "!")
            {
                tmp += str[i];
            }else tmp += str[i] + " ";
        }
    }

}