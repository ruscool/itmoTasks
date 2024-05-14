package itmoTasks.Task13_1;

public class SubMainTask13_1 {
    public static void subMain() {
        TaskNumber taskNumber = new TaskNumber();
        taskNumber.printNumberTask("13.1.1");
        taskOne();

        taskNumber.printNumberTask("13.1.2");
        taskTwo();

    }

    static void taskOne() {
        WordProcessor wordProcessor = new WordProcessor();
        wordProcessor.howManyWords();
    }

    static void taskTwo() {
        CodeCaesarCipher codeCaesarCipher =new CodeCaesarCipher();
        codeCaesarCipher.codeShifr();
    }
}