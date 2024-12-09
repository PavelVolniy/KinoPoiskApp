package com.example.kinopoiskcinemaapp.presentation.home.actorpage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u0084\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u0011\u001a\u00020\u000eH\u0007\u001aI\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0003\u001a\u001e\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0003\u001a\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0019H\u0003\u001a\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0005H\u0003\u001a\u0010\u0010\u001e\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0019H\u0003\u001a\b\u0010\u001f\u001a\u00020\u0001H\u0007\u001a\u0010\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0019H\u0003\u001a\u0016\u0010\"\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0003\u00a8\u0006#"}, d2 = {"ActorPagePreview", "", "actorPageViewModel", "Lcom/example/kinopoiskcinemaapp/presentation/home/actorpage/ActorPageViewModel;", "actorId", "", "onClickFilmItem", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "filmId", "onClickBack", "Lkotlin/Function0;", "selectedScreen", "Lcom/example/kinopoiskcinemaapp/domain/utils/ScreenState;", "screen", "onClickFilmography", "screenState", "ActorPageView", "actor", "Lcom/example/kinopoiskcinemaapp/entity/staff/Actor;", "modifier", "Landroidx/compose/ui/Modifier;", "ClickableText", "text", "", "onClick", "FilmGroupText", "FilmsCountText", "count", "PersonNameText", "PreviewActorPage", "ProfessionText", "profession", "ShowAllButton", "app_debug"})
public final class ActorPageKt {
    
    @android.annotation.SuppressLint(value = {"RememberReturnType"})
    @androidx.compose.runtime.Composable()
    public static final void ActorPagePreview(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.presentation.home.actorpage.ActorPageViewModel actorPageViewModel, int actorId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickFilmItem, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClickBack, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.kinopoiskcinemaapp.domain.utils.ScreenState, kotlin.Unit> selectedScreen, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClickFilmography, @org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.domain.utils.ScreenState screenState) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi.class})
    private static final void ActorPageView(com.example.kinopoiskcinemaapp.entity.staff.Actor actor, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickFilmItem, kotlin.jvm.functions.Function0<kotlin.Unit> onClickFilmography, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void ShowAllButton(kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void FilmsCountText(int count) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void ClickableText(java.lang.String text, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void FilmGroupText(java.lang.String text) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void ProfessionText(java.lang.String profession) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void PersonNameText(java.lang.String name) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable()
    public static final void PreviewActorPage() {
    }
}