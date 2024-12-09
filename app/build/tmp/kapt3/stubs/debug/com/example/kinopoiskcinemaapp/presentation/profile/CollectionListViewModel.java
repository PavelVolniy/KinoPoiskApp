package com.example.kinopoiskcinemaapp.presentation.profile;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/kinopoiskcinemaapp/presentation/profile/CollectionListViewModel;", "Landroidx/lifecycle/ViewModel;", "roomRepo", "Lcom/example/kinopoiskcinemaapp/data/room/RoomRepo;", "(Lcom/example/kinopoiskcinemaapp/data/room/RoomRepo;)V", "_collectionList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/kinopoiskcinemaapp/domain/dto/FilmDTO;", "collectionList", "Lkotlinx/coroutines/flow/StateFlow;", "getCollectionList", "()Lkotlinx/coroutines/flow/StateFlow;", "getCollection", "", "collectionName", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class CollectionListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.kinopoiskcinemaapp.data.room.RoomRepo roomRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.kinopoiskcinemaapp.domain.dto.FilmDTO>> _collectionList = null;
    
    @javax.inject.Inject()
    public CollectionListViewModel(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.data.room.RoomRepo roomRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.kinopoiskcinemaapp.domain.dto.FilmDTO>> getCollectionList() {
        return null;
    }
    
    public final void getCollection(@org.jetbrains.annotations.NotNull()
    java.lang.String collectionName) {
    }
}