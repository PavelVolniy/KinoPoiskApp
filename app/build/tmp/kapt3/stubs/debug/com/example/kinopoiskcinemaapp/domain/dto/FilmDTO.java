package com.example.kinopoiskcinemaapp.domain.dto;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\t\u0010#\u001a\u00020\u000eH\u00c6\u0003J\t\u0010$\u001a\u00020\u0010H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J~\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\u0003H\u00d6\u0001J\t\u00103\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013\u00a8\u00064"}, d2 = {"Lcom/example/kinopoiskcinemaapp/domain/dto/FilmDTO;", "", "filmId", "", "filmName", "", "image", "genre", "slogan", "descriptions", "countries", "filmLength", "ageLimit", "rating", "", "date", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DJ)V", "getAgeLimit", "()Ljava/lang/String;", "getCountries", "getDate", "()J", "getDescriptions", "getFilmId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFilmLength", "getFilmName", "getGenre", "getImage", "getRating", "()D", "getSlogan", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DJ)Lcom/example/kinopoiskcinemaapp/domain/dto/FilmDTO;", "equals", "", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity(tableName = "films")
public final class FilmDTO {
    @androidx.room.PrimaryKey()
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer filmId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String filmName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String image = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String genre = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String slogan = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String descriptions = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String countries = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String filmLength = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ageLimit = null;
    private final double rating = 0.0;
    private final long date = 0L;
    
    public FilmDTO(@org.jetbrains.annotations.Nullable()
    java.lang.Integer filmId, @org.jetbrains.annotations.NotNull()
    java.lang.String filmName, @org.jetbrains.annotations.NotNull()
    java.lang.String image, @org.jetbrains.annotations.NotNull()
    java.lang.String genre, @org.jetbrains.annotations.NotNull()
    java.lang.String slogan, @org.jetbrains.annotations.NotNull()
    java.lang.String descriptions, @org.jetbrains.annotations.NotNull()
    java.lang.String countries, @org.jetbrains.annotations.NotNull()
    java.lang.String filmLength, @org.jetbrains.annotations.NotNull()
    java.lang.String ageLimit, double rating, long date) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFilmId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFilmName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGenre() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSlogan() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescriptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFilmLength() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAgeLimit() {
        return null;
    }
    
    public final double getRating() {
        return 0.0;
    }
    
    public final long getDate() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    public final long component11() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
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
    public final com.example.kinopoiskcinemaapp.domain.dto.FilmDTO copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer filmId, @org.jetbrains.annotations.NotNull()
    java.lang.String filmName, @org.jetbrains.annotations.NotNull()
    java.lang.String image, @org.jetbrains.annotations.NotNull()
    java.lang.String genre, @org.jetbrains.annotations.NotNull()
    java.lang.String slogan, @org.jetbrains.annotations.NotNull()
    java.lang.String descriptions, @org.jetbrains.annotations.NotNull()
    java.lang.String countries, @org.jetbrains.annotations.NotNull()
    java.lang.String filmLength, @org.jetbrains.annotations.NotNull()
    java.lang.String ageLimit, double rating, long date) {
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