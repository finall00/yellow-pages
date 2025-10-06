# Configuração do Ambiente de Desenvolvimento com WSL e Docker no Windows
Este guia vai te mostrar, de forma direta e eficiente, como configurar seu ambiente de desenvolvimento no Windows utilizando o WSL (Subsistema do Windows para Linux) e o Docker.

Seguindo estes passos, você terá um ambiente robusto, performático e muito próximo do que encontrará em servidores de produção, o que é uma prática excelente. Vamos otimizar nosso tempo e recursos.

## Por que WSL + Docker?
- Eficiência: O WSL 2 roda um kernel Linux real dentro do Windows. O Docker Desktop se integra a ele para rodar contêineres de forma nativa, com performance muito superior à de máquinas virtuais tradicionais.

- Economia de Recursos: É mais leve que manter um VirtualBox ou VMWare rodando. Menos memória, menos processamento.

- Padrão de Mercado: É a forma mais comum e recomendada para desenvolvimento web moderno em máquinas Windows. Você estará alinhado com as melhores práticas.

Vamos ao que interessa.

## Passo 1: Instalação do WSL
O WSL permite que você rode um ambiente Linux diretamente no Windows, sem a necessidade de dual-boot. Hoje, a instalação é ridiculamente simples.

1. Abra o PowerShell ou o Prompt de Comando como Administrador.

2. Clique no Menu Iniciar, digite "PowerShell", clique com o botão direito e selecione "Executar como administrador".

3. Execute o comando de instalação.

  - Este comando único vai cuidar de tudo: habilitar os recursos necessários do Windows, baixar o kernel Linux mais recente e instalar o Ubuntu (que é a distribuição padrão e recomendada para começar).

```PowerShell
wsl --install
```

4. Reinicie o computador.

  - Após a execução do comando, você será solicitado a reiniciar a máquina. Faça isso para que todas as alterações sejam aplicadas.

5. Configuração do Usuário Linux.

  - Após reiniciar, o Ubuntu será iniciado automaticamente para você configurar seu nome de usuário e senha. Importante: Esta senha é para o ambiente Linux (usuário sudo), não tem relação com sua senha do Windows. Guarde-a bem.

Pronto. O WSL está instalado e com o Ubuntu pronto para uso.

## Passo 2: Instalação do Docker Desktop
O Docker nos permite "empacotar" nossas aplicações em contêineres, garantindo que elas rodem da mesma forma em qualquer ambiente. O Docker Desktop para Windows se integra perfeitamente ao WSL 2.

1. Baixe o Docker Desktop.

  - Acesse o site oficial: docker.com/products/docker-desktop

2. Faça o download do instalador para Windows.

3. Execute o instalador.
  
  - Dê um duplo clique no arquivo baixado.

  - Na tela de configuração, certifique-se de que a opção "Use WSL 2 instead of Hyper-V (recommended)" esteja marcada. Isso é crucial para a performance.

  - Siga as instruções e finalize a instalação. Pode ser necessário reiniciar o computador novamente.

4. Inicie o Docker Desktop.

  - Após a instalação, inicie o Docker Desktop. O ícone da baleia aparecerá na sua bandeja do sistema. Pode levar um minuto ou dois para ele iniciar completamente na primeira vez.

## Passo 3: Verificação e Integração
Agora vamos garantir que tudo está conversando corretamente.

1. Abra o terminal do seu Ubuntu (WSL).

2. Clique no Menu Iniciar e digite "Ubuntu".
  - Ou no terminal:
```bash
wsl 
```

3. Verifique a versão do Docker.

  - Dentro do terminal do Ubuntu, execute os comandos:

```Bash
docker --version
docker-compose --version # ou 'docker compose version' para a v2
```
Se os comandos retornarem as versões, significa que a integração foi um sucesso! O Docker Desktop automaticamente disponibiliza os comandos docker dentro do seu ambiente WSL.

4. Confirme a Integração no Docker Desktop.

5. Clique com o botão direito no ícone do Docker na bandeja do sistema e vá em Settings.

  - Navegue até Resources > WSL Integration.

  - Verifique se a opção "Enable integration with my default WSL distro" está ativada. Você também verá sua distribuição (ex: Ubuntu) na lista e poderá habilitar a integração para ela. Geralmente, isso já vem configurado por padrão.

## Trabalhando com Arquivos
Para obter a melhor performance possível, você DEVE armazenar os arquivos dos seus projetos DENTRO do sistema de arquivos do WSL, e não no seu C:\.

Como acessar?

Abra o terminal do Ubuntu. Seu "home" estará em ~ (ou /home/seu-usuario).

No Windows Explorer, você pode digitar \\wsl$ na barra de endereço para ver todas as suas distribuições como se fossem pastas de rede. É uma forma fácil de arrastar e soltar arquivos.

Recomendo fortemente usar o Visual Studio Code com a extensão WSL. Com ela, você abre o VS Code, abre o terminal (Ctrl+) e digita code .` dentro da pasta do seu projeto no Ubuntu. O VS Code se conectará ao ambiente WSL e você terá uma experiência de desenvolvimento nativa, como se estivesse em um Mac ou Linux puro.

Conclusão
Parabéns! Seu ambiente de desenvolvimento Windows agora é uma potência. Você tem a flexibilidade do Windows com o poder do Linux e do Docker rodando de forma nativa e performática.
