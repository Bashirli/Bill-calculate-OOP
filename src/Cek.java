
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class Cek {

    public Cek(Login login,Istifadeciler istifadeciler, Integer i,PulHesab pulHesab) throws IOException {
        Scanner scanner=new Scanner(System.in);
        File file=new File("Qebz.txt");
        file.createNewFile();
       
        PrintStream ps=new PrintStream(file);
        String mesaj="\n////////////////////////////////////\n"
                + "Istifadeci : "+login.getAd()
                +"\n Istifade edilen kVt: "+pulHesab.kVt.get(i)
                + "\n Odenilecek mebleg: "+pulHesab.pul.get(i)
                + "\n//////////////////////////////////";
        ps.print(mesaj);
        
        System.out.println("Qebz hazirdir.");
        
    
    
    }
    
}
