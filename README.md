# Mobile Automation with Appium and Java

Prova de conceito para automação de testes mobile usando o webdriver [Appium](http://appium.io/) com a linguagem [Java](https://openjdk.java.net/), gerenciador de dependencias [Gradle](https://docs.gradle.org/current/userguide/userguide.html) e gerador de relatórios [Allure](http://allure.qatools.ru/).

# Requisitos 

Java 8+

Appium ou Appium Desktop

NodeJS

Android Emulator

**Configurações de Ambiente**

1- **Android Studio** (ambiente de desenvolvimento Android que permite criação de emuladores, desenvolvimento e execução de aplicações)
 
 - Instale o Android Studio apartir deste link: https://developer.android.com/studio/install?hl=pt-br

2- **Java Open JDK e JRE 8+** (ambiente de execução da lingagem Java, que será utilizada na escrita dos testes)

 - Instale  o Java OpenJDK apartir deste link ([OpenJDK](https://openjdk.java.net/install/)) ou execute os comandos abaixo caso utilize Ubuntu/Debian Linux:

```
sudo apt-get install openjdk-8-jre
sudo apt-get install openjdk-8-jdk
``` 

3- **Node JS** (interpretador de código javascript que permite gerenciamento de aplicativos e execução de scripts da linguagem em questão)

 - Instale o NodeJS apartir deste link: https://tecadmin.net/install-latest-nodejs-npm-on-ubuntu/

***A instalação do Appium-Server e Appium-Doctor é dependente da instalação do NodeJS.

4- **Appium-Server** (framework de de testes automatizados mobile, responsável pela execução dos testes nos navegadores dos dispositivos mobile ou no próprio dispositovo quando estivermos trabalhando com aplicações nativas).

 - Instale o Appium-Server utilizando o comando abaixo:

```npm install -g appium```

5- **Appium-Doctor** (ferramenta auxiliar que verifica se todas as dependências para execução do Appium foram configuradas ou instaladas corretamente).

 - Instale o Appium-Doctor utilizando o comando abaixo:

```npm install -g appium-doctor```

6- **Appium-Desktop** (interface gráfica que possui os mesmos recursos do Appium-Server além de permitir inspecionar elementos de aplicativos para obtenção de atributos a serem utilizados no teste.)

 - Instale o Appium-Desktop apartir do link: https://github.com/appium/appium-desktop/releases/ acessando a última release disponível e selecionando o aplicativo correspondente a sua versão de sistema operacional (dmg para mac, exe para windows, appimage para linux)

**Configuração das variaveis de ambiente Linux**

 - Edite o arquivo .bashrc correspondente ao seu usuário

 - A localização dele é: /home/SEUUSUARIO/.bashrc

Cole no final do arquivo .bashrc o conteúdo abaixo:

```
export ANDROID_HOME=$HOME/Library/Android/Sdk
export PATH+=:$ANDROID_HOME/bin
export PATH+=:$ANDROID_HOME/tools
export PATH+=:$ANDROID_HOME/platform-tools
export PATH+=:$ANDROID_HOME/lib
export PATH+=:$ANDROID_HOME/tools/lib
export PATH="$ANDROID_HOME/emulator:$PATH"
export JAVA_HOME=/usr/lib/jvm/java-8-oracle
export PATH=$PATH:$JAVA_HOME
export PATH=$PATH:$JAVA_HOME/bin
export PATH=$PATH:usr/local/node/bin
```

**Verificação do ambiente utilizando Appium-Doctor:**

Execute o comando ```appium-doctor``` no terminal, verifique a resposta, em caso de erro o próprio appium-doctor irá orientá-lo quanto a correção ou configuração necessária.

Pronto! Seu ambiente de desenvolvimento está configurado.

---

## Execução dos testes:

**No Android Studio**

Em construção

**No dispositivo Android**

Em construção


### Linha de comando

1- Utilizando o terminal apartir da pasta do projeto execute o comando 

./gradlew runFeatures 

2- Em seguida se desejar ver o relatório execute o comando

allure serve

### Pela IDE

Em construção