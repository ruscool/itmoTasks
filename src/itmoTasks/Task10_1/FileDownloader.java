package itmoTasks.Task10_1;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileDownloader {
    private ExecutorService executor;

    public FileDownloader() {
        this.executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    }

    public CompletableFuture<Void> downloadFile(URL url, Path target) {
        return CompletableFuture.runAsync(() -> {
            try (InputStream in = url.openStream()) {
                System.out.println("Попытка загрузки файла " + target);
                Files.createDirectories(target.getParent());
                Files.copy(in, target);
                System.out.println("Файл загружен: " + target);
            } catch (IOException e) {
                System.err.println("Ошибка при скачивании файла: " + e.getMessage());
            }
        }, executor);
    }

    public void shutdown() {
        executor.shutdown();
    }
}