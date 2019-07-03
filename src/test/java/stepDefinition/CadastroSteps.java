package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;
import screen.CadastroScreen;

public class CadastroSteps {
    CadastroScreen screen = new CadastroScreen();;

    @Dado("^que estou na tela do formulário$")
    public void que_estou_na_tela_do_formulário()  {

        screen.tocarEmFormulario();
    }

    @Quando("^quando preencher os dados do cadastro corretamente$")
    public void quando_preencher_os_dados_do_cadastro_corretamente()  {


    }

    @Quando("^enviar o cadastro$")
    public void enviar_o_cadastro()  {

    }

    @Então("^devo ver os dados enviados$")
    public void devo_ver_os_dados_enviados()  {

    }

}