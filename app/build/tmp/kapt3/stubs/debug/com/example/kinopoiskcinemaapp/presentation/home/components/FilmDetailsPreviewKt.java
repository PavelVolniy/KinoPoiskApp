package com.example.kinopoiskcinemaapp.presentation.home.components;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0016\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0003\u001a \u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0003\u001a\u001e\u0010\t\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0003\u001a*\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0003\u001a\b\u0010\u0016\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u0017\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0003\u001a\u001e\u0010\u0018\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u000bH\u0003\u001a\u001e\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u000bH\u0003\u001a\u0018\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006H\u0003\u001a\"\u0010 \u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010!\u001a\u00020\u0006H\u0002\u00a8\u0006\""}, d2 = {"CollectionButton", "", "onClick", "Lkotlin/Function0;", "CountryAndLengthAndAgeLimitText", "countries", "", "filmLength", "ageLimits", "FavoriteButton", "isLike", "", "FilmDetailsPreview", "film", "Lcom/example/kinopoiskcinemaapp/entity/filmdetails/FilmDetails;", "viewModel", "Lcom/example/kinopoiskcinemaapp/presentation/home/filmpage/FilmPageViewModel;", "addToCollection", "NameAndRatingText", "rating", "", "nameFilm", "PreviewFilmDetails", "SharedButton", "ViewedButton", "isViewed", "WantToSeeButton", "isWantToSee", "YearsAndGenresText", "year", "", "genres", "moveFilmToCollection", "likeCollectionName", "app_debug"})
public final class FilmDetailsPreviewKt {
    
    @kotlin.OptIn(markerClass = {com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi.class})
    @androidx.compose.runtime.Composable()
    public static final void FilmDetailsPreview(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.entity.filmdetails.FilmDetails film, @org.jetbrains.annotations.Nullable()
    com.example.kinopoiskcinemaapp.presentation.home.filmpage.FilmPageViewModel viewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> addToCollection) {
    }
    
    private static final void moveFilmToCollection(boolean isLike, com.example.kinopoiskcinemaapp.presentation.home.filmpage.FilmPageViewModel viewModel, java.lang.String likeCollectionName) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void CollectionButton(kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void SharedButton(kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void FavoriteButton(kotlin.jvm.functions.Function0<kotlin.Unit> onClick, boolean isLike) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void WantToSeeButton(kotlin.jvm.functions.Function0<kotlin.Unit> onClick, boolean isWantToSee) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void ViewedButton(kotlin.jvm.functions.Function0<kotlin.Unit> onClick, boolean isViewed) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void CountryAndLengthAndAgeLimitText(java.lang.String countries, java.lang.String filmLength, java.lang.String ageLimits) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void YearsAndGenresText(int year, java.lang.String genres) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void NameAndRatingText(double rating, java.lang.String nameFilm) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable()
    public static final void PreviewFilmDetails() {
    }
}