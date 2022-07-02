package GUI;

import java.util.List;

public class Soal {
    private String noSoal;
    private String soal;
    private List<String> pilihan;
    private String benar;

    public Soal(){}

    public Soal(String noSoal, String soal, List<String> pilihan, String benar) {
        this.noSoal = noSoal;
        this.soal = soal;
        this.pilihan = pilihan;
        this.benar = benar;
    }

    public String getBenar() {
        return benar;
    }

    public void setBenar(String benar) {
        this.benar = benar;
    }
    
    
    public String getNoSoal() {
        return noSoal;
    }

    public void setNoSoal(String noSoal) {
        this.noSoal = noSoal;
    }

    public String getSoal() {
        return soal;
    }

    public void setSoal(String soal) {
        this.soal = soal;
    }

    public List<String> getPilihan() {
        return pilihan;
    }

    public void setPilihan(List<String> pilihan) {
        this.pilihan = pilihan;
    }
    
    
}
