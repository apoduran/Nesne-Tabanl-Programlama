
package ornek;


public class Ornek{ 

    private String urunadi;
    private String marka;
    private String model;

    public Ornek(){
    this("a","b","c");
    }
    public Ornek(String urunadi, String marka, String model) { 
        this.urunadi= urunadi; 
        this.marka = marka; 
        this.model = model;
        System.out.println(urunadi + " " + marka + " " + model);
    } 
}