# Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet

![GitHub](https://img.shields.io/github/license/Paucinha/api-ecommerce-dio?style=flat-square)

Chegou a hora de colocar em prática a análise de negócios, requisitos, conceitos de programação orientada a objetos e modelagem UML. Com base no vídeo de lançamento do iPhone, utilize uma ferramenta de UML de sua preferência para elaborar a diagramação das classes e interfaces, representando as funções do iPhone como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet. Após isso, crie as classes e interfaces no formato de arquivos  `.java`.

**POO | Git | Java | Git | Back-End | Intermediário**

#### Pré-requisitos:

Lógica de programação e POO;
- Conhecimentos básicos(Java);
- Computador com SO de sua preferência(Windows, Linux, Mac OS);
- IDE (Visual Studio Code, Eclipse, etc);

### Objetivo

1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

#### Funcionalidades a Modelar

1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

```
## Diagrama UML

### Interfaces

#### ReprodutorMusical
| Método                              |
|-------------------------------------|
| + tocar(): void                     |
| + pausar(): void                    |
| + selecionarMusica(musica: String): void |

#### AparelhoTelefonico
| Método                              |
|-------------------------------------|
| + ligar(numero: String): void       |
| + atender(): void                   |
| + iniciarCorreioVoz(): void         |

#### NavegadorInternet
| Método                              |
|-------------------------------------|
| + exibirPagina(url: String): void   |
| + adicionarNovaAba(): void          |
| + atualizarPagina(): void           |

### Classe

#### iPhone
| Método                                                                  |
|-------------------------------------------------------------------------|
| + tocar(): void                                                         |
| + pausar(): void                                                        |
| + selecionarMusica(musica: String): void                                 |
| + ligar(numero: String): void                                            |
| + atender(): void                                                        |
| + iniciarCorreioVoz(): void                                              |
| + exibirPagina(url: String): void                                        |
| + adicionarNovaAba(): void                                               |
| + atualizarPagina(): void                                                |

### Relacionamentos

- **iPhone** implementa as interfaces **ReprodutorMusical**, **AparelhoTelefonico** e **NavegadorInternet**.
```

##

Projeto desenvolvido durante o [**Bootcamp Bradesco - Java Cloud Native**](https://www.dio.me/bootcamp/bradesco-java-cloud-native), fornecido pela [**DIO**](https://www.dio.me/)

##

- [By Páucinha](https://github.com/Paucinha)