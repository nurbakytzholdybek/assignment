public class PhotoGallery {

    private final String title;
    private final String description;
    private final GalleryLayout layout;
    private final GalleryTheme theme;
    private final int photosPerPage;
    private final boolean showCaptions;
    private final boolean allowDownload;

    public PhotoGallery(PhotoGalleryBuilder builder) {
        this.title = builder.getTitle();
        this.description = builder.getDescription();
        this.layout = builder.getLayout();
        this.theme = builder.getTheme();
        this.photosPerPage = builder.getPhotosPerPage();
        this.showCaptions = builder.isShowCaptions();
        this.allowDownload = builder.isAllowDownload();
    }

    @Override
    public String toString() {
        return "PhotoGallery{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", layout=" + layout +
                ", theme=" + theme +
                ", photosPerPage=" + photosPerPage +
                ", showCaptions=" + showCaptions +
                ", allowDownload=" + allowDownload +
                '}';
    }
}