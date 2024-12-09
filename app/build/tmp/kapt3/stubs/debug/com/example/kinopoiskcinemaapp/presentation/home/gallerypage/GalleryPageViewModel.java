package com.example.kinopoiskcinemaapp.presentation.home.gallerypage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/kinopoiskcinemaapp/presentation/home/gallerypage/GalleryPageViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/example/kinopoiskcinemaapp/data/retrofit/KinopoiskRepo;", "(Lcom/example/kinopoiskcinemaapp/data/retrofit/KinopoiskRepo;)V", "_images", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "Lcom/example/kinopoiskcinemaapp/entity/images/FilmImages;", "images", "Lkotlinx/coroutines/flow/StateFlow;", "getImages", "()Lkotlinx/coroutines/flow/StateFlow;", "getImagesById", "", "filmId", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class GalleryPageViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo repo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, com.example.kinopoiskcinemaapp.entity.images.FilmImages>> _images = null;
    
    @javax.inject.Inject()
    public GalleryPageViewModel(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.Map<java.lang.String, com.example.kinopoiskcinemaapp.entity.images.FilmImages>> getImages() {
        return null;
    }
    
    public final void getImagesById(int filmId) {
    }
}