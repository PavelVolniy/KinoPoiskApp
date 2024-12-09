package com.example.kinopoiskcinemaapp.data.room;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0086@\u00a2\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015H\u0086@\u00a2\u0006\u0002\u0010\u0016J\u0016\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0086@\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/kinopoiskcinemaapp/data/room/RoomRepo;", "", "filmsDao", "Lcom/example/kinopoiskcinemaapp/data/room/FilmsDao;", "(Lcom/example/kinopoiskcinemaapp/data/room/FilmsDao;)V", "addCollection", "", "collection", "Lcom/example/kinopoiskcinemaapp/domain/dto/CollectionDTO;", "(Lcom/example/kinopoiskcinemaapp/domain/dto/CollectionDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addCollectionWithCrossRef", "collectionFilmCrossRef", "Lcom/example/kinopoiskcinemaapp/domain/dto/CollectionFilmCrossRef;", "(Lcom/example/kinopoiskcinemaapp/domain/dto/CollectionFilmCrossRef;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addFilmToDB", "filmDTO", "Lcom/example/kinopoiskcinemaapp/domain/dto/FilmDTO;", "(Lcom/example/kinopoiskcinemaapp/domain/dto/FilmDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCollection", "deleteFilmFromCollection", "getAllFilms", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCollectionWithFilms", "Lcom/example/kinopoiskcinemaapp/domain/dto/CollectionWithFilms;", "getCollectionWithFilmsByName", "name", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLast20Films", "app_debug"})
public final class RoomRepo {
    @org.jetbrains.annotations.NotNull()
    private final com.example.kinopoiskcinemaapp.data.room.FilmsDao filmsDao = null;
    
    @javax.inject.Inject()
    public RoomRepo(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.data.room.FilmsDao filmsDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllFilms(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.kinopoiskcinemaapp.domain.dto.FilmDTO>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addFilmToDB(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.domain.dto.FilmDTO filmDTO, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getLast20Films(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.kinopoiskcinemaapp.domain.dto.FilmDTO>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addCollection(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.domain.dto.CollectionDTO collection, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addCollectionWithCrossRef(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.domain.dto.CollectionFilmCrossRef collectionFilmCrossRef, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteFilmFromCollection(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.domain.dto.CollectionFilmCrossRef collectionFilmCrossRef, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCollectionWithFilms(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.kinopoiskcinemaapp.domain.dto.CollectionWithFilms>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCollectionWithFilmsByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.domain.dto.CollectionWithFilms> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteCollection(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.domain.dto.CollectionDTO collection, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}