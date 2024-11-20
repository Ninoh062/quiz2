import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
    Questao q1 = new Questao(
        "1) Qual o melhor jogador de basquete atualmente?",
        "A) Stephen Curry",
        "B) Kyrie Irving",
        "C) Jason Tatum",
        "D) Lebron James",
        "E) Kevin Durant",
        "D"
);

Questao q2 = new Questao(
    "2) Qual é o maior planeta do sistema solar?",
    "A) Terra",
    "B) Marte",
    "C) Júpiter",
    "D) Saturno",
    "E) Vênus",
    "C"
);

Questao q3 = new Questao(
    "3) Quem escreveu 'Dom Quixote'?",
    "A) William Shakespeare",
    "B) Gabriel Garcia Marquez",
    "C) José Saramago",
    "D) Miguel de Cervantes",
    "E) Fiódor Dostoiévski",
    "D"
);

Questao q4 = new Questao(
    "4) Qual é o país mais populoso do mundo?",
    "A) Brasil",
    "B) Índia",
    "C) Estados Unidos",
    "D) China",
    "E) Indonésia",
    "D"
);

Questao q5 = new Questao(
    "5) Qual é o símbolo químico do Ouro?",
    "A) Au",
    "B) Ag",
    "C) Fe",
    "D) Hg",
    "E) Pb",
    "A"
);

Questao q6 = new Questao(
    "6) Qual desses é um filme do diretor Christopher Nolan?",
    "A) Titanic",
    "B) Inception",
    "C) Forrest Gump",
    "D) Gladiador",
    "E) Matrix",
    "B"
);

Questao q7 = new Questao(
    "7) Em qual continente fica o deserto do Saara?",
    "A) América do Sul",
    "B) Ásia",
    "C) África",
    "D) Europa",
    "E) Oceania",
    "C"
);

Questao q8 = new Questao(
    "8) Qual é a língua oficial do Brasil?",
    "A) Espanhol",
    "B) Inglês",
    "C) Português",
    "D) Italiano",
    "E) Francês",
    "C"
);

Questao q9 = new Questao(
    "9) Em que ano o homem pisou na Lua pela primeira vez?",
    "A) 1965",
    "B) 1969",
    "C) 1972",
    "D) 1980",
    "E) 1990",
    "B"
);

Questao q10 = new Questao(
    "10) Qual é o elemento mais abundante na atmosfera terrestre?",
    "A) Oxigênio",
    "B) Hidrogênio",
    "C) Nitrogênio",
    "D) Carbono",
    "E) Hélio",
    "C"
);

Questao q11 = new Questao(
    "11) Quem pintou a obra 'Mona Lisa'?",
    "A) Michelangelo",
    "B) Leonardo da Vinci",
    "C) Rafael",
    "D) Vincent van Gogh",
    "E) Pablo Picasso",
    "B"
);

Questao q12 = new Questao(
    "12) Qual é o esporte mais praticado no mundo?",
    "A) Tênis",
    "B) Basquete",
    "C) Futebol",
    "D) Vôlei",
    "E) Rugby",
    "C"
);

Questao q13 = new Questao(
    "13) Qual desses países é famoso por suas pirâmides antigas?",
    "A) Itália",
    "B) México",
    "C) Egito",
    "D) Grécia",
    "E) Índia",
    "C"
);

Questao q14 = new Questao(
    "14) Qual é a moeda oficial do Japão?",
    "A) Dólar",
    "B) Yuan",
    "C) Euro",
    "D) Iene",
    "E) Real",
    "D"
);

Questao q15 = new Questao(
    "15) Qual desses animais é um mamífero?",
    "A) Crocodilo",
    "B) Tubarão",
    "C) Águia",
    "D) Golfinho",
    "E) Lagarto",
    "D"
);




    

    Questao [] qstList = {q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15};
    int cont = 0;

    for(Questao temp : qstList){
        if (temp.qntCorreta) {
            cont ++;
        }
    }
    System.out.println(cont+" Acertos");//#teste commit
    




}}
