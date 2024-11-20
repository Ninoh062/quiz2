import java.util.Scanner;

public class Questao {
   Scanner ler = new Scanner(System.in);
   String pergunta = "";
   String opcaoA = "";
   String opcaoB = "";
   String opcaoC = "";
   String opcaoD = "";
   String opcaoE = "";
   String correta = "";
   Boolean qntCorreta;

   public Questao(String pergunta, String opcaoA, String opcaoB, String opcaoC, String opcaoD, String opcaoE, String correta) {
    this.pergunta = pergunta;
    this.opcaoA = opcaoA;
    this.opcaoB = opcaoB;
    this.opcaoC = opcaoC;
    this.opcaoD = opcaoD;
    this.opcaoE = opcaoE;
    this.correta = correta;
    this.escrevaQuestao();
    this.qntCorreta = this.isCorreta(this.leiaResposta());
}
   public boolean isCorreta(String resposta){
       if(resposta.equalsIgnoreCase(this.correta)){
           System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
           System.out.println("");
            return true;
       } else {
           System.out.println("Resposta Errada!");
           System.out.println("A opção correta é a letra: " + this.correta);
           System.out.println("");
           return false;
       }
   }
public String leiaResposta() {
    String resp;
    do {
System.out.println("Digite a resposta: ");
resp = ler.next();
} while (!respostaValida(resp));
return resp;
}

private boolean respostaValida(String resp){
    if(resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C")|| 
    resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")){
      return true;
    }
    System.out.println("Resposta inválida! Digite opção A, B, C, D ou E. ");
System.out.println("");
    return false;
}

   public void escrevaQuestao(){
       System.out.println(this.pergunta);
       System.out.println();
       System.out.println(this.opcaoA);
       System.out.println(this.opcaoB);
       System.out.println(this.opcaoC);
       System.out.println(this.opcaoD);
       System.out.println(this.opcaoE);
       System.out.println();
   }
}