package screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CadastroScreen extends BaseScreen {

    @AndroidFindBy(id="fab")
    private MobileElement btnNew;

    public void clicarEmNovoCadastro(){

        btnNew.click();
    }
}
