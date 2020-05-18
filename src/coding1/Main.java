package coding1;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //InputStreamReader reader = new InputStreamReader(System.in);
        //BufferedReader input = new BufferedReader(reader);
        Scanner pilih = new Scanner(System.in);
        float suhu = 0;

        while(true){
            System.out.println("\n===== KONVERSI SUHU =====");
            System.out.println("[1] celsius");
            System.out.println("[2] reamur");
            System.out.println("[3] farenhit");
            System.out.println("[4] kelvin");
            System.out.println("[5] renkie");
            System.out.println("[6] exit");
            System.out.println("=========================");
            System.out.print(" pilih [1-6] : ");
            String option = pilih.next();

            if(option.equalsIgnoreCase("1")){
                System.out.println();
                System.out.print("celsius : ");
                suhu = pilih.nextFloat();
                System.out.println();
                System.out.println("reamur : " + suhu*4/5);
                System.out.println("farenhit : " + (suhu*9/5+32));
                System.out.println("kelvin : " + (suhu+273.15));
                System.out.println("renkie : " + (suhu*9/5+491.67));
            }else if(option.equalsIgnoreCase("2")){
                System.out.println();
                System.out.print("reamur : ");
                suhu = pilih.nextFloat();
                System.out.println();
                System.out.println("celsius : " + (suhu/0.8));
                System.out.println("farenhit : " + (suhu*2.25+32));
                System.out.println("kelvin : " + (suhu/0.8+273.15));
                System.out.println("rankie : " + (suhu*2.25+491.67));
            }else if(option.equalsIgnoreCase("3")){
                System.out.println();
                System.out.print("farenhit : ");
                suhu = pilih.nextFloat();
                System.out.println();
                System.out.println("celsius : " + ((suhu-32)*5/9));
                System.out.println("reamur : " + ((suhu-32)*4/9));
                System.out.println("kelvin : " + ((suhu-32)*5/9+273.15));
                System.out.println("rankie : " + (suhu+459.67));
            }else if(option.equalsIgnoreCase("4")){
                System.out.println();
                System.out.print("kelvin : ");
                suhu = pilih.nextFloat();
                System.out.println();
                System.out.println("celsius : " + (suhu-273.15));
                System.out.println("reamur : " + ((suhu-273.15)*4/5));
                System.out.println("farenhit : " + ((suhu-273.15)*9/5+32));
                System.out.println("rankie : " + (suhu*1.8));
            }else if(option.equalsIgnoreCase("5")){
                System.out.println();
                System.out.print("rankie : ");
                suhu = pilih.nextFloat();
                System.out.println();
                System.out.println("celsius : " + ((suhu-491.67)*5/9));
                System.out.println("reamur : " + ((suhu/1.8-273.15)*0.8));
                System.out.println("farenhit : " + (suhu-459.67));
                System.out.println("kelvin : " + (suhu/1.8));
            }else if(option.equalsIgnoreCase("6")){
                System.exit(0);
            }else{
                System.out.println("pilihan anda tidak ada...");
            }
        }

    }
}