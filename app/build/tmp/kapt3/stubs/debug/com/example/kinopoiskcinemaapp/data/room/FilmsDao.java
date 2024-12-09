package com.example.kinopoiskcinemaapp.data.room;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0010\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u00a7@\u00a2\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014H\u00a7@\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u00a7@\u00a2\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u001dH\u00a7@\u00a2\u0006\u0002\u0010\u0015J\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u00a7@\u00a2\u0006\u0002\u0010\u0015\u00a8\u0006\u001f"}, d2 = {"Lcom/example/kinopoiskcinemaapp/data/room/FilmsDao;", "", "addCollection", "", "collectionDTO", "Lcom/example/kinopoiskcinemaapp/domain/dto/CollectionDTO;", "(Lcom/example/kinopoiskcinemaapp/domain/dto/CollectionDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addCollectionWithFilmCrossRef", "collectionFilmCrossRef", "Lcom/example/kinopoiskcinemaapp/domain/dto/CollectionFilmCrossRef;", "(Lcom/example/kinopoiskcinemaapp/domain/dto/CollectionFilmCrossRef;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addFilm", "filmItem", "Lcom/example/kinopoiskcinemaapp/domain/dto/FilmDTO;", "(Lcom/example/kinopoiskcinemaapp/domain/dto/FilmDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCollection", "deleteFilmFromCollection", "deleteReport", "filmDTO", "getAllFilms", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCollectionWithFilms", "Lcom/example/kinopoiskcinemaapp/domain/dto/CollectionWithFilms;", "getCollectionWithFilmsByName", "name", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCountFilms", "", "getLast20Films", "app_debug"})
@androidx.room.Dao()
public abstract interface FilmsDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addFilm(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.domain.dto.FilmDTO filmItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 5)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addCollection(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.domain.dto.CollectionDTO collectionDTO, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Transaction()
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addCollectionWithFilmCrossRef(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.domain.dto.CollectionFilmCrossRef collectionFilmCrossRef, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Transaction()
    @androidx.room.Query(value = "SELECT * FROM films ORDER BY date DESC LIMIT 20")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLast20Films(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.kinopoiskcinemaapp.domain.dto.FilmDTO>> $completion);
    
    @androidx.room.Transaction()
    @androidx.room.Query(value = "SELECT * FROM films ORDER BY date DESC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllFilms(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.kinopoiskcinemaapp.domain.dto.FilmDTO>> $completion);
    
    @androidx.room.Transaction()
    @androidx.room.Query(value = "SELECT * FROM collection_films")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCollectionWithFilms(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.kinopoiskcinemaapp.domain.dto.CollectionWithFilms>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM collection_films WHERE collectionName= :name LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCollectionWithFilmsByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskcinemaapp.domain.dto.CollectionWithFilms> $completion);
    
    @androidx.room.Query(value = "SELECT count(*) FROM films")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCountFilms(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteFilmFromCollection(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.domain.dto.CollectionFilmCrossRef collectionFilmCrossRef, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteReport(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.domain.dto.FilmDTO filmDTO, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteCollection(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.domain.dto.CollectionDTO collectionDTO, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}