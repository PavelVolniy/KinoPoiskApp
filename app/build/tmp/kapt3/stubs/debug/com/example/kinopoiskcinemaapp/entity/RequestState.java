package com.example.kinopoiskcinemaapp.entity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/example/kinopoiskcinemaapp/entity/RequestState;", "", "()V", "Error", "Loading", "Success", "Lcom/example/kinopoiskcinemaapp/entity/RequestState$Error;", "Lcom/example/kinopoiskcinemaapp/entity/RequestState$Loading;", "Lcom/example/kinopoiskcinemaapp/entity/RequestState$Success;", "app_debug"})
public abstract class RequestState {
    
    private RequestState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/kinopoiskcinemaapp/entity/RequestState$Error;", "Lcom/example/kinopoiskcinemaapp/entity/RequestState;", "()V", "app_debug"})
    public static final class Error extends com.example.kinopoiskcinemaapp.entity.RequestState {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.kinopoiskcinemaapp.entity.RequestState.Error INSTANCE = null;
        
        private Error() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/kinopoiskcinemaapp/entity/RequestState$Loading;", "Lcom/example/kinopoiskcinemaapp/entity/RequestState;", "()V", "app_debug"})
    public static final class Loading extends com.example.kinopoiskcinemaapp.entity.RequestState {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.kinopoiskcinemaapp.entity.RequestState.Loading INSTANCE = null;
        
        private Loading() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/kinopoiskcinemaapp/entity/RequestState$Success;", "Lcom/example/kinopoiskcinemaapp/entity/RequestState;", "list", "", "Lcom/example/kinopoiskcinemaapp/entity/films/FilmItem;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "app_debug"})
    public static final class Success extends com.example.kinopoiskcinemaapp.entity.RequestState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.example.kinopoiskcinemaapp.entity.films.FilmItem> list = null;
        
        public Success(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.kinopoiskcinemaapp.entity.films.FilmItem> list) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.kinopoiskcinemaapp.entity.films.FilmItem> getList() {
            return null;
        }
    }
}