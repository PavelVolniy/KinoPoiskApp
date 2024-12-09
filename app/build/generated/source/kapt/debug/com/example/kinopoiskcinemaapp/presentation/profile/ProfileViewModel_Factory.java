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
public final class ProfileViewModel_Factory implements Factory<ProfileViewModel> {
  private final Provider<RoomRepo> roomRepoProvider;

  public ProfileViewModel_Factory(Provider<RoomRepo> roomRepoProvider) {
    this.roomRepoProvider = roomRepoProvider;
  }

  @Override
  public ProfileViewModel get() {
    return newInstance(roomRepoProvider.get());
  }

  public static ProfileViewModel_Factory create(Provider<RoomRepo> roomRepoProvider) {
    return new ProfileViewModel_Factory(roomRepoProvider);
  }

  public static ProfileViewModel newInstance(RoomRepo roomRepo) {
    return new ProfileViewModel(roomRepo);
  }
}
