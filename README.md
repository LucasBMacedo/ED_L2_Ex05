📁 Projeto: Cálculo de Máximo Divisor Comum (Recursivo)

📌 Descrição: >
  Aplicação em Java que calcula o Máximo Divisor Comum (MDC) de dois números inteiros positivos utilizando recursividade.
  O MDC de dois números é o maior número que divide ambos sem deixar resto.

🗂️ Estrutura de Arquivos:

  📄 src/controller/MDCController.java: 
    Contém o método recursivo responsável por calcular o MDC através de subtrações sucessivas.
  
  📄 src/view/Principal.java: 
    Responsável pela interação com o usuário, validação de entrada e exibição do resultado.

🧠 Lógica da Recursividade:
  método: mdcResultado(int x, int y)
  explicação: 
    - ✋ Condição de parada: Quando x == y, o método retorna o valor de x (ou y), que é o MDC.
    - 🔁 Relação recursiva: 
        - Se x > y, chama mdcResultado(x - y, y).
        - Se x < y, chama mdcResultado(y, x).

💬 Exemplo de Execução:
  entrada: 
    - x: 20
    - y: 24
  saída: 
    - O MDC de 20 e 24 é igual a 4.

📥 Entrada:
  - O usuário insere dois números inteiros positivos via JOptionPane.
  - Não há validação de números negativos no exemplo atual (pode ser adicionado para segurança).

📤 Saída:
  - Exibe o valor do MDC calculado com uma mensagem no JOptionPane.

📌 Observações:
  - A recursão utiliza subtrações sucessivas para encontrar o divisor comum.
  - Código limpo e modularizado, separando a lógica da interação com o usuário.
  - Fácil manutenção e entendimento, ideal para estudos de recursividade básica.

👨‍💻 Autor:
  Criado por Lucas Bezerra de Macedo.
