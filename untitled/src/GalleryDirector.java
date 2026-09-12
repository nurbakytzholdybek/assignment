public class GalleryDirector {

    public PhotoGallery createTravelGallery() {
        return new PhotoGalleryBuilder()
                .setTitle("Travel Gallery")
                .setDescription("Photos from my travels")
                .setLayout(GalleryLayout.SLIDESHOW)
                .setTheme(GalleryTheme.DARK)
                .setPhotosPerPage(15)
                .setShowCaptions(true)
                .setAllowDownload(true)
                .build();
    }

    public PhotoGallery createPortfolioGallery() {
        return new PhotoGalleryBuilder()
                .setTitle("My Portfolio")
                .setDescription("My best photos")
                .setLayout(GalleryLayout.MASONRY)
                .setTheme(GalleryTheme.LIGHT)
                .setPhotosPerPage(12)
                .setShowCaptions(true)
                .setAllowDownload(false)
                .build();
    }
}
