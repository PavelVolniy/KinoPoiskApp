package com.example.kinopoiskcinemaapp.domain.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/example/kinopoiskcinemaapp/domain/utils/HomePageRequestState;", "", "()V", "Error", "Loading", "Success", "Lcom/example/kinopoiskcinemaapp/domain/utils/HomePageRequestState$Error;", "Lcom/example/kinopoiskcinemaapp/domain/utils/HomePageRequestState$Loading;", "Lcom/example/kinopoiskcinemaapp/domain/utils/HomePageRequestState$Success;", "app_debug"})
public abstract class HomePageRequestState {
    
    private HomePageRequestState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/kinopoiskcinemaapp/domain/utils/HomePageRequestState$Error;", "Lcom/example/kinopoiskcinemaapp/domain/utils/HomePageRequestState;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "app_debug"})
    public static final class Error extends com.example.kinopoiskcinemaapp.domain.utils.HomePageRequestState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/kinopoiskcinemaapp/domain/utils/HomePageRequestState$Loading;", "Lcom/example/kinopoiskcinemaapp/domain/utils/HomePageRequestState;", "()V", "app_debug"})
    public static final class Loading extends com.example.kinopoiskcinemaapp.domain.utils.HomePageRequestState {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.kinopoiskcinemaapp.domain.utils.HomePageRequestState.Loading INSTANCE = null;
        
        private Loading() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/kinopoiskcinemaapp/domain/utils/HomePageRequestState$Success;", "Lcom/example/kinopoiskcinemaapp/domain/utils/HomePageRequestState;", "listGroup", "", "Lcom/example/kinopoiskcinemaapp/entity/FilmGroup;", "(Ljava/util/List;)V", "getListGroup", "()Ljava/util/List;", "app_debug"})
    public static final class Success extends com.example.kinopoiskcinemaapp.domain.utils.HomePageRequestState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.example.kinopoiskcinemaapp.entity.FilmGroup> listGroup = null;
        
        public Success(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.kinopoiskcinemaapp.entity.FilmGroup> listGroup) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.kinopoiskcinemaapp.entity.FilmGroup> getListGroup() {
            return null;
        }
    }
}