package com.example.kinopoiskcinemaapp.data.room;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class RoomRepo_Factory implements Factory<RoomRepo> {
  private final Provider<FilmsDao> filmsDaoProvider;

  public RoomRepo_Factory(Provider<FilmsDao> filmsDaoProvider) {
    this.filmsDaoProvider = filmsDaoProvider;
  }

  @Override
  public RoomRepo get() {
    return newInstance(filmsDaoProvider.get());
  }

  public static RoomRepo_Factory create(Provider<FilmsDao> filmsDaoProvider) {
    return new RoomRepo_Factory(filmsDaoProvider);
  }

  public static RoomRepo newInstance(FilmsDao filmsDao) {
    return new RoomRepo(filmsDao);
  }
}
