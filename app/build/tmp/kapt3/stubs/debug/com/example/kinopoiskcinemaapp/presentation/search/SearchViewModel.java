package com.example.kinopoiskcinemaapp.presentation.search;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004Jj\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u001b2\b\b\u0002\u0010\"\u001a\u00020\u0018R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/example/kinopoiskcinemaapp/presentation/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "kinopoiskRepo", "Lcom/example/kinopoiskcinemaapp/data/retrofit/KinopoiskRepo;", "(Lcom/example/kinopoiskcinemaapp/data/retrofit/KinopoiskRepo;)V", "_countryListNames", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/kinopoiskcinemaapp/entity/films/Country;", "_filmsList", "Lcom/example/kinopoiskcinemaapp/entity/RequestState;", "_genreList", "Lcom/example/kinopoiskcinemaapp/entity/films/Genre;", "countryListNames", "Lkotlinx/coroutines/flow/StateFlow;", "getCountryListNames", "()Lkotlinx/coroutines/flow/StateFlow;", "filmList", "getFilmList", "genreList", "getGenreList", "getFilmsByParams", "", "countriesId", "", "genresId", "order", "", "type", "ratingFrom", "ratingTo", "yearFrom", "yearTo", "keyword", "page", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo kinopoiskRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.kinopoiskcinemaapp.entity.RequestState> _filmsList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.kinopoiskcinemaapp.entity.films.Country>> _countryListNames = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.kinopoiskcinemaapp.entity.films.Genre>> _genreList = null;
    
    @javax.inject.Inject()
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo kinopoiskRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.kinopoiskcinemaapp.entity.RequestState> getFilmList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.kinopoiskcinemaapp.entity.films.Country>> getCountryListNames() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.kinopoiskcinemaapp.entity.films.Genre>> getGenreList() {
        return null;
    }
    
    public final void getFilmsByParams(int countriesId, int genresId, @org.jetbrains.annotations.NotNull()
    java.lang.String order, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int ratingFrom, int ratingTo, int yearFrom, int yearTo, @org.jetbrains.annotations.NotNull()
    java.lang.String keyword, int page) {
    }
}