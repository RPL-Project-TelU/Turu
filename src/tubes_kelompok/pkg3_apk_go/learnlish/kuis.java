//kuis
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_kelompok.pkg3_apk_go.learnlish;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Dewa
 */
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
        /*System.out.println("               KERJAKAN SOAL-SOAL DIBAWAH INI DENGAN BENAR");
        System.out.println("                              SOAL BAHASA INGGRIS");
        
        String hasil, JwBn = "Jawaban Anda Benar", JwSl = "Jawaban Anda Salah";
        int Benar = 1, Salah = 1, totbenar, totsalah, bnr1 = 0, bnr2 = 0, bnr3 = 0, bnr4 = 0, bnr5 = 0;
        int Slh1 =0, Slh2 = 0, Slh3 = 0, Slh4 = 0, Slh5 = 0;
        
        String[] b = new String[6];
        
        b[0] = "1.I’m tired. I’m (go) to bed now. ….";
        b[1] = "a.going";
        b[2] = "b.goes";
        b[3] = "c.go";
        b[4] = "d.gone";
        b[5] = "e.go on";
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
        Scanner a1 = new Scanner(System.in);
        System.out.print("Jawab : ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "a":
                System.out.println(JwBn);
                bnr1 = Benar;
                totbenar = bnr1;
                 System.out.println("Jawaban Benar: " + bnr1);
                 totsalah = Slh1;
                System.out.println("Jawaban Salah: " + Slh1); 
                break;
            case "b":
                System.out.println(JwSl);
                Slh1 = Salah;
                System.out.println("kunci jawaban = a." + b[1]);
                totbenar = bnr1;
                 System.out.println("Jawaban Benar: " + bnr1);
                 totsalah = Slh1;
                System.out.println("Jawaban Salah: " + Slh1); 
                break;
            case "c":
                System.out.println(JwSl);
                Slh1 = Salah;
                System.out.println("kunci jawaban = a." + b[1]);
                totbenar = bnr1;
                 System.out.println("Jawaban Benar: " + bnr1);
                 totsalah = Slh1;
                System.out.println("Jawaban Salah: " + Slh1); 
                break;
            case "d":
                System.out.println(JwSl);
                Slh1 = Salah;
                System.out.println("kunci jawaban = a." + b[1]);
                totbenar = bnr1;
                 System.out.println("Jawaban Benar: " + bnr1);
                 totsalah = Slh1;
                System.out.println("Jawaban Salah: " + Slh1); 
                break;
            case "e":
                System.out.println(JwSl);
                Slh1 = Salah;
                System.out.println("kunci jawaban = a." + b[1]);
                totbenar = bnr1;
                 System.out.println("Jawaban Benar: " + bnr1);
                 totsalah = Slh1;
                System.out.println("Jawaban Salah: " + Slh1);              
                break;

        }
        System.out.println("");
        b[0] = "1.… received law degrees as today. ….";
        b[1] = "a.Never so many women have";
        b[2] = "b.Never have so many women";
        b[3] = "c.The women aren’t ever";
        b[4] = "d.Women who have never";
        b[5] = "e.Women lmao";
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
        Scanner a2 = new Scanner(System.in);
        System.out.print("Jawab : ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "b":
                System.out.println(JwBn);
                bnr2 = Benar;
                 totbenar = bnr1 + bnr2;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh2 = Salah;
                System.out.println("kunci jawaban = b." + b[2]);
                 totbenar = bnr1 + bnr2;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh2 = Salah;
                System.out.println("kunci jawaban = b." + b[2]);
                 totbenar = bnr1 + bnr2;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh2 = Salah;
                System.out.println("kunci jawaban = b." + b[2]);
                 totbenar = bnr1 + bnr2;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh2 = Salah;
                System.out.println("kunci jawaban = b." + b[2]);
                totbenar = bnr1 + bnr2;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "3.In the realm of psychological theory Margaret F. Washburn was a dualist ___ that motor phenomena have an essential role in psychology.";
        b[1] = "a.who she believed";
        b[2] = "b.believed";
        b[3] = "c.who believed";
        b[4] = "d.who did she believe";
        b[5] = "e.Believer";
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
        Scanner a3 = new Scanner(System.in);
        System.out.print("Jawab : ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "c":
                System.out.println(JwBn);
                bnr3 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh3 = Salah;
                System.out.println("kunci jawaban = c." + b[3]);
                 totbenar = bnr1 + bnr2 + bnr3;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh3 = Salah;
                System.out.println("kunci jawaban = c." + b[3]);
                 totbenar = bnr1 + bnr2 + bnr3;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "d":
                System.out.println(JwSl);
                Slh3 = Salah;
                System.out.println("kunci jawaban = c." + b[3]);
                 totbenar = bnr1 + bnr2 + bnr3;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh3 = Salah;
                System.out.println("kunci jawaban = c." + b[3]);
                totbenar = bnr1 + bnr2 + bnr3;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "4.Lisa is (stand) between Rina and Anne";
        b[1] = "a.stand up";
        b[2] = "b.stands";
        b[3] = "c.sitting";
        b[4] = "d.standing";
        b[5] = "e.Semua jawaban benar";
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
        Scanner a4 = new Scanner(System.in);
        System.out.print("Jawab : ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "d":
                System.out.println(JwBn);
                bnr4 = Benar;
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh4 = Salah;
                System.out.println("kunci jawaban = d." + b[4]);
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh4 = Salah;
                System.out.println("kunci jawaban = d." + b[4]);
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh4 = Salah;
                System.out.println("kunci jawaban = d." + b[4]);
                 totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "e":
                System.out.println(JwSl);
                Slh4 = Salah;
                System.out.println("kunci jawaban = d." + b[4]);
                totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
        }
        System.out.println("");
        b[0] = "5.We can go out now. It...(not rain) any more.";
        b[1] = "a.was rain";
        b[2] = "b.raining";
        b[3] = "c.will be rain";
        b[4] = "d.wasn’t rain";
        b[5] = "e.isn’t raining";
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
        Scanner a5 = new Scanner(System.in);
        System.out.print("Jawab : ");
        hasil = a1.nextLine();
        switch (hasil) {
            case "e":
                System.out.println(JwBn);
                bnr5 = Benar;
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "b":
                System.out.println(JwSl);
                Slh5 = Salah;
                System.out.println("kunci jawaban = e." + b[5]);
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "c":
                System.out.println(JwSl);
                Slh5 = Salah;
                System.out.println("kunci jawaban = e." + b[5]);
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );         
                break;
            case "d":
                System.out.println(JwSl);
                Slh5 = Salah;
                System.out.println("kunci jawaban = e." + b[5]);
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
            case "a":
                System.out.println(JwSl);
                Slh5 = Salah;
                System.out.println("kunci jawaban = e." + b[5]);
                totbenar = bnr1 + bnr2 + bnr3 + bnr4 + bnr5;
                System.out.println("Jawaban yang benar : " + totbenar );
               totsalah = Slh1 + Slh2 + Slh3 + Slh4 + Slh5;
                System.out.println("Jawaban yang salah : " + totsalah );
                break;
    }
        System.out.println("\n");
        System.out.println("Hasil Akhir");
        totbenar = bnr1+bnr2+bnr3+bnr4+bnr5;
        System.out.println("Jawaban yang benar adalah : " + totbenar);
        totsalah = Slh1+Slh2+Slh3+Slh4+Slh5;
        System.out.println("Jawaban yang salah adalah : " + totsalah);
        System.out.println("Total nilai adalah : " + (totbenar *2));
        String nG;
        
         if (totbenar *2 >= 10){
           nG = "100";
           int ng = Integer.parseInt(nG);
       } else if (totbenar * 2>= 8){
           nG = "80";
           int ng = Integer.parseInt(nG);
       } else if (totbenar * 2>= 6){
           nG = "50";
           int ng = Integer.parseInt(nG);
       } else if (totbenar * 2>= 4){
           nG = "30";
           int ng = Integer.parseInt(nG);
       } else if (totbenar * 2>= 2){
           nG = "10";
           int ng = Integer.parseInt(nG);
       } else {
           nG = "input salah";
       } 
       if (nG == "input salah"){
           System.out.println(nG);
       } else {
           System.out.println("Nilai total :" + nG);
       }
    */
    }
}