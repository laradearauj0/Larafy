# 🎵 Audio Player - Java OOP

Sistema de reprodução de áudio via console desenvolvido em Java com o objetivo de aplicar e consolidar os pilares da **Programação Orientada a Objetos (POO)**: Abstração, Encapsulamento, Herança e Polimorfismo[cite: 3, 4, 5, 6, 7, 8].

---

## 🚀 Funcionalidades

* **Reprodução de Mídia:** Controles para iniciar (`play`) e pausar (`pause`) a reprodução de áudio, contabilizando o número de reproduções (*streams*)[cite: 3, 5, 8].
* **Controle de Volume:** Opções para aumentar (`+10`), diminuir (`-10`) ou silenciar (`0`) o volume do áudio atual[cite: 3, 8].
* **Exibição de Detalhes:** Visualização completa das propriedades da mídia em execução (volume, duração, status de reprodução, total de *streams* e metadados específicos)[cite: 3, 4, 6].
* **Suporte Polimórfico a Formatos:** Menu interativo unificado capaz de controlar tanto músicas (`Music`) quanto podcasts (`Podcast`)[cite: 4, 6, 7, 8].

---

## 🏗️ Arquitetura do Projeto

O projeto foi estruturado aplicando separação de responsabilidades e boas práticas de orientação a objetos:

* `Playable.java` **(Interface):** Define o contrato básico de comportamento para mídias reproduzíveis (`play`, `pause` e `alterVolume`)[cite: 5].
* `Audio.java` **(Superclasse):** Implementa a interface `Playable` e encapsula os atributos e comportamentos comuns a qualquer tipo de áudio (`volume`, `duration`, `isPlaying`, `streams`).
* `Music.java` **(Subclasse):** Herda de `Audio` e adiciona propriedades específicas de faixas musicais (`artist`, `album`, `genre`), sobrescrevendo o método `displayInfo()`[cite: 4].
* `Podcast.java` **(Subclasse):** Herda de `Audio` e adiciona propriedades específicas de episódios (`host`, `topic`), também sobrescrevendo `displayInfo()`[cite: 6].
* `Menu.java` **(Interface de Controle):** Centraliza o loop de interação e controles de reprodução recebendo qualquer objeto do tipo `Audio` por meio de polimorfismo[cite: 8].
* `App.java` **(Classe Principal):** Ponto de entrada da aplicação que exibe o menu principal e direciona o fluxo para a mídia selecionada[cite: 7].

---

## 💻 Tecnologias Utilizadas

* **Java** (JDK 17+ recomendado devido ao uso de *Text Blocks* `"""` nos menus)
* **Git & GitHub** para versionamento de código

---

## ⚙️ Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/laradearauj0/nome-do-repositorio.git](https://github.com/laradearauj0/nome-do-repositorio.git)
