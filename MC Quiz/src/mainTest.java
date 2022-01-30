import java.util.Scanner;

public class mainTest {

    public static void test(Questions [] testQuestion) {
        Scanner scanner= new Scanner(System.in);
        int score = 0;
        for(int i=0; i<testQuestion.length; i++) {
            System.out.println(testQuestion[i].question);
            String result = scanner.nextLine();

            if(result.equals(testQuestion[i].answer)){
                score++;
            }
        }
        System.out.println(score + "/" + testQuestion.length);
    }
    public static void main(String []args){
        String[] Qs = {
                "(1) Who was the first emperor of rome\n " +
                "(a)Augustus\n (b)Julius Caesar\n (c)Vespasian\n (d)Caligula\n",
                "(2)Who were the masters minds of the death of Julius Caesar\n " +
                "(a)Pompey Magnus and Cassius Dio\n (b)Cicero and Crassus \n (c)Brutus and Cassius\n (d)Mark Anthony and Nerva",
                "(3)Which year was known as the year of 4 emperors\n" +
                "(a)69 AD\n (b)100 AD\n (c)44 BC\n (d)1 AD",
                "(4)Who is considered the Rome's biggest enemy\n" +
                "(a)Hannibal Barka\n (b)Attila The Hun\n (c)Mithridates IV\n (d)Prince Suleiman",
                "(5)What year was Julius Caesar assassinated\n" +
                "(a)30 BC\n (b)44 BC \n (c)100 BC\n (d)55 AD",
                "(6)A human-made channel for carrying water long distances \n" +
                "(a)Aqueduct\n  (b) Ditch\n (c) Water line\n (d)Colosseum\n",
                "(7)A stadium built for entertainment such as gladiator fights\n" +
                "(a)Amphitheater\n (b)Colosseum\n (c)Aqueduct\n (d)Arena\n",
                "(8)Upper-class citizen of Rome\n " +
                "(a)Plebeian\n (b)Sudra\n (c)Patrician\n (d)Brahmin\n",
                "(9)A political alliance of three people\n" +
                "(a)Republic\n (b)Treaty\n (c)Patrician\n (d)Triumvirate\n",
                "(10)Which of the following was not a member of the 1st Triumvirate\n" +
                "(a)Caesar\n (b)Pompey\n (c)Crassus\n (d)Octavian Augustus\n",
                "(11)Which of the following was not a member of the 2nd Triumvirate\n" +
                "(a)Antony\n (b)Lepidus\n (c)Caesar\n (d) Octavian Augustus\n",
                "(12)Declared himself Roman Dictator for life in 44 BC\n" +
                "(a)Octavian Augustus\n (b)Romulus\n (c)Julius Caesar\n (d)Remus\n",
                "(13)Who did the Romans go to war with in the Punic Wars?\n" +
                "(a)Greeks\n (b)Carthaginians\n (c)Etruscans\n (d)Egyptians\n",
                "(14)What land was gained after the 1st Punic War?\n" +
                "(a)Spain\n (b)Greece\n (c)India\n (d)Sicily\n",
                "(15)What land was gained after the 1st Punic War?\n" +
                "(a)Spain\n (b)Greece\n (c)India\n (d)Sicily\n"};

        String[] As = {"a","c","a","a","b","a","a","c","d","d","c","c","b","d","a"};
//        System.out.println(Qs[1]);

        //create a new question and answer object
        Questions [] testQuestion = {
                new Questions(Qs[0],As[0]),
                new Questions(Qs[1],As[1]),
                new Questions(Qs[2],As[2]),
                new Questions(Qs[3],As[3]),
                new Questions(Qs[4],As[4]),
                new Questions(Qs[5],As[5]),
                new Questions(Qs[6],As[6]),
                new Questions(Qs[7],As[7]),
                new Questions(Qs[8],As[8]),
                new Questions(Qs[9],As[9]),
                new Questions(Qs[10],As[10]),
                new Questions(Qs[11],As[11]),
                new Questions(Qs[12],As[12]),
                new Questions(Qs[13],As[13]),
                new Questions(Qs[14],As[14])
        };

        System.out.println("Welcome to Rome");
        System.out.println(" ");
        test(testQuestion);
    }
}
