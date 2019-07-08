package stepDefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Então;
import screen.CadastroScreen;
import screen.FormularioScreen;

public class CadastroSteps {
    CadastroScreen cadastroScreen = new CadastroScreen();
    FormularioScreen formularioScreen = new FormularioScreen();

    @Dado("^que estou na tela do formulário$")
    public void que_estou_na_tela_do_formulário()  {

        cadastroScreen.clicarEmNovoCadastro();
    }

    @Quando("^quando preencher os dados do cadastro corretamente$")
    public void quando_preencher_os_dados_do_cadastro_corretamente()  {

        formularioScreen.inserirTitulo("title");
        formularioScreen.inserirDescricao("description");
        formularioScreen.inserirCategoria("category");


    }

    @Quando("^enviar o cadastro$")
    public void enviar_o_cadastro()  {
        formularioScreen.clicarEmSalvar();
    }

    @Então("^devo ver os dados enviados$")
    public void devo_ver_os_dados_enviados()  {


    }

}