package Pages;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.Selenide;


public class Dasveneba {
    private ElementsCollection min = $$("#minprice");
    private ElementsCollection max = $$("#maxprice");
    private ElementsCollection modzebnisGilaki = $$(".submit-button");
    private SelenideElement dasvenebaGilaki = $(".cat-2");

    public void GaxseniDasveneba() {
        Selenide.open("https://www.swoop.ge/");
        dasvenebaGilaki.click();
    }
    public void checkFilter(){
        System.out.println($$(".deal-voucher-price").first().getValue());
    }

    public void gafiltvra(){
        min.last().setValue("170");
        max.last().setValue("180");
    }

    public void modzebna(){
        modzebnisGilaki.last().click();
    }
}
