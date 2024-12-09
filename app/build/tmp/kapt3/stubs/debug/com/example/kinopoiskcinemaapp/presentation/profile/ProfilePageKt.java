package com.example.kinopoiskcinemaapp.presentation.profile;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a[\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00010\fH\u0003\u001ar\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\n2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00010\f2!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00010\fH\u0003\u001aI\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00132!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00010\fH\u0003\u001a3\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u001b2!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00010\fH\u0003\u001a\b\u0010 \u001a\u00020\u0001H\u0007\u001a\u0083\u0001\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110#\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010&\u001a\u00020\'2!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00010\f2!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00010\fH\u0007\u001a\u00ab\u0001\u0010(\u001a\u00020\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00132\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00132\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\n2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00010\f2#\b\u0002\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00010\f2!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00010\fH\u0007\u001a\u0010\u0010,\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\u0005H\u0003\u001a\u0016\u0010.\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003\u001a\u0010\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u0005H\u0007\u00a8\u00061"}, d2 = {"CollectionCardItem", "", "paint", "", "nameCollection", "", "count", "isClosable", "", "onClose", "Lkotlin/Function0;", "onClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "CollectionsGroup", "modifier", "Landroidx/compose/ui/Modifier;", "collectionList", "", "Lcom/example/kinopoiskcinemaapp/domain/dto/CollectionWithFilms;", "createNewCollection", "deleteCollection", "onClickCollection", "FilmGroup", "titleFilmGroup", "listFilmDTO", "Lcom/example/kinopoiskcinemaapp/domain/dto/FilmDTO;", "onClickItem", "id", "FilmItemDTO", "filmItem", "PreviewProfilePage", "ProfilePage", "screenState", "Lcom/example/kinopoiskcinemaapp/domain/utils/ScreenState;", "selectedScreen", "screen", "profileViewModel", "Lcom/example/kinopoiskcinemaapp/presentation/profile/ProfileViewModel;", "ProfileView", "lookedFilmList", "wasInterestingFilmList", "collectionsList", "RatingText", "rating", "ShowAllButton", "Title", "title", "app_debug"})
public final class ProfilePageKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @android.annotation.SuppressLint(value = {"CoroutineCreationDuringComposition"})
    @androidx.compose.runtime.Composable()
    public static final void ProfilePage(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.domain.utils.ScreenState screenState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.kinopoiskcinemaapp.domain.utils.ScreenState, kotlin.Unit> selectedScreen, @org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.presentation.profile.ProfileViewModel profileViewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickItem, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClickCollection) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ProfileView(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskcinemaapp.domain.dto.FilmDTO> lookedFilmList, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskcinemaapp.domain.dto.FilmDTO> wasInterestingFilmList, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskcinemaapp.domain.dto.CollectionWithFilms> collectionsList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> createNewCollection, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> deleteCollection, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickItem, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClickCollection) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void ShowAllButton(kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void CollectionsGroup(androidx.compose.ui.Modifier modifier, java.util.List<com.example.kinopoiskcinemaapp.domain.dto.CollectionWithFilms> collectionList, kotlin.jvm.functions.Function0<kotlin.Unit> createNewCollection, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> deleteCollection, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClickCollection) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void CollectionCardItem(int paint, java.lang.String nameCollection, int count, boolean isClosable, kotlin.jvm.functions.Function0<kotlin.Unit> onClose, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void Title(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void FilmGroup(androidx.compose.ui.Modifier modifier, java.lang.String titleFilmGroup, java.util.List<com.example.kinopoiskcinemaapp.domain.dto.FilmDTO> listFilmDTO, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickItem) {
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
    public static final void PreviewProfilePage() {
    }
}