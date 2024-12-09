package com.example.kinopoiskcinemaapp.presentation.home.listpage;

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
public final class ListPageViewModel_Factory implements Factory<ListPageViewModel> {
  private final Provider<KinopoiskRepo> kinopoiskRepoProvider;

  public ListPageViewModel_Factory(Provider<KinopoiskRepo> kinopoiskRepoProvider) {
    this.kinopoiskRepoProvider = kinopoiskRepoProvider;
  }

  @Override
  public ListPageViewModel get() {
    return newInstance(kinopoiskRepoProvider.get());
  }

  public static ListPageViewModel_Factory create(Provider<KinopoiskRepo> kinopoiskRepoProvider) {
    return new ListPageViewModel_Factory(kinopoiskRepoProvider);
  }

  public static ListPageViewModel newInstance(KinopoiskRepo kinopoiskRepo) {
    return new ListPageViewModel(kinopoiskRepo);
  }
}
