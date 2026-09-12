public class PhotoGalleryBuilder {

    private static final int DEFAULT_PHOTOS_PER_PAGE = 10;

    private String title;
    private String description = "No description";
    private GalleryLayout layout = GalleryLayout.GRID;
    private GalleryTheme theme = GalleryTheme.LIGHT;
    private int photosPerPage = DEFAULT_PHOTOS_PER_PAGE;
    private boolean showCaptions = true;
    private boolean allowDownload = false;

    public PhotoGalleryBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public PhotoGalleryBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public PhotoGalleryBuilder setLayout(GalleryLayout layout) {
        this.layout = layout;
        return this;
    }

    public PhotoGalleryBuilder setTheme(GalleryTheme theme) {
        this.theme = theme;
        return this;
    }

    public PhotoGalleryBuilder setPhotosPerPage(int photosPerPage) {
        this.photosPerPage = photosPerPage;
        return this;
    }

    public PhotoGalleryBuilder setShowCaptions(boolean showCaptions) {
        this.showCaptions = showCaptions;
        return this;
    }

    public PhotoGalleryBuilder setAllowDownload(boolean allowDownload) {
        this.allowDownload = allowDownload;
        return this;
    }

    public PhotoGallery build() {
        validate();
        return new PhotoGallery(this);
    }

    private void validate() {
        if (title == null || title.isBlank()) {
            throw new IllegalStateException("Gallery title cannot be empty");
        }

        if (photosPerPage <= 0) {
            throw new IllegalStateException(
                    "Photos per page must be greater than zero"
            );
        }
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public GalleryLayout getLayout() {
        return layout;
    }

    public GalleryTheme getTheme() {
        return theme;
    }

    public int getPhotosPerPage() {
        return photosPerPage;
    }

    public boolean isShowCaptions() {
        return showCaptions;
    }

    public boolean isAllowDownload() {
        return allowDownload;
    }
}