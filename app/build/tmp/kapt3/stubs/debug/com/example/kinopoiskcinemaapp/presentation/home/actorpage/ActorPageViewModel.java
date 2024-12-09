package com.example.kinopoiskcinemaapp.presentation.home.actorpage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u000f2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lcom/example/kinopoiskcinemaapp/presentation/home/actorpage/ActorPageViewModel;", "Landroidx/lifecycle/ViewModel;", "kinopoiskRepo", "Lcom/example/kinopoiskcinemaapp/data/retrofit/KinopoiskRepo;", "(Lcom/example/kinopoiskcinemaapp/data/retrofit/KinopoiskRepo;)V", "_actor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/kinopoiskcinemaapp/entity/staff/Actor;", "actor", "Lkotlinx/coroutines/flow/StateFlow;", "getActor", "()Lkotlinx/coroutines/flow/StateFlow;", "getKinopoiskRepo", "()Lcom/example/kinopoiskcinemaapp/data/retrofit/KinopoiskRepo;", "getActorData", "", "id", "", "showErrorToLog", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ActorPageViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo kinopoiskRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.kinopoiskcinemaapp.entity.staff.Actor> _actor = null;
    
    @javax.inject.Inject()
    public ActorPageViewModel(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo kinopoiskRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo getKinopoiskRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.kinopoiskcinemaapp.entity.staff.Actor> getActor() {
        return null;
    }
    
    public final void getActorData(int id) {
    }
    
    private final void showErrorToLog(java.lang.Exception e) {
    }
}