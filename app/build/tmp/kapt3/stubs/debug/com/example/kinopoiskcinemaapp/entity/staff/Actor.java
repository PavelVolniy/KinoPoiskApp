package com.example.kinopoiskcinemaapp.entity.staff;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\n\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0018J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00160\nH\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u00c6\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\f0\nH\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\u00c5\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\n2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\n2\b\b\u0002\u0010\u0017\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010B\u001a\u00020\u0003H\u00d6\u0001J\t\u0010C\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\n\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0011\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001c\u00a8\u0006D"}, d2 = {"Lcom/example/kinopoiskcinemaapp/entity/staff/Actor;", "", "age", "", "birthday", "", "birthplace", "death", "deathplace", "facts", "", "films", "Lcom/example/kinopoiskcinemaapp/entity/films/FilmItem;", "growth", "hasAwards", "nameEn", "nameRu", "personId", "posterUrl", "profession", "sex", "spouses", "Lcom/example/kinopoiskcinemaapp/entity/staff/Spouse;", "webUrl", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAge", "()I", "getBirthday", "()Ljava/lang/String;", "getBirthplace", "getDeath", "getDeathplace", "getFacts", "()Ljava/util/List;", "getFilms", "getGrowth", "getHasAwards", "getNameEn", "getNameRu", "getPersonId", "getPosterUrl", "getProfession", "getSex", "getSpouses", "getWebUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Actor {
    private final int age = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String birthday = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String birthplace = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String death = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String deathplace = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> facts = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.kinopoiskcinemaapp.entity.films.FilmItem> films = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String growth = null;
    private final int hasAwards = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nameEn = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nameRu = null;
    private final int personId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String posterUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String profession = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sex = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.kinopoiskcinemaapp.entity.staff.Spouse> spouses = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String webUrl = null;
    
    public Actor(int age, @org.jetbrains.annotations.NotNull()
    java.lang.String birthday, @org.jetbrains.annotations.NotNull()
    java.lang.String birthplace, @org.jetbrains.annotations.NotNull()
    java.lang.String death, @org.jetbrains.annotations.NotNull()
    java.lang.String deathplace, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> facts, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskcinemaapp.entity.films.FilmItem> films, @org.jetbrains.annotations.NotNull()
    java.lang.String growth, int hasAwards, @org.jetbrains.annotations.NotNull()
    java.lang.String nameEn, @org.jetbrains.annotations.NotNull()
    java.lang.String nameRu, int personId, @org.jetbrains.annotations.NotNull()
    java.lang.String posterUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String profession, @org.jetbrains.annotations.NotNull()
    java.lang.String sex, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskcinemaapp.entity.staff.Spouse> spouses, @org.jetbrains.annotations.NotNull()
    java.lang.String webUrl) {
        super();
    }
    
    public final int getAge() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBirthday() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBirthplace() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeathplace() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getFacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskcinemaapp.entity.films.FilmItem> getFilms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGrowth() {
        return null;
    }
    
    public final int getHasAwards() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameEn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameRu() {
        return null;
    }
    
    public final int getPersonId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPosterUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProfession() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskcinemaapp.entity.staff.Spouse> getSpouses() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWebUrl() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskcinemaapp.entity.staff.Spouse> component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
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
    public final java.util.List<java.lang.String> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskcinemaapp.entity.films.FilmItem> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinopoiskcinemaapp.entity.staff.Actor copy(int age, @org.jetbrains.annotations.NotNull()
    java.lang.String birthday, @org.jetbrains.annotations.NotNull()
    java.lang.String birthplace, @org.jetbrains.annotations.NotNull()
    java.lang.String death, @org.jetbrains.annotations.NotNull()
    java.lang.String deathplace, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> facts, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskcinemaapp.entity.films.FilmItem> films, @org.jetbrains.annotations.NotNull()
    java.lang.String growth, int hasAwards, @org.jetbrains.annotations.NotNull()
    java.lang.String nameEn, @org.jetbrains.annotations.NotNull()
    java.lang.String nameRu, int personId, @org.jetbrains.annotations.NotNull()
    java.lang.String posterUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String profession, @org.jetbrains.annotations.NotNull()
    java.lang.String sex, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskcinemaapp.entity.staff.Spouse> spouses, @org.jetbrains.annotations.NotNull()
    java.lang.String webUrl) {
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