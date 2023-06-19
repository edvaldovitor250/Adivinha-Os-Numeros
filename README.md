# O Jogo de Adivinha o Numeros

Dá uma olhada nesse projeto bacana!

O Jogo de Adivinhação de Números é um jogo simples e divertido que pode ser implementado em Java. Neste jogo, o jogador tenta adivinhar um número aleatório escolhido pelo computador. O objetivo é acertar o número em um número ilimitado de tentativas.

Para implementar o jogo, podemos utilizar a classe Random da biblioteca Java.util, que permite gerar números aleatórios. O programa deve começar por escolher um número aleatório entre 1 e 200, por exemplo, usando o método nextInt() da classe Random.

Em seguida, o programa deve pedir ao jogador para digitar um número. A cada tentativa, o programa deve verificar se o número digitado é igual ao número escolhido pelo computador. Se o número digitado for menor do que o número escolhido, o programa deve informar ao jogador que o número é menor e pedir outra tentativa. Se o número digitado for maior do que o número escolhido, o programa deve informar ao jogador que o número é maior e pedir outra tentativa.

O programa deve continuar pedindo ao jogador para digitar um número até que ele acerte o número escolhido ou até que atinja o número máximo de tentativas. Para evitar que o jogador continue tentando adivinhar o número indefinidamente.

Ao final do jogo, o programa deve informar ao jogador se ele acertou o número ou não e quantas tentativas ele levo
