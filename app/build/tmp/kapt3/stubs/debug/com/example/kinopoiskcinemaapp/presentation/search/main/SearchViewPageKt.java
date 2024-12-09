package com.example.kinopoiskcinemaapp.presentation.search.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0005H\u0003\u001a\b\u0010\n\u001a\u00020\u0001H\u0007\u001a\b\u0010\u000b\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0003\u001a\u008f\u0001\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0019\u001a\u00020\u00172!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a8\u0006\u001c"}, d2 = {"FilmItem", "", "filmItem", "Lcom/example/kinopoiskcinemaapp/entity/films/FilmItem;", "onClickRow", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "filmId", "PreviewFilmItem", "PreviewSearchView", "RatingText", "rating", "", "SearchViewPage", "resultRequest", "Lcom/example/kinopoiskcinemaapp/entity/RequestState;", "onClickSearchText", "text", "onClickSettings", "Lkotlin/Function0;", "selectedScreen", "Lcom/example/kinopoiskcinemaapp/domain/utils/ScreenState;", "screen", "screenState", "onClickFilmItem", "id", "app_debug"})
public final class SearchViewPageKt {
    
    @androidx.compose.runtime.Composable()
    public static final void SearchViewPage(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.entity.RequestState resultRequest, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClickSearchText, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClickSettings, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.kinopoiskcinemaapp.domain.utils.ScreenState, kotlin.Unit> selectedScreen, @org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.domain.utils.ScreenState screenState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickFilmItem) {
    }
    
    @kotlin.OptIn(markerClass = {com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi.class})
    @androidx.compose.runtime.Composable()
    private static final void FilmItem(com.example.kinopoiskcinemaapp.entity.films.FilmItem filmItem, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickRow) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void RatingText(java.lang.String rating) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable()
    public static final void PreviewFilmItem() {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable()
    public static final void PreviewSearchView() {
    }
}