public class Main {

    public static void main(String[] args) {

        OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
        ogretmenKrediManager.Hesapla(); //ortak fonksiyonlar...


        TarımKrediManager tarımKrediManager=new TarımKrediManager();
        tarımKrediManager.Hesapla();


        KrediUI krediUI=new KrediUI();
        krediUI.KrediHesapla(new TarımKrediManager());

    }
}
