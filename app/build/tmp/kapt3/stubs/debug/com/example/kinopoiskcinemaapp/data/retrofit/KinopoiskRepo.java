package com.example.kinopoiskcinemaapp.data.retrofit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u000bJr\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020!H\u0086@\u00a2\u0006\u0002\u0010\"J*\u0010#\u001a\u00020$2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010\u0010\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\'J\u000e\u0010(\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010\"J\u0016\u0010)\u001a\u00020*2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010+\u001a\u00020,2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/example/kinopoiskcinemaapp/data/retrofit/KinopoiskRepo;", "", "api", "Lcom/example/kinopoiskcinemaapp/data/retrofit/KPApi;", "(Lcom/example/kinopoiskcinemaapp/data/retrofit/KPApi;)V", "calendar", "Landroid/icu/util/Calendar;", "getActorByStaffId", "Lcom/example/kinopoiskcinemaapp/entity/staff/Actor;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCollections", "Lcom/example/kinopoiskcinemaapp/entity/films/FilmsImpl;", "type", "", "page", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFilmDetailsById", "Lcom/example/kinopoiskcinemaapp/entity/filmdetails/FilmDetails;", "getFilmStaff", "Lcom/example/kinopoiskcinemaapp/entity/staff/Staff;", "getFilmsByParams", "countriesId", "genresId", "order", "ratingFrom", "ratingTo", "yearFrom", "yearTo", "keyword", "(IILjava/lang/String;Ljava/lang/String;IIIILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFilters", "Lcom/example/kinopoiskcinemaapp/entity/filters/Filters;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImagesByFilmId", "Lcom/example/kinopoiskcinemaapp/entity/images/FilmImages;", "imageType", "Lcom/example/kinopoiskcinemaapp/domain/utils/ImageType;", "(ILcom/example/kinopoiskcinemaapp/domain/utils/ImageType;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPremieres", "getSeasons", "Lcom/example/kinopoiskcinemaapp/entity/season/SeasonFilm;", "getSimilarFilms", "Lcom/example/kinopoiskcinemaapp/entity/similars/SimilarFilms;", "app_debug"})
public final class KinopoiskRepo {
    @org.jetbrains.annotations.NotNull()
    private final com.example.kinopoiskcinemaapp.data.retrofit.KPApi api = null;
    @org.jetbrains.annotations.NotNull()
    private final android.icu.util.Calendar calendar = null;
    
    @javax.inject.Inject()
    public KinopoiskRepo(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.data.retrofit.KPApi api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPremieres(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.entity.films.FilmsImpl> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFilmStaff(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.entity.staff.Staff> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSeasons(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.entity.season.SeasonFilm> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getActorByStaffId(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.entity.staff.Actor> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getImagesByFilmId(int id, @org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.domain.utils.ImageType imageType, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.entity.images.FilmImages> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSimilarFilms(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.entity.similars.SimilarFilms> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFilmDetailsById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.entity.filmdetails.FilmDetails> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCollections(@org.jetbrains.annotations.NotNull()
    java.lang.String type, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.entity.films.FilmsImpl> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFilters(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.entity.filters.Filters> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFilmsByParams(int countriesId, int genresId, @org.jetbrains.annotations.NotNull()
    java.lang.String order, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int ratingFrom, int ratingTo, int yearFrom, int yearTo, @org.jetbrains.annotations.NotNull()
    java.lang.String keyword, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.entity.films.FilmsImpl> $completion) {
        return null;
    }
}