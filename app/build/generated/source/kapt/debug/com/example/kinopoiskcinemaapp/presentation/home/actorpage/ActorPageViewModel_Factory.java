package com.example.kinopoiskcinemaapp.presentation.home.actorpage;

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
public final class ActorPageViewModel_Factory implements Factory<ActorPageViewModel> {
  private final Provider<KinopoiskRepo> kinopoiskRepoProvider;

  public ActorPageViewModel_Factory(Provider<KinopoiskRepo> kinopoiskRepoProvider) {
    this.kinopoiskRepoProvider = kinopoiskRepoProvider;
  }

  @Override
  public ActorPageViewModel get() {
    return newInstance(kinopoiskRepoProvider.get());
  }

  public static ActorPageViewModel_Factory create(Provider<KinopoiskRepo> kinopoiskRepoProvider) {
    return new ActorPageViewModel_Factory(kinopoiskRepoProvider);
  }

  public static ActorPageViewModel newInstance(KinopoiskRepo kinopoiskRepo) {
    return new ActorPageViewModel(kinopoiskRepo);
  }
}
