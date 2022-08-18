
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


public class PulHesab {
    public HashMap<Integer,Double> pul=new HashMap<>();
    public HashMap<Integer, String> kVt=new HashMap<>();

    public PulHesab(Login login,Istifadeciler istifadeciler, Integer i) throws InterruptedException, IOException {
        Scanner scanner=new Scanner(System.in);
        String mesaj="\n\n Xos geldiniz "+login.getAd()
                +". \n\n"
                + "Hal hazirda sizin istifade etdiyiniz isiq hesablanir ve mebleg daxil edilir."
                + "\n Zehmet olmasa gozleyin ";
        System.out.print(mesaj);
         for(int j=0;j<3;j++){
                    
                    Thread.sleep(500);
                    System.out.print(".");
                }
        Random random=new Random();
        int kilovat=1+random.nextInt(500);
        System.out.println("\nKilovat tapildi.");
        String mesaj2="\n Nezerinize catdiraq ki, tarif bele hesablanir:\n"
                + "1. ayliq istehsal hecmi 200kVt-dan az olarsa 0.08 AZN\n"
                + "2. ayliq istehsal hecmi 200kVt-dan cox 300kvt-dan az olarsa "
                + "0.09 AZN\n"
                + "3. ayliq istehsal hecmi 300kVt-dan cox olan hissesi ucun 0.11 AZN \n"
                + "Olaraq hesablanir.\n"
                + "Tarife esasen odenilecek mebleg hazirlanir";
        System.out.print(mesaj2);
         for(int j=0;j<3;j++){
                    
                    Thread.sleep(1000);
                    System.out.print(".");
                }
         String hesabat="Ayliq istifade edilen enerji (kVt ile)="+kilovat;
         kVt.put(i, hesabat);
         double hesabla=0;
         
         if(kilovat<=200){
             hesabla=kilovat*0.08;
             pul.put(i, hesabla);
             
         }else if(kilovat>200&&kilovat<=300){
             hesabla=200*0.08+(kilovat-200)*0.09;
              
             pul.put(i, hesabla);
         }else{
               hesabla=200*0.08+99*0.09+(kilovat-299)*0.11;
             pul.put(i, hesabla);
         }
        System.out.print("Mebleg hesablandi. \n Cek hazirlanir");
        for(int j=0;j<3;j++){
                    
                    Thread.sleep(1000);
                    System.out.print(".");
                }
        Cek cek=new Cek(login, istifadeciler, i, this);
    }
    
}
