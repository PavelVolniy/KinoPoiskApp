package com.example.kinopoiskcinemaapp.presentation.home.homepage;

import android.content.Context;
import com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo;
import com.example.kinopoiskcinemaapp.data.room.RoomRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class HomePageViewModel_Factory implements Factory<HomePageViewModel> {
  private final Provider<KinopoiskRepo> kinopoiskRepoProvider;

  private final Provider<RoomRepo> roomRepoProvider;

  private final Provider<Context> contextProvider;

  public HomePageViewModel_Factory(Provider<KinopoiskRepo> kinopoiskRepoProvider,
      Provider<RoomRepo> roomRepoProvider, Provider<Context> contextProvider) {
    this.kinopoiskRepoProvider = kinopoiskRepoProvider;
    this.roomRepoProvider = roomRepoProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public HomePageViewModel get() {
    return newInstance(kinopoiskRepoProvider.get(), roomRepoProvider.get(), contextProvider.get());
  }

  public static HomePageViewModel_Factory create(Provider<KinopoiskRepo> kinopoiskRepoProvider,
      Provider<RoomRepo> roomRepoProvider, Provider<Context> contextProvider) {
    return new HomePageViewModel_Factory(kinopoiskRepoProvider, roomRepoProvider, contextProvider);
  }

  public static HomePageViewModel newInstance(KinopoiskRepo kinopoiskRepo, RoomRepo roomRepo,
      Context context) {
    return new HomePageViewModel(kinopoiskRepo, roomRepo, context);
  }
}
