package screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FormularioScreen extends BaseScreen {

    @AndroidFindBy(id="inputTitle")
    private MobileElement inputTitle;

    @AndroidFindBy(id="inputDescription")
    private MobileElement inputDescription;

    @AndroidFindBy(id="inputCategory")
    private MobileElement inputCategory;

    @AndroidFindBy(id="save")
    private MobileElement btnSave;

    public void inserirTitulo(String text){

        inputTitle.click();
        inputTitle.sendKeys(text);
    }

    public void inserirDescricao(String text){

        inputDescription.click();
        inputDescription.sendKeys(text);
    }

    public void inserirCategoria(String text){

        inputCategory.click();
        inputCategory.sendKeys(text);
    }

    public void clicarEmSalvar(){

        btnSave.click();
    }

}
