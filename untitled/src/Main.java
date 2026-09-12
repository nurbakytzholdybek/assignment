public class Main {

    public static void main(String[] args) {

        GalleryDirector director = new GalleryDirector();

        PhotoGallery travelGallery = director.createTravelGallery();

        System.out.println("=== Travel Gallery ===");
        System.out.println(travelGallery);

        System.out.println();

        PhotoGallery portfolioGallery = director.createPortfolioGallery();

        System.out.println("=== Portfolio Gallery ===");
        System.out.println(portfolioGallery);

        System.out.println();

        PhotoGallery customGallery = new PhotoGalleryBuilder()
                .setTitle("My Personal Gallery")
                .setDescription("My favorite photos")
                .setLayout(GalleryLayout.GRID)
                .setTheme(GalleryTheme.DARK)
                .setPhotosPerPage(20)
                .setShowCaptions(false)
                .setAllowDownload(false)
                .build();

        System.out.println("=== Custom Gallery ===");
        System.out.println(customGallery);
    }
}