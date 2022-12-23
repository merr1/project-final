package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class autorizacia {

    private SelenideElement loginButton = $(".swoop-login").$(withText("შესვლა")),
    authInfo = $("#authInfo"),
    email = $(byName("Email")),
    authButton = $("#AuthBtn"),
    password = $(byName("password"));

    public String loginEmail = "test1@gmail.com";
    public String loginPassw = "00000000";
    public String text = "მეილი ან პაროლი არასწორია, თუ დაგავიწყდათ პაროლი,გთხოვთ ისარგებლოთ პაროლის აღდგენის ფუნქციით!";


    public void GaxseniShesvlisGrafa() {
        loginButton.click();
    }

    public SelenideElement InfosWamogeba() {
        return authInfo;
    }

    public void Gaxsna() {
        Selenide.open("https://www.swoop.ge/");
    }

    public void Dalogineba(){
        email.setValue(loginEmail);
        password.setValue(loginPassw);
        authButton.click();

    }

}