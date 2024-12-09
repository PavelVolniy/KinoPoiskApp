package com.example.kinopoiskcinemaapp.data.retrofit;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0080\u0001\u0010\u000f\u001a\u00020\b2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0013\u001a\u00020\u00052\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u00052\b\b\u0001\u0010\u0016\u001a\u00020\u00052\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u001aH\u00a7@\u00a2\u0006\u0002\u0010\u001bJ,\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u001eJ\"\u0010\u001f\u001a\u00020\b2\b\b\u0001\u0010 \u001a\u00020\u00052\b\b\u0001\u0010!\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\"J\u0018\u0010#\u001a\u00020$2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010%\u001a\u00020&2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\'\u001a\u00020(2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006)"}, d2 = {"Lcom/example/kinopoiskcinemaapp/data/retrofit/KPApi;", "", "getActorById", "Lcom/example/kinopoiskcinemaapp/entity/staff/Actor;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCollections", "Lcom/example/kinopoiskcinemaapp/entity/films/FilmsImpl;", "type", "", "page", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFilmById", "Lcom/example/kinopoiskcinemaapp/entity/filmdetails/FilmDetails;", "getFilmsByParams", "countriesId", "genresId", "order", "ratingFrom", "ratingTo", "yearFrom", "yearTo", "keyword", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;IILjava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFilters", "Lcom/example/kinopoiskcinemaapp/entity/filters/Filters;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImagesByFilmId", "Lcom/example/kinopoiskcinemaapp/entity/images/FilmImages;", "(ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPremieres", "year", "month", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSeasons", "Lcom/example/kinopoiskcinemaapp/entity/season/SeasonFilm;", "getSimilarFilms", "Lcom/example/kinopoiskcinemaapp/entity/similars/SimilarFilms;", "getStaffByFilmId", "Lcom/example/kinopoiskcinemaapp/entity/staff/Staff;", "app_debug"})
public abstract interface KPApi {
    
    @retrofit2.http.GET(value = "/api/v2.2/films/premieres")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPremieres(@retrofit2.http.Query(value = "year")
    int year, @retrofit2.http.Query(value = "month")
    @org.jetbrains.annotations.NotNull()
    java.lang.String month, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.entity.films.FilmsImpl> $completion);
    
    @retrofit2.http.GET(value = "/api/v2.2/films/collections")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCollections(@retrofit2.http.Query(value = "type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String type, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.entity.films.FilmsImpl> $completion);
    
    @retrofit2.http.GET(value = "/api/v2.2/films/filters")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFilters(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.entity.filters.Filters> $completion);
    
    @retrofit2.http.GET(value = "/api/v2.2/films")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFilmsByParams(@retrofit2.http.Query(value = "countries")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer countriesId, @retrofit2.http.Query(value = "genres")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer genresId, @retrofit2.http.Query(value = "order")
    @org.jetbrains.annotations.Nullable()
    java.lang.String order, @retrofit2.http.Query(value = "type")
    @org.jetbrains.annotations.Nullable()
    java.lang.String type, @retrofit2.http.Query(value = "ratingFrom")
    int ratingFrom, @retrofit2.http.Query(value = "ratingTo")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingTo, @retrofit2.http.Query(value = "yearFrom")
    int yearFrom, @retrofit2.http.Query(value = "yearTo")
    int yearTo, @retrofit2.http.Query(value = "keyword")
    @org.jetbrains.annotations.Nullable()
    java.lang.String keyword, @retrofit2.http.Query(value = "page")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.entity.films.FilmsImpl> $completion);
    
    @retrofit2.http.GET(value = "/api/v2.2/films/{id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFilmById(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.entity.filmdetails.FilmDetails> $completion);
    
    @retrofit2.http.GET(value = "/api/v1/staff")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getStaffByFilmId(@retrofit2.http.Query(value = "filmId")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.entity.staff.Staff> $completion);
    
    @retrofit2.http.GET(value = "/api/v1/staff/{id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getActorById(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.entity.staff.Actor> $completion);
    
    @retrofit2.http.GET(value = "/api/v2.2/films/{id}/images")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getImagesByFilmId(@retrofit2.http.Path(value = "id")
    int id, @retrofit2.http.Query(value = "type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String type, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.entity.images.FilmImages> $completion);
    
    @retrofit2.http.GET(value = "/api/v2.2/films/{id}/similars")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSimilarFilms(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.entity.similars.SimilarFilms> $completion);
    
    @retrofit2.http.GET(value = "/api/v2.2/films/{id}/seasons")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSeasons(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.entity.season.SeasonFilm> $completion);
}