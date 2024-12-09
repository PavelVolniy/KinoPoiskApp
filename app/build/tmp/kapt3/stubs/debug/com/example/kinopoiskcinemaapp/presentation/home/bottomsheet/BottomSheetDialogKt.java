package com.example.kinopoiskcinemaapp.presentation.home.bottomsheet;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u001a\u009f\u0001\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\f2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\f2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0007\u001a\u0016\u0010\u0015\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003\u001aO\u0010\u0016\u001a\u00020\u00012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0003\u00a2\u0006\u0002\u0010\u001d\u001a\u0018\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0003\u001a\u0018\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003H\u0003\u001a\b\u0010$\u001a\u00020\u0001H\u0007\u00a8\u0006%"}, d2 = {"AddCollectionRow", "", "text", "", "BottomSheetDialog", "roundedCorner", "", "filmItem", "Lcom/example/kinopoiskcinemaapp/entity/filmdetails/FilmDetails;", "isClose", "Lkotlin/Function0;", "addToCollection", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "nameColl", "deleteFromCollection", "addNewCollection", "listCollections", "", "Lcom/example/kinopoiskcinemaapp/domain/dto/CollectionWithFilms;", "CloseButton", "CollectionRowCheckBox", "isChecked", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "count", "onCheckedChange", "(Ljava/lang/Boolean;Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "FilmDescription", "nameFilm", "yearAndGenre", "ImageFilm", "rating", "image", "PreviewBottomSheetDialog", "app_debug"})
public final class BottomSheetDialogKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void BottomSheetDialog(int roundedCorner, @org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.entity.filmdetails.FilmDetails filmItem, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> isClose, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> addToCollection, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> deleteFromCollection, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> addNewCollection, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskcinemaapp.domain.dto.CollectionWithFilms> listCollections) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void CollectionRowCheckBox(java.lang.Boolean isChecked, androidx.compose.ui.graphics.vector.ImageVector icon, java.lang.String text, java.lang.String count, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onCheckedChange) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void AddCollectionRow(java.lang.String text) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void FilmDescription(java.lang.String nameFilm, java.lang.String yearAndGenre) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi.class})
    private static final void ImageFilm(java.lang.String rating, java.lang.String image) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void CloseButton(kotlin.jvm.functions.Function0<kotlin.Unit> isClose) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    public static final void PreviewBottomSheetDialog() {
    }
}