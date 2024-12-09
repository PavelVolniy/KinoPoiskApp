package com.example.kinopoiskcinemaapp.presentation.home.season;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0003\u001a\b\u0010\u0007\u001a\u00020\u0001H\u0007\u001a;\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\rH\u0003\u001aA\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00032!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0003\u001a \u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0015H\u0007\u00a8\u0006\u001b"}, d2 = {"EpisodeItem", "", "numberSeries", "", "nameSeries", "", "dateRealise", "PreviewSeasonView", "SeasonButton", "num", "isChecked", "", "onCheck", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "numButton", "SeasonButtonRow", "selectedSeason", "onCheckButton", "listButtons", "", "SeasonView", "modifier", "Landroidx/compose/ui/Modifier;", "listSeasons", "Lcom/example/kinopoiskcinemaapp/entity/season/SeasonItem;", "app_debug"})
public final class SeasonViewKt {
    
    @androidx.compose.runtime.Composable()
    public static final void SeasonView(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskcinemaapp.entity.season.SeasonItem> listSeasons) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void SeasonButtonRow(int selectedSeason, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onCheckButton, java.util.List<java.lang.Integer> listButtons) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable()
    public static final void PreviewSeasonView() {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void SeasonButton(int num, boolean isChecked, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onCheck) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void EpisodeItem(int numberSeries, java.lang.String nameSeries, java.lang.String dateRealise) {
    }
}