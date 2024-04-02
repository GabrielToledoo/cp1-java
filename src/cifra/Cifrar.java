package cifra;

public class Cifrar {
    //criando o método para cifrar a mensagem
    public static String cifrar(String mensagem, int chave){
        //criando um StringBuilder para armazenar a variável cifrada
        StringBuilder cifrado = new StringBuilder();
        //criação de um loop para armazenar e realizar a cifragem de cada letra
        for (int i = 0; i < mensagem.length(); i ++){
          //esta variável vai armazenar a letra que esta sendo analizada para realizar a cifragem, ele armazena através do index da letra
          char charactere = mensagem.charAt(i);
          //Verifica se a letra é maiúscula ou minuscula
          if (Character.isLetter(charactere)){
              //transforma a variável do caractere em int para utilizar a tabela ascii, quando o caractere é convertido para int você obtem o valor dele na tabela ASCII
              int codigoAscii = (int) charactere;
              //verifica se a base a ser analizada do caractere é maiusculo ou minusculo, eçe faz essa verificação ai se for TRUE o valor base é 65 (pois é o A maiúsculo) e se for FALSE é 97 (pois é o a minúsculo)
              int base = Character.isUpperCase(charactere) ? 65 : 97;
              //primeiro subtrai o valor da letra original pelo valor da base, isto para obter a letra minuscula ou maiuscula, depois adicionamos o valor da chave para obter a cifragem.
              //após isso a variável obtem o restante do valor da divisão por 26, isto é, precisa dividir por 26 para manter o valor da letra cifrada dentro dos valores do codigo ascii, pois sem isso o valor sairá muito maior do que o afalfeto suporta.
              int cifradoCodigoAscii = (codigoAscii - base + chave) % 26 + base;
              //armazena dentro do stringbuilder o caratere cifrado
              cifrado.append((char) cifradoCodigoAscii);
          }else{
              //caso não seja caractere ele armazena o valor sem modificar dentro da cifra
              cifrado.append(charactere);
          }
        }
        //transforma a letra que estava em ASCII em String novamente
        return cifrado.toString();
    }
}
