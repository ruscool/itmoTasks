package itmoTasks.Task10_1;

import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class SubMainTask10_1 {

    public static void subMain() {
        TaskNumber numberTask = new TaskNumber();
        // Для проверки желательно отдельно запускать задания !!!

        taskOne(numberTask);

//        taskTwo(numberTask);
    }

    static void taskOne(TaskNumber numberTask) {
        numberTask.printNumberTask("10.1.1");

        final Restaurant.Host host = new Restaurant.Host();

        // Создаем и запускаем потоки посетителей
        for (int i = 1; i <= 10; i++) {
            Restaurant.Visitor visitor = new Restaurant.Visitor(host, i);
            new Thread(visitor).start();
            try {
                // Промежуток времени между приходом посетителей
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static void taskTwo(TaskNumber numberTask) {
        numberTask.printNumberTask("10.1.2");

        List<String> urlList = Arrays.asList(
                "https://coolsen.ru/wp-content/uploads/2021/12/74-20211206_170921.jpg",
                "https://wallpapers.com/images/hd/minion-birthday-zrqajry7r6b4esmt.jpg"
                // ... Другие URL-адреса
        );

        FileDownloader downloader = new FileDownloader();

        CompletableFuture<?>[] futures = urlList.stream()
                .map(strUrl -> {
                    try {
                        URL url = new URL(strUrl);
                        String fileName = Paths.get(url.getPath()).getFileName().toString();
                        Path target = Paths.get("downloads", fileName);
                        return downloader.downloadFile(url, target);
                    } catch (Exception e) {
                        throw new RuntimeException("Неверный URL: " + strUrl, e);
                    }
                })
                .toArray(CompletableFuture[]::new);

        CompletableFuture.allOf(futures).join();

        downloader.shutdown();

        System.out.println("Все файлы были скачаны.");
    }


}