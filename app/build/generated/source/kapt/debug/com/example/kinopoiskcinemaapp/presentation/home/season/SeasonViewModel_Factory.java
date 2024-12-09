package com.example.kinopoiskcinemaapp.presentation.home.season;

import com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo;
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
public final class SeasonViewModel_Factory implements Factory<SeasonViewModel> {
  private final Provider<KinopoiskRepo> kinopoiskRepoProvider;

  public SeasonViewModel_Factory(Provider<KinopoiskRepo> kinopoiskRepoProvider) {
    this.kinopoiskRepoProvider = kinopoiskRepoProvider;
  }

  @Override
  public SeasonViewModel get() {
    return newInstance(kinopoiskRepoProvider.get());
  }

  public static SeasonViewModel_Factory create(Provider<KinopoiskRepo> kinopoiskRepoProvider) {
    return new SeasonViewModel_Factory(kinopoiskRepoProvider);
  }

  public static SeasonViewModel newInstance(KinopoiskRepo kinopoiskRepo) {
    return new SeasonViewModel(kinopoiskRepo);
  }
}
