package com.example.kinopoiskcinemaapp.presentation.profile;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0014J\u0006\u0010\r\u001a\u00020\u0012J\u0006\u0010\u0017\u001a\u00020\u0012R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/kinopoiskcinemaapp/presentation/profile/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "roomRepo", "Lcom/example/kinopoiskcinemaapp/data/room/RoomRepo;", "(Lcom/example/kinopoiskcinemaapp/data/room/RoomRepo;)V", "_collections", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/kinopoiskcinemaapp/domain/dto/CollectionWithFilms;", "_lookedFilms", "Lcom/example/kinopoiskcinemaapp/domain/dto/FilmDTO;", "collections", "Lkotlinx/coroutines/flow/StateFlow;", "getCollections", "()Lkotlinx/coroutines/flow/StateFlow;", "lookedFilms", "getLookedFilms", "addNewCollection", "", "collectionName", "", "deleteCollectionByName", "nameCollection", "getLast20Films", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.kinopoiskcinemaapp.data.room.RoomRepo roomRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.kinopoiskcinemaapp.domain.dto.CollectionWithFilms>> _collections = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.kinopoiskcinemaapp.domain.dto.CollectionWithFilms>> collections = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.kinopoiskcinemaapp.domain.dto.FilmDTO>> _lookedFilms = null;
    
    @javax.inject.Inject()
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.data.room.RoomRepo roomRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.kinopoiskcinemaapp.domain.dto.CollectionWithFilms>> getCollections() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.kinopoiskcinemaapp.domain.dto.FilmDTO>> getLookedFilms() {
        return null;
    }
    
    public final void getCollections() {
    }
    
    public final void getLast20Films() {
    }
    
    public final void addNewCollection(@org.jetbrains.annotations.NotNull()
    java.lang.String collectionName) {
    }
    
    public final void deleteCollectionByName(@org.jetbrains.annotations.NotNull()
    java.lang.String nameCollection) {
    }
}