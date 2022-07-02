package GUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kuis {
kuis() {
 
        int hasil = 0;
        Scanner input = new Scanner(System.in);
        ArrayList<Soal> listSoal = kuisJSon.ambilKuisJSON("kuisjson.json");
        for(Soal e:listSoal){
            System.out.print(e.getNoSoal());
            System.out.println(". " + e.getSoal());
            List<String> pilihan = e.getPilihan();
            for(int i = 0; i<pilihan.size(); i++){
                System.out.println(pilihan.get(i));
            }
            System.out.print("Jawab : ");
            String jawaban = input.nextLine();
            if(jawaban.equals(e.getBenar())){
                hasil++;
            }
        }
        System.out.println("Nilai: " + hasil*20);
    }
}