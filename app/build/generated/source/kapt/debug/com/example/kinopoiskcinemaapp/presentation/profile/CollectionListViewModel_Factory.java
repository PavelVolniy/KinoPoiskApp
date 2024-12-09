package com.example.kinopoiskcinemaapp.presentation.profile;

import com.example.kinopoiskcinemaapp.data.room.RoomRepo;
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
public final class CollectionListViewModel_Factory implements Factory<CollectionListViewModel> {
  private final Provider<RoomRepo> roomRepoProvider;

  public CollectionListViewModel_Factory(Provider<RoomRepo> roomRepoProvider) {
    this.roomRepoProvider = roomRepoProvider;
  }

  @Override
  public CollectionListViewModel get() {
    return newInstance(roomRepoProvider.get());
  }

  public static CollectionListViewModel_Factory create(Provider<RoomRepo> roomRepoProvider) {
    return new CollectionListViewModel_Factory(roomRepoProvider);
  }

  public static CollectionListViewModel newInstance(RoomRepo roomRepo) {
    return new CollectionListViewModel(roomRepo);
  }
}
