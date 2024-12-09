package com.example.kinopoiskcinemaapp.presentation.home.listpage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0006H\u0003\u001av\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0013H\u0007\u001a\b\u0010\u0016\u001a\u00020\u0001H\u0007\u00a8\u0006\u0017"}, d2 = {"ListFilmsView", "", "listFilmItem", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/example/kinopoiskcinemaapp/entity/films/FilmItem;", "onClickItem", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "filmId", "ListPage", "listPageViewModel", "Lcom/example/kinopoiskcinemaapp/presentation/home/listpage/ListPageViewModel;", "typeFilmRequest", "", "onClickBack", "Lkotlin/Function0;", "selectedScreen", "Lcom/example/kinopoiskcinemaapp/domain/utils/ScreenState;", "screen", "screenState", "PreviewListFilms", "app_debug"})
public final class ListPageKt {
    
    @android.annotation.SuppressLint(value = {"RememberReturnType"})
    @androidx.compose.runtime.Composable()
    public static final void ListPage(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.presentation.home.listpage.ListPageViewModel listPageViewModel, @org.jetbrains.annotations.NotNull()
    java.lang.String typeFilmRequest, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickItem, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClickBack, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.kinopoiskcinemaapp.domain.utils.ScreenState, kotlin.Unit> selectedScreen, @org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.domain.utils.ScreenState screenState) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void ListFilmsView(androidx.paging.compose.LazyPagingItems<com.example.kinopoiskcinemaapp.entity.films.FilmItem> listFilmItem, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickItem) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    public static final void PreviewListFilms() {
    }
}