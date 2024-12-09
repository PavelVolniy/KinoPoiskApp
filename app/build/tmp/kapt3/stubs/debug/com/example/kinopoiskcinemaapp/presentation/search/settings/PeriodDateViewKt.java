package com.example.kinopoiskcinemaapp.presentation.search.settings;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a]\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0003\u001aN\u0010\u000f\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00010\u0012H\u0007\u001a\b\u0010\u0015\u001a\u00020\u0001H\u0007\u001a,\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0003\u001a_\u0010\u0017\u001a\u00020\u00012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0003\u001a\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002\u00a8\u0006\u001d"}, d2 = {"DatePickerBlock", "", "title", "", "selectYear", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "selectedYear", "yearsList", "", "onClickNext", "Lkotlin/Function0;", "onClickPreview", "PeriodDateView", "onBackPressed", "onSuccessPressed", "Lkotlin/Function2;", "yearFrom", "yearTo", "PreviewPeriodDateView", "TitleRow", "YearPicker", "year", "isChecked", "getYearsList", "startYear", "currentYear", "app_debug"})
public final class PeriodDateViewKt {
    
    @androidx.compose.runtime.Composable()
    public static final void PeriodDateView(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackPressed, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> onSuccessPressed) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void DatePickerBlock(java.lang.String title, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> selectYear, java.util.List<java.lang.Integer> yearsList, kotlin.jvm.functions.Function0<kotlin.Unit> onClickNext, kotlin.jvm.functions.Function0<kotlin.Unit> onClickPreview) {
    }
    
    private static final java.util.List<java.lang.Integer> getYearsList(int startYear, int currentYear) {
        return null;
    }
    
    @androidx.compose.runtime.Composable()
    private static final void YearPicker(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> selectedYear, java.util.List<java.lang.Integer> yearsList, int isChecked, kotlin.jvm.functions.Function0<kotlin.Unit> onClickNext, kotlin.jvm.functions.Function0<kotlin.Unit> onClickPreview) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void TitleRow(java.lang.String title, kotlin.jvm.functions.Function0<kotlin.Unit> onClickNext, kotlin.jvm.functions.Function0<kotlin.Unit> onClickPreview) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable()
    public static final void PreviewPeriodDateView() {
    }
}