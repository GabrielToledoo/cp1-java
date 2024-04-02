package cifra;

public class Decifrar {

    // Método para descriptografar uma mensagem utilizando a Cifra de César
    public static String descriptografar(String mensagem, int chave) {
        StringBuilder decifrado = new StringBuilder();

        /*abaixo, i começa no 0, e se for menor que a string mensagem o loop continua,
        se for maior ou igual à string, o loop se encerra*/
        for (int i = 0; i < mensagem.length(); i++) {
            // aqui se obtém o caractere na posição i de "mensagem" e é aramazenado na variável charactere
            char charactere = mensagem.charAt(i);

            // Verifica se o caractere é uma letra do alfabeto
            if (Character.isLetter(charactere)) {
                int codigoAscii = (int) charactere;

                /* verificação de caracter maiúsculo: como tem um operador ternário, indica condição, no caso se for verdadeira a letra é maiúscula (A = 65 na tabela ASCII),
                e se for falsa é minúscula (a = 97 na tabela ASCII)*/
                int ajuste = Character.isUpperCase(charactere) ? 65 : 97;

                // comando para descriptografar
                int decifradoCodigoAscii = (codigoAscii - base - chave) % 26 - base);

                /* o append é usado para adicionar um caractere no final da variável decifrado*/
                decifrado.append((char) decifradoCodigoAscii);
            } else {
                decifrado.append(charactere);
            }
        }

        return decifrado.toString();
    }

    public static void main(String[] args) {
        String textoCifrado = "D oljhlud udsrvd pduurp vdowrx vreuh r fdfkruur fdqvdgr";
        int deslocamento = 3;

        String textoOriginal = descriptografar(textoCifrado, deslocamento);
        System.out.println("Texto original: " + textoOriginal);
    }
}

