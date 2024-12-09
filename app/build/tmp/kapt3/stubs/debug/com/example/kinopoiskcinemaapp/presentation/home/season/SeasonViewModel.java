package com.example.kinopoiskcinemaapp.presentation.home.season;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/example/kinopoiskcinemaapp/presentation/home/season/SeasonViewModel;", "Landroidx/lifecycle/ViewModel;", "kinopoiskRepo", "Lcom/example/kinopoiskcinemaapp/data/retrofit/KinopoiskRepo;", "(Lcom/example/kinopoiskcinemaapp/data/retrofit/KinopoiskRepo;)V", "_seasonData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/kinopoiskcinemaapp/entity/season/SeasonFilm;", "seasonData", "Lkotlinx/coroutines/flow/StateFlow;", "getSeasonData", "()Lkotlinx/coroutines/flow/StateFlow;", "getSeasonDats", "", "seasonId", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SeasonViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo kinopoiskRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.kinopoiskcinemaapp.entity.season.SeasonFilm> _seasonData = null;
    
    @javax.inject.Inject()
    public SeasonViewModel(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo kinopoiskRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.kinopoiskcinemaapp.entity.season.SeasonFilm> getSeasonData() {
        return null;
    }
    
    public final void getSeasonDats(int seasonId) {
    }
}