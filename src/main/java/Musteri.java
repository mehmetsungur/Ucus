import java.util.HashMap;
import java.util.Scanner;

public class Musteri {
    private String isim;
    private String musteriId;
    private static int musteriPassword = 3000;
    private static int id = 1000;
    private static int flightNo=9000;

    Scanner scan = new Scanner(System.in);
    HashMap<String,String> isimId = new HashMap<String,String>();
    HashMap<String,Integer> isimPwd = new HashMap<String,Integer>();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(String musteriId) {
        this.musteriId = musteriId;
    }

    public static int getMusteriPassword() {
        return musteriPassword;
    }

    public static void setMusteriPassword(int musteriPassword) {
        Musteri.musteriPassword = musteriPassword;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Musteri.id = id;
    }

    public static int getFlightNo() {
        return flightNo;
    }

    public static void setFlightNo(int flightNo) {
        Musteri.flightNo = flightNo;
    }

    public void musteriEkle(){
        isimId.put(getIsim(), getMusteriId());
        isimPwd.put(getIsim(), getMusteriPassword());
    }

    public void signIn(){

    }
}
