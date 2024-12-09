package com.example.kinopoiskcinemaapp.entity.films;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\bE\b\u0087\b\u0018\u00002\u00020\u0001B\u00e9\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\u0006\u0010\u0019\u001a\u00020\n\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\n\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\n\u0012\u0006\u0010\"\u001a\u00020\n\u0012\u0006\u0010#\u001a\u00020\n\u00a2\u0006\u0002\u0010$J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0011H\u00c6\u0003J\t\u0010G\u001a\u00020\u0011H\u00c6\u0003J\t\u0010H\u001a\u00020\nH\u00c6\u0003J\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u0011H\u00c6\u0003J\t\u0010K\u001a\u00020\nH\u00c6\u0003J\t\u0010L\u001a\u00020\nH\u00c6\u0003J\t\u0010M\u001a\u00020\nH\u00c6\u0003J\t\u0010N\u001a\u00020\nH\u00c6\u0003J\t\u0010O\u001a\u00020\nH\u00c6\u0003J\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\nH\u00c6\u0003J\t\u0010S\u001a\u00020\nH\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\t\u0010U\u001a\u00020 H\u00c6\u0003J\t\u0010V\u001a\u00020\nH\u00c6\u0003J\t\u0010W\u001a\u00020\nH\u00c6\u0003J\t\u0010X\u001a\u00020\nH\u00c6\u0003J\u000f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u00c6\u0003J\t\u0010Z\u001a\u00020\nH\u00c6\u0003J\t\u0010[\u001a\u00020\nH\u00c6\u0003J\t\u0010\\\u001a\u00020\nH\u00c6\u0003J\t\u0010]\u001a\u00020\nH\u00c6\u0003J\t\u0010^\u001a\u00020\nH\u00c6\u0003J\t\u0010_\u001a\u00020\nH\u00c6\u0003J\u00a3\u0002\u0010`\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\nH\u00c6\u0001J\u0013\u0010a\u001a\u00020 2\b\u0010b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010d\u001a\u00020\nH\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0016\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u001e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\u001f\u001a\u00020 \u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0011\u0010\u0017\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0011\u0010\f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010(R\u0011\u0010\u000e\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010(R\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010(R\u0011\u0010\u001c\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0011\u0010!\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010(R\u0011\u0010\u0018\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010(R\u0011\u0010\"\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010(R\u0011\u0010\u0015\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010<R\u0011\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010<R\u0011\u0010#\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010(R\u0011\u0010\u001d\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010(R\u0011\u0010\u0019\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010(R\u0011\u0010\u0013\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010(R\u0011\u0010\u001a\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010(R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010*\u00a8\u0006e"}, d2 = {"Lcom/example/kinopoiskcinemaapp/entity/films/FilmItem;", "", "kinopoiskId", "", "countries", "", "Lcom/example/kinopoiskcinemaapp/entity/films/Country;", "genres", "Lcom/example/kinopoiskcinemaapp/entity/films/Genre;", "imdbId", "", "nameEn", "nameOriginal", "nameRu", "posterUrl", "posterUrlPreview", "ratingImdb", "", "ratingKinopoisk", "type", "year", "ratingImbd", "description", "imageUrl", "publishedAt", "title", "url", "duration", "premiereRu", "someData", "filmId", "general", "", "professionKey", "rating", "relationType", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountries", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "getDuration", "()I", "getFilmId", "getGeneral", "()Z", "getGenres", "getImageUrl", "getImdbId", "getKinopoiskId", "getNameEn", "getNameOriginal", "getNameRu", "getPosterUrl", "getPosterUrlPreview", "getPremiereRu", "getProfessionKey", "getPublishedAt", "getRating", "getRatingImbd", "()D", "getRatingImdb", "getRatingKinopoisk", "getRelationType", "getSomeData", "getTitle", "getType", "getUrl", "getYear", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class FilmItem {
    private final int kinopoiskId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.kinopoiskcinemaapp.entity.films.Country> countries = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.kinopoiskcinemaapp.entity.films.Genre> genres = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String imdbId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nameEn = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nameOriginal = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nameRu = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String posterUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String posterUrlPreview = null;
    private final double ratingImdb = 0.0;
    private final double ratingKinopoisk = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    private final int year = 0;
    private final double ratingImbd = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String imageUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String publishedAt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String url = null;
    private final int duration = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String premiereRu = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String someData = null;
    private final int filmId = 0;
    private final boolean general = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String professionKey = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String rating = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String relationType = null;
    
    public FilmItem(int kinopoiskId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskcinemaapp.entity.films.Country> countries, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskcinemaapp.entity.films.Genre> genres, @org.jetbrains.annotations.NotNull()
    java.lang.String imdbId, @org.jetbrains.annotations.NotNull()
    java.lang.String nameEn, @org.jetbrains.annotations.NotNull()
    java.lang.String nameOriginal, @org.jetbrains.annotations.NotNull()
    java.lang.String nameRu, @org.jetbrains.annotations.NotNull()
    java.lang.String posterUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String posterUrlPreview, double ratingImdb, double ratingKinopoisk, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int year, double ratingImbd, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String publishedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String url, int duration, @org.jetbrains.annotations.NotNull()
    java.lang.String premiereRu, @org.jetbrains.annotations.NotNull()
    java.lang.String someData, int filmId, boolean general, @org.jetbrains.annotations.NotNull()
    java.lang.String professionKey, @org.jetbrains.annotations.NotNull()
    java.lang.String rating, @org.jetbrains.annotations.NotNull()
    java.lang.String relationType) {
        super();
    }
    
    public final int getKinopoiskId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskcinemaapp.entity.films.Country> getCountries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskcinemaapp.entity.films.Genre> getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImdbId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameEn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameOriginal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameRu() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPosterUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPosterUrlPreview() {
        return null;
    }
    
    public final double getRatingImdb() {
        return 0.0;
    }
    
    public final double getRatingKinopoisk() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final int getYear() {
        return 0;
    }
    
    public final double getRatingImbd() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImageUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPublishedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final int getDuration() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPremiereRu() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSomeData() {
        return null;
    }
    
    public final int getFilmId() {
        return 0;
    }
    
    public final boolean getGeneral() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProfessionKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRating() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRelationType() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final double component14() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskcinemaapp.entity.films.Country> component2() {
        return null;
    }
    
    public final int component20() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    public final int component23() {
        return 0;
    }
    
    public final boolean component24() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskcinemaapp.entity.films.Genre> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinopoiskcinemaapp.entity.films.FilmItem copy(int kinopoiskId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskcinemaapp.entity.films.Country> countries, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskcinemaapp.entity.films.Genre> genres, @org.jetbrains.annotations.NotNull()
    java.lang.String imdbId, @org.jetbrains.annotations.NotNull()
    java.lang.String nameEn, @org.jetbrains.annotations.NotNull()
    java.lang.String nameOriginal, @org.jetbrains.annotations.NotNull()
    java.lang.String nameRu, @org.jetbrains.annotations.NotNull()
    java.lang.String posterUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String posterUrlPreview, double ratingImdb, double ratingKinopoisk, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int year, double ratingImbd, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String publishedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String url, int duration, @org.jetbrains.annotations.NotNull()
    java.lang.String premiereRu, @org.jetbrains.annotations.NotNull()
    java.lang.String someData, int filmId, boolean general, @org.jetbrains.annotations.NotNull()
    java.lang.String professionKey, @org.jetbrains.annotations.NotNull()
    java.lang.String rating, @org.jetbrains.annotations.NotNull()
    java.lang.String relationType) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}