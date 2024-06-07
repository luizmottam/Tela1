# Projeto de Agendamento para Lava-Jato

Este projeto é um aplicativo Android simples que permite aos usuários agendar serviços em uma loja de Lava-Jato. A interface consiste em uma tela de agendamento básico onde o usuário pode selecionar o tipo de lavagem, o tamanho do carro, o horário e a data desejada, e ver o total previsto para o serviço.

## Estrutura do Projeto

A estrutura do projeto é a seguinte:

```
app
├── manifests
│   └── AndroidManifest.xml
├── java
│   └── com.example.myapplication
│       ├── MainActivity.java
│       ├── com.example.myapplication (androidTest)
│       └── com.example.myapplication (test)
├── res
│   ├── drawable
│   │   ├── baseline_access_time_filled_24.xml
│   │   ├── baseline_arrow_back_24.xml
│   │   ├── baseline_arrow_forward_24.xml
│   │   ├── baseline_calendar_month_24.xml
│   │   ├── ic_launcher_background.xml
│   │   └── ic_launcher_foreground.xml
│   ├── layout
│   │   ├── activity_main.xml
│   │   └── list_item.xml
│   ├── mipmap
│   │   ├── ic_launcher
│   │   └── ic_launcher_round
│   ├── values
│   │   ├── colors.xml
│   │   ├── strings.xml
│   │   └── themes.xml
│   └── xml
│       ├── backup_rules.xml
│       └── data_extraction_rules.xml
└── Gradle Scripts
```

## Funcionalidades

- **Seleção do Tipo de Lavagem**: O usuário pode selecionar diferentes tipos de lavagem disponíveis.
- **Seleção do Tamanho do Carro**: O usuário pode selecionar o tamanho do carro para ajustar o preço do serviço.
- **Definição de Horário e Data**: O usuário pode definir o horário e a data desejados para o agendamento do serviço.
- **Cálculo do Total Previsto**: O aplicativo calcula e exibe o valor total previsto para o serviço selecionado.
- **Botão de Avançar**: O usuário pode confirmar as informações e prosseguir para finalizar o agendamento.

## Layout da Interface

A interface do aplicativo é composta pelos seguintes elementos:

- **Título**: "Agendamento"
- **Dropdowns**: Para seleção do tipo de lavagem e tamanho do carro.
- **Inputs**: Para seleção de horário e data.
- **Texto**: Exibe o total previsto para o serviço.
- **Botão**: "Avançar" para confirmar e prosseguir com o agendamento.

https://github.com/luizmottam/pi-pdm/assets/95381902/87b32293-b655-4e31-be1e-64116b688b67


## Configuração do Ambiente de Desenvolvimento

Para configurar o ambiente de desenvolvimento, siga os passos abaixo:

1. **Clone o repositório**:
   ```bash
   git clone <URL do repositório>
   ```

2. **Importe o projeto no Android Studio**:
   - Abra o Android Studio.
   - Selecione "Import project" e escolha a pasta do projeto clonado.

3. **Compile e execute o projeto**:
   - Conecte um dispositivo Android ou inicie um emulador.
   - Clique em "Run" no Android Studio para compilar e executar o aplicativo.

## Contribuição

Para contribuir com este projeto, siga os passos abaixo:

1. **Fork o repositório**.
2. **Crie uma branch para sua feature** (`git checkout -b feature/nova-feature`).
3. **Commit suas mudanças** (`git commit -m 'Adicionei nova feature'`).
4. **Dê push na sua branch** (`git push origin feature/nova-feature`).
5. **Abra um Pull Request**.

## Licença

Este projeto é licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
