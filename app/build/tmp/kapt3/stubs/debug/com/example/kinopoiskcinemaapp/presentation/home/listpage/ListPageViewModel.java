package com.example.kinopoiskcinemaapp.presentation.home.listpage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/kinopoiskcinemaapp/presentation/home/listpage/ListPageViewModel;", "Landroidx/lifecycle/ViewModel;", "kinopoiskRepo", "Lcom/example/kinopoiskcinemaapp/data/retrofit/KinopoiskRepo;", "(Lcom/example/kinopoiskcinemaapp/data/retrofit/KinopoiskRepo;)V", "collectionsFilms", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/kinopoiskcinemaapp/entity/films/FilmItem;", "getCollectionsFilms", "()Lkotlinx/coroutines/flow/Flow;", "setCollectionsFilms", "(Lkotlinx/coroutines/flow/Flow;)V", "films", "getFilms", "setFilms", "", "typeRequest", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ListPageViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo kinopoiskRepo = null;
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.kinopoiskcinemaapp.entity.films.FilmItem>> collectionsFilms;
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.kinopoiskcinemaapp.entity.films.FilmItem>> films;
    
    @javax.inject.Inject()
    public ListPageViewModel(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo kinopoiskRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.kinopoiskcinemaapp.entity.films.FilmItem>> getCollectionsFilms() {
        return null;
    }
    
    public final void setCollectionsFilms(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.kinopoiskcinemaapp.entity.films.FilmItem>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.kinopoiskcinemaapp.entity.films.FilmItem>> getFilms() {
        return null;
    }
    
    public final void setFilms(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.kinopoiskcinemaapp.entity.films.FilmItem>> p0) {
    }
    
    public final void getFilms(@org.jetbrains.annotations.NotNull()
    java.lang.String typeRequest) {
    }
}