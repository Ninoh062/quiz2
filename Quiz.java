import java.text.DecimalFormat;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
    questao q1 = new questao(
        "1) Qual o melhor jogador de basquete atualmente?",
        "A) Stephen Curry",
        "B) Kyrie Irving",
        "C) Jason Tatum",
        "D) Lebron James",
        "E) Kevin Durant",
        "D"
);

questao q2 = new questao(
    "2) Qual é o maior planeta do sistema solar?",
    "A) Terra",
    "B) Marte",
    "C) Júpiter",
    "D) Saturno",
    "E) Vênus",
    "C"
);

questao q3 = new questao(
    "3) Quem escreveu 'Dom Quixote'?",
    "A) William Shakespeare",
    "B) Gabriel Garcia Marquez",
    "C) José Saramago",
    "D) Miguel de Cervantes",
    "E) Fiódor Dostoiévski",
    "D"
);

questao q4 = new questao(
    "4) Qual é o país mais populoso do mundo?",
    "A) Brasil",
    "B) Índia",
    "C) Estados Unidos",
    "D) China",
    "E) Indonésia",
    "D"
);

questao q5 = new questao(
    "5) Qual é o símbolo químico do Ouro?",
    "A) Au",
    "B) Ag",
    "C) Fe",
    "D) Hg",
    "E) Cu",
    "A"
);

questao q6 = new questao(
    "6) Qual desses é um filme do diretor Christopher Nolan?",
    "A) Titanic",
    "B) Inception",
    "C) Forrest Gump",
    "D) Rambo",
    "E) Matrix",
    "B"
);

questao q7 = new questao(
    "7) Em qual continente fica o deserto do Saara?",
    "A) América do Sul",
    "B) Ásia",
    "C) África",
    "D) Europa",
    "E) América do Norte",
    "C"
);

questao q8 = new questao(
    "8) Qual é a língua oficial do Brasil?",
    "A) Espanhol",
    "B) Inglês",
    "C) Português",
    "D) Italiano",
    "E) Francês",
    "C"
);

questao q9 = new questao(
    "9) Em que ano o homem pisou na Lua pela primeira vez?",
    "A) 1965",
    "B) 1969",
    "C) 1972",
    "D) 1980",
    "E) 1990",
    "B"
);

questao q10 = new questao(
    "10) Qual é o elemento mais abundante na atmosfera terrestre?",
    "A) Oxigênio",
    "B) Hidrogênio",
    "C) Nitrogênio",
    "D) Carbono",
    "E) Hélio",
    "C"
);

questao q11 = new questao(
    "11) Quem pintou a obra 'Mona Lisa'?",
    "A) Michelangelo",
    "B) Leonardo da Vinci",
    "C) Rafael",
    "D) Vincent van Gogh",
    "E) Pablo Picasso",
    "B"
);

questao q12 = new questao(
    "12) Qual é o esporte mais praticado no mundo?",
    "A) Tênis",
    "B) Basquete",
    "C) Futebol",
    "D) Vôlei",
    "E) Rugby",
    "C"
);

questao q13 = new questao(
    "13) Qual desses países é famoso por suas pirâmides antigas?",
    "A) Itália",
    "B) México",
    "C) Egito",
    "D) Grécia",
    "E) Índia",
    "C"
);

questao q14 = new questao(
    "14) Qual é a moeda oficial do Japão?",
    "A) Dólar",
    "B) Yuan",
    "C) Euro",
    "D) Iene",
    "E) Real",
    "D"
);

questao q15 = new questao(
    "15) Qual desses animais é um mamífero?",
    "A) Crocodilo",
    "B) Tubarão",
    "C) Águia",
    "D) Golfinho",
    "E) Lagarto",
    "D"
);


    
    questao [] qstList = {q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15};
    int cont = 0;
    int total = qstList.length;

    for(questao temp : qstList){
        if (temp.qntCorreta) {
            cont ++;
        }
    }
    System.out.println(cont+" Acertos");

    double porcentagem = (cont * 100.0) / total;
        DecimalFormat df = new DecimalFormat("#.0");
        System.out.println(df.format(porcentagem) + "% de Acerto"); 

    




}}
