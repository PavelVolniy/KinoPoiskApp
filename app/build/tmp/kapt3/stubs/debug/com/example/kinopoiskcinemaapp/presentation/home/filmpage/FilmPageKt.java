package com.example.kinopoiskcinemaapp.presentation.home.filmpage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0003\u001a\u00e6\u0001\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u00152!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\f2!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c2!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000fH\u0003\u001a\u00df\u0001\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00102!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000f2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110#\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010%\u001a\u00020#2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000fH\u0007\u001a\b\u0010\'\u001a\u00020\u0001H\u0007\u001a\b\u0010(\u001a\u00020\u0001H\u0007\u001a\u001e\u0010)\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\u001cH\u0007\u001a \u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0003\u001a\u0018\u0010,\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0003\u00a8\u0006-"}, d2 = {"DescriptionText", "", "description", "", "modifier", "Landroidx/compose/ui/Modifier;", "FilmDetailsView", "film", "Lcom/example/kinopoiskcinemaapp/entity/filmdetails/FilmDetails;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "staff", "", "Lcom/example/kinopoiskcinemaapp/entity/staff/StaffItem;", "onClickStaff", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "id", "images", "Lcom/example/kinopoiskcinemaapp/entity/images/FilmImages;", "onClickImageGallery", "filmId", "similarFilms", "Lcom/example/kinopoiskcinemaapp/entity/films/FilmItem;", "onClickFilmItem", "addToCollection", "Lkotlin/Function0;", "onClickSeasons", "FilmPage", "filmPageViewModel", "Lcom/example/kinopoiskcinemaapp/presentation/home/filmpage/FilmPageViewModel;", "onBackPressed", "selectedScreen", "Lcom/example/kinopoiskcinemaapp/domain/utils/ScreenState;", "screen", "screenState", "onClickSeason", "PreviewFilmPage", "PreviewPersonItem", "SeasonRow", "ShortDescriptionFilm", "slogan", "SloganText", "app_debug"})
public final class FilmPageKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @android.annotation.SuppressLint(value = {"RememberReturnType", "CoroutineCreationDuringComposition"})
    @androidx.compose.runtime.Composable()
    public static final void FilmPage(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.presentation.home.filmpage.FilmPageViewModel filmPageViewModel, int filmId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickFilmItem, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickImageGallery, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickStaff, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackPressed, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.kinopoiskcinemaapp.domain.utils.ScreenState, kotlin.Unit> selectedScreen, @org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.domain.utils.ScreenState screenState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickSeason) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void FilmDetailsView(androidx.compose.ui.Modifier modifier, com.example.kinopoiskcinemaapp.entity.filmdetails.FilmDetails film, androidx.compose.foundation.ScrollState scrollState, java.util.List<com.example.kinopoiskcinemaapp.entity.staff.StaffItem> staff, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickStaff, com.example.kinopoiskcinemaapp.entity.images.FilmImages images, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickImageGallery, int filmId, java.util.List<com.example.kinopoiskcinemaapp.entity.films.FilmItem> similarFilms, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickFilmItem, kotlin.jvm.functions.Function0<kotlin.Unit> addToCollection, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickSeasons) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SeasonRow(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClickSeason) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void ShortDescriptionFilm(java.lang.String slogan, java.lang.String description, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void DescriptionText(java.lang.String description, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void SloganText(java.lang.String slogan, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable()
    public static final void PreviewFilmPage() {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable()
    public static final void PreviewPersonItem() {
    }
}