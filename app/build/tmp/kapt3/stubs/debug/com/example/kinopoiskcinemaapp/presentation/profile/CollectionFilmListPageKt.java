package com.example.kinopoiskcinemaapp.presentation.profile;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a~\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052#\b\u0002\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001aA\u0010\u0012\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0003\u001a3\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00152!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003\u001a\b\u0010\u001a\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0005H\u0003\u00a8\u0006\u001d"}, d2 = {"CollectionFilmListPage", "", "screenState", "Lcom/example/kinopoiskcinemaapp/domain/utils/ScreenState;", "collectionName", "", "onClickItem", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "id", "collectionListViewModel", "Lcom/example/kinopoiskcinemaapp/presentation/profile/CollectionListViewModel;", "onBackPressed", "Lkotlin/Function0;", "selectedScreen", "screen", "CollectionFilmListView", "list", "", "Lcom/example/kinopoiskcinemaapp/domain/dto/FilmDTO;", "modifier", "Landroidx/compose/ui/Modifier;", "FilmItemDTO", "filmItem", "PreviewCollectionFilmListPage", "RatingText", "rating", "app_debug"})
public final class CollectionFilmListPageKt {
    
    @androidx.compose.runtime.Composable()
    public static final void CollectionFilmListPage(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.domain.utils.ScreenState screenState, @org.jetbrains.annotations.NotNull()
    java.lang.String collectionName, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickItem, @org.jetbrains.annotations.Nullable()
    com.example.kinopoiskcinemaapp.presentation.profile.CollectionListViewModel collectionListViewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackPressed, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.kinopoiskcinemaapp.domain.utils.ScreenState, kotlin.Unit> selectedScreen) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void CollectionFilmListView(java.util.List<com.example.kinopoiskcinemaapp.domain.dto.FilmDTO> list, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickItem, androidx.compose.ui.Modifier modifier) {
    }
    
    @kotlin.OptIn(markerClass = {com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi.class})
    @androidx.compose.runtime.Composable()
    private static final void FilmItemDTO(com.example.kinopoiskcinemaapp.domain.dto.FilmDTO filmItem, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickItem) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void RatingText(java.lang.String rating) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable()
    public static final void PreviewCollectionFilmListPage() {
    }
}