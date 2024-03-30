package itmoTasks.Task2_3_1;

public class file {
    public interface PrintableContent {
        void printContent();
    }

    public static class Article implements PrintableContent {
        private String title;
        private String content;

        public Article(String title, String content) {
            this.title = title;
            this.content = content;
        }

        @Override
        public void printContent() {
            System.out.println("Статья: " + title);
            System.out.println(content);
        }

        public static void printArticles(PrintableContent[] printableContents) {
            System.out.println("Печатные изделия:");
            for (PrintableContent content : printableContents) {
                if (content instanceof Article) {
                    content.printContent();
                }
            }
        }
    }

    public static class Photo implements PrintableContent {
        private String caption;
        private String imageUrl;

        public Photo(String caption, String imageUrl) {
            this.caption = caption;
            this.imageUrl = imageUrl;
        }

        @Override
        public void printContent() {
            System.out.println("Фотография: " + caption);
            System.out.println("Ссылка на фото: " + imageUrl);
        }

        public static void printPhotos(PrintableContent[] printableContents) {
            System.out.println("Печать фотографий:");
            for (PrintableContent content : printableContents) {
                if (content instanceof Photo) {
                    content.printContent();
                }
            }
        }
    }
}
