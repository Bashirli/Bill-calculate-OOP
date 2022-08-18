
import java.io.IOException;
import java.util.Scanner;


public class Login {
    public String ad;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Login(Istifadeciler istifadeciler) throws InterruptedException, IOException {
    
        Scanner scanner=new Scanner(System.in);
       while(true){ 
        String mesaj="\n\n//////////////////////////////////////"
                + "\nXXX Isiq sirketine xos gelmisiniz. \n"
                + "//////////////////////////////////////\n\n"
                + "Zehmet olmasa hesaba giris edin:";
        
        System.out.print(mesaj);
    
        String log=scanner.nextLine();
    for(Integer i=1;i<=istifadeciler.login.size();i++){
        if(log.equals(istifadeciler.login.get(i))){
            System.out.print("Parolu daxil edin:");
            
            String par=scanner.nextLine();
            if(par.equals(istifadeciler.parol.get(i))){
                setAd(log);
                System.out.print("Sisteme giris edilir");
                for(int j=0;j<3;j++){
                    
                    Thread.sleep(1000);
                    System.out.print(".");
                }
                System.out.println("\nSisteme giris edildi.");
                System.out.print("Novbeti sehife yuklenir");
                 for(int j=0;j<3;j++){
                    
                    Thread.sleep(1000);
                    System.out.print(".");
                }
                 PulHesab pulHesab=new PulHesab(this, istifadeciler, i);
                 break;
                 
            }else{
                System.out.println("Parol sehvdir.");
                break;
            }
            
            
            
        }else if(i==istifadeciler.login.size()&&!log.equals(istifadeciler.login.get(i))){
            System.out.println("Bele bir login yoxdur yeniden yoxlayin.\n");
            break;
        }
    }
       continue;
       }
    
    
    
    }
    
    
    
}
