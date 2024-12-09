package com.example.kinopoiskcinemaapp.di;

import com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo;
import com.example.kinopoiskcinemaapp.presentation.home.actorpage.ActorPageViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class ViewModelModule_ProvideActorPageFactory implements Factory<ActorPageViewModel> {
  private final Provider<KinopoiskRepo> kinopoiskRepoProvider;

  public ViewModelModule_ProvideActorPageFactory(Provider<KinopoiskRepo> kinopoiskRepoProvider) {
    this.kinopoiskRepoProvider = kinopoiskRepoProvider;
  }

  @Override
  public ActorPageViewModel get() {
    return provideActorPage(kinopoiskRepoProvider.get());
  }

  public static ViewModelModule_ProvideActorPageFactory create(
      Provider<KinopoiskRepo> kinopoiskRepoProvider) {
    return new ViewModelModule_ProvideActorPageFactory(kinopoiskRepoProvider);
  }

  public static ActorPageViewModel provideActorPage(KinopoiskRepo kinopoiskRepo) {
    return Preconditions.checkNotNullFromProvides(ViewModelModule.INSTANCE.provideActorPage(kinopoiskRepo));
  }
}
