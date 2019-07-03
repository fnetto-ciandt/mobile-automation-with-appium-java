package support;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import helper.AppiumDriverHelper;
import io.qameta.allure.Allure;

public class Utils {
    public static File gerarScreenShot(Scenario scenario){
        File imagem = ((TakesScreenshot) AppiumDriverHelper.
                getDriver()).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.
                    copyFile(imagem, (new File("./evidence", scenario.getName() + " - " + scenario.getStatus().toUpperCase() + ".png")));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return imagem;
    }

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int i, n;

        System.out.printf("Informe o número para a tabuada:\n");
        n = ler.nextInt();

        FileWriter arq = new FileWriter("d:\\tabuada.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        gravarArq.printf("+--Resultado--+%n");
        for (i=1; i<=10; i++) {
            gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i*n));
        }
        gravarArq.printf("+-------------+%n");

        arq.close();

        System.out.printf("\nTabuada do %d foi gravada com sucesso em \"d:\\tabuada.txt\".\n", n);
    }

    public static void embedScreenshot(File file, String description) {
        Path content = Paths.
                get(file.getPath());

        try (InputStream is = Files.newInputStream(content)) {
            Allure.
                    addAttachment(description, is);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
