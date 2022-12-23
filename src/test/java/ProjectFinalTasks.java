import Pages.autorizacia;
import Pages.IuridiuliAutorizacia;
import Pages.iuridiuliRegistracia;
import Pages.Dasveneba;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Condition.*;

public class ProjectFinalTasks {
    private static autorizacia autorizaci = new autorizacia();
    private static IuridiuliAutorizacia iuridiuli = new IuridiuliAutorizacia();
    private static iuridiuliRegistracia iuridiuliRegistracia = new iuridiuliRegistracia();
    private static Dasveneba dasveneba = new Dasveneba();


     @Test(priority = 1)
     private static void pirveliDavaleba() {
            autorizaci.Gaxsna();
            autorizaci.GaxseniShesvlisGrafa();
            autorizaci.Dalogineba();
            autorizaci.InfosWamogeba().should(appear);
            autorizaci.InfosWamogeba().shouldHave(exactText(autorizaci.text));
             //sleep(4500);

     }
     @Test( priority = 2)
     private static void meoreDavaleba() {
            iuridiuli.Gaxsna();
            iuridiuli.GaxseniShesvlisGrafa();
            iuridiuli.IuridiulisArcheva();
            iuridiuli.TeqstisCveneba().should(appear);
            iuridiuli.Checkbox().shouldBe(checked);
            //sleep(4500);
     }
     @Test(dependsOnMethods = {"meoreDavaleba"}, priority = 3)
     private static void mesameDavaleba() {
         iuridiuliRegistracia.Gaxsna();
         iuridiuliRegistracia.GaxseniShesvlisGrafa();
         iuridiuliRegistracia.IuridiulisArcheva();
         iuridiuliRegistracia.Dropdown().selectOption(iuridiuliRegistracia.saaqcio);
         iuridiuliRegistracia.Registracia("omedia", "999999999999", "Tbilsi", "1243", "", "00000000", "00000000", "MERI JABISHVILI", "10101010101", "598379999");
         iuridiuliRegistracia.Message().shouldHave(exactText(iuridiuliRegistracia.errorMesiji));
         //sleep(9900);
     }

      @Test(priority = 4)
     private static void meotxeDavaleba(){
           dasveneba.GaxseniDasveneba();
            dasveneba.gafiltvra();
             dasveneba.modzebna();
             dasveneba.checkFilter();
     }
}
