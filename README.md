# AppFilmes - Android App

![Badge Status](https://img.shields.io/badge/status-active-brightgreen)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84?logo=android-studio&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)
![Firebase](https://img.shields.io/badge/firebase-%23039BE5.svg?style=for-the-badge&logo=firebase)

## Descrição

O AppFilmes é uma aplicação desenvolvida em Java que consome a API interna para buscar informações de filmes listados dentro do aplicativo. A aplicação utiliza a arquitetura MVC (Model-View-Controller) para organizar o código e facilitar a manutenção e escalabilidade, entre outros recursos como Retrofit, Glide, RecyclerView, Firebase e GSon.

### GIF de Demonstração
![GIF do projeto](https://github.com/rfemina/AppFilmes/blob/master/AppFilmes-Demonstra%C3%A7%C3%A3o.gif)

### YouTube
[![Assista ao vídeo](https://img.shields.io/badge/YouTube-%23FF0000.svg?style=for-the-badge&logo=YouTube&logoColor=white)](https://youtu.be/Cs2HoPNT1KU)

### Arquivo APK
[![Arquivo APK](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://github.com/rfemina/AppFilmes/blob/master/AppFilmes.apk)

## Índice

- [Instalação](#instalação)
- [Uso](#uso)
- [Arquitetura](#arquitetura)
- [Objetivos](#objetivos)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Contribuição](#contribuição)
- [Licença](#licença)
- [Contato](#contato)

## Instalação

Siga os passos abaixo para configurar e rodar o projeto em sua máquina local.

1. Clone o repositório:
    ```sh
    git clone https://github.com/seu-usuario/AppFilmes.git
    cd AppFilmes
    ```

2. Abra o projeto no Android Studio:
    - File -> Open -> Selecione a pasta do projeto

3. Sincronize as dependências do Gradle:
    - Android Studio geralmente faz isso automaticamente, mas você pode forçar a sincronização clicando em `Sync Project with Gradle Files`.

4. Execute o projeto:
    - Conecte um dispositivo Android ou inicie um emulador.
    - Clique em `Run` ou use o atalho `Shift + F10`.

## Uso

1. Abra o aplicativo no seu dispositivo Android.
2. Navegue entre os filmes listados e realize a interação.
3. Clique no filme desejado.
4. Verifique das informações relacionadas ao filme
5. Clique em "play" para visualizar o trailer do filme selecionado
6. Retorne para a página principal para visualizar novamente o catálogo de filmes

## Arquitetura

O projeto segue a arquitetura MVC (Model-View-Controller), entretanto com as nomenclaturas alteradas:

- **Model:** Contém a lógica de dados e as classes de modelo, contendo a interface para o consumo e conversão do arquivo em Json
- **OnClick:** Responsável pela interface do usuário.
- **Adapter:** Gerencia a comunicação entre o Model e a View.

### Estrutura de Pastas

```markdown
- src/
  - main/
    - java/
      - com/projetosrafaelfemina/appfilmes/
        - Adapter/
          - AdapterMovie.class
        - model/
          - Movie.class
          - MovieApi.class
        - OnClick/
          - RecyclerItemClickListener.class
      - MainActivity.class
      - Movie.class
      - Movie_details.class
    - res/
      - layout/
        - activity_main.xml
        - activity_details_movie.xml
        - activity_movie.xml
        - movie_item.xml
```
## Objetivos

Objetivo Principal:

Permitir que os usuários busquem informações de alguns filmes a partir da listagem, e verifique os elencos, detalhes e trailer do filme selecionado.

Requisitos:

  - Consumir a API AppFilmes interna hospedada no Firebase.
  - Exibir informações dos filmes selecionados de maneira clara.
  - Utilizar o recurso de RecyclerView para inserção da listagem dinâmica, permitindo alteração somente no Json e não no código
  - Manter uma arquitetura organizada (MVC).

## Tecnologias Utilizadas
  - Java
  - Android Studio
  - Retrofit - Para consumo da API
  - Gson - Para parseamento de JSON
  - Glide - Para manipulação de imagens
  - RecyclerView - Para listagem dinâmica dos recursos da API
  - AppFilmes API (interna)
  - Firebase


## Contribuição
Contribuições são bem-vindas! Siga os passos abaixo para contribuir:

  - Faça um fork do projeto
  - Crie uma branch para sua feature (git checkout -b feature/AmazingFeature)
  - Commit suas mudanças (git commit -m 'Add some AmazingFeature')
  - Push para a branch (git push origin feature/AmazingFeature)
  - Abra um Pull Request


## Licença
Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.

## Contato

    - Nome: Rafael Luiz Femina
    - E-mail: rfemina2@gmail.com
    - Link do Projeto: https://github.com/rfemina/Via-Cep
    - Linkedin: https://www.linkedin.com/in/rafael-femina-0628692a0/
