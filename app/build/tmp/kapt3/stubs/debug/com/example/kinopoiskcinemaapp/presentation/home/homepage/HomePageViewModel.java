package com.example.kinopoiskcinemaapp.presentation.home.homepage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ*\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0082@\u00a2\u0006\u0002\u0010\u001eJ\u000e\u0010\u001f\u001a\u00020\u0017H\u0082@\u00a2\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\u0017J\u0006\u0010\"\u001a\u00020\u0017J\u0014\u0010#\u001a\u00020\u00172\n\u0010$\u001a\u00060%j\u0002`&H\u0002R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/example/kinopoiskcinemaapp/presentation/home/homepage/HomePageViewModel;", "Landroidx/lifecycle/ViewModel;", "kinopoiskRepo", "Lcom/example/kinopoiskcinemaapp/data/retrofit/KinopoiskRepo;", "roomRepo", "Lcom/example/kinopoiskcinemaapp/data/room/RoomRepo;", "context", "Landroid/content/Context;", "(Lcom/example/kinopoiskcinemaapp/data/retrofit/KinopoiskRepo;Lcom/example/kinopoiskcinemaapp/data/room/RoomRepo;Landroid/content/Context;)V", "_collectionWithFilmsDTO", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/kinopoiskcinemaapp/domain/dto/CollectionWithFilms;", "_filmsGroupList", "Lcom/example/kinopoiskcinemaapp/domain/utils/HomePageRequestState;", "collectionWithFilmsDTO", "getCollectionWithFilmsDTO", "()Ljava/util/List;", "filmGroupList", "Lkotlinx/coroutines/flow/StateFlow;", "getFilmGroupList", "()Lkotlinx/coroutines/flow/StateFlow;", "addCollectionToBD", "", "collectionName", "", "icon", "", "isClosable", "", "(Ljava/lang/String;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCollections", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFilms", "getFilters", "showErrorToLog", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class HomePageViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo kinopoiskRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.kinopoiskcinemaapp.data.room.RoomRepo roomRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.kinopoiskcinemaapp.domain.utils.HomePageRequestState> _filmsGroupList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.kinopoiskcinemaapp.domain.dto.CollectionWithFilms>> _collectionWithFilmsDTO = null;
    
    @javax.inject.Inject()
    public HomePageViewModel(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo kinopoiskRepo, @org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.data.room.RoomRepo roomRepo, @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.kinopoiskcinemaapp.domain.utils.HomePageRequestState> getFilmGroupList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskcinemaapp.domain.dto.CollectionWithFilms> getCollectionWithFilmsDTO() {
        return null;
    }
    
    private final java.lang.Object addCollectionToBD(java.lang.String collectionName, int icon, boolean isClosable, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void getFilms() {
    }
    
    private final java.lang.Object getCollections(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void showErrorToLog(java.lang.Exception e) {
    }
    
    public final void getFilters() {
    }
}