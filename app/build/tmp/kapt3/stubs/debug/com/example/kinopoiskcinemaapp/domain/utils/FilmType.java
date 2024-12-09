package com.example.kinopoiskcinemaapp.domain.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/example/kinopoiskcinemaapp/domain/utils/FilmType;", "", "Lcom/example/kinopoiskcinemaapp/entity/GroupsType;", "nameGroup", "", "nameRequest", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getNameGroup", "()I", "getNameRequest", "()Ljava/lang/String;", "FILM", "TV_SHOW", "TV_SERIES", "MINI_SERIES", "ALL", "PREMIERES", "TEST", "app_debug"})
public enum FilmType implements com.example.kinopoiskcinemaapp.entity.GroupsType {
    /*public static final*/ FILM /* = new FILM(0, null) */,
    /*public static final*/ TV_SHOW /* = new TV_SHOW(0, null) */,
    /*public static final*/ TV_SERIES /* = new TV_SERIES(0, null) */,
    /*public static final*/ MINI_SERIES /* = new MINI_SERIES(0, null) */,
    /*public static final*/ ALL /* = new ALL(0, null) */,
    /*public static final*/ PREMIERES /* = new PREMIERES(0, null) */,
    /*public static final*/ TEST /* = new TEST(0, null) */;
    private final int nameGroup = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nameRequest = null;
    
    FilmType(int nameGroup, java.lang.String nameRequest) {
    }
    
    @java.lang.Override()
    public int getNameGroup() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getNameRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.example.kinopoiskcinemaapp.domain.utils.FilmType> getEntries() {
        return null;
    }
}